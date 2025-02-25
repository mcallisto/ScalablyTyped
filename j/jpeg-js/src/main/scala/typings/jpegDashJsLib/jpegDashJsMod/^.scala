package typings
package jpegDashJsLib.jpegDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jpeg-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(jpegData: stdLib.ArrayBuffer): RawImageData[nodeLib.Buffer] = js.native
  def decode(jpegData: stdLib.ArrayBuffer, useTypedArray: scala.Boolean): RawImageData[stdLib.Uint8Array | nodeLib.Buffer] = js.native
  def decode(jpegData: stdLib.ArrayLike[scala.Double]): RawImageData[nodeLib.Buffer] = js.native
  def decode(jpegData: stdLib.ArrayLike[scala.Double], useTypedArray: scala.Boolean): RawImageData[stdLib.Uint8Array | nodeLib.Buffer] = js.native
  def decode(jpegData: stdLib.Iterable[scala.Double]): RawImageData[nodeLib.Buffer] = js.native
  def decode(jpegData: stdLib.Iterable[scala.Double], useTypedArray: scala.Boolean): RawImageData[stdLib.Uint8Array | nodeLib.Buffer] = js.native
  @JSName("decode")
  def decode_false(jpegData: stdLib.ArrayBuffer, useTypedArray: jpegDashJsLib.jpegDashJsLibNumbers.`false`): RawImageData[nodeLib.Buffer] = js.native
  @JSName("decode")
  def decode_false(
    jpegData: stdLib.ArrayLike[scala.Double],
    useTypedArray: jpegDashJsLib.jpegDashJsLibNumbers.`false`
  ): RawImageData[nodeLib.Buffer] = js.native
  @JSName("decode")
  def decode_false(jpegData: stdLib.Iterable[scala.Double], useTypedArray: jpegDashJsLib.jpegDashJsLibNumbers.`false`): RawImageData[nodeLib.Buffer] = js.native
  @JSName("decode")
  def decode_true(jpegData: stdLib.ArrayBuffer, useTypedArray: jpegDashJsLib.jpegDashJsLibNumbers.`true`): RawImageData[stdLib.Uint8Array] = js.native
  @JSName("decode")
  def decode_true(jpegData: stdLib.ArrayLike[scala.Double], useTypedArray: jpegDashJsLib.jpegDashJsLibNumbers.`true`): RawImageData[stdLib.Uint8Array] = js.native
  @JSName("decode")
  def decode_true(jpegData: stdLib.Iterable[scala.Double], useTypedArray: jpegDashJsLib.jpegDashJsLibNumbers.`true`): RawImageData[stdLib.Uint8Array] = js.native
  def encode(imgData: RawImageData[stdLib.Uint8Array | nodeLib.Buffer]): RawImageData[nodeLib.Buffer] = js.native
  def encode(imgData: RawImageData[stdLib.Uint8Array | nodeLib.Buffer], qu: scala.Double): RawImageData[nodeLib.Buffer] = js.native
}

