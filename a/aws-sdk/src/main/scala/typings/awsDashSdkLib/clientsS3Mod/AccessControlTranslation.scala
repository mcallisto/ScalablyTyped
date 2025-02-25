package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessControlTranslation extends js.Object {
  /**
    * Specifies the replica ownership. For default and valid values, see PUT bucket replication in the Amazon Simple Storage Service API Reference.
    */
  var Owner: OwnerOverride
}

object AccessControlTranslation {
  @scala.inline
  def apply(Owner: OwnerOverride): AccessControlTranslation = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccessControlTranslation]
  }
}

