package typings
package vegaDashLiteLib.buildSrcToplevelpropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericCompositionLayout extends BoundsMixins {
  /**
    * The alignment to apply to grid rows and columns.
    * The supported string values are `"all"`, `"each"`, and `"none"`.
    *
    * - For `"none"`, a flow layout will be used, in which adjacent subviews are simply placed one after the other.
    * - For `"each"`, subviews will be aligned into a clean grid structure, but each row or column may be of variable size.
    * - For `"all"`, subviews will be aligned and each row or column will be sized identically based on the maximum observed size. String values for this property will be applied to both grid rows and columns.
    *
    * Alternatively, an object value of the form `{"row": string, "column": string}` can be used to supply different alignments for rows and columns.
    *
    * __Default value:__ `"all"`.
    */
  var align: js.UndefOr[
    vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgLayoutAlign | vegaDashLiteLib.buildSrcVegaDotSchemaMod.RowCol[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgLayoutAlign]
  ] = js.undefined
  /**
    * Boolean flag indicating if subviews should be centered relative to their respective rows or columns.
    *
    * An object value of the form `{"row": boolean, "column": boolean}` can be used to supply different centering values for rows and columns.
    *
    * __Default value:__ `false`
    */
  var center: js.UndefOr[scala.Boolean | vegaDashLiteLib.buildSrcVegaDotSchemaMod.RowCol[scala.Boolean]] = js.undefined
  /**
    * The spacing in pixels between sub-views of the composition operator.
    * An object of the form `{"row": number, "column": number}` can be used to set
    * different spacing values for rows and columns.
    *
    * __Default value__: `10`
    */
  var spacing: js.UndefOr[scala.Double | vegaDashLiteLib.buildSrcVegaDotSchemaMod.RowCol[scala.Double]] = js.undefined
}

object GenericCompositionLayout {
  @scala.inline
  def apply(
    align: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgLayoutAlign | vegaDashLiteLib.buildSrcVegaDotSchemaMod.RowCol[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgLayoutAlign] = null,
    bounds: vegaDashLiteLib.vegaDashLiteLibStrings.full | vegaDashLiteLib.vegaDashLiteLibStrings.flush = null,
    center: scala.Boolean | vegaDashLiteLib.buildSrcVegaDotSchemaMod.RowCol[scala.Boolean] = null,
    spacing: scala.Double | vegaDashLiteLib.buildSrcVegaDotSchemaMod.RowCol[scala.Double] = null
  ): GenericCompositionLayout = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericCompositionLayout]
  }
}

