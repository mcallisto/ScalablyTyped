package typings
package opentracingLib.libMockUnderscoreTracerMockUnderscoreSpanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("opentracing/lib/mock_tracer/mock_span", "MockSpan")
@js.native
class MockSpan protected () extends js.Object {
  def this(tracer: opentracingLib.libMockUnderscoreTracerMockUnderscoreTracerMod.default) = this()
  var _finishMs: scala.Double = js.native
  var _logs: js.Any = js.native
  var _mockTracer: js.Any = js.native
  var _operationName: js.Any = js.native
  var _startMs: js.Any = js.native
  var _startStack: js.UndefOr[java.lang.String] = js.native
  var _tags: js.Any = js.native
  var _uuid: js.Any = js.native
  /* protected */ def _addTags(set: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  /* protected */ def _context(): opentracingLib.libMockUnderscoreTracerMockUnderscoreContextMod.default = js.native
  /* protected */ def _finish(): scala.Unit = js.native
  /* protected */ def _finish(finishTime: scala.Double): scala.Unit = js.native
  /* private */ def _generateUUID(): js.Any = js.native
  /* protected */ def _log(fields: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  /* protected */ def _log(fields: org.scalablytyped.runtime.StringDictionary[js.Any], timestamp: scala.Double): scala.Unit = js.native
  /* protected */ def _setOperationName(name: java.lang.String): scala.Unit = js.native
  def addReference(ref: opentracingLib.libReferenceMod.default): scala.Unit = js.native
  /**
    * Returns a simplified object better for console.log()'ing.
    */
  def debug(): DebugInfo = js.native
  def durationMs(): scala.Double = js.native
  def operationName(): java.lang.String = js.native
  def tags(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def tracer(): js.Any = js.native
  def uuid(): java.lang.String = js.native
}

