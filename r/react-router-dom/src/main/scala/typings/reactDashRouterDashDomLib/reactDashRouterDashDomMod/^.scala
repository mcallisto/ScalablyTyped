package typings
package reactDashRouterDashDomLib.reactDashRouterDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-dom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generatePath(pattern: java.lang.String): java.lang.String = js.native
  def generatePath(
    pattern: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]
  ): java.lang.String = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: java.lang.String): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.matchPath with js.Any */](
    pathname: java.lang.String,
    props: java.lang.String,
    parent: reactDashRouterLib.reactDashRouterMod.`match`[Params]
  ): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: reactDashRouterLib.reactDashRouterMod.RouteProps): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.matchPath with js.Any */](
    pathname: java.lang.String,
    props: reactDashRouterLib.reactDashRouterMod.RouteProps,
    parent: reactDashRouterLib.reactDashRouterMod.`match`[Params]
  ): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def withRouter[P /* <: reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
    _, 
    reactDashRouterLib.reactDashRouterMod.StaticContext, 
    historyLib.historyMod.LocationState
  ] */, C /* <: reactLib.reactMod.ComponentType[P] */](component: C with reactLib.reactMod.ComponentType[P]): (reactLib.reactMod.ComponentClass[
    (reactDashRouterLib.reactDashRouterMod.Omit[P, java.lang.String]) with reactDashRouterLib.reactDashRouterMod.WithRouterProps[C], 
    reactLib.reactMod.ComponentState
  ]) with reactDashRouterLib.reactDashRouterMod.WithRouterStatics[C] = js.native
}

