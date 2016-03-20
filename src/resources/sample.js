/**
 * Sample Resource, will contain route definitions and logic for saving/fetching data.
 */
'use strict';

import Resource from "../resource";

/**
 * Sample Resource
 * @class Sample
 * @type {Sample}
 */
export default class Sample extends Resource {
  constructor (server) {
    super(server);
  }

  /**
   * Define Routes.
   */
  routes () {
    this.server.get('/', this.getRoot);
  }



  getRoot (req, res, next) {
    res.end('<h1>Webservice, AH - Shop!</h1>');
    return next();
  }
}
