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
export default class PurchasedRoute extends Resource {
  constructor (server) {
    super(server);
  }

  /**
   * Define Routes.
   */
  routes () {
    var self = this;

    this.server.post('/purchased', function(req, res, next){
      var items = req.query['item'];
      var userid = req.body.userid;
      var UserInfo = self.models.user_info;
      var Product = self.models.product;
      var msg = {};

      var User = UserInfo.findOne({
        where: {
          userId: userid
        }
      }).then(function(user) {
        return user.get({
          plain: true
        });
      }).then(function(user) {
        var balance = user.balance;
        var total = 0;
        var Products = Product.findAll({
          where: {
            id: items
          }
        }).then(function(items) {
          items.forEach(function(val, index) {
            var id = val.get('id');
            var amount = val.get('amount');
            var price = val.get('price');

            if(amount == 0 ) {

            }
            console.log(val.get('amount'));
          });
        });
      });
      console.log(req.query);
      console.log(req.body);
    });
  }

}
