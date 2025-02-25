package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of a layer.
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * The layer attributes. For the HaproxyStatsPassword, MysqlRootPassword, and GangliaPassword attributes, AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value For an ECS Cluster layer, AWS OpsWorks Stacks the EcsClusterArn attribute is set to the cluster's ARN.
    */
  var Attributes: js.UndefOr[LayerAttributes] = js.undefined
  /**
    * Whether to automatically assign an Elastic IP address to the layer's instances. For more information, see How to Edit a Layer.
    */
  var AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined
  /**
    * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's instances. For more information, see How to Edit a Layer.
    */
  var AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon CloudWatch Logs configuration settings for the layer.
    */
  var CloudWatchLogsConfiguration: js.UndefOr[CloudWatchLogsConfiguration] = js.undefined
  /**
    * Date when the layer was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  /**
    * The ARN of the default IAM profile to be used for the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var CustomInstanceProfileArn: js.UndefOr[String] = js.undefined
  /**
    * A JSON formatted string containing the layer's custom stack configuration and deployment attributes.
    */
  var CustomJson: js.UndefOr[String] = js.undefined
  /**
    * A LayerCustomRecipes object that specifies the layer's custom recipes.
    */
  var CustomRecipes: js.UndefOr[Recipes] = js.undefined
  /**
    * An array containing the layer's custom security group IDs.
    */
  var CustomSecurityGroupIds: js.UndefOr[Strings] = js.undefined
  /**
    * AWS OpsWorks Stacks supports five lifecycle events: setup, configuration, deploy, undeploy, and shutdown. For each layer, AWS OpsWorks Stacks runs a set of standard recipes for each event. You can also provide custom recipes for any or all layers and events. AWS OpsWorks Stacks runs custom event recipes after the standard recipes. LayerCustomRecipes specifies the custom recipes for a particular layer to be run in response to each of the five events. To specify a recipe, use the cookbook's directory name in the repository followed by two colons and the recipe name, which is the recipe's file name without the .rb extension. For example: phpapp2::dbsetup specifies the dbsetup.rb recipe in the repository's phpapp2 folder.
    */
  var DefaultRecipes: js.UndefOr[Recipes] = js.undefined
  /**
    * An array containing the layer's security group names.
    */
  var DefaultSecurityGroupNames: js.UndefOr[Strings] = js.undefined
  /**
    * Whether auto healing is disabled for the layer.
    */
  var EnableAutoHealing: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. If this value is set to false, you must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.undefined
  /**
    * A LifeCycleEventConfiguration object that specifies the Shutdown event configuration.
    */
  var LifecycleEventConfiguration: js.UndefOr[LifecycleEventConfiguration] = js.undefined
  /**
    * The layer name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * An array of Package objects that describe the layer's packages.
    */
  var Packages: js.UndefOr[Strings] = js.undefined
  /**
    * The layer short name.
    */
  var Shortname: js.UndefOr[String] = js.undefined
  /**
    * The layer stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  /**
    * The layer type.
    */
  var Type: js.UndefOr[LayerType] = js.undefined
  /**
    * Whether the layer uses Amazon EBS-optimized instances.
    */
  var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined
  /**
    * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
    */
  var VolumeConfigurations: js.UndefOr[VolumeConfigurations] = js.undefined
}

object Layer {
  @scala.inline
  def apply(
    Arn: String = null,
    Attributes: LayerAttributes = null,
    AutoAssignElasticIps: js.UndefOr[Boolean] = js.undefined,
    AutoAssignPublicIps: js.UndefOr[Boolean] = js.undefined,
    CloudWatchLogsConfiguration: CloudWatchLogsConfiguration = null,
    CreatedAt: DateTime = null,
    CustomInstanceProfileArn: String = null,
    CustomJson: String = null,
    CustomRecipes: Recipes = null,
    CustomSecurityGroupIds: Strings = null,
    DefaultRecipes: Recipes = null,
    DefaultSecurityGroupNames: Strings = null,
    EnableAutoHealing: js.UndefOr[Boolean] = js.undefined,
    InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.undefined,
    LayerId: String = null,
    LifecycleEventConfiguration: LifecycleEventConfiguration = null,
    Name: String = null,
    Packages: Strings = null,
    Shortname: String = null,
    StackId: String = null,
    Type: LayerType = null,
    UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.undefined,
    VolumeConfigurations: VolumeConfigurations = null
  ): Layer = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (!js.isUndefined(AutoAssignElasticIps)) __obj.updateDynamic("AutoAssignElasticIps")(AutoAssignElasticIps)
    if (!js.isUndefined(AutoAssignPublicIps)) __obj.updateDynamic("AutoAssignPublicIps")(AutoAssignPublicIps)
    if (CloudWatchLogsConfiguration != null) __obj.updateDynamic("CloudWatchLogsConfiguration")(CloudWatchLogsConfiguration)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (CustomInstanceProfileArn != null) __obj.updateDynamic("CustomInstanceProfileArn")(CustomInstanceProfileArn)
    if (CustomJson != null) __obj.updateDynamic("CustomJson")(CustomJson)
    if (CustomRecipes != null) __obj.updateDynamic("CustomRecipes")(CustomRecipes)
    if (CustomSecurityGroupIds != null) __obj.updateDynamic("CustomSecurityGroupIds")(CustomSecurityGroupIds)
    if (DefaultRecipes != null) __obj.updateDynamic("DefaultRecipes")(DefaultRecipes)
    if (DefaultSecurityGroupNames != null) __obj.updateDynamic("DefaultSecurityGroupNames")(DefaultSecurityGroupNames)
    if (!js.isUndefined(EnableAutoHealing)) __obj.updateDynamic("EnableAutoHealing")(EnableAutoHealing)
    if (!js.isUndefined(InstallUpdatesOnBoot)) __obj.updateDynamic("InstallUpdatesOnBoot")(InstallUpdatesOnBoot)
    if (LayerId != null) __obj.updateDynamic("LayerId")(LayerId)
    if (LifecycleEventConfiguration != null) __obj.updateDynamic("LifecycleEventConfiguration")(LifecycleEventConfiguration)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Packages != null) __obj.updateDynamic("Packages")(Packages)
    if (Shortname != null) __obj.updateDynamic("Shortname")(Shortname)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (!js.isUndefined(UseEbsOptimizedInstances)) __obj.updateDynamic("UseEbsOptimizedInstances")(UseEbsOptimizedInstances)
    if (VolumeConfigurations != null) __obj.updateDynamic("VolumeConfigurations")(VolumeConfigurations)
    __obj.asInstanceOf[Layer]
  }
}

