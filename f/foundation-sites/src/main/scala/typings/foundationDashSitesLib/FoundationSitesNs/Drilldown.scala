package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/drilldown-menu.html#javascript-reference
trait Drilldown extends js.Object {
  def destroy(): scala.Unit
}

object Drilldown {
  @scala.inline
  def apply(destroy: () => scala.Unit): Drilldown = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[Drilldown]
  }
}

