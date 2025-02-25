package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3AccessControlPolicy extends js.Object {
  /**
    * 
    */
  var AccessControlList: js.UndefOr[S3AccessControlList] = js.undefined
  /**
    * 
    */
  var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.undefined
}

object S3AccessControlPolicy {
  @scala.inline
  def apply(
    AccessControlList: S3AccessControlList = null,
    CannedAccessControlList: S3CannedAccessControlList = null
  ): S3AccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList)
    if (CannedAccessControlList != null) __obj.updateDynamic("CannedAccessControlList")(CannedAccessControlList.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3AccessControlPolicy]
  }
}

