package typings
package inversifyDashExpressDashUtilsLib.dtsBaseUnderscoreMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/base_middleware", "BaseMiddleware")
@js.native
abstract class BaseMiddleware () extends js.Object {
  val httpContext: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.HttpContext = js.native
  /* protected */ def bind[T](serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[T]): inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.BindingToSyntax[T] = js.native
  def handler(
    req: expressLib.expressMod.Request,
    res: expressLib.expressMod.Response,
    next: expressLib.expressMod.NextFunction
  ): scala.Unit = js.native
}

