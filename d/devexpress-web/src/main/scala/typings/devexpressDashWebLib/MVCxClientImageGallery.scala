package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the ImageGallery extension.
  */
@js.native
trait MVCxClientImageGallery extends ASPxClientImageGallery {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientImageGallery: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientImageGallery]] = js.native
  /**
    * Sends a callback with a parameter to update the ImageGallery by processing the passed information on the server, in an Action specified via the ImageGallery's CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the CustomActionRouteValues property.
    */
  def PerformCallback(data: js.Object): scala.Unit = js.native
  /**
    * Sends a callback with a parameter to update the ImageGallery by processing the passed information on the server, in an Action specified via the ImageGallery's CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Object, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

