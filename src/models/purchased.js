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
   sequelize.define('purchased', {
     price: DataTypes.DOUBLE
   });
 }

 
