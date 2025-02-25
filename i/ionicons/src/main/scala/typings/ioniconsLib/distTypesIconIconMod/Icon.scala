package typings
package ioniconsLib.distTypesIconIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionicons/dist/types/icon/icon", "Icon")
@js.native
class Icon () extends js.Object {
  /**
    * Specifies the label to use for accessibility. Defaults to the icon name.
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.native
  /**
    * The color to use for the background of the item.
    */
  var color: js.UndefOr[java.lang.String] = js.native
  var el: stdLib.HTMLElement = js.native
  /**
    * Specifies whether the icon should horizontally flip when `dir` is `"rtl"`.
    */
  var flipRtl: js.UndefOr[scala.Boolean] = js.native
  /**
    * A combination of both `name` and `src`. If a `src` url is detected
    * it will set the `src` property. Otherwise it assumes it's a built-in named
    * SVG and set the `name` property.
    */
  var icon: js.UndefOr[js.Any] = js.native
  var io: js.UndefOr[js.Any] = js.native
  /**
    * Specifies which icon to use on `ios` mode.
    */
  var ios: js.UndefOr[java.lang.String] = js.native
  var isVisible: js.Any = js.native
  /**
    * If enabled, ion-icon will be loaded lazily when it's visible in the viewport.
    * Default, `false`.
    */
  var `lazy`: scala.Boolean = js.native
  /**
    * Specifies which icon to use on `md` mode.
    */
  var md: js.UndefOr[java.lang.String] = js.native
  var mode: java.lang.String = js.native
  /**
    * Specifies which icon to use from the built-in set of icons.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * The size of the icon.
    * Available options are: `"small"` and `"large"`.
    */
  var size: js.UndefOr[java.lang.String] = js.native
  /**
    * Specifies the exact `src` of an SVG file to use.
    */
  var src: js.UndefOr[java.lang.String] = js.native
  var svgContent: js.UndefOr[js.Any] = js.native
  var waitUntilVisible: js.Any = js.native
  def connectedCallback(): scala.Unit = js.native
  def disconnectedCallback(): scala.Unit = js.native
  def loadIcon(): scala.Unit = js.native
  def render(): js.Any = js.native
}

