package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapSliderViewModel extends SliderViewModel {
  /**
    * The colorStops of the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) to associate with the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider-HeatmapSliderViewModel.html#stops)
    */
  var stops: js.Array[HeatmapColorStop] = js.native
  /**
    * Generates the color ramp gradient rendered on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-HeatmapSlider-HeatmapSliderViewModel.html#getStopInfo)
    *
    *
    */
  def getStopInfo(): js.Array[HeatmapSliderViewModelStopInfo] = js.native
  @JSName("on")
  def on_maxchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`max-change`,
    eventHandler: HeatmapSliderViewModelMaxChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_minchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`min-change`,
    eventHandler: HeatmapSliderViewModelMinChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_valuechange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`value-change`,
    eventHandler: HeatmapSliderViewModelValueChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
}

@JSGlobal("__esri.HeatmapSliderViewModel")
@js.native
class HeatmapSliderViewModelCls () extends HeatmapSliderViewModel {
  def this(properties: HeatmapSliderViewModelProperties) = this()
}

