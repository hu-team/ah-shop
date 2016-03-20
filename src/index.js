/**
 * AH Shop Webservice Server.
 */
'use strict';

import * as Package from './../package';
import * as Config  from './../config';

import Server from './server';

new Server(Package.version, Config).then((server) => {
  server.listen();
});
