package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpanContext
  extends opentracingLib.opentracingMod.SpanContext {
  /**
    * Returns the string representation of the internal span ID.
    */
  def toSpanId(): java.lang.String = js.native
  /**
    * Returns the string representation of the internal trace ID.
    */
  def toTraceId(): java.lang.String = js.native
}

