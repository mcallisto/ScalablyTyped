package typings
package twilsockLib.twilsockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @alias Twilsock
  * @classdesc Client library for the Twilsock service
  * It allows to recevie service-generated updates as well as bi-directional transport
  * @fires Twilsock#message
  * @fires Twilsock#connected
  * @fires Twilsock#disconnected
  * @fires Twilsock#tokenAboutToExpire
  * @fires Twilsock#stateChanged
  * @fires Twilsock#connectionError
  */
@JSImport("twilsock", "Twilsock")
@js.native
class Twilsock protected ()
  extends twilsockLib.libClientMod.TwilsockClient {
  /**
    * @param {string} token Twilio access token
    * @param {string} productId Product identifier. Should be the same as a grant name in token
    */
  def this(token: java.lang.String, productId: java.lang.String) = this()
  def this(token: java.lang.String, productId: java.lang.String, options: js.Any) = this()
}

