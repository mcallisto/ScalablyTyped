package typings
package reactDashRouterLib.reactDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val __RouterContext: reactLib.reactMod.Context[
    RouteComponentProps[js.Object, StaticContext, historyLib.historyMod.LocationState]
  ] = js.native
  def generatePath(pattern: java.lang.String): java.lang.String = js.native
  def generatePath(
    pattern: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]
  ): java.lang.String = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: java.lang.String): `match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: java.lang.String, parent: `match`[Params]): `match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: RouteProps): `match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: RouteProps, parent: `match`[Params]): `match`[Params] | scala.Null = js.native
  def withRouter[P /* <: RouteComponentProps[_, StaticContext, historyLib.historyMod.LocationState] */, C /* <: reactLib.reactMod.ComponentType[P] */](component: C with reactLib.reactMod.ComponentType[P]): (reactLib.reactMod.ComponentClass[
    (Omit[P, java.lang.String]) with WithRouterProps[C], 
    reactLib.reactMod.ComponentState
  ]) with WithRouterStatics[C] = js.native
}

