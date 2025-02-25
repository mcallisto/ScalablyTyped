package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to add handlers for key and mouse events. A handler is not a passive listener, it can even consume the event.
  * @since OOo 1.1.2
  */
trait XUserInputInterception
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.KeyEvent} . Every listener is given the opportunity to consume the event, i.e. prevent
    * the not yet called listeners from being called.
    * @param xHandler If this is a valid reference it is inserted into the list of handlers. It is the task of the caller to not register the same handler twi
    */
  def addKeyHandler(xHandler: XKeyHandler): scala.Unit
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.MouseEvent} . Every listener is given the opportunity to consume the event, i.e. prevent
    * the not yet called listeners from being called.
    * @param xHandler If this is a valid reference it is inserted into the list of handlers. It is the task of the caller to not register the same handler twi
    */
  def addMouseClickHandler(xHandler: XMouseClickHandler): scala.Unit
  /**
    * Remove the specified listener from the list of listeners.
    * @param xHandler If the reference is empty then nothing will be changed. If the handler has been registered twice (or more) then all references will be r
    */
  def removeKeyHandler(xHandler: XKeyHandler): scala.Unit
  /**
    * Remove the specified listener from the list of listeners.
    * @param xHandler If the reference is empty then nothing will be changed. If the handler has been registered twice (or more) then all references will be r
    */
  def removeMouseClickHandler(xHandler: XMouseClickHandler): scala.Unit
}

object XUserInputInterception {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addKeyHandler: XKeyHandler => scala.Unit,
    addMouseClickHandler: XMouseClickHandler => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeKeyHandler: XKeyHandler => scala.Unit,
    removeMouseClickHandler: XMouseClickHandler => scala.Unit
  ): XUserInputInterception = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler))
  
    __obj.asInstanceOf[XUserInputInterception]
  }
}

