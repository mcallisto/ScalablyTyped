package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesTreemapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  var children: js.UndefOr[js.Array[DataObject]] = js.undefined
  /**
    * Children will not be shown when area size of a node is smaller
    * than this value (unit: px square).
    *
    * This can hide the details of nodes when the rectangular area
    * is not large enough.
    * When users zoom nodes, the child node would show if the area
    * is larger than this threshold.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `childrenVisibleMin` attribute could appear
    * in more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.childrenVisibleMin
    */
  var childrenVisibleMin: js.UndefOr[scala.Double] = js.undefined
  /**
    * A color list for a level.
    * Each node in the level will obtain a color from the color
    * list (the rule see
    * [colorMappingBy](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.colorMappingBy)
    * ).
    * It is empty by default, which means the global color list
    * will be used.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `color` attribute could appear in more
    * than one places:
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.color
    */
  var color: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * It indicates the range of tranparent rate (color alpha) for
    * nodes in a level . The range of values is 0 ~ 1.
    *
    * For example, `colorAlpha` can be `[0.3, 1]`.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorAlpha` attribute could appear in
    * more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.colorAlpha
    */
  var colorAlpha: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Specify the rule according to which each node obtain color
    * from
    * [color list](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.color)
    * . Optional values:
    *
    * + `'value'`:
    *
    * Map
    * [series-treemap.data.value](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.value)
    * to color.
    *
    * In this way, the color of each node indicate its value.
    *
    * [visualDimension](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.visualDimension)
    * can be used to specify which dimension of
    * [data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * is used to perform visual mapping.
    *
    * + `'index'`:
    *
    * Map the `index` (ordinal number) of nodes to color.
    * Namely, in a level, the first node is mapped to the first
    * color of
    * [color list](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.color)
    * , and the second node gets the second color.
    *
    * In this way, adjacent nodes are distinguished by color.
    *
    * + `'id'`:
    *
    * Map
    * [series-treemap.data.id](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.id)
    * to color.
    *
    * Since `id` is used to identify node, if user call `setOption`
    * to modify the tree, each node will remain the original color
    * before and after `setOption` called. See this
    * [example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=treemap-obama&edit=1&reset=1)
    * .
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorMappingBy` attribute could appear
    * in more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @default
    * "index"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.colorMappingBy
    */
  var colorMappingBy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * It indicates the range of saturation (color alpha) for nodes
    * in a level . The range of values is 0 ~ 1.
    *
    * For example, `colorSaturation` can be `[0.3, 1]`.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `colorSaturation` attribute could appear
    * in more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.colorSaturation
    */
  var colorSaturation: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.emphasis
    */
  var emphasis: js.UndefOr[
    echartsLib.Anon_ItemStyleLabelUpperLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsis
  ] = js.undefined
  /**
    * `id` is not mandatory.
    * But if using API, id is used to locate node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * > Tps: In treemap, `itemStyle` attribute could appear in
    * more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_BorderColorBorderColorSaturationBorderWidth] = js.undefined
  /**
    * `label` decribes the style of the label in each node.
    *
    * > Tps: In treemap, `label` attribute could appear in more
    * than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsisFontFamilyFontSize
  ] = js.undefined
  /**
    * Show the description text in rectangle.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * `upperLabel` is used to specify whether show label when the
    * node has children. When
    * [upperLabel.show](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.upperLabel.show)
    * is set as `true`, the feature that "show parent label" is
    * enabled.
    *
    * The same as
    * [series-treemap.label](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.label)
    * , the option `upperLabel` can be placed at the root of
    * [series-treemap](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap)
    * directly, or in
    * [series-treemap.level](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.level)
    * , or in each item of
    * [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * .
    *
    * Specifically,
    * [series-treemap.label](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.label)
    * specifies the style when a node is a leaf, while `upperLabel`
    * specifies the style when a node has children, in which case
    * the label is displayed in the inner top of the node.
    *
    * See:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.treemap.data)
    *
    * > Tps: In treemap, `label` attribute could appear in more
    * than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.upperLabel
    */
  var upperLabel: js.UndefOr[
    echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsisFontFamilyFontSizeFontStyle
  ] = js.undefined
  /**
    * The value of this node, indicating the area size.
    *
    * It could also be an array, such as \[2323, 43, 55\], in which
    * the first item of array indicates the area size.
    *
    * The other items of the array can be used for extra visual
    * mapping. See details in series-treemp.levels.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.value
    */
  var value: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
  /**
    * A node will not be shown when its area size is smaller than
    * this value (unit: px square).
    *
    * In this way, tiny nodes will be hidden, otherwise they will
    * huddle together.
    * When user zoom the treemap, the area size will increase and
    * the rectangle will be shown if the area size is larger than
    * this threshold.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `visibleMin` attribute could appear in
    * more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @default
    * 10
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.visibleMin
    */
  var visibleMin: js.UndefOr[scala.Double] = js.undefined
  /**
    * `treemap` is able to map any dimensions of data to visual.
    *
    * The value of
    * [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * can be an array.
    * And each item of the array represents a "dimension".
    * `visualDimension` specifies the dimension on which visual
    * mapping will be performed.
    *
    * About visual encoding, see details in
    * [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * .
    *
    * > Tps: In treemap, `visualDimension` attribute could appear
    * in more than one places:
    * >
    * > + It could appear in
    * > [sereis-treemap](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap)
    * > , indicating the unified setting of the series.
    * >
    * > + It could appear in each array element of
    * > [series-treemap.levels](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels)
    * > , indicating the unified setting of each level of the tree.
    * >
    * > + It could appear in each node of
    * > [series-treemap.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data)
    * > , indicating the particular setting of each node.
    * >
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.visualDimension
    */
  var visualDimension: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximal value of current level.
    * Auto-statistics by default.
    *
    * When
    * [colorMappingBy](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.colorMappingBy)
    * is set to `'value'`, you are able to specify extent manually
    * for visual mapping by specifying `visualMin` or `visualMax`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.visualMax
    */
  var visualMax: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimal value of current level.
    * Auto-statistics by default.
    *
    * When
    * [colorMappingBy](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.levels.colorMappingBy)
    * is set to `'value'`, you are able to specify extent manually
    * for visual mapping by specifying `visualMin` or `visualMax`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-treemap.data.visualMin
    */
  var visualMin: js.UndefOr[scala.Double] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    children: js.Array[DataObject] = null,
    childrenVisibleMin: scala.Int | scala.Double = null,
    color: js.Array[_] = null,
    colorAlpha: js.Array[_] = null,
    colorMappingBy: java.lang.String = null,
    colorSaturation: scala.Int | scala.Double = null,
    emphasis: echartsLib.Anon_ItemStyleLabelUpperLabelAnonAlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsis = null,
    id: java.lang.String = null,
    itemStyle: echartsLib.Anon_BorderColorBorderColorSaturationBorderWidth = null,
    label: echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsisFontFamilyFontSize = null,
    name: java.lang.String = null,
    upperLabel: echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceEllipsisFontFamilyFontSizeFontStyle = null,
    value: js.Array[_] | scala.Double = null,
    visibleMin: scala.Int | scala.Double = null,
    visualDimension: scala.Int | scala.Double = null,
    visualMax: scala.Int | scala.Double = null,
    visualMin: scala.Int | scala.Double = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (childrenVisibleMin != null) __obj.updateDynamic("childrenVisibleMin")(childrenVisibleMin.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorAlpha != null) __obj.updateDynamic("colorAlpha")(colorAlpha)
    if (colorMappingBy != null) __obj.updateDynamic("colorMappingBy")(colorMappingBy)
    if (colorSaturation != null) __obj.updateDynamic("colorSaturation")(colorSaturation.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (upperLabel != null) __obj.updateDynamic("upperLabel")(upperLabel)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (visibleMin != null) __obj.updateDynamic("visibleMin")(visibleMin.asInstanceOf[js.Any])
    if (visualDimension != null) __obj.updateDynamic("visualDimension")(visualDimension.asInstanceOf[js.Any])
    if (visualMax != null) __obj.updateDynamic("visualMax")(visualMax.asInstanceOf[js.Any])
    if (visualMin != null) __obj.updateDynamic("visualMin")(visualMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

