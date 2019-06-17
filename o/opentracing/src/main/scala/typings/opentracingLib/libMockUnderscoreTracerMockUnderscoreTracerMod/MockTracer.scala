package typings
package opentracingLib.libMockUnderscoreTracerMockUnderscoreTracerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("opentracing/lib/mock_tracer/mock_tracer", "MockTracer")
@js.native
class MockTracer () extends js.Object {
  var _spans: js.Any = js.native
  /* private */ def _allocSpan(): js.Any = js.native
  /* protected */ def _extract(format: js.Any, carrier: js.Any): scala.Nothing = js.native
  /* protected */ def _inject(
    span: opentracingLib.libMockUnderscoreTracerMockUnderscoreSpanMod.default,
    format: js.Any,
    carrier: js.Any
  ): scala.Nothing = js.native
  /* protected */ def _startSpan(
    name: java.lang.String,
    fields: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify opentracing.SpanOptions */ js.Any
  ): opentracingLib.libMockUnderscoreTracerMockUnderscoreSpanMod.default = js.native
  /**
    * Discard any buffered data.
    */
  def clear(): scala.Unit = js.native
  /**
    * Return the buffered data in a format convenient for making unit test
    * assertions.
    */
  def report(): opentracingLib.libMockUnderscoreTracerMockUnderscoreReportMod.default = js.native
}

