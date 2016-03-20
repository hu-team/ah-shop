/**
 * AH Shop Webservice Server.
 */
'use strict';

import * as Package from './../package';
import * as Config  from './../config';

import Server from './server';

let server = new Server(Package.version, Config)
  .listen();
