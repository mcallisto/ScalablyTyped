package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Target extends js.Object {
  var target: js.Function0[stdLib.Window | scala.Null]
}

object Anon_Target {
  @scala.inline
  def apply(target: () => stdLib.Window | scala.Null): Anon_Target = {
    val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target))
  
    __obj.asInstanceOf[Anon_Target]
  }
}

