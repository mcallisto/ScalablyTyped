package typings
package atPulumiAwsLib.redshiftClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterArgs extends js.Object {
  /**
    * If true , major version upgrades can be applied during the maintenance window to the Amazon Redshift engine that is running on the cluster. Default is true
    */
  val allowVersionUpgrade: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The number of days that automated snapshots are retained. If the value is 0, automated snapshots are disabled. Even if automated snapshots are disabled, you can still create manual snapshots when you want with create-cluster-snapshot. Default is 1.
    */
  val automatedSnapshotRetentionPeriod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The EC2 Availability Zone (AZ) in which you want Amazon Redshift to provision the cluster. For example, if you have several EC2 instances running in a specific Availability Zone, then you might want the cluster to be provisioned in the same zone in order to decrease network latency.
    */
  val availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Cluster Identifier. Must be a lower case
    * string.
    */
  val clusterIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the parameter group to be associated with this cluster.
    */
  val clusterParameterGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The public key for the cluster
    */
  val clusterPublicKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The specific revision number of the database in the cluster
    */
  val clusterRevisionNumber: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of security groups to be associated with this cluster.
    */
  val clusterSecurityGroups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of a cluster subnet group to be associated with this cluster. If this parameter is not provided the resulting cluster will be deployed outside virtual private cloud (VPC).
    */
  val clusterSubnetGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The cluster type to use. Either `single-node` or `multi-node`.
    */
  val clusterType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The version of the Amazon Redshift engine software that you want to deploy on the cluster.
    * The version selected runs on all the nodes in the cluster.
    */
  val clusterVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the first database to be created when the cluster is created.
    * If you do not provide a name, Amazon Redshift will create a default database called `dev`.
    */
  val databaseName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Elastic IP (EIP) address for the cluster.
    */
  val elasticIp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If true , the data in the cluster is encrypted at rest.
    */
  val encrypted: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The connection endpoint
    */
  val endpoint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If true , enhanced VPC routing is enabled.
    */
  val enhancedVpcRouting: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, `skip_final_snapshot` must be false.
    */
  val finalSnapshotIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
    */
  val iamRoles: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Logging, documented below.
    */
  val logging: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketNameEnableS3KeyPrefix]
  ] = js.undefined
  /**
    * Password for the master DB user.
    * Note that this may show up in logs, and it will be stored in the state file. Password must contain at least 8 chars and
    * contain at least one uppercase letter, one lowercase letter, and one number.
    */
  val masterPassword: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Username for the master DB user.
    */
  val masterUsername: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The node type to be provisioned for the cluster.
    */
  val nodeType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The number of compute nodes in the cluster. This parameter is required when the ClusterType parameter is specified as multi-node. Default is 1.
    */
  val numberOfNodes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
    */
  val ownerAccount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The port number on which the cluster accepts incoming connections.
    * The cluster is accessible only via the JDBC and ODBC connection strings. Part of the connection string requires the port on which the cluster will listen for incoming connections. Default port is 5439.
    */
  val port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The weekly time range (in UTC) during which automated cluster maintenance can occur.
    * Format: ddd:hh24:mi-ddd:hh24:mi
    */
  val preferredMaintenanceWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If true, the cluster can be accessed from a public network. Default is `true`.
    */
  val publiclyAccessible: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true , a final cluster snapshot is not created. If false , a final cluster snapshot is created before the cluster is deleted. Default is false.
    */
  val skipFinalSnapshot: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The name of the cluster the source snapshot was created from.
    */
  val snapshotClusterIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Configuration of automatic copy of snapshots from one region to another. Documented below.
    */
  val snapshotCopy: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DestinationRegionGrantName]
  ] = js.undefined
  /**
    * The name of the snapshot from which to create the new cluster.
    */
  val snapshotIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * A list of Virtual Private Cloud (VPC) security groups to be associated with the cluster.
    */
  val vpcSecurityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object ClusterArgs {
  @scala.inline
  def apply(
    clusterIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    nodeType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    allowVersionUpgrade: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    automatedSnapshotRetentionPeriod: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clusterParameterGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clusterPublicKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clusterRevisionNumber: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clusterSecurityGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    clusterSubnetGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clusterType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clusterVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    databaseName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    elasticIp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    encrypted: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    endpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    enhancedVpcRouting: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    finalSnapshotIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    iamRoles: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    kmsKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    logging: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketNameEnableS3KeyPrefix] = null,
    masterPassword: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    masterUsername: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    numberOfNodes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    ownerAccount: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    port: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    preferredMaintenanceWindow: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    publiclyAccessible: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    skipFinalSnapshot: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    snapshotClusterIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    snapshotCopy: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DestinationRegionGrantName] = null,
    snapshotIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    vpcSecurityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): ClusterArgs = {
    val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    if (allowVersionUpgrade != null) __obj.updateDynamic("allowVersionUpgrade")(allowVersionUpgrade.asInstanceOf[js.Any])
    if (automatedSnapshotRetentionPeriod != null) __obj.updateDynamic("automatedSnapshotRetentionPeriod")(automatedSnapshotRetentionPeriod.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (clusterParameterGroupName != null) __obj.updateDynamic("clusterParameterGroupName")(clusterParameterGroupName.asInstanceOf[js.Any])
    if (clusterPublicKey != null) __obj.updateDynamic("clusterPublicKey")(clusterPublicKey.asInstanceOf[js.Any])
    if (clusterRevisionNumber != null) __obj.updateDynamic("clusterRevisionNumber")(clusterRevisionNumber.asInstanceOf[js.Any])
    if (clusterSecurityGroups != null) __obj.updateDynamic("clusterSecurityGroups")(clusterSecurityGroups.asInstanceOf[js.Any])
    if (clusterSubnetGroupName != null) __obj.updateDynamic("clusterSubnetGroupName")(clusterSubnetGroupName.asInstanceOf[js.Any])
    if (clusterType != null) __obj.updateDynamic("clusterType")(clusterType.asInstanceOf[js.Any])
    if (clusterVersion != null) __obj.updateDynamic("clusterVersion")(clusterVersion.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    if (elasticIp != null) __obj.updateDynamic("elasticIp")(elasticIp.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (enhancedVpcRouting != null) __obj.updateDynamic("enhancedVpcRouting")(enhancedVpcRouting.asInstanceOf[js.Any])
    if (finalSnapshotIdentifier != null) __obj.updateDynamic("finalSnapshotIdentifier")(finalSnapshotIdentifier.asInstanceOf[js.Any])
    if (iamRoles != null) __obj.updateDynamic("iamRoles")(iamRoles.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (masterPassword != null) __obj.updateDynamic("masterPassword")(masterPassword.asInstanceOf[js.Any])
    if (masterUsername != null) __obj.updateDynamic("masterUsername")(masterUsername.asInstanceOf[js.Any])
    if (numberOfNodes != null) __obj.updateDynamic("numberOfNodes")(numberOfNodes.asInstanceOf[js.Any])
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (preferredMaintenanceWindow != null) __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow.asInstanceOf[js.Any])
    if (publiclyAccessible != null) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible.asInstanceOf[js.Any])
    if (skipFinalSnapshot != null) __obj.updateDynamic("skipFinalSnapshot")(skipFinalSnapshot.asInstanceOf[js.Any])
    if (snapshotClusterIdentifier != null) __obj.updateDynamic("snapshotClusterIdentifier")(snapshotClusterIdentifier.asInstanceOf[js.Any])
    if (snapshotCopy != null) __obj.updateDynamic("snapshotCopy")(snapshotCopy.asInstanceOf[js.Any])
    if (snapshotIdentifier != null) __obj.updateDynamic("snapshotIdentifier")(snapshotIdentifier.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcSecurityGroupIds != null) __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterArgs]
  }
}

