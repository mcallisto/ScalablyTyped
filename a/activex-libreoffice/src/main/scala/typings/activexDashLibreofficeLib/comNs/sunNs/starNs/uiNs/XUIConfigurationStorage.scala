package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supplies functions to change or get information about the storage of a user interface configuration manager.
  * @since OOo 2.0
  */
trait XUIConfigurationStorage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * checks if an instance has already a storage to load/store its data.
    * @returns `TRUE` if the instance has a storage otherwise `FALSE` .
    */
  def hasStorage(): scala.Boolean
  /**
    * connects a storage to the user interface configuration manager which is used on subsequent calls of load() and store().
    * @param Storage all configuration data is loaded/stored from/into this storage. If the storage is in read/write mode load() and store() can be used other
    */
  def setStorage(Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): scala.Unit
}

object XUIConfigurationStorage {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    hasStorage: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => scala.Unit
  ): XUIConfigurationStorage = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasStorage = js.Any.fromFunction0(hasStorage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStorage = js.Any.fromFunction1(setStorage))
  
    __obj.asInstanceOf[XUIConfigurationStorage]
  }
}

