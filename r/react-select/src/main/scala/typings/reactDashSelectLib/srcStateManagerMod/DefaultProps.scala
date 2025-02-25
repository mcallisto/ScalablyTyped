package typings
package reactDashSelectLib.srcStateManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps[OptionType] extends js.Object {
  var defaultInputValue: java.lang.String
  var defaultMenuIsOpen: scala.Boolean
  var defaultValue: reactDashSelectLib.srcTypesMod.ValueType[OptionType]
}

object DefaultProps {
  @scala.inline
  def apply[OptionType](
    defaultInputValue: java.lang.String,
    defaultMenuIsOpen: scala.Boolean,
    defaultValue: reactDashSelectLib.srcTypesMod.ValueType[OptionType]
  ): DefaultProps[OptionType] = {
    val __obj = js.Dynamic.literal(defaultInputValue = defaultInputValue, defaultMenuIsOpen = defaultMenuIsOpen, defaultValue = defaultValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultProps[OptionType]]
  }
}

