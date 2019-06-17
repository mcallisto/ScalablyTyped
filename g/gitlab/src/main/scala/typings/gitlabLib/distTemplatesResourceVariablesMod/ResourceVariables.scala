package typings
package gitlabLib.distTemplatesResourceVariablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceVariables
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
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any
  ): js.Promise[js.Object] = js.native
  def create(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    keyId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KeyId */ js.Any
  ): js.Promise[js.Object] = js.native
  def edit(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    keyId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KeyId */ js.Any,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    keyId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KeyId */ js.Any
  ): js.Promise[js.Object] = js.native
  def remove(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    keyId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KeyId */ js.Any,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    keyId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KeyId */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    keyId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify KeyId */ js.Any,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

