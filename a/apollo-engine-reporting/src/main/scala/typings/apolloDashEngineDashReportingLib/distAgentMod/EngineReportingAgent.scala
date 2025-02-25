package typings
package apolloDashEngineDashReportingLib.distAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/agent", "EngineReportingAgent")
@js.native
class EngineReportingAgent[TContext] protected () extends js.Object {
  def this(options: js.UndefOr[scala.Nothing], hasSchemaHash: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLServiceContext */ js.Any) = this()
  def this(options: EngineReportingOptions[TContext], hasSchemaHash: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLServiceContext */ js.Any) = this()
  var apiKey: js.Any = js.native
  var getTraceSignature: js.Any = js.native
  var options: js.Any = js.native
  var report: js.Any = js.native
  var reportHeader: js.Any = js.native
  var reportSize: js.Any = js.native
  var reportTimer: js.Any = js.native
  var resetReport: js.Any = js.native
  var sendReportAndReportErrors: js.Any = js.native
  var sendReportsImmediately: js.UndefOr[js.Any] = js.native
  var signatureCache: js.Any = js.native
  var stopped: js.Any = js.native
  def addTrace(hasTraceQueryHashDocumentASTOperationNameQueryString: AddTraceArgs): js.Promise[scala.Unit] = js.native
  def newExtension(): apolloDashEngineDashReportingLib.distExtensionMod.EngineReportingExtension[TContext] = js.native
  def sendReport(): js.Promise[scala.Unit] = js.native
  def stop(): scala.Unit = js.native
}

