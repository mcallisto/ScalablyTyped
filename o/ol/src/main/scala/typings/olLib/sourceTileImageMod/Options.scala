package typings
package olLib.sourceTileImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributions: js.UndefOr[olLib.sourceSourceMod.AttributionLike] = js.undefined
  var attributionsCollapsible: js.UndefOr[scala.Boolean] = js.undefined
  var cacheSize: js.UndefOr[scala.Double] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var opaque: js.UndefOr[scala.Boolean] = js.undefined
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var state: js.UndefOr[olLib.sourceStateMod.State] = js.undefined
  var tileClass: js.UndefOr[olLib.imageTileMod.default] = js.undefined
  var tileGrid: js.UndefOr[olLib.tilegridTileGridMod.default] = js.undefined
  var tileLoadFunction: js.UndefOr[olLib.tileMod.LoadFunction] = js.undefined
  var tilePixelRatio: js.UndefOr[scala.Double] = js.undefined
  var tileUrlFunction: js.UndefOr[olLib.tileMod.UrlFunction] = js.undefined
  var transition: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attributions: olLib.sourceSourceMod.AttributionLike = null,
    attributionsCollapsible: js.UndefOr[scala.Boolean] = js.undefined,
    cacheSize: scala.Int | scala.Double = null,
    crossOrigin: java.lang.String = null,
    key: java.lang.String = null,
    opaque: js.UndefOr[scala.Boolean] = js.undefined,
    projection: olLib.projMod.ProjectionLike = null,
    reprojectionErrorThreshold: scala.Int | scala.Double = null,
    state: olLib.sourceStateMod.State = null,
    tileClass: olLib.imageTileMod.default = null,
    tileGrid: olLib.tilegridTileGridMod.default = null,
    tileLoadFunction: olLib.tileMod.LoadFunction = null,
    tilePixelRatio: scala.Int | scala.Double = null,
    tileUrlFunction: olLib.tileMod.UrlFunction = null,
    transition: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    urls: js.Array[java.lang.String] = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionsCollapsible)) __obj.updateDynamic("attributionsCollapsible")(attributionsCollapsible)
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (tileClass != null) __obj.updateDynamic("tileClass")(tileClass)
    if (tileGrid != null) __obj.updateDynamic("tileGrid")(tileGrid)
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(tileLoadFunction)
    if (tilePixelRatio != null) __obj.updateDynamic("tilePixelRatio")(tilePixelRatio.asInstanceOf[js.Any])
    if (tileUrlFunction != null) __obj.updateDynamic("tileUrlFunction")(tileUrlFunction)
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}

