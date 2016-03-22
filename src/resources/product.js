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
    var Product = this.models.product;

    this.server.get('/products', function(req, res, next) {
      Product.findAll().then(function(product){
        //var data = product.getDataValue();

        var msg = {
          type: "data",
          data: product,
          count: product.length
        }

        res.json(msg);
        return next();
      });
    });
  }
}
