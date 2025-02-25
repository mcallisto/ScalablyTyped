package typings
package pngDotJsLib.pngDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNG extends js.Object {
  var alpha: scala.Boolean = js.native
  var bitDepth: BitDepth = js.native
  var colorType: ColorType = js.native
  var colors: scala.Double = js.native
  var compressionMethod: pngDotJsLib.pngDotJsLibNumbers.`0` = js.native
  var filterMethod: pngDotJsLib.pngDotJsLibNumbers.`0` = js.native
  var height: scala.Double = js.native
  var interlaceMethod: pngDotJsLib.pngDotJsLibNumbers.`0` | pngDotJsLib.pngDotJsLibNumbers.`1` = js.native
  var palette: js.Array[scala.Double] | scala.Null = js.native
  var pixelBits: scala.Double = js.native
  var pixels: nodeLib.Buffer | scala.Null = js.native
  var width: scala.Double = js.native
  def getBitDepth(): BitDepth = js.native
  def getColorType(): ColorType = js.native
  def getCompressionMethod(): pngDotJsLib.pngDotJsLibNumbers.`0` = js.native
  def getFilterMethod(): pngDotJsLib.pngDotJsLibNumbers.`0` = js.native
  def getHeight(): scala.Double = js.native
  def getInterlaceMethod(): pngDotJsLib.pngDotJsLibNumbers.`0` | pngDotJsLib.pngDotJsLibNumbers.`1` = js.native
  def getPalette(): js.Array[scala.Double] = js.native
  def getPixel(x: scala.Double, y: scala.Double): js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double] = js.native
  def getWidth(): scala.Double = js.native
  def setBitDepth(bitDepth: BitDepth): scala.Unit = js.native
  def setColorType(colorType: ColorType): scala.Unit = js.native
  @JSName("setCompressionMethod")
  def setCompressionMethod_0(compressionMethod: pngDotJsLib.pngDotJsLibNumbers.`0`): scala.Unit = js.native
  @JSName("setFilterMethod")
  def setFilterMethod_0(filterMethod: pngDotJsLib.pngDotJsLibNumbers.`0`): scala.Unit = js.native
  def setHeight(height: scala.Double): scala.Unit = js.native
  @JSName("setInterlaceMethod")
  def setInterlaceMethod_0(interlaceMethod: pngDotJsLib.pngDotJsLibNumbers.`0`): scala.Unit = js.native
  @JSName("setInterlaceMethod")
  def setInterlaceMethod_1(interlaceMethod: pngDotJsLib.pngDotJsLibNumbers.`1`): scala.Unit = js.native
  def setPalette(palette: js.Array[scala.Double]): scala.Unit = js.native
  def setWidth(width: scala.Double): scala.Unit = js.native
}

