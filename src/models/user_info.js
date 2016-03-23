/**
 * User info
 */
'use strict';


/**
 * Define the model.
 *
 * @param [Sequelize} sequelize
 * @param {DataTypes} DataTypes
 */
 export function define (sequelize, DataTypes) {
   sequelize.define('user_info', {
     firstname: DataTypes.STRING,
     lastname: DataTypes.STRING,
     balance: DataTypes.DOUBLE
   });
 }

 /**
  * Associate the model with any other models (this is called after all models has been defined!)
  * @param {object} models Models Array
  */
 export function associate (models) {
   // models['Sample'].belongsTo(models['User']);
 }
