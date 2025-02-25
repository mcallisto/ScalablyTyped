package typings
package verrorLib.verrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * SError is like VError, but stricter about types.  You cannot pass "null" or
  * "undefined" as string arguments to the formatter.  Since SError is only a
  * different function, not really a different class, we don't set
  * SError.prototype.name.
  */
@JSImport("verror", "SError")
@js.native
class SError () extends VError {
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override def cause(): js.UndefOr[stdLib.Error] = js.native
}

