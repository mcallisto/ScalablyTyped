package typings
package atPulumiAwsLib.appautoscalingTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appautoscaling/target", "Target")
@js.native
class Target protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Target resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: TargetArgs) = this()
  def this(name: java.lang.String, args: TargetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The max capacity of the scalable target.
    */
  val maxCapacity: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * The min capacity of the scalable target.
    */
  val minCapacity: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val resourceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ARN of the IAM role that allows Application
    * AutoScaling to modify your scalable target on your behalf.
    */
  val roleArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val scalableDimension: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val serviceNamespace: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appautoscaling/target", "Target")
@js.native
object Target extends js.Object {
  /**
    * Get an existing Target resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appautoscalingTargetMod.Target = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appautoscalingTargetMod.TargetState
  ): atPulumiAwsLib.appautoscalingTargetMod.Target = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appautoscalingTargetMod.TargetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.appautoscalingTargetMod.Target = js.native
  /**
    * Returns true if the given object is an instance of Target.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/target.Target */ scala.Boolean = js.native
}

