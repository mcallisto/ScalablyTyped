package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dotDensityCreateRendererParamsAttributes
  extends stdLib.Object {
  /**
    * The name of a numeric field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The label describing the field name (or category) in the legend. This is should be used if the given field doesn't have an intuitive field name or alias. For example, for a field named `dem` representing the total vote count for the Democratic party, you can set the label to `Democrat` to clarify the name of the category in the final visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    */
  var valueExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text describing the value returned from the `valueExpression`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    */
  var valueExpressionTitle: js.UndefOr[java.lang.String] = js.undefined
}

object dotDensityCreateRendererParamsAttributes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    field: java.lang.String = null,
    label: java.lang.String = null,
    valueExpression: java.lang.String = null,
    valueExpressionTitle: java.lang.String = null
  ): dotDensityCreateRendererParamsAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (field != null) __obj.updateDynamic("field")(field)
    if (label != null) __obj.updateDynamic("label")(label)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle)
    __obj.asInstanceOf[dotDensityCreateRendererParamsAttributes]
  }
}

