package typings
package findDashMyDashWayLib.findDashMyDashWayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindResult[V /* <: HTTPVersion */] extends js.Object {
  @JSName("handler")
  var handler_Original: Handler[V] = js.native
  var params: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = js.native
  var store: js.Any = js.native
  def handler(
    req: nodeLib.http2Mod.Http2ServerRequest | nodeLib.httpMod.IncomingMessage,
    res: nodeLib.http2Mod.Http2ServerResponse | nodeLib.httpMod.ServerResponse,
    params: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]],
    store: js.Any
  ): scala.Unit = js.native
}

