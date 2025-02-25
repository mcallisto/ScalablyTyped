package typings
package phononLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var phonon: phononLib.PhononNs.Phonon = js.native
  def off(
    event: java.lang.String,
    callback: js.Function1[/* event */ phononLib.PhononNs.PhononCustomWindowEvent, scala.Unit]
  ): scala.Unit = js.native
  def off(
    event: java.lang.String,
    callback: js.Function1[/* event */ phononLib.PhononNs.PhononCustomWindowEvent, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def on(
    event: java.lang.String,
    callback: js.Function1[/* event */ phononLib.PhononNs.PhononCustomWindowEvent, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: java.lang.String,
    callback: js.Function1[/* event */ phononLib.PhononNs.PhononCustomWindowEvent, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
}

