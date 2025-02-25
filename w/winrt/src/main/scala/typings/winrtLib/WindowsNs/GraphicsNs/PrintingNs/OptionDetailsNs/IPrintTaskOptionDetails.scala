package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionDetails extends js.Object {
  var onbeginvalidation: js.Any
  var onoptionchanged: js.Any
  var options: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, IPrintOptionDetails]
  def createItemListOption(optionId: java.lang.String, displayName: java.lang.String): PrintCustomItemListOptionDetails
  def createTextOption(optionId: java.lang.String, displayName: java.lang.String): PrintCustomTextOptionDetails
}

object IPrintTaskOptionDetails {
  @scala.inline
  def apply(
    createItemListOption: (java.lang.String, java.lang.String) => PrintCustomItemListOptionDetails,
    createTextOption: (java.lang.String, java.lang.String) => PrintCustomTextOptionDetails,
    onbeginvalidation: js.Any,
    onoptionchanged: js.Any,
    options: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, IPrintOptionDetails]
  ): IPrintTaskOptionDetails = {
    val __obj = js.Dynamic.literal(createItemListOption = js.Any.fromFunction2(createItemListOption), createTextOption = js.Any.fromFunction2(createTextOption), onbeginvalidation = onbeginvalidation, onoptionchanged = onoptionchanged, options = options)
  
    __obj.asInstanceOf[IPrintTaskOptionDetails]
  }
}

