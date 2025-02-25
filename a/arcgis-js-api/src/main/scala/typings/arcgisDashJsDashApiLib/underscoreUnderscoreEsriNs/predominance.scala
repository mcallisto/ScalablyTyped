package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains a helper method for generating a predominance visualization. Visualizing predominance involves coloring a [layer’s](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) features based on which attribute among a set of competing numeric attributes wins or beats the others in total count. Common applications of this include visualizing election results, survey results, and demographic majorities.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html)
  */
trait predominance extends js.Object {
  /**
    * Generates a predominance renderer based on a set of competing numeric fields.  Visualizing predominance involves coloring a [layer’s](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) features based on which attribute among a set of competing numeric attributes wins or beats the others in total count. Common applications of this include visualizing election results, survey results, and demographic majorities.  For example, suppose you have a layer of U.S. counties with fields containing the total sales of various crops: wheat, soybeans, corn, cotton, and vegetables. If a feature has the following values for each field:
    *
    * Field Name | Count | Color
    * -----------|-------|------
    * Wheat | 130 | purple
    * Soybeans | 2000 | blue
    * Corn | 0 | yellow
    * Cotton | 300 | green
    * Vegetables | 120 | red
    *
    * Then the renderer symbolizes the feature with a blue color since Soybeans is the predominant crop.  The predominant field of a feature is determined based on the result of an Arcade expression generated by this method. You are required to provide a `layer`, `view`, and list of `fields` to generate this renderer. Optionally, you can set `includeSizeVariable` to `true` to change the size of each feature to indicate how influential the feature is compared to the entire layer as a whole. You can also set `includeOpacityVariable` to `true` to add opacity to each feature depending on how strong the predominant field is compared to all the other fields. For the example above, the feature would likely be opaque since Soybeans beats all other features combined by a wide margin. If the Soybean total were still the highest, but only 301, then the feature would be very transparent, indicating the Soybean total wins, but not by a wide margin.  Other options are provided for convenience for more involved custom visualization authoring applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#createRenderer)
    *
    * @param params Input parameters for generating a predominance visualization based on a set of competing field(s). See the table below for details of each parameter.
    * @param params.layer The layer for which the visualization is generated.
    * @param params.view The view instance in which the visualization will be rendered.
    * @param params.fields A set of competing numeric fields used as the basis of the predominance visualization. For example, if creating an election map, you would indicate the names of each field representing the candidate or political party where total votes are stored.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    * @param params.includeOpacityVariable Indicates whether to include data-driven opacity in the final renderer. If `true`, features where the predominant value beats all others by a large margin are given a high opacity. Features where the predominant value beats others by a small margin will be assigned a low opacity, indicating that while the feature has a winning value, it doesn't win by much.  ![predominance-opacity](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/predominance-opacity.png)
    * @param params.includeSizeVariable Indicates whether to include data-driven size in the final renderer. If `true`, features will be assigned a sized based on the sum of all competing values in the `fields` param. Features with small total counts will be sized with small icons or lines depending on the geometry type of the layer, and features with large total counts will be sized with large icons or lines. Enabling this option is good for visualizing how influential a particular feature is compared to the dataset as a whole. It removes bias introduced by features with large geographic areas, but relatively small data values.  ![predominance-size](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/predominance-size.png)
    * @param params.outlineOptimizationEnabled Only for polygon layers. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.sizeOptimizationEnabled Only for polygon layers when `includeSizeVariable` is `true`. Indicates whether the icon sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.legendOptions Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    * @param params.statistics A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function. The `createAgeRenderer()` method generates an Arcade expression and executes a statistics query against the layer for the result of the expression. If statistics for the expression have already been generated, then pass the object here to avoid making a second statistics query.
    * @param params.sortBy
    * Indicates how values should be sorted in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html). See the table below for information about values that may be passed to this parameter.
    *
    *   Possible Value | Description
    *   ---------------|------------
    *   count | Unique values/types will be sorted from highest to lowest based on the count of features that fall in each category.
    *   value | Unique values/types will be sorted in the order they were specified in the `fields` parameter.
    *
    *   **Possible Values:** count | value
    * @param params.predominanceScheme In authoring apps, the user may select a pre-defined predominance scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    * @param params.symbolType
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter does not need to be specified for layers with a `mesh` geometry type. Possible values are described below.
    *
    *   | Value | Description |
    *   | ----- | ----------- |
    *   | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    *   | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    *   | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A SceneView instance must be provided to the `view` parameter if this option is used. |
    * @param params.defaultSymbolEnabled Enables the `defaultSymbol` on the renderer and assigns it to features with no value.
    * @param params.colorMixMode
    * **This option only applies to generating renderers for mesh SceneLayers**. Specifies how the symbol's color is applied to the geometry color/texture. See the documentation in [FillSymbol3DLayer.material](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material) for more context. See the table below for possible values.
    *
    *   Value | Description
    *   ------|------------
    *   tint | Applies the symbol `color` to the desaturated geometry/texture color.
    *   replace | Removes the geometry/texture color and applies the symbol `color`.
    *   multiply | Multiplies geometry/texture color value with the symbol `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    *
    */
  def createRenderer(params: predominanceCreateRendererParams): arcgisDashJsDashApiLib.IPromise[predominanceRendererResult]
}

object predominance {
  @scala.inline
  def apply(
    createRenderer: predominanceCreateRendererParams => arcgisDashJsDashApiLib.IPromise[predominanceRendererResult]
  ): predominance = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
  
    __obj.asInstanceOf[predominance]
  }
}

