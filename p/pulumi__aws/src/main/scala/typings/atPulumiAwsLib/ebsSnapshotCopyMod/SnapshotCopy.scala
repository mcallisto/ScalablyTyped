package typings
package atPulumiAwsLib.ebsSnapshotCopyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ebs/snapshotCopy", "SnapshotCopy")
@js.native
class SnapshotCopy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a SnapshotCopy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: SnapshotCopyArgs) = this()
  def this(name: java.lang.String, args: SnapshotCopyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The data encryption key identifier for the snapshot.
    * * `source_snapshot_id` The ARN of the copied snapshot.
    * * `source_region` The region of the source snapshot.
    */
  val dataEncryptionKeyId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A description of what the snapshot is.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The ARN for the KMS encryption key.
    * * `source_snapshot_id` The ARN for the snapshot to be copied.
    * * `source_region` The region of the source snapshot.
    */
  val kmsKeyId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
    */
  val ownerAlias: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The AWS account ID of the snapshot owner.
    */
  val ownerId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val sourceRegion: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val sourceSnapshotId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags for the snapshot.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  val volumeId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The size of the drive in GiBs.
    */
  val volumeSize: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ebs/snapshotCopy", "SnapshotCopy")
@js.native
object SnapshotCopy extends js.Object {
  /**
    * Get an existing SnapshotCopy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ebsSnapshotCopyMod.SnapshotCopy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ebsSnapshotCopyMod.SnapshotCopyState
  ): atPulumiAwsLib.ebsSnapshotCopyMod.SnapshotCopy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ebsSnapshotCopyMod.SnapshotCopyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ebsSnapshotCopyMod.SnapshotCopy = js.native
  /**
    * Returns true if the given object is an instance of SnapshotCopy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshotCopy.SnapshotCopy */ scala.Boolean = js.native
}

