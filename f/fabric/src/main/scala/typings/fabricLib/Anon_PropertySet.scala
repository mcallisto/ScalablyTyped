package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PropertySet extends js.Object {
  var propertySet: js.UndefOr[java.lang.String] = js.undefined
  var stateProperties: js.UndefOr[js.Array[_]] = js.undefined
}

object Anon_PropertySet {
  @scala.inline
  def apply(propertySet: java.lang.String = null, stateProperties: js.Array[_] = null): Anon_PropertySet = {
    val __obj = js.Dynamic.literal()
    if (propertySet != null) __obj.updateDynamic("propertySet")(propertySet)
    if (stateProperties != null) __obj.updateDynamic("stateProperties")(stateProperties)
    __obj.asInstanceOf[Anon_PropertySet]
  }
}

