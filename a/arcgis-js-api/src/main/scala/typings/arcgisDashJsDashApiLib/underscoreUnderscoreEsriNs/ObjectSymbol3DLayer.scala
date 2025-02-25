package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectSymbol3DLayer
  extends Symbol3DLayer
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.Symbol3DLayer
     with symbolsSymbol3DLayer {
  /**
    * The positioning of the symbol relative to the geometry. The default behavior (`origin`) depends on the resource:
    *   * For `sphere`, `cube` and `diamond` primitives, the origin is at the center.
    *   * For `cylinder`, `cone`, `inverted-cone` and `tetrahedron` primitives, the origin is at the bottom.
    *   * For `href` resources, the origin coincides with the origin of the 3D model.
    *
    *
    * If `anchor` is set to `relative`, the anchor is defined by [`anchorPosition`](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition) as a fraction of the symbol's bounding box.  **Possible Values:** center | top | bottom | origin | relative
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor)
    *
    * @default origin
    */
  var anchor: java.lang.String = js.native
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor) relative to the center of the [symbol layer resource](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource). It is specified as a ratio of the resource's bounding box dimensions. For example, a value of `{ x: 0, y: 0, z: 0 }` designates the center, while a value of `{ x: -0.5, y: -0.5, z: -0.5 }` places the symbol at the lower south-west corner of the symbol's bounding box.  This property only applies when [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor) is set to `relative`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: ObjectSymbol3DLayerAnchorPosition = js.native
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: scala.Boolean = js.native
  /**
    * The depth, or diameter from north to south, of the object in meters. If `undefined`, the depth will be calculated to maintain the original proportions of the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#depth)
    *
    * @default 10
    */
  var depth: scala.Double = js.native
  /**
    * The clockwise rotation of the symbol in the horizontal plane (i.e., around the z axis). The rotation is specified in degrees and is relative to the y-axis.  If the symbol resource is aligned such that its forward facing side points in the direction of the y-axis (the y-axis always points North in WGS84 or WebMercator coordinates), its upwards facing side is pointing in the direction of the z-axis, and its right-hand side points in the direction of the x-axis (the x-axis always points East in WGS84 or WebMercator coordinates), then this angle corresponds to the heading of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#heading)
    */
  var heading: scala.Double = js.native
  /**
    * The height of the object in meters. If `undefined`, the height will be calculated to maintain the original proportions of the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#height)
    *
    * @default 10
    */
  var height: scala.Double = js.native
  /**
    * The material used to shade the object. This property defines the object's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#material)
    */
  var material: ObjectSymbol3DLayerMaterial = js.native
  /**
    * The primitive shape (`primitive`) or external 3D model (`href`) used to visualize the points. If both properties are present, `primitive` takes precedence and `href` is ignored. When using the `href` property, external 3D models must be present in glTF format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
    *
    * @default { primitive: "sphere" }
    */
  var resource: ObjectSymbol3DLayerResource = js.native
  /**
    * The rotation of the symbol in the lateral vertical plane (i.e., around the y axis). The rotation is specified in degrees and is relative to the x-axis. At 0 degrees, the model is level. A positive value lifts the left part and lowers the right part of the model.  If the symbol resource is aligned such that its forward facing side points in the direction of the y-axis (the y-axis always points North in WGS84 or WebMercator coordinates), its upwards facing side is pointing in the direction of the z-axis, and its right-hand side points in the direction of the x-axis (the x-axis always points East in WGS84 or WebMercator coordinates), then this angle corresponds to the roll of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#roll)
    */
  var roll: scala.Double = js.native
  /**
    * The rotation of the symbol in the longitudinal vertical plane (i.e., around the x axis). The rotation is specified in degrees and is relative to the y-axis. At 0 degrees, the model is level. A positive value points lifts the front and lowers the back of the model.  If the symbol resource is aligned such that its forward facing side points in the direction of the y-axis (the y-axis always points North in WGS84 or WebMercator coordinates), its upwards facing side is pointing in the direction of the z-axis, and its right-hand side points in the direction of the x-axis (the x-axis always points East in WGS84 or WebMercator coordinates), then this angle corresponds to the tilt of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#tilt)
    */
  var tilt: scala.Double = js.native
  /**
    * For ObjectSymbol3DLayer the type is always `object`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_ObjectSymbol3DLayer: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`object` = js.native
  /**
    * The width, or diameter from east to west, of the object in meters. If `undefined`, the width will be calculated to maintain the original proportions of the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#width)
    *
    * @default 10
    */
  var width: scala.Double = js.native
}

@JSGlobal("__esri.ObjectSymbol3DLayer")
@js.native
/**
  * ObjectSymbol3DLayer is used to render [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries using a volumetric 3D shape (e.g., a sphere or cylinder) with a [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) does not support 3D symbols. [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) features may also be rendered with ObjectSymbol3DLayers, but the object symbol layer must be contained in a [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html), not a [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) in this scenario.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html)
  */
class ObjectSymbol3DLayerCls () extends ObjectSymbol3DLayer {
  def this(properties: ObjectSymbol3DLayerProperties) = this()
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

