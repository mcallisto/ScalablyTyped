package typings
package atPulumiAwsLib.snsTopicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns/topic", "Topic")
@js.native
class Topic protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Topic resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: TopicArgs) = this()
  def this(name: java.lang.String, args: TopicArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * IAM role for failure feedback
    */
  val applicationFailureFeedbackRoleArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The IAM role permitted to receive success feedback for this topic
    */
  val applicationSuccessFeedbackRoleArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Percentage of success to sample
    */
  val applicationSuccessFeedbackSampleRate: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The ARN of the SNS topic, as a more obvious property (clone of id)
    */
  val arn: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.arnMod.ARN] = js.native
  /**
    * The SNS delivery policy. More on [AWS documentation](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html)
    */
  val deliveryPolicy: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The display name for the SNS topic
    */
  val displayName: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * IAM role for failure feedback
    */
  val httpFailureFeedbackRoleArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The IAM role permitted to receive success feedback for this topic
    */
  val httpSuccessFeedbackRoleArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Percentage of success to sample
    */
  val httpSuccessFeedbackSampleRate: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see [Key Terms](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms)
    */
  val kmsMasterKeyId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * IAM role for failure feedback
    */
  val lambdaFailureFeedbackRoleArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The IAM role permitted to receive success feedback for this topic
    */
  val lambdaSuccessFeedbackRoleArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Percentage of success to sample
    */
  val lambdaSuccessFeedbackSampleRate: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The friendly name for the SNS topic. Conflicts with `name`.
    */
  val namePrefix: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  val policy: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * IAM role for failure feedback
    */
  val sqsFailureFeedbackRoleArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The IAM role permitted to receive success feedback for this topic
    */
  val sqsSuccessFeedbackRoleArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Percentage of success to sample
    */
  val sqsSuccessFeedbackSampleRate: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Creates a new subscription to events fired from this Topic to the handler provided, along
    * with options to control the behavior of the subscription.
    */
  def onEvent(name: java.lang.String, handler: atPulumiAwsLib.snsSnsMixinsMod.TopicEventHandler): atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.snsSnsMixinsMod.TopicEventHandler,
    args: atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscriptionArgs
  ): atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.snsSnsMixinsMod.TopicEventHandler,
    args: atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscription = js.native
}

/* static members */
@JSImport("@pulumi/aws/sns/topic", "Topic")
@js.native
object Topic extends js.Object {
  /**
    * Get an existing Topic resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.snsTopicMod.Topic = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.snsTopicMod.TopicState
  ): atPulumiAwsLib.snsTopicMod.Topic = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.snsTopicMod.TopicState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.snsTopicMod.Topic = js.native
  /**
    * Returns true if the given object is an instance of Topic.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topic.Topic */ scala.Boolean = js.native
}

