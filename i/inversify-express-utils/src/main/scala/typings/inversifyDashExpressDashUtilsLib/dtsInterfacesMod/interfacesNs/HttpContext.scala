package typings
package inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpContext extends js.Object {
  var container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container
  var request: expressLib.expressMod.Request
  var response: expressLib.expressMod.Response
  var user: Principal
}

object HttpContext {
  @scala.inline
  def apply(
    container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container,
    request: expressLib.expressMod.Request,
    response: expressLib.expressMod.Response,
    user: Principal
  ): HttpContext = {
    val __obj = js.Dynamic.literal(container = container, request = request, response = response, user = user)
  
    __obj.asInstanceOf[HttpContext]
  }
}

