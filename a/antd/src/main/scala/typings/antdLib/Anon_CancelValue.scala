package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelValue extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var value: js.Array[java.lang.String | scala.Double | scala.Boolean]
  def cancelValue(value: java.lang.String): scala.Unit
  def registerValue(value: java.lang.String): scala.Unit
  def toggleOption(option: antdLib.esCheckboxGroupMod.CheckboxOptionType): scala.Unit
}

object Anon_CancelValue {
  @scala.inline
  def apply(
    cancelValue: java.lang.String => scala.Unit,
    registerValue: java.lang.String => scala.Unit,
    toggleOption: antdLib.esCheckboxGroupMod.CheckboxOptionType => scala.Unit,
    value: js.Array[java.lang.String | scala.Double | scala.Boolean],
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null
  ): Anon_CancelValue = {
    val __obj = js.Dynamic.literal(cancelValue = js.Any.fromFunction1(cancelValue), registerValue = js.Any.fromFunction1(registerValue), toggleOption = js.Any.fromFunction1(toggleOption), value = value)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_CancelValue]
  }
}

