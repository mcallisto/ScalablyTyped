package typings
package epilogueLib.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseContollerOptions extends js.Object {
  @JSName("app")
  var app_Original: expressLib.expressMod.Express = js.native
  var endpoint: java.lang.String = js.native
  var include: js.Array[epilogueLib.Anon_Model | java.lang.String] = js.native
  var model: js.Any = js.native
  var resource: Resource = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def app(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: nodeLib.httpMod.ServerResponse
  ): js.Any = js.native
  def app(
    req: nodeLib.httpMod.IncomingMessage,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response
  ): js.Any = js.native
  def app(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
}

