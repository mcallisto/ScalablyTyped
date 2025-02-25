package typings
package antdLib.libCheckboxGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxGroup
  extends reactLib.reactMod.Component[CheckboxGroupProps, CheckboxGroupState, js.Any] {
  def cancelValue(value: java.lang.String): scala.Unit = js.native
  def getChildContext(): antdLib.Anon_CheckboxGroupAnonCancelValueDisabled = js.native
  def getOptions(): js.Array[CheckboxOptionType] = js.native
  def registerValue(value: java.lang.String): scala.Unit = js.native
  def renderGroup(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCheckboxGroup(nextProps: CheckboxGroupProps, nextState: CheckboxGroupState): scala.Boolean = js.native
  def toggleOption(option: CheckboxOptionType): scala.Unit = js.native
}

