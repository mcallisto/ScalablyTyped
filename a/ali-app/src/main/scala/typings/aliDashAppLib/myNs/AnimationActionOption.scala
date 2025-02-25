package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationActionOption extends js.Object {
  var transformOrigin: java.lang.String
  var transition: AnimationTransition
}

object AnimationActionOption {
  @scala.inline
  def apply(transformOrigin: java.lang.String, transition: AnimationTransition): AnimationActionOption = {
    val __obj = js.Dynamic.literal(transformOrigin = transformOrigin, transition = transition)
  
    __obj.asInstanceOf[AnimationActionOption]
  }
}

