package typings
package semanticDashUiDashVisibilityLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("visibility")
  var visibility_Original: semanticDashUiDashVisibilityLib.SemanticUINs.Visibility = js.native
  def visibility(): JQuery = js.native
  def visibility(settings: semanticDashUiDashVisibilityLib.SemanticUINs.VisibilitySettings): JQuery = js.native
  @JSName("visibility")
  def visibility_destroy(behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.destroy): JQuery = js.native
  /**
    * Disable callbacks temporarily. This is useful if you need to adjust scroll position and do not want to trigger callbacks during the position change.
    */
  @JSName("visibility")
  def visibility_disablecallbacks(
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`disable callbacks`
  ): JQuery = js.native
  /**
    * Re-enable callbacks
    */
  @JSName("visibility")
  def visibility_enablecallbacks(
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`enable callbacks`
  ): JQuery = js.native
  /**
    * Returns element calculations as object
    */
  @JSName("visibility")
  def visibility_getelementcalculations(
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`get element calculations`
  ): semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs.ElementCalculations = js.native
  /**
    * Returns number of pixels passed in current element from top of element
    */
  @JSName("visibility")
  def visibility_getpixelspassed(
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`get pixels passed`
  ): scala.Double = js.native
  /**
    * Returns screen calculations as object
    */
  @JSName("visibility")
  def visibility_getscreencalculations(
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`get screen calculations`
  ): semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs.ScreenCalculations = js.native
  /**
    * Returns screen size as object
    */
  @JSName("visibility")
  def visibility_getscreensize(behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`get screen size`): semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs.ScreenSize = js.native
  /**
    * Returns whether element is off screen
    */
  @JSName("visibility")
  def visibility_isoffscreen(behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`is off screen`): scala.Boolean = js.native
  /**
    * Returns whether element is on screen
    */
  @JSName("visibility")
  def visibility_isonscreen(behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.`is on screen`): scala.Boolean = js.native
  @JSName("visibility")
  def visibility_setting(
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.setting,
    value: semanticDashUiDashVisibilityLib.SemanticUINs.VisibilitySettings
  ): JQuery = js.native
  @JSName("visibility")
  def visibility_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl[K] */ js.Any = js.native
  @JSName("visibility")
  def visibility_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

