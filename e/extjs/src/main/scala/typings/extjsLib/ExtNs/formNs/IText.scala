package typings
package extjsLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IText
  extends extjsLib.ExtNs.formNs.fieldNs.IBase {
  /** [Config Option] (Boolean) */
  var allowBlank: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowOnlyWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Automatically grows the field to accomodate the width of the text up to the maximum field width allowed  */
  var autoSize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] private */
  @JSName("beforeFocus")
  var beforeFocus_IText: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var blankText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var disableKeyFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var emptyCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var enableKeyEvents: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enforceMaxLength: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Validates a value according to the field s validation rules and returns an array of errors for any failing validations
  		* @param value Object The value to validate. The processed raw value will be used if nothing is passed.
  		* @returns String[] Array of any validation errors
  		*/
  @JSName("getErrors")
  var getErrors_IText: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the raw String value of the field without performing any normalization conversion or validation
  		* @returns String The raw String value of the field
  		*/
  @JSName("getRawValue")
  var getRawValue_IText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Boolean) */
  var grow: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var growAppend: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var growMax: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var growMin: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (RegExp) */
  var maskRe: js.UndefOr[stdLib.RegExp] = js.undefined
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var maxLengthText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var minLength: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var minLengthText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] private */
  @JSName("postBlur")
  var postBlur_IText: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Performs any necessary manipulation of a raw String value to prepare it for conversion and or validation
  		* @param value String The unprocessed string value
  		* @returns String The processed string value
  		*/
  @JSName("processRawValue")
  var processRawValue_IText: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  /** [Config Option] (RegExp) */
  var regex: js.UndefOr[stdLib.RegExp] = js.undefined
  /** [Config Option] (String) */
  var regexText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var requiredCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  @JSName("reset")
  var reset_IText: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var selectOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Selects text in this field
  		* @param start Number The index where the selection should start
  		* @param end Number The index where the selection should end (defaults to the text length)
  		*/
  var selectText: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[scala.Double], /* end */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Method] Sets a data value into the field and runs the change detection and validation
  		* @param value Object The value to set
  		* @returns any this
  		*/
  @JSName("setValue")
  var setValue_IText: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Number) */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (RegExp) */
  var stripCharsRe: js.UndefOr[stdLib.RegExp] = js.undefined
  /** [Config Option] (Boolean) */
  var validateBlank: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Function) */
  var validator: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var vtype: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var vtypeText: js.UndefOr[java.lang.String] = js.undefined
}

