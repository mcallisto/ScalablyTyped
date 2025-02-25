package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMatchResult extends js.Object {
  var consumed: js.Array[UrlSegment]
  var posParams: js.UndefOr[org.scalablytyped.runtime.StringDictionary[UrlSegment]] = js.undefined
}

object UrlMatchResult {
  @scala.inline
  def apply(
    consumed: js.Array[UrlSegment],
    posParams: org.scalablytyped.runtime.StringDictionary[UrlSegment] = null
  ): UrlMatchResult = {
    val __obj = js.Dynamic.literal(consumed = consumed)
    if (posParams != null) __obj.updateDynamic("posParams")(posParams)
    __obj.asInstanceOf[UrlMatchResult]
  }
}

