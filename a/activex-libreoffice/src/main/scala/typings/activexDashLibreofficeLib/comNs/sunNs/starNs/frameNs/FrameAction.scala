package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * these are the events which can happen to the components in frames of the desktop
  *
  * Interest listener can get information about loaded/reloaded or unloaded components into a {@link Frame} .
  * @see XFrame
  * @see XFrameActionListener
  * @see FrameActionEvent
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
*/
trait FrameAction extends js.Object

object FrameAction {
  /**
    * an event of this kind is broadcast whenever a component is attached to a frame
    *
    * This is almost the same as the instantiation of the component within that frame. The component is attached to the frame immediately before this event
    * is broadcast.
    * @see XFrame.setComponent()
    */
  @scala.inline
  def COMPONENT_ATTACHED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /**
    * an event of this kind is broadcast whenever a component is detaching from a frame
    *
    * This is quite the same as the destruction of the component which was in that frame. At the moment when the event is broadcast the component is still
    * attached to the frame but in the next moment it won't.
    * @see XFrame.setComponent()
    */
  @scala.inline
  def COMPONENT_DETACHING: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * an event of this kind is broadcast whenever a component is attached to a new model.
    *
    * In this case the component remains the same but operates on a new model component.
    */
  @scala.inline
  def COMPONENT_REATTACHED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * an event of this kind is broadcast whenever a component changes its internal context (i.e., the selection).
    *
    * If the activation status within a frame changes, this counts as a context change too.
    * @see XFrame.contextChanged()
    */
  @scala.inline
  def CONTEXT_CHANGED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /**
    * an event of this kind is broadcast whenever a component gets activated
    *
    * Activations are broadcast from the top component which was not active before, down to the inner most component.
    * @see XFrame.activate()
    */
  @scala.inline
  def FRAME_ACTIVATED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * an event of this kind is broadcasted immediately before the component is deactivated
    *
    * Deactivations are broadcast from the innermost component which does not stay active up to the outer most component which does not stay active.
    * @see XFrame.deactivate()
    */
  @scala.inline
  def FRAME_DEACTIVATING: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /**
    * an event of this kind is broadcast by an active frame when it is getting UI control (tool control).
    * @see XFrame.activate()
    */
  @scala.inline
  def FRAME_UI_ACTIVATED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /**
    * an event of this kind is broadcast by an active frame when it is losing UI control (tool control).
    * @see XFrame.deactivate()
    */
  @scala.inline
  def FRAME_UI_DEACTIVATING: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

