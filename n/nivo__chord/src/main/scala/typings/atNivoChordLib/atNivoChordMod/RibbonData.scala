package typings
package atNivoChordLib.atNivoChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RibbonData extends js.Object {
  var id: java.lang.String
  var source: RibbonSubject
  var target: RibbonSubject
}

object RibbonData {
  @scala.inline
  def apply(id: java.lang.String, source: RibbonSubject, target: RibbonSubject): RibbonData = {
    val __obj = js.Dynamic.literal(id = id, source = source, target = target)
  
    __obj.asInstanceOf[RibbonData]
  }
}

