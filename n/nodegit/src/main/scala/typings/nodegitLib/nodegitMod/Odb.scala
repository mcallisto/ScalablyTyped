package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Odb")
@js.native
class Odb ()
  extends nodegitLib.odbMod.Odb

/* static members */
@JSImport("nodegit", "Odb")
@js.native
object Odb extends js.Object {
  def open(objectsDir: java.lang.String): js.Promise[nodegitLib.odbMod.Odb] = js.native
}

