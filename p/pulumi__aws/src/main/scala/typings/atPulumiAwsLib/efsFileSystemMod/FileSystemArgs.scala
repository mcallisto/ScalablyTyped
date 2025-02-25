package typings
package atPulumiAwsLib.efsFileSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemArgs extends js.Object {
  val creationToken: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If true, the disk will be encrypted.
    */
  val encrypted: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARN for the KMS encryption key. When specifying kms_key_id, encrypted needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The file system performance mode. Can be either `"generalPurpose"` or `"maxIO"` (Default: `"generalPurpose"`).
    */
  val performanceMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The throughput, measured in MiB/s, that you want to provision for the file system. Only applicable with `throughput_mode` set to `provisioned`.
    */
  val provisionedThroughputInMibps: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * A mapping of tags to assign to the file system.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Throughput mode for the file system. Defaults to `bursting`. Valid values: `bursting`, `provisioned`. When using `provisioned`, also set `provisioned_throughput_in_mibps`.
    */
  val throughputMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object FileSystemArgs {
  @scala.inline
  def apply(
    creationToken: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    encrypted: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    kmsKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    performanceMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    provisionedThroughputInMibps: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    throughputMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): FileSystemArgs = {
    val __obj = js.Dynamic.literal()
    if (creationToken != null) __obj.updateDynamic("creationToken")(creationToken.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (performanceMode != null) __obj.updateDynamic("performanceMode")(performanceMode.asInstanceOf[js.Any])
    if (provisionedThroughputInMibps != null) __obj.updateDynamic("provisionedThroughputInMibps")(provisionedThroughputInMibps.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (throughputMode != null) __obj.updateDynamic("throughputMode")(throughputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemArgs]
  }
}

