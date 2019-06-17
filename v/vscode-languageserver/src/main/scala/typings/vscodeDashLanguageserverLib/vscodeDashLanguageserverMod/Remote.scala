package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remote extends js.Object {
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection
  /**
    * Attach the remote to the given connection.
    *
    * @param connection The connection this remote is operating on.
    */
  def attach(connection: IConnection): scala.Unit
  /**
    * Called to fill in the server capabilities this feature implements.
    *
    * @param capabilities The server capabilities to fill.
    */
  def fillServerCapabilities(capabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ServerCapabilities): scala.Unit
  /**
    * Called to initialize the remote with the given
    * client capabilities
    *
    * @param capabilities The client capabilities
    */
  def initialize(capabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ClientCapabilities): scala.Unit
}

object Remote {
  @scala.inline
  def apply(
    attach: IConnection => scala.Unit,
    connection: IConnection,
    fillServerCapabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ServerCapabilities => scala.Unit,
    initialize: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ClientCapabilities => scala.Unit
  ): Remote = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), connection = connection, fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), initialize = js.Any.fromFunction1(initialize))
  
    __obj.asInstanceOf[Remote]
  }
}

