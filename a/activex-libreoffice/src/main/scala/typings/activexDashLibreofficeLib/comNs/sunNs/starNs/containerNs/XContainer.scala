package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports quick access to the information if a container currently contains elements.
  *
  * The {@link XContainer} interface is provided for containers which need to broadcast changes within the container; that means the actions of adding or
  * removing elements are broadcast to the listeners.
  *
  * This can be useful for UI to enable/disable some functions without actually accessing the data.
  * @see XContent
  * @see XIndexAccess
  * @see XNameAccess
  * @see XEnumerationAccess
  */
trait XContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener to receive events when elements are inserted or removed.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see XContainerListener
    */
  def addContainerListener(xListener: XContainerListener): scala.Unit
  /**
    * removes the specified listener so it does not receive any events from this container.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see XContainerListener
    */
  def removeContainerListener(xListener: XContainerListener): scala.Unit
}

object XContainer {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addContainerListener: XContainerListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeContainerListener: XContainerListener => scala.Unit
  ): XContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener))
  
    __obj.asInstanceOf[XContainer]
  }
}

