package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  /**
    * The data blob, which is base64-encoded when the blob is serialized. The maximum size of the data blob, before base64-encoding, is 1,000 KiB.
    */
  var Data: awsDashSdkLib.clientsFirehoseMod.Data
}

object Record {
  @scala.inline
  def apply(Data: Data): Record = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Record]
  }
}

