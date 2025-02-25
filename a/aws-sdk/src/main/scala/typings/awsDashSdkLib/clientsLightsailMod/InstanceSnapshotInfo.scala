package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceSnapshotInfo extends js.Object {
  /**
    * The blueprint ID from which the source instance (e.g., os_debian_8_3).
    */
  var fromBlueprintId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The bundle ID from which the source instance was created (e.g., micro_1_0).
    */
  var fromBundleId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * A list of objects describing the disks that were attached to the source instance.
    */
  var fromDiskInfo: js.UndefOr[DiskInfoList] = js.undefined
}

object InstanceSnapshotInfo {
  @scala.inline
  def apply(
    fromBlueprintId: NonEmptyString = null,
    fromBundleId: NonEmptyString = null,
    fromDiskInfo: DiskInfoList = null
  ): InstanceSnapshotInfo = {
    val __obj = js.Dynamic.literal()
    if (fromBlueprintId != null) __obj.updateDynamic("fromBlueprintId")(fromBlueprintId)
    if (fromBundleId != null) __obj.updateDynamic("fromBundleId")(fromBundleId)
    if (fromDiskInfo != null) __obj.updateDynamic("fromDiskInfo")(fromDiskInfo)
    __obj.asInstanceOf[InstanceSnapshotInfo]
  }
}

