package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassedSizeSlider extends SmartMappingSliderBase {
  /**
    * An array of class breaks with associated sizes. The size mapped to each break should be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks)
    */
  var breaks: js.Array[ClassedSizeSliderBreaks] = js.native
  /**
    * The view model for the ClassedSizeSlider widget. This class contains all the logic (properties and methods) that controls this widget's behavior. See the [ClassedSizeSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider-ClassedSizeSliderViewModel.html) class to access all properties and methods on the ClassedSizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#viewModel)
    */
  var viewModel: ClassedSizeSliderViewModel = js.native
  @JSName("on")
  def on_maxchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`max-change`,
    eventHandler: ClassedSizeSliderMaxChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_minchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`min-change`,
    eventHandler: ClassedSizeSliderMinChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_thumbchange(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`thumb-change`,
    eventHandler: ClassedSizeSliderThumbChangeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_thumbdrag(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`thumb-drag`,
    eventHandler: ClassedSizeSliderThumbDragEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * A convenience function used to update the [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos) of a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) associated with this slider.  The number of breaks from the renderer must match the number of breaks in the slider. Generally, the input breaks for this method should come from the same renderer as one used to create the slider with the [fromRendererResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#fromRendererResult) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#updateClassBreakInfos)
    *
    * @param breakInfos The classBreakInfos from a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) instance to update based on the properties of the slider.
    *
    */
  def updateClassBreakInfos(breakInfos: js.Array[ClassBreakInfo]): js.Array[ClassBreakInfo] = js.native
  /**
    * A convenience function used to update the properties a ClassedSizeSlider from the result of the [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createClassBreaksRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#updateClassBreakInfos)
    *
    * @param rendererResult The result object from the [createClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createClassBreaksRenderer) method.
    * @param histogramResult The result histogram object from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#histogram) method.
    *
    */
  def updateClassBreakInfos(rendererResult: sizeClassBreaksRendererResult): scala.Unit = js.native
  def updateClassBreakInfos(rendererResult: sizeClassBreaksRendererResult, histogramResult: HistogramResult): scala.Unit = js.native
}

@JSGlobal("__esri.ClassedSizeSlider")
@js.native
/**
  * The ClassedSizeSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with size in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html). At a minimum you must set the [breaks](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks) property of the widget. The breaks are used to set the slider's thumbs.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html)
  */
class ClassedSizeSliderCls () extends ClassedSizeSlider {
  def this(properties: ClassedSizeSliderProperties) = this()
}

