package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  def getDashStyle(): DashStyle
  def getLineFill(): LineFill
  def getWeight(): scala.Double
  def isVisible(): scala.Boolean
  def setDashStyle(style: DashStyle): Border
  def setTransparent(): Border
  def setWeight(points: scala.Double): Border
}

object Border {
  @scala.inline
  def apply(
    getDashStyle: () => DashStyle,
    getLineFill: () => LineFill,
    getWeight: () => scala.Double,
    isVisible: () => scala.Boolean,
    setDashStyle: DashStyle => Border,
    setTransparent: () => Border,
    setWeight: scala.Double => Border
  ): Border = {
    val __obj = js.Dynamic.literal(getDashStyle = js.Any.fromFunction0(getDashStyle), getLineFill = js.Any.fromFunction0(getLineFill), getWeight = js.Any.fromFunction0(getWeight), isVisible = js.Any.fromFunction0(isVisible), setDashStyle = js.Any.fromFunction1(setDashStyle), setTransparent = js.Any.fromFunction0(setTransparent), setWeight = js.Any.fromFunction1(setWeight))
  
    __obj.asInstanceOf[Border]
  }
}

