package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: scala.Boolean
  var placeholder: java.lang.String
  var prefixCls: java.lang.String
  var showCancelButton: scala.Boolean
  var styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.RegisteredStyle[_]]
  def onBlur(): scala.Unit
  def onChange(): scala.Unit
  def onClear(): scala.Unit
  def onFocus(): scala.Unit
  def onSubmit(): scala.Unit
}

object Anon_Disabled {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    onBlur: () => scala.Unit,
    onChange: () => scala.Unit,
    onClear: () => scala.Unit,
    onFocus: () => scala.Unit,
    onSubmit: () => scala.Unit,
    placeholder: java.lang.String,
    prefixCls: java.lang.String,
    showCancelButton: scala.Boolean,
    styles: org.scalablytyped.runtime.StringDictionary[reactDashNativeLib.reactDashNativeMod.RegisteredStyle[_]]
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onClear = js.Any.fromFunction0(onClear), onFocus = js.Any.fromFunction0(onFocus), onSubmit = js.Any.fromFunction0(onSubmit), placeholder = placeholder, prefixCls = prefixCls, showCancelButton = showCancelButton, styles = styles)
  
    __obj.asInstanceOf[Anon_Disabled]
  }
}

