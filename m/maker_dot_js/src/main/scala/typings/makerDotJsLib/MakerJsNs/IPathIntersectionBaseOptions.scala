package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to path.intersection()
  */
trait IPathIntersectionBaseOptions extends js.Object {
  /**
    * Optional boolean to only return deep intersections, i.e. not on an end point or tangent.
    */
  var excludeTangents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional output variable which will be set to true if the paths are overlapped.
    */
  var out_AreOverlapped: js.UndefOr[scala.Boolean] = js.undefined
}

object IPathIntersectionBaseOptions {
  @scala.inline
  def apply(
    excludeTangents: js.UndefOr[scala.Boolean] = js.undefined,
    out_AreOverlapped: js.UndefOr[scala.Boolean] = js.undefined
  ): IPathIntersectionBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeTangents)) __obj.updateDynamic("excludeTangents")(excludeTangents)
    if (!js.isUndefined(out_AreOverlapped)) __obj.updateDynamic("out_AreOverlapped")(out_AreOverlapped)
    __obj.asInstanceOf[IPathIntersectionBaseOptions]
  }
}

