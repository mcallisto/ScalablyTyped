package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EdgeLength extends js.Object {
  /**
    * The distance between 2 nodes on edge.
    * This distance is also affected by
    * [repulsion](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.force.repulsion)
    * .
    *
    * It can be an array to represent the range of edge length.
    * In this case edge with larger value will be shorter, which
    * means two nodes are closer.
    * And edge with smaller value will be longer.
    *
    *
    * @default
    * 30
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.force.edgeLength
    */
  var edgeLength: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
  /**
    * The gravity factor enforcing nodes approach to the center.
    * The nodes will be closer to the center as the value becomes
    * larger.
    *
    *
    * @default
    * 0.1
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.force.gravity
    */
  var gravity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The initial layout before force-directed layout, which will
    * influence on the result of force-directed layout.
    *
    * It defaults not to do any layout and use
    * [x](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.x)
    * ,
    * [y](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data.y)
    * provided in
    * [node](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.data)
    * as the position of node.
    * If it doesn't exist, the position will be generated randomly.
    *
    * You can also use circular layout `'circular'`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.force.initLayout
    */
  var initLayout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Because the force-directed layout will be steady after several
    * iterations, this parameter will be decide whether to show
    * the iteration animation of layout.
    * It is not recommended to be closed on browser when there
    * are a lot of node data (>100) as the layout process will
    * cause browser to hang.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.force.layoutAnimation
    */
  var layoutAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The repulsion factor between nodes.
    * The repulsion will be stronger and the distance between 2
    * nodes becomes further as this value becomes larger.
    *
    * It can be an array to represent the range of repulsion.
    * In this case larger value have larger repulsion and smaller
    * value will have smaller repulsion.
    *
    *
    * @default
    * 50
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.force.repulsion
    */
  var repulsion: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
}

object Anon_EdgeLength {
  @scala.inline
  def apply(
    edgeLength: js.Array[_] | scala.Double = null,
    gravity: scala.Int | scala.Double = null,
    initLayout: java.lang.String = null,
    layoutAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    repulsion: js.Array[_] | scala.Double = null
  ): Anon_EdgeLength = {
    val __obj = js.Dynamic.literal()
    if (edgeLength != null) __obj.updateDynamic("edgeLength")(edgeLength.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (initLayout != null) __obj.updateDynamic("initLayout")(initLayout)
    if (!js.isUndefined(layoutAnimation)) __obj.updateDynamic("layoutAnimation")(layoutAnimation)
    if (repulsion != null) __obj.updateDynamic("repulsion")(repulsion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EdgeLength]
  }
}

