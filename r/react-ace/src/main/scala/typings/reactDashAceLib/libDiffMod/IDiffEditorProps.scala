package typings
package reactDashAceLib.libDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiffEditorProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cursorStart: js.UndefOr[scala.Double] = js.undefined
  var editorProps: js.UndefOr[js.Object] = js.undefined
  var enableBasicAutocompletion: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var enableLiveAutocompletion: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var highlightActiveLine: js.UndefOr[scala.Boolean] = js.undefined
  var maxLines: js.UndefOr[scala.Double] = js.undefined
  var minLines: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* value */ js.Array[java.lang.String], /* event */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* editor */ reactDashAceLib.libTypesMod.IEditorProps, scala.Unit]] = js.undefined
  var onPaste: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* editor */ reactDashAceLib.libTypesMod.IEditorProps, scala.Unit]] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var scrollMargin: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var setOptions: js.UndefOr[js.Object] = js.undefined
  var showGutter: js.UndefOr[scala.Boolean] = js.undefined
  var showPrintMargin: js.UndefOr[scala.Boolean] = js.undefined
  var splits: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabSize: js.UndefOr[scala.Double] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
  var wrapEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object IDiffEditorProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    cursorStart: scala.Int | scala.Double = null,
    editorProps: js.Object = null,
    enableBasicAutocompletion: scala.Boolean | js.Array[java.lang.String] = null,
    enableLiveAutocompletion: scala.Boolean | js.Array[java.lang.String] = null,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    fontSize: scala.Int | scala.Double = null,
    height: java.lang.String = null,
    highlightActiveLine: js.UndefOr[scala.Boolean] = js.undefined,
    maxLines: scala.Int | scala.Double = null,
    minLines: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    name: java.lang.String = null,
    onChange: (/* value */ js.Array[java.lang.String], /* event */ js.UndefOr[js.Any]) => scala.Unit = null,
    onLoad: /* editor */ reactDashAceLib.libTypesMod.IEditorProps => scala.Unit = null,
    onPaste: /* value */ java.lang.String => scala.Unit = null,
    onScroll: /* editor */ reactDashAceLib.libTypesMod.IEditorProps => scala.Unit = null,
    orientation: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    scrollMargin: js.Array[scala.Double] = null,
    setOptions: js.Object = null,
    showGutter: js.UndefOr[scala.Boolean] = js.undefined,
    showPrintMargin: js.UndefOr[scala.Boolean] = js.undefined,
    splits: scala.Int | scala.Double = null,
    style: js.Object = null,
    tabSize: scala.Int | scala.Double = null,
    theme: java.lang.String = null,
    value: js.Array[java.lang.String] = null,
    width: java.lang.String = null,
    wrapEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): IDiffEditorProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (cursorStart != null) __obj.updateDynamic("cursorStart")(cursorStart.asInstanceOf[js.Any])
    if (editorProps != null) __obj.updateDynamic("editorProps")(editorProps)
    if (enableBasicAutocompletion != null) __obj.updateDynamic("enableBasicAutocompletion")(enableBasicAutocompletion.asInstanceOf[js.Any])
    if (enableLiveAutocompletion != null) __obj.updateDynamic("enableLiveAutocompletion")(enableLiveAutocompletion.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(highlightActiveLine)) __obj.updateDynamic("highlightActiveLine")(highlightActiveLine)
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (minLines != null) __obj.updateDynamic("minLines")(minLines.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (scrollMargin != null) __obj.updateDynamic("scrollMargin")(scrollMargin)
    if (setOptions != null) __obj.updateDynamic("setOptions")(setOptions)
    if (!js.isUndefined(showGutter)) __obj.updateDynamic("showGutter")(showGutter)
    if (!js.isUndefined(showPrintMargin)) __obj.updateDynamic("showPrintMargin")(showPrintMargin)
    if (splits != null) __obj.updateDynamic("splits")(splits.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width)
    if (!js.isUndefined(wrapEnabled)) __obj.updateDynamic("wrapEnabled")(wrapEnabled)
    __obj.asInstanceOf[IDiffEditorProps]
  }
}

