package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeThingRequest extends js.Object {
  /**
    * The name of the thing.
    */
  var thingName: ThingName
}

object DescribeThingRequest {
  @scala.inline
  def apply(thingName: ThingName): DescribeThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName)
  
    __obj.asInstanceOf[DescribeThingRequest]
  }
}

