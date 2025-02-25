package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkFrameworkConfiguration extends js.Object {
  /**
    *  Hyperledger Fabric configuration properties for a Managed Blockchain network that uses Hyperledger Fabric. 
    */
  var Fabric: js.UndefOr[NetworkFabricConfiguration] = js.undefined
}

object NetworkFrameworkConfiguration {
  @scala.inline
  def apply(Fabric: NetworkFabricConfiguration = null): NetworkFrameworkConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Fabric != null) __obj.updateDynamic("Fabric")(Fabric)
    __obj.asInstanceOf[NetworkFrameworkConfiguration]
  }
}

