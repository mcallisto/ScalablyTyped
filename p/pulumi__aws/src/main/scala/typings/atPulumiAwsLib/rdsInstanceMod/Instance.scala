package typings
package atPulumiAwsLib.rdsInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/instance", "Instance")
@js.native
class Instance protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Instance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: InstanceArgs) = this()
  def this(name: java.lang.String, args: InstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The hostname of the RDS instance. See also `endpoint` and `port`.
    */
  val address: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The allocated storage in gibibytes. If `max_allocated_storage` is configured, this argument represents the initial storage allocation and differences from the configuration will be ignored automatically when Storage Autoscaling occurs.
    */
  val allocatedStorage: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Indicates that major version
    * upgrades are allowed. Changing this parameter does not result in an outage and
    * the change is asynchronously applied as soon as possible.
    */
  val allowMajorVersionUpgrade: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon RDS Documentation for more
    * information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
    */
  val applyImmediately: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The ARN of the RDS instance.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Indicates that minor engine upgrades
    * will be applied automatically to the DB instance during the maintenance window.
    * Defaults to true.
    */
  val autoMinorVersionUpgrade: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The AZ for the RDS instance.
    */
  val availabilityZone: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The days to retain backups for. Must be
    * between `0` and `35`. Must be greater than `0` if the database is used as a source for a Read Replica. [See Read Replica][1].
    */
  val backupRetentionPeriod: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * The daily time range (in UTC) during which
    * automated backups are created if they are enabled. Example: "09:46-10:16". Must
    * not overlap with `maintenance_window`.
    */
  val backupWindow: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specifies the identifier of the CA certificate for the
    * DB instance.
    */
  val caCertIdentifier: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The character set name to use for DB
    * encoding in Oracle instances. This can't be changed. See [Oracle Character Sets
    * Supported in Amazon
    * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.OracleCharacterSets.html)
    * for more information.
    */
  val characterSetName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Copy all Instance `tags` to snapshots. Default is `false`.
    */
  val copyTagsToSnapshot: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Name of [DB subnet group](https://www.terraform.io/docs/providers/aws/r/db_subnet_group.html). DB instance will
    * be created in the VPC associated with the DB subnet group. If unspecified, will
    * be created in the `default` VPC, or in EC2 Classic, if available. When working
    * with read replicas, it should be specified only if the source database
    * specifies an instance in another AWS Region. See [DBSubnetGroupName in API
    * action CreateDBInstanceReadReplica](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstanceReadReplica.html)
    * for additional read replica contraints.
    */
  val dbSubnetGroupName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The ID of the Directory Service Active Directory domain to create the instance in.
    */
  val domain: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the IAM role to be used when making API calls to the Directory Service.
    */
  val domainIamRoleName: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * List of log types to enable for exporting to CloudWatch logs. If omitted, no logs will be exported. Valid values (depending on `engine`): `alert`, `audit`, `error`, `general`, `listener`, `slowquery`, `trace`, `postgresql` (PostgreSQL), `upgrade` (PostgreSQL).
    */
  val enabledCloudwatchLogsExports: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The connection endpoint in `address:port` format.
    */
  val endpoint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * (Required unless a `snapshot_identifier` or `replicate_source_db`
    * is provided) The database engine to use.  For supported values, see the Engine parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
    * Note that for Amazon Aurora instances the engine must match the [DB cluster](https://www.terraform.io/docs/providers/aws/r/rds_cluster.html)'s engine'.
    * For information on the difference between the available Aurora MySQL engines
    * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
    * in the Amazon RDS User Guide.
    */
  val engine: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The engine version to use. If `auto_minor_version_upgrade`
    * is enabled, you can provide a prefix of the version such as `5.7` (for `5.7.10`) and
    * this attribute will ignore differences in the patch version automatically (e.g. `5.7.17`).
    * For supported values, see the EngineVersion parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
    * Note that for Amazon Aurora instances the engine version must match the [DB cluster](https://www.terraform.io/docs/providers/aws/r/rds_cluster.html)'s engine version'.
    */
  val engineVersion: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of your final DB snapshot
    * when this DB instance is deleted. If omitted, no final snapshot will be made.
    */
  val finalSnapshotIdentifier: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The canonical hosted zone ID of the DB instance (to be used
    * in a Route 53 Alias record).
    */
  val hostedZoneId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specifies whether or
    * mappings of AWS Identity and Access Management (IAM) accounts to database
    * accounts is enabled.
    */
  val iamDatabaseAuthenticationEnabled: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  val identifier: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique
    * identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The instance type of the RDS instance.
    */
  val instanceClass: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The amount of provisioned IOPS. Setting this implies a
    * storage_type of "io1".
    */
  val iops: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The ARN for the KMS encryption key. If creating an
    * encrypted replica, set this to the destination KMS ARN.
    */
  val kmsKeyId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * (Optional, but required for some DB engines, i.e. Oracle
    * SE1) License model information for this DB instance.
    */
  val licenseModel: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00". See [RDS
    * Maintenance Window
    * docs](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow)
    * for more information.
    */
  val maintenanceWindow: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * When configured, the upper limit to which Amazon RDS can automatically scale the storage of the DB instance. Configuring this will automatically ignore differences to `allocated_storage`. Must be greater than or equal to `allocated_storage` or `0` to disable Storage Autoscaling.
    */
  val maxAllocatedStorage: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The interval, in seconds, between points
    * when Enhanced Monitoring metrics are collected for the DB instance. To disable
    * collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid
    * Values: 0, 1, 5, 10, 15, 30, 60.
    */
  val monitoringInterval: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The ARN for the IAM role that permits RDS
    * to send enhanced monitoring metrics to CloudWatch Logs. You can find more
    * information on the [AWS
    * Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
    * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
    */
  val monitoringRoleArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specifies if the RDS instance is multi-AZ
    */
  val multiAz: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The name of the database to create when the DB instance is created. If this parameter is not specified, no database is created in the DB instance. Note that this does not apply for Oracle or SQL Server engines. See the [AWS documentation](http://docs.aws.amazon.com/cli/latest/reference/rds/create-db-instance.html) for more details on what applies for those engines.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name of the DB option group to associate.
    */
  val optionGroupName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name of the DB parameter group to
    * associate.
    */
  val parameterGroupName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * (Required unless a `snapshot_identifier` or `replicate_source_db`
    * is provided) Password for the master DB user. Note that this may show up in
    * logs, and it will be stored in the state file.
    */
  val password: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Specifies whether Performance Insights are enabled. Defaults to false.
    */
  val performanceInsightsEnabled: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The ARN for the KMS key to encrypt Performance Insights data. When specifying `performance_insights_kms_key_id`, `performance_insights_enabled` needs to be set to true. Once KMS key is set, it can never be changed.
    */
  val performanceInsightsKmsKeyId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The amount of time in days to retain Performance Insights data. Either 7 (7 days) or 731 (2 years). When specifying `performance_insights_retention_period`, `performance_insights_enabled` needs to be set to true. Defaults to '7'.
    */
  val performanceInsightsRetentionPeriod: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * The port on which the DB accepts connections.
    */
  val port: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Bool to control if instance is publicly
    * accessible. Default is `false`.
    */
  val publiclyAccessible: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  val replicas: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Specifies that this resource is a Replicate
    * database, and to use this value as the source database. This correlates to the
    * `identifier` of another Amazon RDS Database to replicate. Note that if you are
    * creating a cross-region replica of an encrypted database you will also need to
    * specify a `kms_key_id`. See [DB Instance Replication][1] and [Working with
    * PostgreSQL and MySQL Read Replicas](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html)
    * for more information on using Replication.
    */
  val replicateSourceDb: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The RDS Resource ID of this instance.
    */
  val resourceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Restore from a Percona Xtrabackup in S3.  See [Importing Data into an Amazon RDS MySQL DB Instance](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html)
    */
  val s3Import: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_BucketNameBucketPrefix]] = js.native
  /**
    * List of DB Security Groups to
    * associate. Only used for [DB Instances on the _EC2-Classic_
    * Platform](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html#USER_VPC.FindDefaultVPC).
    */
  val securityGroupNames: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Determines whether a final DB snapshot is
    * created before the DB instance is deleted. If true is specified, no DBSnapshot
    * is created. If false is specified, a DB snapshot is created before the DB
    * instance is deleted, using the value from `final_snapshot_identifier`. Default
    * is `false`.
    */
  val skipFinalSnapshot: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Specifies whether or not to create this
    * database from a snapshot. This correlates to the snapshot ID you'd find in the
    * RDS console, e.g: rds:production-2015-06-26-06-05.
    */
  val snapshotIdentifier: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The RDS instance status.
    */
  val status: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specifies whether the DB instance is
    * encrypted. Note that if you are creating a cross-region read replica this field
    * is ignored and you should instead declare `kms_key_id` with a valid ARN. The
    * default is `false` if not specified.
    */
  val storageEncrypted: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * One of "standard" (magnetic), "gp2" (general
    * purpose SSD), or "io1" (provisioned IOPS SSD). The default is "io1" if `iops` is
    * specified, "gp2" if not.
    */
  val storageType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Time zone of the DB instance. `timezone` is currently
    * only supported by Microsoft SQL Server. The `timezone` can only be set on
    * creation. See [MSSQL User
    * Guide](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
    * for more information.
    */
  val timezone: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * (Required unless a `snapshot_identifier` or `replicate_source_db`
    * is provided) Username for the master DB user.
    */
  val username: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * List of VPC security groups to
    * associate.
    */
  val vpcSecurityGroupIds: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/rds/instance", "Instance")
@js.native
object Instance extends js.Object {
  /**
    * Get an existing Instance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsInstanceMod.Instance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsInstanceMod.InstanceState
  ): atPulumiAwsLib.rdsInstanceMod.Instance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsInstanceMod.InstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.rdsInstanceMod.Instance = js.native
  /**
    * Returns true if the given object is an instance of Instance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/instance.Instance */ scala.Boolean = js.native
}

