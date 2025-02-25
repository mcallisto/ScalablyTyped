package typings
package applicationinsightsLib.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultClient: TelemetryClient = js.native
  var liveMetricsClient: applicationinsightsLib.outLibraryQuickPulseStateManagerMod.^ = js.native
  def dispose(): scala.Unit = js.native
  def getCorrelationContext(): applicationinsightsLib.outAutoCollectionCorrelationContextManagerMod.CorrelationContext = js.native
  def setup(): applicationinsightsLib.TypeofClassConfiguration = js.native
  def setup(instrumentationKey: java.lang.String): applicationinsightsLib.TypeofClassConfiguration = js.native
  def start(): applicationinsightsLib.TypeofClassConfiguration = js.native
  def wrapWithCorrelationContext[T /* <: js.Function */](fn: T): T = js.native
}

