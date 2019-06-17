package typings
package gitlabLib.distTemplatesResourceCustomAttributesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceCustomAttributes
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
  def remove(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    customAttributeId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CustomAttributeId */ js.Any
  ): js.Promise[js.Object] = js.native
  def remove(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    customAttributeId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CustomAttributeId */ js.Any,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def set(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    customAttributeId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CustomAttributeId */ js.Any,
    value: java.lang.String
  ): js.Promise[js.Object] = js.native
  def set(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    customAttributeId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CustomAttributeId */ js.Any,
    value: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    customAttributeId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CustomAttributeId */ js.Any
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    customAttributeId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CustomAttributeId */ js.Any,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

