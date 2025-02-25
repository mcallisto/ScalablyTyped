package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBInstance extends js.Object {
  /**
    * Specifies the allocated storage size specified in gibibytes.
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  /**
    * Indicates that minor version patches are applied automatically.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the name of the Availability Zone the DB instance is located in.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * Specifies the number of days for which automatic DB snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined
  /**
    * The identifier of the CA certificate for this DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.undefined
  /**
    * If present, specifies the name of the character set that this instance is associated with.
    */
  var CharacterSetName: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether tags are copied from the DB instance to snapshots of the DB instance.
    */
  var CopyTagsToSnapshot: js.UndefOr[Boolean] = js.undefined
  /**
    * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the DB instance.
    */
  var DBInstanceArn: js.UndefOr[String] = js.undefined
  /**
    * Contains the name of the compute and memory capacity class of the DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  /**
    * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Specifies the current state of this database.
    */
  var DBInstanceStatus: js.UndefOr[String] = js.undefined
  /**
    * The database name.
    */
  var DBName: js.UndefOr[String] = js.undefined
  /**
    * Provides the list of DB parameter groups applied to this DB instance.
    */
  var DBParameterGroups: js.UndefOr[DBParameterGroupStatusList] = js.undefined
  /**
    *  Provides List of DB security group elements containing only DBSecurityGroup.Name and DBSecurityGroup.Status subelements.
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined
  /**
    * Specifies information on the subnet group associated with the DB instance, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
  /**
    * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a different port than the DB cluster port.
    */
  var DbInstancePort: js.UndefOr[Integer] = js.undefined
  /**
    * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
    */
  var DbiResourceId: js.UndefOr[String] = js.undefined
  /**
    * Not supported
    */
  var DomainMemberships: js.UndefOr[DomainMembershipList] = js.undefined
  /**
    * A list of log types that this DB instance is configured to export to CloudWatch Logs.
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  /**
    * Specifies the connection endpoint.
    */
  var Endpoint: js.UndefOr[Endpoint] = js.undefined
  /**
    * Provides the name of the database engine to be used for this DB instance.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch Logs log stream that receives the Enhanced Monitoring metrics data for the DB instance.
    */
  var EnhancedMonitoringResourceArn: js.UndefOr[String] = js.undefined
  /**
    * True if AWS Identity and Access Management (IAM) authentication is enabled, and otherwise false.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides the date and time the DB instance was created.
    */
  var InstanceCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  /**
    *  Not supported: The encryption for DB instances is managed by the DB cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[TStamp] = js.undefined
  /**
    * License model information for this DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  /**
    * Contains the master username for the DB instance.
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The ARN for the IAM role that permits Neptune to send Enhanced Monitoring metrics to Amazon CloudWatch Logs.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.undefined
  /**
    * Specifies if the DB instance is a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides the list of option group memberships for this DB instance.
    */
  var OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList] = js.undefined
  /**
    * Specifies that changes to the DB instance are pending. This element is only included when changes are pending. Specific changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined
  /**
    * True if Performance Insights is enabled for the DB instance, and otherwise false.
    */
  var PerformanceInsightsEnabled: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
  /**
    *  Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod.
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    * A value that specifies the order in which a Read Replica is promoted to the primary instance after a failure of the existing primary instance. 
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * This flag should no longer be used.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
  /**
    * Contains one or more identifiers of DB clusters that are Read Replicas of this DB instance.
    */
  var ReadReplicaDBClusterIdentifiers: js.UndefOr[ReadReplicaDBClusterIdentifierList] = js.undefined
  /**
    * Contains one or more identifiers of the Read Replicas associated with this DB instance.
    */
  var ReadReplicaDBInstanceIdentifiers: js.UndefOr[ReadReplicaDBInstanceIdentifierList] = js.undefined
  /**
    * Contains the identifier of the source DB instance if this DB instance is a Read Replica.
    */
  var ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * If present, specifies the name of the secondary Availability Zone for a DB instance with multi-AZ support.
    */
  var SecondaryAvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The status of a Read Replica. If the instance is not a Read Replica, this is blank.
    */
  var StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.undefined
  /**
    * Not supported: The encryption for DB instances is managed by the DB cluster.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the storage type associated with DB instance.
    */
  var StorageType: js.UndefOr[String] = js.undefined
  /**
    * The ARN from the key store with which the instance is associated for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.undefined
  /**
    * Not supported.
    */
  var Timezone: js.UndefOr[String] = js.undefined
  /**
    * Provides a list of VPC security group elements that the DB instance belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}

object DBInstance {
  @scala.inline
  def apply(
    AllocatedStorage: js.UndefOr[Integer] = js.undefined,
    AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
    AvailabilityZone: String = null,
    BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined,
    CACertificateIdentifier: String = null,
    CharacterSetName: String = null,
    CopyTagsToSnapshot: js.UndefOr[Boolean] = js.undefined,
    DBClusterIdentifier: String = null,
    DBInstanceArn: String = null,
    DBInstanceClass: String = null,
    DBInstanceIdentifier: String = null,
    DBInstanceStatus: String = null,
    DBName: String = null,
    DBParameterGroups: DBParameterGroupStatusList = null,
    DBSecurityGroups: DBSecurityGroupMembershipList = null,
    DBSubnetGroup: DBSubnetGroup = null,
    DbInstancePort: js.UndefOr[Integer] = js.undefined,
    DbiResourceId: String = null,
    DomainMemberships: DomainMembershipList = null,
    EnabledCloudwatchLogsExports: LogTypeList = null,
    Endpoint: Endpoint = null,
    Engine: String = null,
    EngineVersion: String = null,
    EnhancedMonitoringResourceArn: String = null,
    IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
    InstanceCreateTime: TStamp = null,
    Iops: js.UndefOr[IntegerOptional] = js.undefined,
    KmsKeyId: String = null,
    LatestRestorableTime: TStamp = null,
    LicenseModel: String = null,
    MasterUsername: String = null,
    MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
    MonitoringRoleArn: String = null,
    MultiAZ: js.UndefOr[Boolean] = js.undefined,
    OptionGroupMemberships: OptionGroupMembershipList = null,
    PendingModifiedValues: PendingModifiedValues = null,
    PerformanceInsightsEnabled: js.UndefOr[BooleanOptional] = js.undefined,
    PerformanceInsightsKMSKeyId: String = null,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
    PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
    ReadReplicaDBClusterIdentifiers: ReadReplicaDBClusterIdentifierList = null,
    ReadReplicaDBInstanceIdentifiers: ReadReplicaDBInstanceIdentifierList = null,
    ReadReplicaSourceDBInstanceIdentifier: String = null,
    SecondaryAvailabilityZone: String = null,
    StatusInfos: DBInstanceStatusInfoList = null,
    StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
    StorageType: String = null,
    TdeCredentialArn: String = null,
    Timezone: String = null,
    VpcSecurityGroups: VpcSecurityGroupMembershipList = null
  ): DBInstance = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllocatedStorage)) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage)
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(BackupRetentionPeriod)) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod)
    if (CACertificateIdentifier != null) __obj.updateDynamic("CACertificateIdentifier")(CACertificateIdentifier)
    if (CharacterSetName != null) __obj.updateDynamic("CharacterSetName")(CharacterSetName)
    if (!js.isUndefined(CopyTagsToSnapshot)) __obj.updateDynamic("CopyTagsToSnapshot")(CopyTagsToSnapshot)
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier)
    if (DBInstanceArn != null) __obj.updateDynamic("DBInstanceArn")(DBInstanceArn)
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass)
    if (DBInstanceIdentifier != null) __obj.updateDynamic("DBInstanceIdentifier")(DBInstanceIdentifier)
    if (DBInstanceStatus != null) __obj.updateDynamic("DBInstanceStatus")(DBInstanceStatus)
    if (DBName != null) __obj.updateDynamic("DBName")(DBName)
    if (DBParameterGroups != null) __obj.updateDynamic("DBParameterGroups")(DBParameterGroups)
    if (DBSecurityGroups != null) __obj.updateDynamic("DBSecurityGroups")(DBSecurityGroups)
    if (DBSubnetGroup != null) __obj.updateDynamic("DBSubnetGroup")(DBSubnetGroup)
    if (!js.isUndefined(DbInstancePort)) __obj.updateDynamic("DbInstancePort")(DbInstancePort)
    if (DbiResourceId != null) __obj.updateDynamic("DbiResourceId")(DbiResourceId)
    if (DomainMemberships != null) __obj.updateDynamic("DomainMemberships")(DomainMemberships)
    if (EnabledCloudwatchLogsExports != null) __obj.updateDynamic("EnabledCloudwatchLogsExports")(EnabledCloudwatchLogsExports)
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (EnhancedMonitoringResourceArn != null) __obj.updateDynamic("EnhancedMonitoringResourceArn")(EnhancedMonitoringResourceArn)
    if (!js.isUndefined(IAMDatabaseAuthenticationEnabled)) __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(IAMDatabaseAuthenticationEnabled)
    if (InstanceCreateTime != null) __obj.updateDynamic("InstanceCreateTime")(InstanceCreateTime)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (LatestRestorableTime != null) __obj.updateDynamic("LatestRestorableTime")(LatestRestorableTime)
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel)
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername)
    if (!js.isUndefined(MonitoringInterval)) __obj.updateDynamic("MonitoringInterval")(MonitoringInterval)
    if (MonitoringRoleArn != null) __obj.updateDynamic("MonitoringRoleArn")(MonitoringRoleArn)
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (OptionGroupMemberships != null) __obj.updateDynamic("OptionGroupMemberships")(OptionGroupMemberships)
    if (PendingModifiedValues != null) __obj.updateDynamic("PendingModifiedValues")(PendingModifiedValues)
    if (!js.isUndefined(PerformanceInsightsEnabled)) __obj.updateDynamic("PerformanceInsightsEnabled")(PerformanceInsightsEnabled)
    if (PerformanceInsightsKMSKeyId != null) __obj.updateDynamic("PerformanceInsightsKMSKeyId")(PerformanceInsightsKMSKeyId)
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (!js.isUndefined(PromotionTier)) __obj.updateDynamic("PromotionTier")(PromotionTier)
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible)
    if (ReadReplicaDBClusterIdentifiers != null) __obj.updateDynamic("ReadReplicaDBClusterIdentifiers")(ReadReplicaDBClusterIdentifiers)
    if (ReadReplicaDBInstanceIdentifiers != null) __obj.updateDynamic("ReadReplicaDBInstanceIdentifiers")(ReadReplicaDBInstanceIdentifiers)
    if (ReadReplicaSourceDBInstanceIdentifier != null) __obj.updateDynamic("ReadReplicaSourceDBInstanceIdentifier")(ReadReplicaSourceDBInstanceIdentifier)
    if (SecondaryAvailabilityZone != null) __obj.updateDynamic("SecondaryAvailabilityZone")(SecondaryAvailabilityZone)
    if (StatusInfos != null) __obj.updateDynamic("StatusInfos")(StatusInfos)
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted)
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType)
    if (TdeCredentialArn != null) __obj.updateDynamic("TdeCredentialArn")(TdeCredentialArn)
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    if (VpcSecurityGroups != null) __obj.updateDynamic("VpcSecurityGroups")(VpcSecurityGroups)
    __obj.asInstanceOf[DBInstance]
  }
}

