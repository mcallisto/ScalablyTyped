package typings
package reactDashApolloLib.withApolloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/withApollo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[TProps, TResult](WrappedComponent: reactLib.reactMod.ComponentType[WithApolloClient[TProps]]): reactLib.reactMod.ComponentClass[TProps, reactLib.reactMod.ComponentState] = js.native
  def default[TProps, TResult](
    WrappedComponent: reactLib.reactMod.ComponentType[WithApolloClient[TProps]],
    operationOptions: reactDashApolloLib.typesMod.OperationOption[
      TProps, 
      TResult, 
      reactDashApolloLib.typesMod.OperationVariables, 
      reactDashApolloLib.typesMod.ChildProps[TProps, TResult, reactDashApolloLib.typesMod.OperationVariables]
    ]
  ): reactLib.reactMod.ComponentClass[TProps, reactLib.reactMod.ComponentState] = js.native
}

