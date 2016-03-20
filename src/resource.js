/**
 * Abstract Resource Class. Will support the injection of the server components.
 */
'use strict';

/**
 * Resource Abstract Class.
 * @class Resource
 * @type {Resource}
 * @abstract
 *
 * @property {object} models
 * @property {restify} restify
 * @property {restify} server
 * @property {Sequelize} sequelize
 * @property {Sequelize} db
 */
export default class Resource {
  models;

  server; // restify
  restify;

  db; // sequelize
  sequelize;

  /**
   *
   * @param {Server} server
   */
  constructor(server) {
    this.models = server.sequelize.models;

    this.server = server.restify;
    this.restify = server.restify;

    this.db = server.sequelize;
    this.sequelize = server.sequelize;
  }
}
