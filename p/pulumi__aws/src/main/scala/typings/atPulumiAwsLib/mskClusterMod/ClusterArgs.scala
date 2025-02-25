package typings
package atPulumiAwsLib.mskClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterArgs extends js.Object {
  /**
    * Configuration block for the broker nodes of the Kafka cluster.
    */
  val brokerNodeGroupInfo: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AzDistributionClientSubnets]
  /**
    * Configuration block for specifying a client authentication. See below.
    */
  val clientAuthentication: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TlsAnonCertificateAuthorityArnsArray]
  ] = js.undefined
  /**
    * Name of the MSK cluster.
    */
  val clusterName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
    */
  val configurationInfo: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArnRevisionInput]] = js.undefined
  /**
    * Configuration block for specifying encryption. See below.
    */
  val encryptionInfo: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EncryptionAtRestKmsKeyArnEncryptionInTransit]
  ] = js.undefined
  /**
    * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
    */
  val enhancedMonitoring: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specify the desired Kafka software version.
    */
  val kafkaVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
    */
  val numberOfBrokerNodes: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object ClusterArgs {
  @scala.inline
  def apply(
    brokerNodeGroupInfo: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AzDistributionClientSubnets],
    clusterName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    kafkaVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    numberOfBrokerNodes: atPulumiPulumiLib.outputMod.Input[scala.Double],
    clientAuthentication: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TlsAnonCertificateAuthorityArnsArray] = null,
    configurationInfo: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArnRevisionInput] = null,
    encryptionInfo: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EncryptionAtRestKmsKeyArnEncryptionInTransit] = null,
    enhancedMonitoring: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal(brokerNodeGroupInfo = brokerNodeGroupInfo.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any], kafkaVersion = kafkaVersion.asInstanceOf[js.Any], numberOfBrokerNodes = numberOfBrokerNodes.asInstanceOf[js.Any])
    if (clientAuthentication != null) __obj.updateDynamic("clientAuthentication")(clientAuthentication.asInstanceOf[js.Any])
    if (configurationInfo != null) __obj.updateDynamic("configurationInfo")(configurationInfo.asInstanceOf[js.Any])
    if (encryptionInfo != null) __obj.updateDynamic("encryptionInfo")(encryptionInfo.asInstanceOf[js.Any])
    if (enhancedMonitoring != null) __obj.updateDynamic("enhancedMonitoring")(enhancedMonitoring.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
}

