package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracing extends js.Object {
  var parentSpan: js.Object
  var startSpan: js.Function
  var tracer: js.Object
}

object Tracing {
  @scala.inline
  def apply(parentSpan: js.Object, startSpan: js.Function, tracer: js.Object): Tracing = {
    val __obj = js.Dynamic.literal(parentSpan = parentSpan, startSpan = startSpan, tracer = tracer)
  
    __obj.asInstanceOf[Tracing]
  }
}

