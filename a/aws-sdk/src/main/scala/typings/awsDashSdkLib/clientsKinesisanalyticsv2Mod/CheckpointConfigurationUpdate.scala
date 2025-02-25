package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckpointConfigurationUpdate extends js.Object {
  /**
    * Describes updates to the interval in milliseconds between checkpoint operations.
    */
  var CheckpointIntervalUpdate: js.UndefOr[CheckpointInterval] = js.undefined
  /**
    * Describes updates to whether checkpointing is enabled for an application.
    */
  var CheckpointingEnabledUpdate: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data Analytics.
    */
  var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.undefined
  /**
    * Describes updates to the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.
    */
  var MinPauseBetweenCheckpointsUpdate: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined
}

object CheckpointConfigurationUpdate {
  @scala.inline
  def apply(
    CheckpointIntervalUpdate: js.UndefOr[CheckpointInterval] = js.undefined,
    CheckpointingEnabledUpdate: js.UndefOr[BooleanObject] = js.undefined,
    ConfigurationTypeUpdate: ConfigurationType = null,
    MinPauseBetweenCheckpointsUpdate: js.UndefOr[MinPauseBetweenCheckpoints] = js.undefined
  ): CheckpointConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CheckpointIntervalUpdate)) __obj.updateDynamic("CheckpointIntervalUpdate")(CheckpointIntervalUpdate)
    if (!js.isUndefined(CheckpointingEnabledUpdate)) __obj.updateDynamic("CheckpointingEnabledUpdate")(CheckpointingEnabledUpdate)
    if (ConfigurationTypeUpdate != null) __obj.updateDynamic("ConfigurationTypeUpdate")(ConfigurationTypeUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(MinPauseBetweenCheckpointsUpdate)) __obj.updateDynamic("MinPauseBetweenCheckpointsUpdate")(MinPauseBetweenCheckpointsUpdate)
    __obj.asInstanceOf[CheckpointConfigurationUpdate]
  }
}

