package typings
package atPulumiAwsLib.eksGetClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  val arn: java.lang.String
  /**
    * Nested attribute containing `certificate-authority-data` for your cluster.
    */
  val certificateAuthority: atPulumiAwsLib.Anon_Data
  /**
    * The Unix epoch time stamp in seconds for when the cluster was created.
    */
  val createdAt: java.lang.String
  /**
    * The enabled control plane logs.
    */
  val enabledClusterLogTypes: js.Array[java.lang.String]
  /**
    * The endpoint for your Kubernetes API server.
    */
  val endpoint: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val name: java.lang.String
  /**
    * The platform version for the cluster.
    */
  val platformVersion: java.lang.String
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
    */
  val roleArn: java.lang.String
  /**
    * The Kubernetes server version for the cluster.
    */
  val version: java.lang.String
  /**
    * Nested attribute containing VPC configuration for the cluster.
    */
  val vpcConfig: atPulumiAwsLib.Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    certificateAuthority: atPulumiAwsLib.Anon_Data,
    createdAt: java.lang.String,
    enabledClusterLogTypes: js.Array[java.lang.String],
    endpoint: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    platformVersion: java.lang.String,
    roleArn: java.lang.String,
    version: java.lang.String,
    vpcConfig: atPulumiAwsLib.Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn, certificateAuthority = certificateAuthority, createdAt = createdAt, enabledClusterLogTypes = enabledClusterLogTypes, endpoint = endpoint, id = id, name = name, platformVersion = platformVersion, roleArn = roleArn, version = version, vpcConfig = vpcConfig)
  
    __obj.asInstanceOf[GetClusterResult]
  }
}

