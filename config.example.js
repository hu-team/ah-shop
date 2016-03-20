/**
 * CONFIG FILE. Copy to config.js and edit!
 */
'use strict';
module.exports = {
  database: {
    host: 'localhost',
    port: 3306,
    database: 'ahshop',

    username: 'root',
    password: ''
  },

  server: {
    port: 8080, // HTTP Listen Port
    secure: false // Use SSL (not implemented!!)
  }
};
