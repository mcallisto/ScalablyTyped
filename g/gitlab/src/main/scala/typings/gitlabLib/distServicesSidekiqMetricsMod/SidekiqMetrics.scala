package typings
package gitlabLib.distServicesSidekiqMetricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidekiqMetrics
  extends gitlabLib.distInfrastructureMod.BaseService {
  def compoundMetrics(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def jobStats(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def processMetrics(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def queueMetrics(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

