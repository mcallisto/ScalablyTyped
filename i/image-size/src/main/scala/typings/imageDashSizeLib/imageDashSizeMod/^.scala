package typings
package imageDashSizeLib.imageDashSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-size", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(pathOrBuffer: java.lang.String | nodeLib.Buffer): ImageInfo = js.native
  def apply(
    path: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* dimensions */ ImageInfo, scala.Unit]
  ): scala.Unit = js.native
}

