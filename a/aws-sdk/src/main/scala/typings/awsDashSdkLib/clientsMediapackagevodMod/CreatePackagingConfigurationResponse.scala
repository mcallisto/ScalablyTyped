package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePackagingConfigurationResponse extends js.Object {
  /**
    * The ARN of the PackagingConfiguration.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  var CmafPackage: js.UndefOr[CmafPackage] = js.undefined
  var DashPackage: js.UndefOr[DashPackage] = js.undefined
  var HlsPackage: js.UndefOr[HlsPackage] = js.undefined
  /**
    * The ID of the PackagingConfiguration.
    */
  var Id: js.UndefOr[__string] = js.undefined
  var MssPackage: js.UndefOr[MssPackage] = js.undefined
  /**
    * The ID of a PackagingGroup.
    */
  var PackagingGroupId: js.UndefOr[__string] = js.undefined
}

object CreatePackagingConfigurationResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CmafPackage: CmafPackage = null,
    DashPackage: DashPackage = null,
    HlsPackage: HlsPackage = null,
    Id: __string = null,
    MssPackage: MssPackage = null,
    PackagingGroupId: __string = null
  ): CreatePackagingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CmafPackage != null) __obj.updateDynamic("CmafPackage")(CmafPackage)
    if (DashPackage != null) __obj.updateDynamic("DashPackage")(DashPackage)
    if (HlsPackage != null) __obj.updateDynamic("HlsPackage")(HlsPackage)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (MssPackage != null) __obj.updateDynamic("MssPackage")(MssPackage)
    if (PackagingGroupId != null) __obj.updateDynamic("PackagingGroupId")(PackagingGroupId)
    __obj.asInstanceOf[CreatePackagingConfigurationResponse]
  }
}

