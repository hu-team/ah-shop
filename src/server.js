/**
 * Server Class.
 */
'use strict';

import Restify      from 'restify';
import Sequelize    from 'sequelize';

import chalk        from 'chalk';
import glob         from 'glob';

/**
 * Server Class.
 *
 * @class    Server
 * @type    {Server}
 *
 * @property {string}     version
 * @property {object}     config
 *
 * @property {object}     restify
 * @property {Sequelize}  sequelize
 *
 * @property {Resource[]} resources
 */
export default class Server {
  version;
  config;

  restify;
  sequelize;

  resources = [];

  constructor (version, config) {
    this.version = version;
    this.config  = config;

    // Init Sequelize Database Client.
    this.sequelize = new Sequelize(config.database.database, config.database.username, config.database.password, {
      host: config.database.host,
      port: config.database.port,

      dialect: 'mysql',
      pool: {
        max: 5,
        min: 0,
        idle: 10000
      }
    });

    // Init Restify API Server.
    this.restify = Restify.createServer({
      name: 'ah-shop',
      version: '1.0.0' // API Version
    });

    // Start the definition of the models.
    this._initModels();

    // Start the prepare of middleware.
    this._initMiddleware();

    // Start the route definitions.
    this._initRoutes();
  }

  /**
   * Init Models.
   * @private
   */
  _initModels () {
    let modelModules = [];

    glob.sync(__dirname + '/models/**.js').forEach((file) => {
      try {
        let model = require(file);
        model.define(this.sequelize, Sequelize);
        modelModules.push(model);
      }catch (err) {
        console.log(chalk.bold.underline.red('Your model file has an invalid syntax!'));
        console.error(file);
        console.error(err);
        console.error(err.stack);
        process.exit(1);
      }
    });

    // Relations
    modelModules.forEach((model) => {
      if (model.hasOwnProperty('associate') && typeof model.associate === 'function') {
        model.associate(this.sequelize.models);
      }
    });
  }

  /**
   * Init Middleware.
   * @private
   */
  _initMiddleware () {
    // Parsers
    this.restify.use(Restify.acceptParser(this.restify.acceptable));
    this.restify.use(Restify.queryParser());
    this.restify.use(Restify.bodyParser());

    // Compression
    this.restify.use(Restify.gzipResponse());

    // Authorization
    this.restify.use(Restify.authorizationParser());
  }

  /**
   * Init Routes.
   * @private
   */
  _initRoutes () {
    glob.sync(__dirname + '/resources/**.js').forEach((file) => {
      try {
        let resourceClass = require(file).default;
        let resource = new resourceClass(this);
        this.resources.push(resource);
      }catch (err) {
        console.log(chalk.bold.underline.red('Your resource file an invalid no syntax!'));
        console.error(file);
        console.error(err);
        console.error(err.stack);
        process.exit(1);
      }
    });

    // Register routes
    this.resources.forEach((resource) => {
      resource.routes(this.restify);
    })
  }


  /**
   * Start listening on provided port, or default config port.
   * @param port
   */
  listen (port) {
    this.restify.listen(port || this.config.server.port, () => {
      console.log(chalk.bold.blue('%s listening at %s'), this.restify.name, this.restify.url);
    });
  }
}
