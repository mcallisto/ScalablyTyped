package typings
package gitlabLib.distTemplatesResourceMilestonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceMilestones
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    title: java.lang.String
  ): js.Promise[js.Object] = js.native
  def create(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    title: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    milestoneId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MilestoneId */ js.Any
  ): js.Promise[js.Object] = js.native
  def edit(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    milestoneId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MilestoneId */ js.Any,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def issues(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    milestoneId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MilestoneId */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def issues(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    milestoneId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MilestoneId */ js.Any,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def mergeRequests(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    milestoneId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MilestoneId */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def mergeRequests(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    milestoneId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MilestoneId */ js.Any,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    milestoneId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MilestoneId */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    milestoneId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MilestoneId */ js.Any,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

