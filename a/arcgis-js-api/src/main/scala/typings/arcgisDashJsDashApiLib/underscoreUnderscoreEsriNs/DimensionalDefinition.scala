package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionalDefinition
  extends Accessor
     with JSONSupport {
  /**
    * The dimension associated with the variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#dimensionName)
    */
  var dimensionName: java.lang.String = js.native
  /**
    * Indicates whether the values indicate slices (rather than ranges).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#isSlice)
    *
    * @default false
    */
  var isSlice: scala.Boolean = js.native
  /**
    * An array of single values or tuples [min, max] each defining a range of valid values along the specified dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#values)
    */
  var values: js.Array[scala.Double | js.Array[scala.Double]] = js.native
  /**
    * The required variable name by which to filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#variableName)
    */
  var variableName: java.lang.String = js.native
}

@JSGlobal("__esri.DimensionalDefinition")
@js.native
/**
  * A dimensional definition defines a filter based on one variable and one dimension. You can filter with one or multiple dimensional slices. Instances of this class are typically used when filtering data based on [slices](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#isSlice) or ranges in one or more dimensions with [MosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html)
  */
class DimensionalDefinitionCls () extends DimensionalDefinition {
  def this(properties: DimensionalDefinitionProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

