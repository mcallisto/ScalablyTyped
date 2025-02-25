package typings
package quixoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Page positions and sizes are available on QFrame.page().
trait PageDescriptor extends js.Object {
  // The bottom of the page.
  var bottom: PositionDescriptor
  // Horizontal center: midway between right and left.
  var center: PositionDescriptor
  // Height of the page.
  var height: SizeDescriptor
  // The left side of the page.
  var left: PositionDescriptor
  // Vertical middle: midway between top and bottom.
  var middle: PositionDescriptor
  // The right side of the page.
  var right: PositionDescriptor
  // The top of the page.
  var top: PositionDescriptor
  // Width of the page.
  var width: SizeDescriptor
}

object PageDescriptor {
  @scala.inline
  def apply(
    bottom: PositionDescriptor,
    center: PositionDescriptor,
    height: SizeDescriptor,
    left: PositionDescriptor,
    middle: PositionDescriptor,
    right: PositionDescriptor,
    top: PositionDescriptor,
    width: SizeDescriptor
  ): PageDescriptor = {
    val __obj = js.Dynamic.literal(bottom = bottom, center = center, height = height, left = left, middle = middle, right = right, top = top, width = width)
  
    __obj.asInstanceOf[PageDescriptor]
  }
}

