package typings
package samchonLib.protocolServerServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/server/Server", "Server")
@js.native
abstract class Server ()
  extends samchonLib.protocolServerIServerMod.IServer {
  /**
    * @hidden
    */
  var _Handle_connect: js.Any = js.native
  /**
    * @hidden
    */
  var net_driver_ : js.Any = js.native
  /**
    * @inheritdoc
    */
  def addClient(driver: samchonLib.protocolCommunicatorClientUnderscoreDriverClientDriverMod.ClientDriver): scala.Unit = js.native
  /**
    * Add a newly connected remote client.
    *
    * The {@link addClient addClient()} is an abstract method being called when a remote client is newly connected
    * with {@link IClientDriver} object who communicates with the remote system. Overrides this method and defines
    * what to do with the *driver*, a newly connected remote client.
    *
    * Below methods and example codes may be good for comprehending how to utilize this {@link addClient} method.
    *
    * - https://github.com/samchon/framework-examples/blob/master/calculator/calculator-server.ts
    * - https://github.com/samchon/framework-examples/blob/master/chat-server/server.ts
    * - {@link service.Server.addClient}
    * - {@link external.ExternalClientArray.addClient}
    * - {@link slave.SlaveServer.addClient}
    *
    * @param driver A {@link ICommunicator communicator} with (newly connected) remote client.
    */
  /* CompleteClass */
  override def addClient(driver: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver): scala.Unit = js.native
  /**
    * Close server.
    *
    * Close opened server. All remote clients, have connected with this server, are also closed and their call back
    * functions, for closed connection, {@link IClientDriver.onClose} are also called.
    */
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /**
    * Open server.
    *
    * @param port Port number to open.
    */
  /* CompleteClass */
  override def open(port: scala.Double): scala.Unit = js.native
}

