package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePublicKeyResult extends js.Object {
  /**
    * The current version of the public key. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The fully qualified URI of the new public key resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/cloudfront-public-key/EDFDVBD632BHDS5.
    */
  var Location: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Returned when you add a public key.
    */
  var PublicKey: js.UndefOr[PublicKey] = js.undefined
}

object CreatePublicKeyResult {
  @scala.inline
  def apply(ETag: java.lang.String = null, Location: java.lang.String = null, PublicKey: PublicKey = null): CreatePublicKeyResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey)
    __obj.asInstanceOf[CreatePublicKeyResult]
  }
}

