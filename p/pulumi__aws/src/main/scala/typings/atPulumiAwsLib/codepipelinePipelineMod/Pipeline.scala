package typings
package atPulumiAwsLib.codepipelinePipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codepipeline/pipeline", "Pipeline")
@js.native
class Pipeline protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Pipeline resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: PipelineArgs) = this()
  def this(name: java.lang.String, args: PipelineArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The codepipeline ARN.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * An artifact_store block. Artifact stores are documented below.
    * * `stage` (Minimum of at least two `stage` blocks is required) A stage block. Stages are documented below.
    */
  val artifactStore: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_EncryptionKey] = js.native
  /**
    * The name of the pipeline.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
    */
  val roleArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val stages: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_Actions]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/codepipeline/pipeline", "Pipeline")
@js.native
object Pipeline extends js.Object {
  /**
    * Get an existing Pipeline resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.codepipelinePipelineMod.Pipeline = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codepipelinePipelineMod.PipelineState
  ): atPulumiAwsLib.codepipelinePipelineMod.Pipeline = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.codepipelinePipelineMod.PipelineState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.codepipelinePipelineMod.Pipeline = js.native
  /**
    * Returns true if the given object is an instance of Pipeline.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codepipeline/pipeline.Pipeline */ scala.Boolean = js.native
}

