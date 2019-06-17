package typings
package opentracingLib.opentracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing", "Reference")
@js.native
class Reference protected ()
  extends opentracingLib.libReferenceMod.default {
  def this(`type`: java.lang.String, referencedContext: opentracingLib.libSpanMod.default) = this()
  /**
    * Initialize a new Reference instance.
    *
    * @param {string} type - the Reference type constant (e.g.,
    *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
    * @param {SpanContext} referencedContext - the SpanContext being referred
    *        to. As a convenience, a Span instance may be passed in instead
    *        (in which case its .context() is used here).
    */
  def this(`type`: java.lang.String, referencedContext: opentracingLib.libSpanUnderscoreContextMod.default) = this()
}

