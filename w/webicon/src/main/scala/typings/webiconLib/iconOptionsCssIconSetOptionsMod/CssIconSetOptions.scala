package typings
package webiconLib.iconOptionsCssIconSetOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssIconSetOptions
  extends webiconLib.iconIconMod.Icon {
  /**
    * An alias of the `className`-property.
    */
  var `class`: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['className'] */ js.Any
  ] = js.undefined
  /**
    * Either a text-pattern or a callback which provides a css-classname.
    *
    * The symbols `?` and `%` in the text-pattern are replaced by the icon-id.
    */
  var className: js.UndefOr[webiconLib.iconCssClassConfigMod.CssClassConfig] = js.undefined
  /**
    * An alias of the `className`-property.
    */
  var cssClass: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: this['className'] */ js.Any
  ] = js.undefined
}

object CssIconSetOptions {
  @scala.inline
  def apply(
    `class`: /* import warning: ImportType.apply Failed type conversion: this['className'] */ js.Any = null,
    className: webiconLib.iconCssClassConfigMod.CssClassConfig = null,
    cssClass: /* import warning: ImportType.apply Failed type conversion: this['className'] */ js.Any = null,
    iconIdParser: (/* id */ java.lang.String, /* params */ js.Array[java.lang.String]) => java.lang.String = null
  ): CssIconSetOptions = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2(iconIdParser))
    __obj.asInstanceOf[CssIconSetOptions]
  }
}

