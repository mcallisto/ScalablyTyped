package typings
package reactstrapLib.libTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncontrolledTooltipProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var autohide: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var delay: js.UndefOr[scala.Double | reactstrapLib.Anon_Hide] = js.undefined
  var fade: js.UndefOr[scala.Boolean] = js.undefined
  var flip: js.UndefOr[scala.Boolean] = js.undefined
  var innerClassName: js.UndefOr[java.lang.String] = js.undefined
  var modifiers: js.UndefOr[popperDotJsLib.popperDotJsMod.Modifiers] = js.undefined
  var placement: js.UndefOr[popperDotJsLib.popperDotJsMod.Placement] = js.undefined
  var target: java.lang.String | stdLib.HTMLElement
}

object UncontrolledTooltipProps {
  @scala.inline
  def apply(
    target: java.lang.String | stdLib.HTMLElement,
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    autohide: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    container: java.lang.String | stdLib.HTMLElement = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    delay: scala.Double | reactstrapLib.Anon_Hide = null,
    fade: js.UndefOr[scala.Boolean] = js.undefined,
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    innerClassName: java.lang.String = null,
    modifiers: popperDotJsLib.popperDotJsMod.Modifiers = null,
    placement: popperDotJsLib.popperDotJsMod.Placement = null
  ): UncontrolledTooltipProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide)
    if (className != null) __obj.updateDynamic("className")(className)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (innerClassName != null) __obj.updateDynamic("innerClassName")(innerClassName)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    __obj.asInstanceOf[UncontrolledTooltipProps]
  }
}

