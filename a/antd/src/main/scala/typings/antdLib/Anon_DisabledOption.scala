package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledOption extends js.Object {
  var disabled: scala.Boolean
  var value: js.Any
  def toggleOption(option: antdLib.libCheckboxGroupMod.CheckboxOptionType): scala.Unit
}

object Anon_DisabledOption {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    toggleOption: antdLib.libCheckboxGroupMod.CheckboxOptionType => scala.Unit,
    value: js.Any
  ): Anon_DisabledOption = {
    val __obj = js.Dynamic.literal(disabled = disabled, toggleOption = js.Any.fromFunction1(toggleOption), value = value)
  
    __obj.asInstanceOf[Anon_DisabledOption]
  }
}

