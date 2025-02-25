package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionData extends js.Object {
  var edges: js.UndefOr[js.Array[_] | scala.Null] = js.undefined
  var pageInfo: js.UndefOr[stdLib.Partial[relayDashRuntimeLib.relayDashRuntimeMod.PageInfo] | scala.Null] = js.undefined
}

object ConnectionData {
  @scala.inline
  def apply(
    edges: js.Array[_] = null,
    pageInfo: stdLib.Partial[relayDashRuntimeLib.relayDashRuntimeMod.PageInfo] = null
  ): ConnectionData = {
    val __obj = js.Dynamic.literal()
    if (edges != null) __obj.updateDynamic("edges")(edges)
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    __obj.asInstanceOf[ConnectionData]
  }
}

