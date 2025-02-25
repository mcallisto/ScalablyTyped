package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordDetail extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[CreatedTime] = js.undefined
  /**
    * The path identifier.
    */
  var PathId: js.UndefOr[Id] = js.undefined
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
  /**
    * The identifier of the provisioned product.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.undefined
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionedProductName: js.UndefOr[ProvisionedProductName] = js.undefined
  /**
    * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
    */
  var ProvisionedProductType: js.UndefOr[ProvisionedProductType] = js.undefined
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
  /**
    * The errors that occurred.
    */
  var RecordErrors: js.UndefOr[RecordErrors] = js.undefined
  /**
    * The identifier of the record.
    */
  var RecordId: js.UndefOr[Id] = js.undefined
  /**
    * One or more tags.
    */
  var RecordTags: js.UndefOr[RecordTags] = js.undefined
  /**
    * The record type.    PROVISION_PRODUCT     UPDATE_PROVISIONED_PRODUCT     TERMINATE_PROVISIONED_PRODUCT   
    */
  var RecordType: js.UndefOr[RecordType] = js.undefined
  /**
    * The status of the provisioned product.    CREATED - The request was created but the operation has not started.    IN_PROGRESS - The requested operation is in progress.    IN_PROGRESS_IN_ERROR - The provisioned product is under change but the requested operation failed and some remediation is occurring. For example, a rollback.    SUCCEEDED - The requested operation has successfully completed.    FAILED - The requested operation has unsuccessfully completed. Investigate using the error messages returned.  
    */
  var Status: js.UndefOr[RecordStatus] = js.undefined
  /**
    * The time when the record was last updated.
    */
  var UpdatedTime: js.UndefOr[UpdatedTime] = js.undefined
}

object RecordDetail {
  @scala.inline
  def apply(
    CreatedTime: CreatedTime = null,
    PathId: Id = null,
    ProductId: Id = null,
    ProvisionedProductId: Id = null,
    ProvisionedProductName: ProvisionedProductName = null,
    ProvisionedProductType: ProvisionedProductType = null,
    ProvisioningArtifactId: Id = null,
    RecordErrors: RecordErrors = null,
    RecordId: Id = null,
    RecordTags: RecordTags = null,
    RecordType: RecordType = null,
    Status: RecordStatus = null,
    UpdatedTime: UpdatedTime = null
  ): RecordDetail = {
    val __obj = js.Dynamic.literal()
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (PathId != null) __obj.updateDynamic("PathId")(PathId)
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId)
    if (ProvisionedProductId != null) __obj.updateDynamic("ProvisionedProductId")(ProvisionedProductId)
    if (ProvisionedProductName != null) __obj.updateDynamic("ProvisionedProductName")(ProvisionedProductName)
    if (ProvisionedProductType != null) __obj.updateDynamic("ProvisionedProductType")(ProvisionedProductType)
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId)
    if (RecordErrors != null) __obj.updateDynamic("RecordErrors")(RecordErrors)
    if (RecordId != null) __obj.updateDynamic("RecordId")(RecordId)
    if (RecordTags != null) __obj.updateDynamic("RecordTags")(RecordTags)
    if (RecordType != null) __obj.updateDynamic("RecordType")(RecordType)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UpdatedTime != null) __obj.updateDynamic("UpdatedTime")(UpdatedTime)
    __obj.asInstanceOf[RecordDetail]
  }
}

