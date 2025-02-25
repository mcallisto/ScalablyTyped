package typings
package reactDashDomLib.testDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowRenderer extends js.Object {
  /**
    * After `shallowRenderer.render()` has been called, returns shallowly rendered output.
    */
  def getRenderOutput(): reactLib.reactMod.ReactElement = js.native
  /**
    * After `shallowRenderer.render()` has been called, returns shallowly rendered output.
    */
  @JSName("getRenderOutput")
  def getRenderOutput_EReactElementE[E /* <: reactLib.reactMod.ReactElement */](): E = js.native
  /**
    * Similar to `ReactDOM.render` but it doesn't require DOM and only renders a single level deep.
    */
  def render(element: reactLib.reactMod.ReactElement): scala.Unit = js.native
  def render(element: reactLib.reactMod.ReactElement, context: js.Any): scala.Unit = js.native
  def unmount(): scala.Unit = js.native
}

