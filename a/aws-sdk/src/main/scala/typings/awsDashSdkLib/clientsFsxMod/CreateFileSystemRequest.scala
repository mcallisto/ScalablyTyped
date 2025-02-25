package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFileSystemRequest extends js.Object {
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The type of Amazon FSx file system to create.
    */
  var FileSystemType: awsDashSdkLib.clientsFsxMod.FileSystemType
  var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  var LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration] = js.undefined
  /**
    * A list of IDs specifying the security groups to apply to all network interfaces created for file system access. This list isn't returned in later requests to describe the file system.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
  /**
    * The storage capacity of the file system being created. For Windows file systems, the storage capacity has a minimum of 300 GiB, and a maximum of 65,536 GiB. For Lustre file systems, the storage capacity has a minimum of 3,600 GiB. Storage capacity is provisioned in increments of 3,600 GiB.
    */
  var StorageCapacity: awsDashSdkLib.clientsFsxMod.StorageCapacity
  /**
    * The IDs of the subnets that the file system will be accessible from. File systems support only one subnet. The file server is also launched in that subnet's Availability Zone.
    */
  var SubnetIds: awsDashSdkLib.clientsFsxMod.SubnetIds
  /**
    * The tags to apply to the file system being created. The key value of the Name tag appears in the console as the file system name.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * The Microsoft Windows configuration for the file system being created. This value is required if FileSystemType is set to WINDOWS.
    */
  var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.undefined
}

object CreateFileSystemRequest {
  @scala.inline
  def apply(
    FileSystemType: FileSystemType,
    StorageCapacity: StorageCapacity,
    SubnetIds: SubnetIds,
    ClientRequestToken: ClientRequestToken = null,
    KmsKeyId: KmsKeyId = null,
    LustreConfiguration: CreateFileSystemLustreConfiguration = null,
    SecurityGroupIds: SecurityGroupIds = null,
    Tags: Tags = null,
    WindowsConfiguration: CreateFileSystemWindowsConfiguration = null
  ): CreateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemType = FileSystemType.asInstanceOf[js.Any], StorageCapacity = StorageCapacity, SubnetIds = SubnetIds)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (LustreConfiguration != null) __obj.updateDynamic("LustreConfiguration")(LustreConfiguration)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (WindowsConfiguration != null) __obj.updateDynamic("WindowsConfiguration")(WindowsConfiguration)
    __obj.asInstanceOf[CreateFileSystemRequest]
  }
}

