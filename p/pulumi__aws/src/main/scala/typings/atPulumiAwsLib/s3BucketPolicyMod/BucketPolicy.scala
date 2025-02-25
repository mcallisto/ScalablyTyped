package typings
package atPulumiAwsLib.s3BucketPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/bucketPolicy", "BucketPolicy")
@js.native
class BucketPolicy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a BucketPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: BucketPolicyArgs) = this()
  def this(name: java.lang.String, args: BucketPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The name of the bucket to which to apply the policy.
    */
  val bucket: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val policy: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/s3/bucketPolicy", "BucketPolicy")
@js.native
object BucketPolicy extends js.Object {
  /**
    * Get an existing BucketPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3BucketPolicyMod.BucketPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3BucketPolicyMod.BucketPolicyState
  ): atPulumiAwsLib.s3BucketPolicyMod.BucketPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3BucketPolicyMod.BucketPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.s3BucketPolicyMod.BucketPolicy = js.native
  /**
    * Returns true if the given object is an instance of BucketPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketPolicy.BucketPolicy */ scala.Boolean = js.native
}

