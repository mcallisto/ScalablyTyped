package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFace extends js.Object {
  var MozFontFeatureSettings: js.UndefOr[FontFaceFontFeatureSettingsProperty] = js.undefined
  var fontDisplay: js.UndefOr[FontFaceFontDisplayProperty] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontFeatureSettings: js.UndefOr[FontFaceFontFeatureSettingsProperty] = js.undefined
  var fontStretch: js.UndefOr[FontFaceFontStretchProperty] = js.undefined
  var fontStyle: js.UndefOr[FontFaceFontStyleProperty] = js.undefined
  var fontVariant: js.UndefOr[FontFaceFontVariantProperty] = js.undefined
  var fontVariationSettings: js.UndefOr[FontFaceFontVariationSettingsProperty] = js.undefined
  var fontWeight: js.UndefOr[FontFaceFontWeightProperty] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var unicodeRange: js.UndefOr[java.lang.String] = js.undefined
}

object FontFace {
  @scala.inline
  def apply(
    MozFontFeatureSettings: FontFaceFontFeatureSettingsProperty = null,
    fontDisplay: FontFaceFontDisplayProperty = null,
    fontFamily: java.lang.String = null,
    fontFeatureSettings: FontFaceFontFeatureSettingsProperty = null,
    fontStretch: FontFaceFontStretchProperty = null,
    fontStyle: FontFaceFontStyleProperty = null,
    fontVariant: FontFaceFontVariantProperty = null,
    fontVariationSettings: FontFaceFontVariationSettingsProperty = null,
    fontWeight: FontFaceFontWeightProperty = null,
    src: java.lang.String = null,
    unicodeRange: java.lang.String = null
  ): FontFace = {
    val __obj = js.Dynamic.literal()
    if (MozFontFeatureSettings != null) __obj.updateDynamic("MozFontFeatureSettings")(MozFontFeatureSettings.asInstanceOf[js.Any])
    if (fontDisplay != null) __obj.updateDynamic("fontDisplay")(fontDisplay)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontFeatureSettings != null) __obj.updateDynamic("fontFeatureSettings")(fontFeatureSettings.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontVariationSettings != null) __obj.updateDynamic("fontVariationSettings")(fontVariationSettings.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src)
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange)
    __obj.asInstanceOf[FontFace]
  }
}

