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
      var productprice, productTable, newBalance, newAmount;
      var userid = req.body.userid;
      var productid = req.body.productid;
      var UserInfo = self.models.user_info;
      var Product = self.models.product;
      var Purchased = self.models.purchased;

      var Products = Product.findOne({
        where: {
          id: productid
        }
      }).then(function(product){
        var amount = product.get("amount");
        productTable = product;

        if(amount == 0) {
          return Promise.reject('Sorry, product is sold out');
        }

          return Promise.resolve(product.get('price'));

      }).then(function(price) {
         productprice = price;
        return UserInfo.findOne({
          where: {
            userId: userid
          }
        })

      }).catch(function(err) {
          var msg = {
            type: "isSoldOut",
            message: err
          }

          res.json(msg);
          return next();
      }).then(function(user) {
        if(user != null) {
          var balance = user.get('balance');

          if(productprice > balance) {
            return Promise.reject('Sorry, you dont have enough money');
          }
            newBalance = balance - productprice;
            newAmount = productTable.get('amount') - 1;

            return Promise.resolve(user);
        } else {
          res.json({
            type: "userNotFound"
          });
          return next();
        }

      }).then(function(user) {

        user.set('balance', newBalance);
        user.save();
        productTable.set('amount', newAmount);
        productTable.save();

        return Purchased.create({
              productId: productTable.get('id'),
              userId: userid,
            })
      }).catch(function(err) {
        res.json({
          type: "notEnoughMoney",
          message: err
        });
        return next();
      }).then(function(){
        res.json({
          type: "boughtItem",
          message: "You bought a " + productTable.get('name')
        });
        return next();
      });

    });
  }

}
