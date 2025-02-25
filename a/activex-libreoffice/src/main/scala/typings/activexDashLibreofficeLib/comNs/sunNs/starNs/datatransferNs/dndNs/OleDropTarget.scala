package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service connects the Java-like UNO Drag & Drop protocol to the protocol used on window platforms. It realizes the drop target.
  * @see XDropTarget
  */
trait OleDropTarget
  extends XDropTarget
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object OleDropTarget {
  @scala.inline
  def apply(
    DefaultActions: scala.Double,
    acquire: () => scala.Unit,
    addDropTargetListener: XDropTargetListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    dispose: () => scala.Unit,
    getDefaultActions: () => scala.Double,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    isActive: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeDropTargetListener: XDropTargetListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    setActive: scala.Boolean => scala.Unit,
    setDefaultActions: scala.Double => scala.Unit
  ): OleDropTarget = {
    val __obj = js.Dynamic.literal(DefaultActions = DefaultActions, acquire = js.Any.fromFunction0(acquire), addDropTargetListener = js.Any.fromFunction1(addDropTargetListener), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getDefaultActions = js.Any.fromFunction0(getDefaultActions), initialize = js.Any.fromFunction1(initialize), isActive = js.Any.fromFunction0(isActive), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDropTargetListener = js.Any.fromFunction1(removeDropTargetListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setActive = js.Any.fromFunction1(setActive), setDefaultActions = js.Any.fromFunction1(setDefaultActions))
  
    __obj.asInstanceOf[OleDropTarget]
  }
}

