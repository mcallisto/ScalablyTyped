package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A controller object that allows you to abort one or more DOM requests as and when desired. */
trait AbortController extends js.Object {
  /**
    * Returns the AbortSignal object associated with this object.
    */
  val signal: AbortSignal
  /**
    * Invoking this method will set this object's AbortSignal's aborted flag and
    * signal to any observers that the associated activity is to be aborted.
    */
  def abort(): scala.Unit
}

@JSGlobal("AbortController")
@js.native
class AbortControllerCls () extends AbortController {
  /**
    * Returns the AbortSignal object associated with this object.
    */
  /* CompleteClass */
  override val signal: AbortSignal = js.native
  /**
    * Invoking this method will set this object's AbortSignal's aborted flag and
    * signal to any observers that the associated activity is to be aborted.
    */
  /* CompleteClass */
  override def abort(): scala.Unit = js.native
}

@JSGlobal("AbortController")
@js.native
object AbortController
  extends org.scalablytyped.runtime.Instantiable0[AbortController]

