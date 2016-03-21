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
   sequelize.define('product', {
     name: DataTypes.STRING,
     info: DataTypes.STRING,
     price: DataTypes.DOUBLE,
     amount: DataTypes.INTEGER
   });
 }
