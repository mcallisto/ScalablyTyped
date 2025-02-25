package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchConstructorOptions extends js.Object {
  var coordinate: js.UndefOr[Coordinate] = js.undefined
  var getsUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[CoordinateRegion] = js.undefined
}

object SearchConstructorOptions {
  @scala.inline
  def apply(
    coordinate: Coordinate = null,
    getsUserLocation: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    region: CoordinateRegion = null
  ): SearchConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (coordinate != null) __obj.updateDynamic("coordinate")(coordinate)
    if (!js.isUndefined(getsUserLocation)) __obj.updateDynamic("getsUserLocation")(getsUserLocation)
    if (language != null) __obj.updateDynamic("language")(language)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[SearchConstructorOptions]
  }
}

