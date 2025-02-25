package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentPathRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the document.
    */
  var DocumentId: IdType
  /**
    * A comma-separated list of values. Specify NAME to include the names of the parent folders.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.undefined
  /**
    * The maximum number of levels in the hierarchy to return.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  /**
    * This value is not supported.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
}

object GetDocumentPathRequest {
  @scala.inline
  def apply(
    DocumentId: IdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Fields: FieldNamesType = null,
    Limit: js.UndefOr[LimitType] = js.undefined,
    Marker: PageMarkerType = null
  ): GetDocumentPathRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (Fields != null) __obj.updateDynamic("Fields")(Fields)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[GetDocumentPathRequest]
  }
}

