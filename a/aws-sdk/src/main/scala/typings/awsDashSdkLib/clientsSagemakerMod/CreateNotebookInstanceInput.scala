package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNotebookInstanceInput extends js.Object {
  /**
    * A list of Elastic Inference (EI) instance types to associate with this notebook instance. Currently, only one instance type can be associated with a notebook instance. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined
  /**
    * An array of up to three Git repositories to associate with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in AWS CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined
  /**
    * A Git repository to associate with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in AWS CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined
  /**
    * Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to Disabled this notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC. For more information, see Notebook Instances Are Internet-Enabled by Default. You can set the value of this parameter to Disabled only if you set a value for the SubnetId parameter.
    */
  var DirectInternetAccess: js.UndefOr[DirectInternetAccess] = js.undefined
  /**
    * The type of ML compute instance to launch for the notebook instance.
    */
  var InstanceType: awsDashSdkLib.clientsSagemakerMod.InstanceType
  /**
    * The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to your notebook instance. The KMS key you provide must be enabled. For information, see Enabling and Disabling Keys in the AWS Key Management Service Developer Guide.
    */
  var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined
  /**
    * The name of the new notebook instance.
    */
  var NotebookInstanceName: awsDashSdkLib.clientsSagemakerMod.NotebookInstanceName
  /**
    *  When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this role to perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker can perform these tasks. The policy must allow the Amazon SageMaker service principal (sagemaker.amazonaws.com) permissions to assume this role. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
    */
  var RoleArn: awsDashSdkLib.clientsSagemakerMod.RoleArn
  /**
    * Whether root access is enabled or disabled for users of the notebook instance. The default value is Enabled.  Lifecycle configurations need root access to be able to set up a notebook instance. Because of this, lifecycle configurations associated with a notebook instance always run with root access even if you disable root access for users. 
    */
  var RootAccess: js.UndefOr[RootAccess] = js.undefined
  /**
    * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in the subnet. 
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
  /**
    * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML compute instance. 
    */
  var SubnetId: js.UndefOr[SubnetId] = js.undefined
  /**
    * A list of tags to associate with the notebook instance. You can add tags later by using the CreateTags API.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
    */
  var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
}

object CreateNotebookInstanceInput {
  @scala.inline
  def apply(
    InstanceType: InstanceType,
    NotebookInstanceName: NotebookInstanceName,
    RoleArn: RoleArn,
    AcceleratorTypes: NotebookInstanceAcceleratorTypes = null,
    AdditionalCodeRepositories: AdditionalCodeRepositoryNamesOrUrls = null,
    DefaultCodeRepository: CodeRepositoryNameOrUrl = null,
    DirectInternetAccess: DirectInternetAccess = null,
    KmsKeyId: KmsKeyId = null,
    LifecycleConfigName: NotebookInstanceLifecycleConfigName = null,
    RootAccess: RootAccess = null,
    SecurityGroupIds: SecurityGroupIds = null,
    SubnetId: SubnetId = null,
    Tags: TagList = null,
    VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
  ): CreateNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any], NotebookInstanceName = NotebookInstanceName, RoleArn = RoleArn)
    if (AcceleratorTypes != null) __obj.updateDynamic("AcceleratorTypes")(AcceleratorTypes)
    if (AdditionalCodeRepositories != null) __obj.updateDynamic("AdditionalCodeRepositories")(AdditionalCodeRepositories)
    if (DefaultCodeRepository != null) __obj.updateDynamic("DefaultCodeRepository")(DefaultCodeRepository)
    if (DirectInternetAccess != null) __obj.updateDynamic("DirectInternetAccess")(DirectInternetAccess.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (LifecycleConfigName != null) __obj.updateDynamic("LifecycleConfigName")(LifecycleConfigName)
    if (RootAccess != null) __obj.updateDynamic("RootAccess")(RootAccess.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (!js.isUndefined(VolumeSizeInGB)) __obj.updateDynamic("VolumeSizeInGB")(VolumeSizeInGB)
    __obj.asInstanceOf[CreateNotebookInstanceInput]
  }
}

