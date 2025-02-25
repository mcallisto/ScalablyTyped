package typings
package antdLib.esFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedFormInternalProps[V] extends js.Object {
  var form: WrappedFormUtils[V]
}

object WrappedFormInternalProps {
  @scala.inline
  def apply[V](form: WrappedFormUtils[V]): WrappedFormInternalProps[V] = {
    val __obj = js.Dynamic.literal(form = form)
  
    __obj.asInstanceOf[WrappedFormInternalProps[V]]
  }
}

