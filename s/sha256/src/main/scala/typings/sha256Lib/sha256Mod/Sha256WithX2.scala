package typings
package sha256Lib.sha256Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha256WithX2 extends Sha256 {
  @JSName("x2")
  var x2_Original: Sha256 = js.native
  def x2(message: Message): java.lang.String = js.native
  def x2(message: Message, options: sha256Lib.Anon_AsBytes): js.Array[scala.Double] = js.native
  def x2(message: Message, options: sha256Lib.Anon_AsString): java.lang.String = js.native
}

