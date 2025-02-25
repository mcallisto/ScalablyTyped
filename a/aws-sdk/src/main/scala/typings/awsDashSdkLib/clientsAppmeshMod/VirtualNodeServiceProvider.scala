package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeServiceProvider extends js.Object {
  /**
    * The name of the virtual node that is acting as a service provider.
    */
  var virtualNodeName: ResourceName
}

object VirtualNodeServiceProvider {
  @scala.inline
  def apply(virtualNodeName: ResourceName): VirtualNodeServiceProvider = {
    val __obj = js.Dynamic.literal(virtualNodeName = virtualNodeName)
  
    __obj.asInstanceOf[VirtualNodeServiceProvider]
  }
}