object IText {
  @scala.inline
  def apply(
    IBase: extjsLib.ExtNs.formNs.fieldNs.IBase = null,
    afterComponentLayout: () => scala.Unit = null,
    afterRender: () => scala.Unit = null,
    allowBlank: js.UndefOr[scala.Boolean] = js.undefined,
    allowOnlyWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    applyState: /* state */ js.UndefOr[js.Any] => scala.Unit = null,
    autoSize: () => scala.Unit = null,
    beforeFocus: () => scala.Unit = null,
    blankText: java.lang.String = null,
    disableKeyFilter: js.UndefOr[scala.Boolean] = js.undefined,
    emptyCls: java.lang.String = null,
    emptyText: java.lang.String = null,
    enableKeyEvents: js.UndefOr[scala.Boolean] = js.undefined,
    enforceMaxLength: js.UndefOr[scala.Boolean] = js.undefined,
    getErrors: /* value */ js.UndefOr[js.Any] => extjsLib.ExtNs.Array = null,
    getRawValue: () => java.lang.String = null,
    getState: () => _ = null,
    getSubTplData: () => _ = null,
    grow: js.UndefOr[scala.Boolean] = js.undefined,
    growAppend: java.lang.String = null,
    growMax: scala.Int | scala.Double = null,
    growMin: scala.Int | scala.Double = null,
    initComponent: () => scala.Unit = null,
    initEvents: () => scala.Unit = null,
    maskRe: stdLib.RegExp = null,
    maxLength: scala.Int | scala.Double = null,
    maxLengthText: java.lang.String = null,
    minLength: scala.Int | scala.Double = null,
    minLengthText: java.lang.String = null,
    onDestroy: () => scala.Unit = null,
    onDisable: () => scala.Unit = null,
    onEnable: () => scala.Unit = null,
    postBlur: () => scala.Unit = null,
    processRawValue: /* value */ js.UndefOr[java.lang.String] => java.lang.String = null,
    regex: stdLib.RegExp = null,
    regexText: java.lang.String = null,
    requiredCls: java.lang.String = null,
    reset: () => scala.Unit = null,
    selectOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    selectText: (/* start */ js.UndefOr[scala.Double], /* end */ js.UndefOr[scala.Double]) => scala.Unit = null,
    setValue: /* value */ js.UndefOr[js.Any] => _ = null,
    size: scala.Int | scala.Double = null,
    stripCharsRe: stdLib.RegExp = null,
    validateBlank: js.UndefOr[scala.Boolean] = js.undefined,
    validator: js.Any = null,
    vtype: java.lang.String = null,
    vtypeText: java.lang.String = null
  ): IText = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBase)
    if (afterComponentLayout != null) __obj.updateDynamic("afterComponentLayout")(js.Any.fromFunction0(afterComponentLayout))
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction0(afterRender))
    if (!js.isUndefined(allowBlank)) __obj.updateDynamic("allowBlank")(allowBlank)
    if (!js.isUndefined(allowOnlyWhitespace)) __obj.updateDynamic("allowOnlyWhitespace")(allowOnlyWhitespace)
    if (applyState != null) __obj.updateDynamic("applyState")(js.Any.fromFunction1(applyState))
    if (autoSize != null) __obj.updateDynamic("autoSize")(js.Any.fromFunction0(autoSize))
    if (beforeFocus != null) __obj.updateDynamic("beforeFocus")(js.Any.fromFunction0(beforeFocus))
    if (blankText != null) __obj.updateDynamic("blankText")(blankText)
    if (!js.isUndefined(disableKeyFilter)) __obj.updateDynamic("disableKeyFilter")(disableKeyFilter)
    if (emptyCls != null) __obj.updateDynamic("emptyCls")(emptyCls)
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText)
    if (!js.isUndefined(enableKeyEvents)) __obj.updateDynamic("enableKeyEvents")(enableKeyEvents)
    if (!js.isUndefined(enforceMaxLength)) __obj.updateDynamic("enforceMaxLength")(enforceMaxLength)
    if (getErrors != null) __obj.updateDynamic("getErrors")(js.Any.fromFunction1(getErrors))
    if (getRawValue != null) __obj.updateDynamic("getRawValue")(js.Any.fromFunction0(getRawValue))
    if (getState != null) __obj.updateDynamic("getState")(js.Any.fromFunction0(getState))
    if (getSubTplData != null) __obj.updateDynamic("getSubTplData")(js.Any.fromFunction0(getSubTplData))
    if (!js.isUndefined(grow)) __obj.updateDynamic("grow")(grow)
    if (growAppend != null) __obj.updateDynamic("growAppend")(growAppend)
    if (growMax != null) __obj.updateDynamic("growMax")(growMax.asInstanceOf[js.Any])
    if (growMin != null) __obj.updateDynamic("growMin")(growMin.asInstanceOf[js.Any])
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (initEvents != null) __obj.updateDynamic("initEvents")(js.Any.fromFunction0(initEvents))
    if (maskRe != null) __obj.updateDynamic("maskRe")(maskRe)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxLengthText != null) __obj.updateDynamic("maxLengthText")(maxLengthText)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minLengthText != null) __obj.updateDynamic("minLengthText")(minLengthText)
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction0(onDestroy))
    if (onDisable != null) __obj.updateDynamic("onDisable")(js.Any.fromFunction0(onDisable))
    if (onEnable != null) __obj.updateDynamic("onEnable")(js.Any.fromFunction0(onEnable))
    if (postBlur != null) __obj.updateDynamic("postBlur")(js.Any.fromFunction0(postBlur))
    if (processRawValue != null) __obj.updateDynamic("processRawValue")(js.Any.fromFunction1(processRawValue))
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (regexText != null) __obj.updateDynamic("regexText")(regexText)
    if (requiredCls != null) __obj.updateDynamic("requiredCls")(requiredCls)
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (!js.isUndefined(selectOnFocus)) __obj.updateDynamic("selectOnFocus")(selectOnFocus)
    if (selectText != null) __obj.updateDynamic("selectText")(js.Any.fromFunction2(selectText))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stripCharsRe != null) __obj.updateDynamic("stripCharsRe")(stripCharsRe)
    if (!js.isUndefined(validateBlank)) __obj.updateDynamic("validateBlank")(validateBlank)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    if (vtype != null) __obj.updateDynamic("vtype")(vtype)
    if (vtypeText != null) __obj.updateDynamic("vtypeText")(vtypeText)
    __obj.asInstanceOf[IText]
  }
}

