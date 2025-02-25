package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RotateLabel extends js.Object {
  /**
    * Whether to rotate the label automatically.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-graph.circular.rotateLabel
    */
  var rotateLabel: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_RotateLabel {
  @scala.inline
  def apply(rotateLabel: js.UndefOr[scala.Boolean] = js.undefined): Anon_RotateLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rotateLabel)) __obj.updateDynamic("rotateLabel")(rotateLabel)
    __obj.asInstanceOf[Anon_RotateLabel]
  }
}

