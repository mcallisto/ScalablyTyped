package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Abstract base interface for any conditional format
  *
  * Is extended by any conditional format entry, e.g. color scale, data bar, icon set, date formats, condition formats
  */
trait XConditionEntry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val Type: scala.Double
  def getType(): scala.Double
}

object XConditionEntry {
  @scala.inline
  def apply(
    Type: scala.Double,
    acquire: () => scala.Unit,
    getType: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XConditionEntry = {
    val __obj = js.Dynamic.literal(Type = Type, acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XConditionEntry]
  }
}

