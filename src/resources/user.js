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
export default class UserRoute extends Resource {

  constructor (server) {
    super(server);
  }

  /**
   * Define Routes.
   */
  routes () {
    var UserInfo = this.models.user_info;
    var User = this.models.user;
    var self = this;

    this.server.post('/users', function(req, res, next) {
      var username = req.params.username;
      var firstname = req.params.firstname;
      var lastname = req.params.lastname;
      var password = self.generatePassword();

      User.create({
        username: username,
        password: password
      }).then(function(user) {
        var id = user.get({
          plain: true
        })['id'];

        UserInfo.create({
          firstname: firstname,
          lastname: lastname,
          balance: 20.78,
          userId: id
        }).then(function(){
          var msg = {
            type: "CREATED",
            message: `A user account was created, this is your password ${password}`
          };
          self.Response(res, next, msg);
        });

      }).catch(function(err) {
        var msg = {
          type: "ERROR",
          message: err.errors[0]['message']
        }
        self.ErrResponse(res, next, msg);
      });
    });

    this.server.get('/users/:username/:password', function(req, res, next){
      var username = req.params['username'];
      var password = req.params['password'];

      User.findOne({
        where: {
          username: username,
          password: password
        },
        include: [
          { model: UserInfo }
        ]
      }).then(function(user){
          var msg = {};

          if(user != null) {
            msg.type = "isUser";
            msg.data = [ user.get({
              plain: true
            })];
            self.Response(res, next, msg);
          }

          msg.type = "userNotFound";
          msg.message = "Username or password is incorrect";

          self.ErrResponse(res, next , msg);
      });
    });
  }

  Response(res, next, msg) {
    res.json(msg);
    return next();
  }

  generatePassword() {
    var length = 8,
    charset = "abcdefghijklnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789",
    retVal = "";

    for (var i = 0, n = charset.length; i < length; ++i) {
      retVal += charset.charAt(Math.floor(Math.random() * n));
    }

    return retVal;
  }

  ErrResponse(res, next, msg) {

    res.json(msg);
    return next();
  }

  setUser (req, res, next) {
    var username = req.body.username;
    var firstname = req.body.firstname;
    var lastname = req.body.lastname;

    //res.end();
    return next();
  }
}
