package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSchemaExtensionRequest extends js.Object {
  /**
    * The identifier of the directory whose schema extension will be canceled.
    */
  var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryId
  /**
    * The identifier of the schema extension that will be canceled.
    */
  var SchemaExtensionId: awsDashSdkLib.clientsDirectoryserviceMod.SchemaExtensionId
}

object CancelSchemaExtensionRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, SchemaExtensionId: SchemaExtensionId): CancelSchemaExtensionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId, SchemaExtensionId = SchemaExtensionId)
  
    __obj.asInstanceOf[CancelSchemaExtensionRequest]
  }
}

