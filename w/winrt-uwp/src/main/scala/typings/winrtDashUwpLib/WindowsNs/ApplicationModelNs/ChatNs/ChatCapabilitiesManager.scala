package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for getting chat capabilities. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatCapabilitiesManager")
@js.native
abstract class ChatCapabilitiesManager () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Chat.ChatCapabilitiesManager")
@js.native
object ChatCapabilitiesManager extends js.Object {
  /**
    * Asynchronously gets the locally cached Rich Communication Services (RCS) chat capabilities for the specified phone number.
    * @param address The phone number for which to get the RCS chat capabilites
    * @return The locally cached RCS chat capabilities.
    */
  def getCachedCapabilitiesAsync(address: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatCapabilities] = js.native
  /**
    * Asynchronously gets the Rich Communication Services (RCS) chat capabilities for the specified phone number from the service provider.
    * @param address The phone number for which to get the RCS chat capabilities.
    * @return The RCS chat capabilities from the service provider.
    */
  def getCapabilitiesFromNetworkAsync(address: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatCapabilities] = js.native
}

