package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdevice extends js.Object {
  def isAndroid(): scala.Boolean
  def isFlat(): scala.Boolean
  def isIOS(): scala.Boolean
  def isIOS7(): scala.Boolean
  def isWindows(): scala.Boolean
}

object Typeofdevice {
  @scala.inline
  def apply(
    isAndroid: () => scala.Boolean,
    isFlat: () => scala.Boolean,
    isIOS: () => scala.Boolean,
    isIOS7: () => scala.Boolean,
    isWindows: () => scala.Boolean
  ): Typeofdevice = {
    val __obj = js.Dynamic.literal(isAndroid = js.Any.fromFunction0(isAndroid), isFlat = js.Any.fromFunction0(isFlat), isIOS = js.Any.fromFunction0(isIOS), isIOS7 = js.Any.fromFunction0(isIOS7), isWindows = js.Any.fromFunction0(isWindows))
  
    __obj.asInstanceOf[Typeofdevice]
  }
}

