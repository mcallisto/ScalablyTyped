package typings
package atStorybookThemingLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var app: java.lang.String
  var bar: java.lang.String
  var content: java.lang.String
  var critical: java.lang.String
  var gridCellSize: scala.Double
  var hoverable: java.lang.String
  var negative: java.lang.String
  var positive: java.lang.String
  var warning: java.lang.String
}

object Background {
  @scala.inline
  def apply(
    app: java.lang.String,
    bar: java.lang.String,
    content: java.lang.String,
    critical: java.lang.String,
    gridCellSize: scala.Double,
    hoverable: java.lang.String,
    negative: java.lang.String,
    positive: java.lang.String,
    warning: java.lang.String
  ): Background = {
    val __obj = js.Dynamic.literal(app = app, bar = bar, content = content, critical = critical, gridCellSize = gridCellSize, hoverable = hoverable, negative = negative, positive = positive, warning = warning)
  
    __obj.asInstanceOf[Background]
  }
}

