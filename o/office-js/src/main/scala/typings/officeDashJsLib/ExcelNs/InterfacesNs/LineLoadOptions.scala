package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a line inside a worksheet. To get the corresponding Shape object, use `Line.shape`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait LineLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the shape to which the beginning of the specified line is attached.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginConnectedShape: js.UndefOr[ShapeLoadOptions] = js.undefined
  /**
    *
    * Represents the connection site to which the beginning of a connector is connected. Read-only. Returns null when the beginning of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginConnectedSite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the shape to which the end of the specified line is attached.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endConnectedShape: js.UndefOr[ShapeLoadOptions] = js.undefined
  /**
    *
    * Represents the connection site to which the end of a connector is connected. Read-only. Returns null when the end of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endConnectedSite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the beginning of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isBeginConnected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the end of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEndConnected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the Shape object associated with the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shape: js.UndefOr[ShapeLoadOptions] = js.undefined
}

object LineLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    beginArrowheadLength: js.UndefOr[scala.Boolean] = js.undefined,
    beginArrowheadStyle: js.UndefOr[scala.Boolean] = js.undefined,
    beginArrowheadWidth: js.UndefOr[scala.Boolean] = js.undefined,
    beginConnectedShape: ShapeLoadOptions = null,
    beginConnectedSite: js.UndefOr[scala.Boolean] = js.undefined,
    connectorType: js.UndefOr[scala.Boolean] = js.undefined,
    endArrowheadLength: js.UndefOr[scala.Boolean] = js.undefined,
    endArrowheadStyle: js.UndefOr[scala.Boolean] = js.undefined,
    endArrowheadWidth: js.UndefOr[scala.Boolean] = js.undefined,
    endConnectedShape: ShapeLoadOptions = null,
    endConnectedSite: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    isBeginConnected: js.UndefOr[scala.Boolean] = js.undefined,
    isEndConnected: js.UndefOr[scala.Boolean] = js.undefined,
    shape: ShapeLoadOptions = null
  ): LineLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(beginArrowheadLength)) __obj.updateDynamic("beginArrowheadLength")(beginArrowheadLength)
    if (!js.isUndefined(beginArrowheadStyle)) __obj.updateDynamic("beginArrowheadStyle")(beginArrowheadStyle)
    if (!js.isUndefined(beginArrowheadWidth)) __obj.updateDynamic("beginArrowheadWidth")(beginArrowheadWidth)
    if (beginConnectedShape != null) __obj.updateDynamic("beginConnectedShape")(beginConnectedShape)
    if (!js.isUndefined(beginConnectedSite)) __obj.updateDynamic("beginConnectedSite")(beginConnectedSite)
    if (!js.isUndefined(connectorType)) __obj.updateDynamic("connectorType")(connectorType)
    if (!js.isUndefined(endArrowheadLength)) __obj.updateDynamic("endArrowheadLength")(endArrowheadLength)
    if (!js.isUndefined(endArrowheadStyle)) __obj.updateDynamic("endArrowheadStyle")(endArrowheadStyle)
    if (!js.isUndefined(endArrowheadWidth)) __obj.updateDynamic("endArrowheadWidth")(endArrowheadWidth)
    if (endConnectedShape != null) __obj.updateDynamic("endConnectedShape")(endConnectedShape)
    if (!js.isUndefined(endConnectedSite)) __obj.updateDynamic("endConnectedSite")(endConnectedSite)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isBeginConnected)) __obj.updateDynamic("isBeginConnected")(isBeginConnected)
    if (!js.isUndefined(isEndConnected)) __obj.updateDynamic("isEndConnected")(isEndConnected)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[LineLoadOptions]
  }
}

