package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Customer")
@js.native
class Customer () extends js.Object {
  /**
    * The customer's physical address.
    */
  var address: js.UndefOr[Address] = js.native
  /**
    * The customer's birthday in RFC-3339 format. Year is optional, timezone and times are not allowed. Example:
    * `0000-09-01T00:00:00-00:00` for a birthday on September 1st. `1998-09-01T00:00:00-00:00` for a birthday on
    * September 1st 1998.
    */
  var birthday: js.UndefOr[java.lang.String] = js.native
  /**
    * The payment details of the customer's cards on file.
    */
  var cards: js.UndefOr[js.Array[Card]] = js.native
  /**
    * The name of the customer's company.
    */
  var company_name: js.UndefOr[java.lang.String] = js.native
  /**
    * The time when the customer was created, in RFC 3339 format.
    */
  var created_at: java.lang.String = js.native
  /**
    * A creation source represents the method used to create the customer profile.
    * See [CustomerCreationSource](#type-customercreationsource) for possible values.
    */
  var creation_source: js.UndefOr[squareDashConnectLib.squareDashConnectMod.CustomerNs.CreationSourceEnum] = js.native
  /**
    * The customer's email address.
    */
  var email_address: js.UndefOr[java.lang.String] = js.native
  /**
    * The customer's family (i.e., last) name.
    */
  var family_name: js.UndefOr[java.lang.String] = js.native
  /**
    * The customer's given (i.e., first) name.
    */
  var given_name: js.UndefOr[java.lang.String] = js.native
  /**
    * The groups the customer belongs to.
    */
  var groups: js.UndefOr[js.Array[CustomerGroupInfo]] = js.native
  /**
    * The customer's unique ID.
    */
  var id: java.lang.String = js.native
  /**
    * The customer's nickname.
    */
  var nickname: js.UndefOr[java.lang.String] = js.native
  /**
    * A note to associate with the customer.
    */
  var note: js.UndefOr[java.lang.String] = js.native
  /**
    * The customer's phone number.
    */
  var phone_number: js.UndefOr[java.lang.String] = js.native
  /**
    * The customer's preferences.
    */
  var preferences: js.UndefOr[CustomerPreferences] = js.native
  /**
    * A second ID you can set to associate the customer with an entity in another system.
    */
  var reference_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The time when the customer was last updated, in RFC 3339 format.
    */
  var updated_at: java.lang.String = js.native
}

