package typings
package hlsDotJsLib.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragParsingUserData extends js.Object {
  var frag: Fragment
  var id: java.lang.String
  var samples: js.Array[_]
}

object fragParsingUserData {
  @scala.inline
  def apply(frag: Fragment, id: java.lang.String, samples: js.Array[_]): fragParsingUserData = {
    val __obj = js.Dynamic.literal(frag = frag, id = id, samples = samples)
  
    __obj.asInstanceOf[fragParsingUserData]
  }
}

