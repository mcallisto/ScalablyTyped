package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSatelliteResponse extends js.Object {
  /**
    * When a satellite was created.
    */
  var dateCreated: js.UndefOr[Timestamp] = js.undefined
  /**
    * When a satellite was last updated.
    */
  var lastUpdated: js.UndefOr[Timestamp] = js.undefined
  /**
    * NORAD satellite ID number.
    */
  var noradSatelliteID: js.UndefOr[noradSatelliteID] = js.undefined
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[satelliteArn] = js.undefined
  /**
    * UUID of a satellite.
    */
  var satelliteId: js.UndefOr[Uuid] = js.undefined
  /**
    * Tags assigned to a satellite.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}

object GetSatelliteResponse {
  @scala.inline
  def apply(
    dateCreated: Timestamp = null,
    lastUpdated: Timestamp = null,
    noradSatelliteID: js.UndefOr[noradSatelliteID] = js.undefined,
    satelliteArn: satelliteArn = null,
    satelliteId: Uuid = null,
    tags: TagsMap = null
  ): GetSatelliteResponse = {
    val __obj = js.Dynamic.literal()
    if (dateCreated != null) __obj.updateDynamic("dateCreated")(dateCreated)
    if (lastUpdated != null) __obj.updateDynamic("lastUpdated")(lastUpdated)
    if (!js.isUndefined(noradSatelliteID)) __obj.updateDynamic("noradSatelliteID")(noradSatelliteID)
    if (satelliteArn != null) __obj.updateDynamic("satelliteArn")(satelliteArn)
    if (satelliteId != null) __obj.updateDynamic("satelliteId")(satelliteId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetSatelliteResponse]
  }
}

