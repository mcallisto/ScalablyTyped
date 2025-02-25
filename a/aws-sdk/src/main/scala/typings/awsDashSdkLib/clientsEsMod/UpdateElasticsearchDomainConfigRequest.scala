package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateElasticsearchDomainConfigRequest extends js.Object {
  /**
    * IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined
  /**
    * Modifies the advanced option to allow references to indices in an HTTP request body. Must be false when configuring access to individual sub-resources. By default, the value is true. See Configuration Advanced Options for more information.
    */
  var AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined
  /**
    * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined
  /**
    * The name of the Elasticsearch domain that you are updating. 
    */
  var DomainName: awsDashSdkLib.clientsEsMod.DomainName
  /**
    * Specify the type and size of the EBS volume that you want to use. 
    */
  var EBSOptions: js.UndefOr[EBSOptions] = js.undefined
  /**
    * The type and number of instances to instantiate for the domain cluster.
    */
  var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig] = js.undefined
  /**
    * Map of LogType and LogPublishingOption, each containing options to publish a given type of Elasticsearch log.
    */
  var LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined
  /**
    * Option to set the time, in UTC format, for the daily automated snapshot. Default value is 0 hours. 
    */
  var SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined
  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see Creating a VPC in VPC Endpoints for Amazon Elasticsearch Service Domains
    */
  var VPCOptions: js.UndefOr[VPCOptions] = js.undefined
}

object UpdateElasticsearchDomainConfigRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    AccessPolicies: PolicyDocument = null,
    AdvancedOptions: AdvancedOptions = null,
    CognitoOptions: CognitoOptions = null,
    EBSOptions: EBSOptions = null,
    ElasticsearchClusterConfig: ElasticsearchClusterConfig = null,
    LogPublishingOptions: LogPublishingOptions = null,
    SnapshotOptions: SnapshotOptions = null,
    VPCOptions: VPCOptions = null
  ): UpdateElasticsearchDomainConfigRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (AccessPolicies != null) __obj.updateDynamic("AccessPolicies")(AccessPolicies)
    if (AdvancedOptions != null) __obj.updateDynamic("AdvancedOptions")(AdvancedOptions)
    if (CognitoOptions != null) __obj.updateDynamic("CognitoOptions")(CognitoOptions)
    if (EBSOptions != null) __obj.updateDynamic("EBSOptions")(EBSOptions)
    if (ElasticsearchClusterConfig != null) __obj.updateDynamic("ElasticsearchClusterConfig")(ElasticsearchClusterConfig)
    if (LogPublishingOptions != null) __obj.updateDynamic("LogPublishingOptions")(LogPublishingOptions)
    if (SnapshotOptions != null) __obj.updateDynamic("SnapshotOptions")(SnapshotOptions)
    if (VPCOptions != null) __obj.updateDynamic("VPCOptions")(VPCOptions)
    __obj.asInstanceOf[UpdateElasticsearchDomainConfigRequest]
  }
}

