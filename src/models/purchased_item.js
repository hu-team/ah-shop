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
   sequelize.define('purchased_item', {
     amount: DataTypes.INTEGER,
     price: DataTypes.DOUBLE,
     date: DataTypes.DATE
   });
 }

 /**
  * Associate the model with any other models (this is called after all models has been defined!)
  * @param {object} models Models Array
  */
 export function associate (models) {
   models['purchased'].hasMany(models['purchased_item']);
   models['product'].hasMany(models['purchased_item']);
   // models['Sample'].belongsTo(models['User']);
 }
