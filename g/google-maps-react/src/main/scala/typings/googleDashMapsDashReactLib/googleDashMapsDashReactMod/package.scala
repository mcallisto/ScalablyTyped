package typings
package googleDashMapsDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googleDashMapsDashReactMod {
  type GoogleApiOptionsFunc = js.Function1[/* props */ js.Any, GoogleApiOptions]
  type mapEventHandler = js.Function3[
    /* mapProps */ js.UndefOr[MapProps], 
    /* map */ js.UndefOr[googlemapsLib.googleNs.mapsNs.Map], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
  type markerEventHandler = js.Function3[
    /* props */ js.UndefOr[MarkerProps], 
    /* marker */ js.UndefOr[googlemapsLib.googleNs.mapsNs.Marker], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
}
