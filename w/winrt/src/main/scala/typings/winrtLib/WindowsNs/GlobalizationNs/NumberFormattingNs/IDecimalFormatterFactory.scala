package typings
package winrtLib.WindowsNs.GlobalizationNs.NumberFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecimalFormatterFactory extends js.Object {
  def createDecimalFormatter(
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    geographicRegion: java.lang.String
  ): DecimalFormatter
}

object IDecimalFormatterFactory {
  @scala.inline
  def apply(
    createDecimalFormatter: (winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], java.lang.String) => DecimalFormatter
  ): IDecimalFormatterFactory = {
    val __obj = js.Dynamic.literal(createDecimalFormatter = js.Any.fromFunction2(createDecimalFormatter))
  
    __obj.asInstanceOf[IDecimalFormatterFactory]
  }
}

