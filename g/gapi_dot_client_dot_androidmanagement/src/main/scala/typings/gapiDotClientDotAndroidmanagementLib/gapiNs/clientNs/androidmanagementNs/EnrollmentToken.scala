package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnrollmentToken extends js.Object {
  /**
    * Optional, arbitrary data associated with the enrollment token. This could contain, for example, the id of an org unit to which the device is assigned
    * after enrollment. After a device enrolls with the token, this data will be exposed in the enrollment_token_data field of the Device resource. The data
    * must be 1024 characters or less; otherwise, the creation request will fail.
    */
  var additionalData: js.UndefOr[java.lang.String] = js.undefined
  /** The duration of the token. If not specified, the duration will be 1 hour. The allowed range is 1 minute to 30 days. */
  var duration: js.UndefOr[java.lang.String] = js.undefined
  /** The expiration time of the token. This is a read-only field generated by the server. */
  var expirationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the enrollment token, which is generated by the server during creation, in the form
    * enterprises/{enterpriseId}/enrollmentTokens/{enrollmentTokenId}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the policy that will be initially applied to the enrolled device in the form enterprises/{enterpriseId}/policies/{policyId}. If not
    * specified, the policy with id default is applied. It is permissible to only specify the policyId when updating this field as long as the policyId
    * contains no slashes since the rest of the policy name can be inferred from context.
    */
  var policyName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A JSON string whose UTF-8 representation can be used to generate a QR code to enroll a device with this enrollment token. To enroll a device using NFC,
    * the NFC record must contain a serialized java.util.Properties representation of the properties in the JSON.
    */
  var qrCode: js.UndefOr[java.lang.String] = js.undefined
  /** The token value which is passed to the device and authorizes the device to enroll. This is a read-only field generated by the server. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object EnrollmentToken {
  @scala.inline
  def apply(
    additionalData: java.lang.String = null,
    duration: java.lang.String = null,
    expirationTimestamp: java.lang.String = null,
    name: java.lang.String = null,
    policyName: java.lang.String = null,
    qrCode: java.lang.String = null,
    value: java.lang.String = null
  ): EnrollmentToken = {
    val __obj = js.Dynamic.literal()
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (expirationTimestamp != null) __obj.updateDynamic("expirationTimestamp")(expirationTimestamp)
    if (name != null) __obj.updateDynamic("name")(name)
    if (policyName != null) __obj.updateDynamic("policyName")(policyName)
    if (qrCode != null) __obj.updateDynamic("qrCode")(qrCode)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EnrollmentToken]
  }
}

