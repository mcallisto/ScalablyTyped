package typings
package atPulumiAwsLib.efsFileSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/efs/fileSystem", "FileSystem")
@js.native
class FileSystem protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a FileSystem resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: FileSystemArgs) = this()
  def this(name: java.lang.String, args: FileSystemArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Amazon Resource Name of the file system.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val creationToken: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
    */
  val dnsName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * If true, the disk will be encrypted.
    */
  val encrypted: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The ARN for the KMS encryption key. When specifying kms_key_id, encrypted needs to be set to true.
    */
  val kmsKeyId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The file system performance mode. Can be either `"generalPurpose"` or `"maxIO"` (Default: `"generalPurpose"`).
    */
  val performanceMode: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The throughput, measured in MiB/s, that you want to provision for the file system. Only applicable with `throughput_mode` set to `provisioned`.
    */
  val provisionedThroughputInMibps: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * A mapping of tags to assign to the file system.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Throughput mode for the file system. Defaults to `bursting`. Valid values: `bursting`, `provisioned`. When using `provisioned`, also set `provisioned_throughput_in_mibps`.
    */
  val throughputMode: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/efs/fileSystem", "FileSystem")
@js.native
object FileSystem extends js.Object {
  /**
    * Get an existing FileSystem resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.efsFileSystemMod.FileSystem = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.efsFileSystemMod.FileSystemState
  ): atPulumiAwsLib.efsFileSystemMod.FileSystem = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.efsFileSystemMod.FileSystemState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.efsFileSystemMod.FileSystem = js.native
  /**
    * Returns true if the given object is an instance of FileSystem.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystem.FileSystem */ scala.Boolean = js.native
}

