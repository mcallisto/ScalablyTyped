package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInfo extends js.Object {
  /**
    * the active IP address the connection was bound to after starting. Set to undefined until the server has been
    * started or when using a non TCP port (e.g. UNIX domain socket).
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * server creation timestamp.
    */
  var created: scala.Double
  /**
    * The [host](https://github.com/hapijs/hapi/blob/master/API.md#server.options.host) configuration value.
    */
  var host: java.lang.String
  /**
    * a unique server identifier (using the format '{hostname}:{pid}:{now base36}').
    */
  var id: java.lang.String
  /**
    * the connection [port](https://github.com/hapijs/hapi/blob/master/API.md#server.options.port) based on the following rules:
    *  * before the server has been started: the configured port value.
    *  * after the server has been started: the actual port assigned when no port is configured or was set to 0.
    */
  var port: scala.Double | java.lang.String
  /**
    *  the protocol used:
    * * 'http' - HTTP.
    * * 'https' - HTTPS.
    * * 'socket' - UNIX domain socket or Windows named pipe.
    */
  var protocol: hapiLib.hapiLibStrings.http | hapiLib.hapiLibStrings.https | hapiLib.hapiLibStrings.socket
  /**
    * server start timestamp (0 when stopped).
    */
  var started: scala.Double
  /**
    * a string representing the connection (e.g. 'http://example.com:8080' or 'socket:/unix/domain/socket/path'). Contains
    * the uri value if set, otherwise constructed from the available settings. If no port is configured or is set
    * to 0, the uri will not include a port component until the server is started.
    */
  var uri: java.lang.String
}

object ServerInfo {
  @scala.inline
  def apply(
    created: scala.Double,
    host: java.lang.String,
    id: java.lang.String,
    port: scala.Double | java.lang.String,
    protocol: hapiLib.hapiLibStrings.http | hapiLib.hapiLibStrings.https | hapiLib.hapiLibStrings.socket,
    started: scala.Double,
    uri: java.lang.String,
    address: java.lang.String = null
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(created = created, host = host, id = id, port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], started = started, uri = uri)
    if (address != null) __obj.updateDynamic("address")(address)
    __obj.asInstanceOf[ServerInfo]
  }
}

