package typings
package atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a attachments model.
  */
trait IOptions extends js.Object {
  /**
    * The attachment content factory used by the model.
    *
    * If not given, a default factory will be used.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.undefined
  /**
    * An optional IModelDB to store the attachments model.
    */
  var modelDB: js.UndefOr[atJupyterlabObservablesLib.libModeldbMod.IModelDB] = js.undefined
  /**
    * The initial values for the model.
    */
  var values: js.UndefOr[atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IAttachments] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    contentFactory: IContentFactory = null,
    modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB = null,
    values: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IAttachments = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory)
    if (modelDB != null) __obj.updateDynamic("modelDB")(modelDB)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[IOptions]
  }
}

