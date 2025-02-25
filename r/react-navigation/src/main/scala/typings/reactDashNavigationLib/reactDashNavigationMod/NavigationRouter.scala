package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationRouter[State, Options] extends js.Object {
  /**
    * Gets the screen navigation options for a given screen.
    *
    * For example, we could get the config for the 'Foo' screen when the
    * `navigation.state` is:
    *
    *  {routeName: 'Foo', key: '123'}
    */
  var getScreenOptions: NavigationScreenOptionsGetter[Options] = js.native
  /**
    * Maps a URI-like string to an action. This can be mapped to a state
    * using `getStateForAction`.
    */
  def getActionForPathAndParams(path: java.lang.String): NavigationAction | scala.Null = js.native
  def getActionForPathAndParams(path: java.lang.String, params: NavigationParams): NavigationAction | scala.Null = js.native
  def getComponentForRouteName(routeName: java.lang.String): NavigationComponent = js.native
  def getComponentForState(state: State): NavigationComponent = js.native
  def getPathAndParamsForState(state: State): reactDashNavigationLib.Anon_Params = js.native
  /**
    * The reducer that outputs the new navigation state for a given action, with
    * an optional previous state. When the action is considered handled but the
    * state is unchanged, the output state is null.
    */
  def getStateForAction(action: NavigationAction): State | scala.Null = js.native
  def getStateForAction(action: NavigationAction, lastState: State): State | scala.Null = js.native
}

