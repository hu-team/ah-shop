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
export default class InventoryRoute extends Resource {
  constructor (server) {
    super(server);
  }

  /**
   * Define Routes.
   */
  routes () {
    var self = this;
    this.server.get('/inventory/:userid', function(req, res, next) {
      var userid = req.params.userid;
      var Purchased = self.models.purchased;
      var Product = self.models.product;
      var _productids = [];
      var productitems = [];


      Purchased.findAll({
        where: {
          userId: userid
        }
      }).then(function(items) {

        //Set all items in array
        items.forEach(function(val, index){
          var id = val.get('productId');
          _productids.push(id);

          if(_productids.length == items.length) {
            return Promise.resolve();

          }
        });
      }).then(function(){

        //Loop over all items in array
        for(var i = 0; i < _productids.length; i++) {
          var id = _productids[i];
          var duplicate = false;

          //Check if the object already exisist if so set amount++ and duplicate true.
          for(var ip = 0 ; ip < productitems.length; ip++) {
            var productarr = productitems[ip];

            if(productarr.id === id) {
              productarr.amount += 1;
              duplicate = true;
              break;
            }
          }

          if(!duplicate) {
            var obj = {
              id: id,
              name: "",
              amount: 1
            }
            productitems.push(obj);
          }

        }

        //Set name object for all products in productitems
        var teller = 0;
        productitems.forEach(function(val, index){
          Product.findOne({
            where: {
              id: val.id
            }
          }).then(function(product) {
            val.name = product.get("name")
            teller++;

            if(teller == productitems.length) {
              self.Response(productitems, res, next);
            }
          });
        });
      });
    });
  }

  Response (data, res, next) {
    var msg = {
      type: "userInventory",
      data: data
    };

    res.json(msg);
    return next();
  }

}
