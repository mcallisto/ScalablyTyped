package typings
package punycodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("punycode", JSImport.Namespace)
@js.native
object punycodeMod extends js.Object {
  val version: java.lang.String = js.native
  def decode(input: java.lang.String): java.lang.String = js.native
  def encode(input: java.lang.String): java.lang.String = js.native
  def toASCII(input: java.lang.String): java.lang.String = js.native
  def toUnicode(input: java.lang.String): java.lang.String = js.native
  @JSName("ucs2")
  @js.native
  object ucs2Ns extends js.Object {
    def decode(string: java.lang.String): js.Array[scala.Double] = js.native
    def encode(array: js.Array[scala.Double]): java.lang.String = js.native
  }
  
}

