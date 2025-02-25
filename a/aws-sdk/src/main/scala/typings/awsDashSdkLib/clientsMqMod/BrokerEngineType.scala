package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerEngineType extends js.Object {
  /**
    * The type of broker engine.
    */
  var EngineType: js.UndefOr[EngineType] = js.undefined
  /**
    * The list of engine versions.
    */
  var EngineVersions: js.UndefOr[__listOfEngineVersion] = js.undefined
}

object BrokerEngineType {
  @scala.inline
  def apply(EngineType: EngineType = null, EngineVersions: __listOfEngineVersion = null): BrokerEngineType = {
    val __obj = js.Dynamic.literal()
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType.asInstanceOf[js.Any])
    if (EngineVersions != null) __obj.updateDynamic("EngineVersions")(EngineVersions)
    __obj.asInstanceOf[BrokerEngineType]
  }
}

