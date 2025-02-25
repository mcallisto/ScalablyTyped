package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "Cipher")
@js.native
class Cipher protected ()
  extends nodeLib.streamMod.Duplex {
  def `final`(): nodeLib.Buffer = js.native
  def `final`(output_encoding: java.lang.String): java.lang.String = js.native
  def setAutoPadding(): this.type = js.native
  def setAutoPadding(auto_padding: scala.Boolean): this.type = js.native
  def update(
    data: java.lang.String,
    input_encoding: js.UndefOr[scala.Nothing],
    output_encoding: HexBase64BinaryEncoding
  ): java.lang.String = js.native
  def update(data: java.lang.String, input_encoding: Utf8AsciiBinaryEncoding): nodeLib.Buffer = js.native
  def update(
    data: java.lang.String,
    input_encoding: Utf8AsciiBinaryEncoding,
    output_encoding: HexBase64BinaryEncoding
  ): java.lang.String = js.native
  def update(data: BinaryLike): nodeLib.Buffer = js.native
  def update(data: Binary, input_encoding: js.UndefOr[scala.Nothing], output_encoding: HexBase64BinaryEncoding): java.lang.String = js.native
}

