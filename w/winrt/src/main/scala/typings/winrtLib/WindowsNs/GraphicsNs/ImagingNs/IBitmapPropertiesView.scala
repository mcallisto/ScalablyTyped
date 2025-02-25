package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapPropertiesView extends js.Object {
  def getPropertiesAsync(propertiesToRetrieve: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapPropertySet]
}

object IBitmapPropertiesView {
  @scala.inline
  def apply(
    getPropertiesAsync: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String] => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[BitmapPropertySet]
  ): IBitmapPropertiesView = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync))
  
    __obj.asInstanceOf[IBitmapPropertiesView]
  }
}

