package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidMobileAppIdentifier extends MobileAppIdentifier {
  /** The identifier for an app, as specified in the play store. */
  var packageId: js.UndefOr[java.lang.String] = js.undefined
}

object AndroidMobileAppIdentifier {
  @scala.inline
  def apply(packageId: java.lang.String = null): AndroidMobileAppIdentifier = {
    val __obj = js.Dynamic.literal()
    if (packageId != null) __obj.updateDynamic("packageId")(packageId)
    __obj.asInstanceOf[AndroidMobileAppIdentifier]
  }
}

