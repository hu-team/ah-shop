/**
 * User
 */
'use strict';


/**
 * Define the model.
 *
 * @param [Sequelize} sequelize
 * @param {DataTypes} DataTypes
 */
 export function define (sequelize, DataTypes) {
   sequelize.define('user', {
     username: {type: DataTypes.STRING, unique: true},
     password: DataTypes.STRING
   });
 }

 /**
  * Associate the model with any other models (this is called after all models has been defined!)
  * @param {object} models Models Array
  */
 export function associate (models) {
   models['user'].hasOne(models['user_info']);
   // models['Sample'].belongsTo(models['User']);
 }
