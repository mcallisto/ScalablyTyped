package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipSchemeForMesh
  extends stdLib.Object
     with RelationshipScheme {
  /**
    * Defines the colors to use in each bin of the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForMesh)
    */
  var colorsForClassBreaks: js.Array[RelationshipSchemeForMeshColorsForClassBreaks]
  /**
    * The ID uniquely identifying the color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForMesh)
    */
  var id: java.lang.String
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForMesh)
    */
  var name: java.lang.String
  /**
    * The color of the fill symbol used to indicate features with no data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForMesh)
    */
  var noDataColor: Color
  /**
    * The opacity of the fill symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForMesh)
    */
  var opacity: scala.Double
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForMesh)
    */
  var tags: js.Array[java.lang.String]
}

object RelationshipSchemeForMesh {
  @scala.inline
  def apply(
    colorsForClassBreaks: js.Array[RelationshipSchemeForMeshColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    id: java.lang.String,
    name: java.lang.String,
    noDataColor: Color,
    opacity: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    tags: js.Array[java.lang.String]
  ): RelationshipSchemeForMesh = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, name = name, noDataColor = noDataColor, opacity = opacity, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags)
  
    __obj.asInstanceOf[RelationshipSchemeForMesh]
  }
}

