package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to specify how an arithmetic date series is calculated.
  * @see com.sun.star.sheet.FillMode
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
*/
trait FillDateMode extends js.Object

object FillDateMode {
  /** for every new value a single day is added. */
  @scala.inline
  def FILL_DATE_DAY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** for every new value one month is added (day keeps unchanged). */
  @scala.inline
  def FILL_DATE_MONTH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** for every new value a single day is added, but Saturdays and Sundays are skipped. */
  @scala.inline
  def FILL_DATE_WEEKDAY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** for every new value one year is added (day and month keep unchanged). */
  @scala.inline
  def FILL_DATE_YEAR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

