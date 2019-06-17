package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Telemetry extends Remote {
  /**
    * Log the given data to telemetry.
    *
    * @param data The data to log. Must be a JSON serializable object.
    */
  def logEvent(data: js.Any): scala.Unit
}

object Telemetry {
  @scala.inline
  def apply(
    attach: IConnection => scala.Unit,
    connection: IConnection,
    fillServerCapabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ServerCapabilities => scala.Unit,
    initialize: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ClientCapabilities => scala.Unit,
    logEvent: js.Any => scala.Unit
  ): Telemetry = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), connection = connection, fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), initialize = js.Any.fromFunction1(initialize), logEvent = js.Any.fromFunction1(logEvent))
  
    __obj.asInstanceOf[Telemetry]
  }
}

