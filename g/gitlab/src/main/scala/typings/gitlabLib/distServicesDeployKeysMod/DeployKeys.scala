package typings
package gitlabLib.distServicesDeployKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeployKeys
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def add(projectId: gitlabLib.distServicesMod.ProjectId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def all(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def enable(projectId: gitlabLib.distServicesMod.ProjectId, keyId: gitlabLib.distServicesMod.KeyId): js.Promise[js.Object] = js.native
  def enable(
    projectId: gitlabLib.distServicesMod.ProjectId,
    keyId: gitlabLib.distServicesMod.KeyId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.distServicesMod.ProjectId, keyId: gitlabLib.distServicesMod.KeyId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    keyId: gitlabLib.distServicesMod.KeyId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

