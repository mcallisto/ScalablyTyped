package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ChargeRequestAdditionalRecipient")
@js.native
class ChargeRequestAdditionalRecipient () extends js.Object {
  /**
    * The amount of money distributed to the recipient.
    */
  var amount_money: Money = js.native
  /**
    * The description of the additional recipient.
    */
  var description: java.lang.String = js.native
  /**
    * The location ID for a recipient (other than the merchant) receiving a portion of the tender.
    */
  var location_id: java.lang.String = js.native
}

