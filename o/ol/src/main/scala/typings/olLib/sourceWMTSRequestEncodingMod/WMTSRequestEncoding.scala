package typings
package olLib.sourceWMTSRequestEncodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WMTSRequestEncoding extends js.Object

@JSImport("ol/source/WMTSRequestEncoding", "WMTSRequestEncoding")
@js.native
object WMTSRequestEncoding extends js.Object {
  @js.native
  sealed trait KVP
    extends olLib.sourceWMTSRequestEncodingMod.WMTSRequestEncoding
  
  @js.native
  sealed trait REST
    extends olLib.sourceWMTSRequestEncodingMod.WMTSRequestEncoding
  
}

