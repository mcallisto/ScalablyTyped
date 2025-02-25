package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDataSourceFromRDSOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of the DataSourceID in the request. 
    */
  var DataSourceId: js.UndefOr[EntityId] = js.undefined
}

object CreateDataSourceFromRDSOutput {
  @scala.inline
  def apply(DataSourceId: EntityId = null): CreateDataSourceFromRDSOutput = {
    val __obj = js.Dynamic.literal()
    if (DataSourceId != null) __obj.updateDynamic("DataSourceId")(DataSourceId)
    __obj.asInstanceOf[CreateDataSourceFromRDSOutput]
  }
}

