package typings
package atPulumiAwsLib.elasticbeanstalkApplicationVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticbeanstalk/applicationVersion", "ApplicationVersion")
@js.native
class ApplicationVersion protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ApplicationVersion resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ApplicationVersionArgs) = this()
  def this(name: java.lang.String, args: ApplicationVersionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Name of the Beanstalk Application the version is associated with.
    */
  val application: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.elasticbeanstalkApplicationMod.Application] = js.native
  /**
    * The ARN assigned by AWS for this Elastic Beanstalk Application.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * S3 bucket that contains the Application Version source bundle.
    */
  val bucket: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Short description of the Application Version.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * On delete, force an Application Version to be deleted when it may be in use
    * by multiple Elastic Beanstalk Environments.
    */
  val forceDelete: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * S3 object that is the Application Version source bundle.
    */
  val key: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A unique name for the this Application Version.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Key-value mapping of tags for the Elastic Beanstalk Application Version.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticbeanstalk/applicationVersion", "ApplicationVersion")
@js.native
object ApplicationVersion extends js.Object {
  /**
    * Get an existing ApplicationVersion resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersionState
  ): atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
  /**
    * Returns true if the given object is an instance of ApplicationVersion.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/applicationVersion.ApplicationVersion */ scala.Boolean = js.native
}

