package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBInstanceMessage extends js.Object {
  /**
    * The amount of storage (in gibibytes) to allocate for the DB instance. Type: Integer  Amazon Aurora  Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database increases, though you are only charged for the space that you use in an Aurora cluster volume.  MySQL  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.   Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.   Magnetic storage (standard): Must be an integer from 5 to 3072.    MariaDB  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.   Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.   Magnetic storage (standard): Must be an integer from 5 to 3072.    PostgreSQL  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.   Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.   Magnetic storage (standard): Must be an integer from 5 to 3072.    Oracle  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.   Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.   Magnetic storage (standard): Must be an integer from 10 to 3072.    SQL Server  Constraints to the amount of storage for each storage type are the following:    General Purpose (SSD) storage (gp2):   Enterprise and Standard editions: Must be an integer from 200 to 16384.   Web and Express editions: Must be an integer from 20 to 16384.     Provisioned IOPS storage (io1):   Enterprise and Standard editions: Must be an integer from 200 to 16384.   Web and Express editions: Must be an integer from 100 to 16384.     Magnetic storage (standard):   Enterprise and Standard editions: Must be an integer from 200 to 1024.   Web and Express editions: Must be an integer from 20 to 1024.    
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A value that indicates whether minor engine upgrades are applied automatically to the DB instance during the maintenance window. By default, minor engine upgrades are applied automatically.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  /**
    *  The Availability Zone (AZ) where the database will be created. For information on AWS Regions and Availability Zones, see Regions and Availability Zones.  Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.  Example: us-east-1d   Constraint: The AvailabilityZone parameter can't be specified if the DB instance is a Multi-AZ deployment. The specified Availability Zone must be in the same AWS Region as the current endpoint. 
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The number of days for which automated backups are retained. Setting this parameter to a positive number enables backups. Setting this parameter to 0 disables automated backups.  Amazon Aurora  Not applicable. The retention period for automated backups is managed by the DB cluster. Default: 1 Constraints:   Must be a value from 0 to 35   Can't be set to 0 if the DB instance is a source to Read Replicas  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * For supported engines, indicates that the DB instance should be associated with the specified CharacterSet.  Amazon Aurora  Not applicable. The character set is managed by the DB cluster. For more information, see CreateDBCluster.
    */
  var CharacterSetName: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates whether to copy tags from the DB instance to snapshots of the DB instance. By default, tags are not copied.  Amazon Aurora  Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB instance has no effect on the DB cluster setting.
    */
  var CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The identifier of the DB cluster that the instance will belong to.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The compute and memory capacity of the DB instance, for example, db.m4.large. Not all DB instance classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes, and availability for your engine, see DB Instance Class in the Amazon RDS User Guide. 
    */
  var DBInstanceClass: String
  /**
    * The DB instance identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
    */
  var DBInstanceIdentifier: String
  /**
    * The meaning of this parameter differs according to the database engine you use.  MySQL  The name of the database to create when the DB instance is created. If this parameter is not specified, no database is created in the DB instance. Constraints:   Must contain 1 to 64 letters or numbers.   Can't be a word reserved by the specified database engine    MariaDB  The name of the database to create when the DB instance is created. If this parameter is not specified, no database is created in the DB instance. Constraints:   Must contain 1 to 64 letters or numbers.   Can't be a word reserved by the specified database engine    PostgreSQL  The name of the database to create when the DB instance is created. If this parameter is not specified, the default "postgres" database is created in the DB instance. Constraints:   Must contain 1 to 63 letters, numbers, or underscores.   Must begin with a letter or an underscore. Subsequent characters can be letters, underscores, or digits (0-9).   Can't be a word reserved by the specified database engine    Oracle  The Oracle System ID (SID) of the created DB instance. If you specify null, the default value ORCL is used. You can't specify the string NULL, or any other reserved word, for DBName.  Default: ORCL  Constraints:   Can't be longer than 8 characters    SQL Server  Not applicable. Must be null.  Amazon Aurora  The name of the database to create when the primary instance of the DB cluster is created. If this parameter is not specified, no database is created in the DB instance. Constraints:   Must contain 1 to 64 letters or numbers.   Can't be a word reserved by the specified database engine  
    */
  var DBName: js.UndefOr[String] = js.undefined
  /**
    * The name of the DB parameter group to associate with this DB instance. If this argument is omitted, the default DBParameterGroup for the specified engine is used. Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens  
    */
  var DBParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * A list of DB security groups to associate with this DB instance. Default: The default DB security group for the database engine.
    */
  var DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined
  /**
    * A DB subnet group to associate with this DB instance. If there is no DB subnet group, then it is a non-VPC DB instance.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled. For more information, see  Deleting a DB Instance. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * For an Amazon RDS DB instance that's running Microsoft SQL Server, this parameter specifies the Active Directory directory ID to create the instance in. Amazon RDS uses Windows Authentication to authenticate users that connect to the DB instance. For more information, see Using Windows Authentication with an Amazon RDS DB Instance Running Microsoft SQL Server in the Amazon RDS User Guide. 
    */
  var Domain: js.UndefOr[String] = js.undefined
  /**
    * Specify the name of the IAM role to be used when making API calls to the Directory Service.
    */
  var DomainIAMRoleName: js.UndefOr[String] = js.undefined
  /**
    * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on the DB engine being used. For more information, see Publishing Database Logs to Amazon CloudWatch Logs  in the Amazon Relational Database Service User Guide.
    */
  var EnableCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.undefined
  /**
    * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts. By default, mapping is disabled. You can enable IAM database authentication for the following database engines:  Amazon Aurora  Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster.  MySQL    For MySQL 5.6, minor version 5.6.34 or higher   For MySQL 5.7, minor version 5.7.16 or higher  
    */
  var EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A value that indicates whether to enable Performance Insights for the DB instance.  For more information, see Using Amazon Performance Insights in the Amazon Relational Database Service User Guide. 
    */
  var EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The name of the database engine to be used for this instance.  Not every database engine is available for every AWS Region.  Valid Values:     aurora (for MySQL 5.6-compatible Aurora)    aurora-mysql (for MySQL 5.7-compatible Aurora)    aurora-postgresql     mariadb     mysql     oracle-ee     oracle-se2     oracle-se1     oracle-se     postgres     sqlserver-ee     sqlserver-se     sqlserver-ex     sqlserver-web   
    */
  var Engine: String
  /**
    * The version number of the database engine to use. For a list of valid engine versions, use the DescribeDBEngineVersions action. The following are the database engines and links to information about the major and minor versions that are available with Amazon RDS. Not every database engine is available for every AWS Region.  Amazon Aurora  Not applicable. The version number of the database engine to be used by the DB instance is managed by the DB cluster.  MariaDB  See MariaDB on Amazon RDS Versions in the Amazon RDS User Guide.   Microsoft SQL Server  See Version and Feature Support on Amazon RDS in the Amazon RDS User Guide.   MySQL  See MySQL on Amazon RDS Versions in the Amazon RDS User Guide.   Oracle  See Oracle Database Engine Release Notes in the Amazon RDS User Guide.   PostgreSQL  See Supported PostgreSQL Database Versions in the Amazon RDS User Guide. 
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB instance. For information about valid Iops values, see see Amazon RDS Provisioned IOPS Storage to Improve Performance in the Amazon RDS User Guide.  Constraints: Must be a multiple between 1 and 50 of the storage amount for the DB instance. 
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The AWS KMS key identifier for an encrypted DB instance. The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB instance with the same AWS account that owns the KMS encryption key used to encrypt the new DB instance, then you can use the KMS key alias instead of the ARN for the KM encryption key.  Amazon Aurora  Not applicable. The KMS key identifier is managed by the DB cluster. For more information, see CreateDBCluster. If StorageEncrypted is enabled, and you do not specify a value for the KmsKeyId parameter, then Amazon RDS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * License model information for this DB instance.  Valid values: license-included | bring-your-own-license | general-public-license 
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  /**
    * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".  Amazon Aurora  Not applicable. The password for the master user is managed by the DB cluster.  MariaDB  Constraints: Must contain from 8 to 41 characters.  Microsoft SQL Server  Constraints: Must contain from 8 to 128 characters.  MySQL  Constraints: Must contain from 8 to 41 characters.  Oracle  Constraints: Must contain from 8 to 30 characters.  PostgreSQL  Constraints: Must contain from 8 to 128 characters.
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  /**
    * The name for the master user.  Amazon Aurora  Not applicable. The name for the master user is managed by the DB cluster.   MariaDB  Constraints:   Required for MariaDB.   Must be 1 to 16 letters or numbers.   Can't be a reserved word for the chosen database engine.    Microsoft SQL Server  Constraints:   Required for SQL Server.   Must be 1 to 128 letters or numbers.   The first character must be a letter.   Can't be a reserved word for the chosen database engine.    MySQL  Constraints:   Required for MySQL.   Must be 1 to 16 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.    Oracle  Constraints:   Required for Oracle.   Must be 1 to 30 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.    PostgreSQL  Constraints:   Required for PostgreSQL.   Must be 1 to 63 letters or numbers.   First character must be a letter.   Can't be a reserved word for the chosen database engine.  
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  /**
    * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
    */
  var MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. If MonitoringRoleArn is specified, then you must also set MonitoringInterval to a value other than 0. Valid Values: 0, 1, 5, 10, 15, 30, 60 
    */
  var MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For example, arn:aws:iam:123456789012:role/emaccess. For information on creating a monitoring role, go to Setting Up and Enabling Enhanced Monitoring in the Amazon RDS User Guide. If MonitoringInterval is set to a value other than 0, then you must supply a MonitoringRoleArn value.
    */
  var MonitoringRoleArn: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates whether the DB instance is a Multi-AZ deployment. You can't set the AvailabilityZone parameter if the DB instance is a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * Indicates that the DB instance should be associated with the specified option group. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  /**
    * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key. If you do not specify a value for PerformanceInsightsKMSKeyId, then Amazon RDS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var PerformanceInsightsKMSKeyId: js.UndefOr[String] = js.undefined
  /**
    * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years). 
    */
  var PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The port number on which the database accepts connections.  MySQL   Default: 3306   Valid Values: 1150-65535  Type: Integer  MariaDB   Default: 3306   Valid Values: 1150-65535  Type: Integer  PostgreSQL   Default: 5432   Valid Values: 1150-65535  Type: Integer  Oracle   Default: 1521   Valid Values: 1150-65535   SQL Server   Default: 1433   Valid Values: 1150-65535 except for 1434, 3389, 47001, 49152, and 49152 through 49156.   Amazon Aurora   Default: 3306   Valid Values: 1150-65535  Type: Integer
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    *  The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter. For more information, see The Backup Window in the Amazon RDS User Guide.   Amazon Aurora  Not applicable. The daily time range for creating automated backups is managed by the DB cluster.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred DB Instance Maintenance Window in the Amazon RDS User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
  /**
    * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC). For more information, see Amazon RDS Maintenance Window.   Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week.  Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun. Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
  /**
    * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure of the existing primary instance. For more information, see  Fault Tolerance for an Aurora DB Cluster in the Amazon Aurora User Guide.  Default: 1 Valid Values: 0 - 15
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A value that indicates whether the DB instance is publicly accessible. When the DB instance is publicly accessible, it is an Internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. When the DB instance is not publicly accessible, it is an internal instance with a DNS name that resolves to a private IP address. Default: The default behavior varies depending on whether DBSubnetGroupName is specified. If DBSubnetGroupName is not specified, and PubliclyAccessible is not specified, the following applies:   If the default VPC in the target region doesn’t have an Internet gateway attached to it, the DB instance is private.   If the default VPC in the target region has an Internet gateway attached to it, the DB instance is public.   If DBSubnetGroupName is specified, and PubliclyAccessible is not specified, the following applies:   If the subnets are part of a VPC that doesn’t have an Internet gateway attached to it, the DB instance is private.   If the subnets are part of a VPC that has an Internet gateway attached to it, the DB instance is public.  
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A value that indicates whether the DB instance is encrypted. By default, it is not encrypted.  Amazon Aurora  Not applicable. The encryption for DB instances is managed by the DB cluster.
    */
  var StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * Specifies the storage type to be associated with the DB instance.  Valid values: standard | gp2 | io1   If you specify io1, you must also include a value for the Iops parameter.   Default: io1 if the Iops parameter is specified, otherwise gp2 
    */
  var StorageType: js.UndefOr[String] = js.undefined
  /**
    * Tags to assign to the DB instance.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ARN from the key store with which to associate the instance for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.undefined
  /**
    * The password for the given ARN from the key store in order to access the device.
    */
  var TdeCredentialPassword: js.UndefOr[String] = js.undefined
  /**
    * The time zone of the DB instance. The time zone parameter is currently supported only by Microsoft SQL Server. 
    */
  var Timezone: js.UndefOr[String] = js.undefined
  /**
    * A list of Amazon EC2 VPC security groups to associate with this DB instance.  Amazon Aurora  Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. Default: The default EC2 VPC security group for the DB subnet group's VPC.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}

object CreateDBInstanceMessage {
  @scala.inline
  def apply(
    DBInstanceClass: String,
    DBInstanceIdentifier: String,
    Engine: String,
    AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
    AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
    AvailabilityZone: String = null,
    BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
    CharacterSetName: String = null,
    CopyTagsToSnapshot: js.UndefOr[BooleanOptional] = js.undefined,
    DBClusterIdentifier: String = null,
    DBName: String = null,
    DBParameterGroupName: String = null,
    DBSecurityGroups: DBSecurityGroupNameList = null,
    DBSubnetGroupName: String = null,
    DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined,
    Domain: String = null,
    DomainIAMRoleName: String = null,
    EnableCloudwatchLogsExports: LogTypeList = null,
    EnableIAMDatabaseAuthentication: js.UndefOr[BooleanOptional] = js.undefined,
    EnablePerformanceInsights: js.UndefOr[BooleanOptional] = js.undefined,
    EngineVersion: String = null,
    Iops: js.UndefOr[IntegerOptional] = js.undefined,
    KmsKeyId: String = null,
    LicenseModel: String = null,
    MasterUserPassword: String = null,
    MasterUsername: String = null,
    MaxAllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
    MonitoringInterval: js.UndefOr[IntegerOptional] = js.undefined,
    MonitoringRoleArn: String = null,
    MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
    OptionGroupName: String = null,
    PerformanceInsightsKMSKeyId: String = null,
    PerformanceInsightsRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    ProcessorFeatures: ProcessorFeatureList = null,
    PromotionTier: js.UndefOr[IntegerOptional] = js.undefined,
    PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
    StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined,
    StorageType: String = null,
    Tags: TagList = null,
    TdeCredentialArn: String = null,
    TdeCredentialPassword: String = null,
    Timezone: String = null,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): CreateDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceClass = DBInstanceClass, DBInstanceIdentifier = DBInstanceIdentifier, Engine = Engine)
    if (!js.isUndefined(AllocatedStorage)) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage)
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(BackupRetentionPeriod)) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod)
    if (CharacterSetName != null) __obj.updateDynamic("CharacterSetName")(CharacterSetName)
    if (!js.isUndefined(CopyTagsToSnapshot)) __obj.updateDynamic("CopyTagsToSnapshot")(CopyTagsToSnapshot)
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier)
    if (DBName != null) __obj.updateDynamic("DBName")(DBName)
    if (DBParameterGroupName != null) __obj.updateDynamic("DBParameterGroupName")(DBParameterGroupName)
    if (DBSecurityGroups != null) __obj.updateDynamic("DBSecurityGroups")(DBSecurityGroups)
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName)
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection)
    if (Domain != null) __obj.updateDynamic("Domain")(Domain)
    if (DomainIAMRoleName != null) __obj.updateDynamic("DomainIAMRoleName")(DomainIAMRoleName)
    if (EnableCloudwatchLogsExports != null) __obj.updateDynamic("EnableCloudwatchLogsExports")(EnableCloudwatchLogsExports)
    if (!js.isUndefined(EnableIAMDatabaseAuthentication)) __obj.updateDynamic("EnableIAMDatabaseAuthentication")(EnableIAMDatabaseAuthentication)
    if (!js.isUndefined(EnablePerformanceInsights)) __obj.updateDynamic("EnablePerformanceInsights")(EnablePerformanceInsights)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel)
    if (MasterUserPassword != null) __obj.updateDynamic("MasterUserPassword")(MasterUserPassword)
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername)
    if (!js.isUndefined(MaxAllocatedStorage)) __obj.updateDynamic("MaxAllocatedStorage")(MaxAllocatedStorage)
    if (!js.isUndefined(MonitoringInterval)) __obj.updateDynamic("MonitoringInterval")(MonitoringInterval)
    if (MonitoringRoleArn != null) __obj.updateDynamic("MonitoringRoleArn")(MonitoringRoleArn)
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName)
    if (PerformanceInsightsKMSKeyId != null) __obj.updateDynamic("PerformanceInsightsKMSKeyId")(PerformanceInsightsKMSKeyId)
    if (!js.isUndefined(PerformanceInsightsRetentionPeriod)) __obj.updateDynamic("PerformanceInsightsRetentionPeriod")(PerformanceInsightsRetentionPeriod)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (ProcessorFeatures != null) __obj.updateDynamic("ProcessorFeatures")(ProcessorFeatures)
    if (!js.isUndefined(PromotionTier)) __obj.updateDynamic("PromotionTier")(PromotionTier)
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible)
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted)
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TdeCredentialArn != null) __obj.updateDynamic("TdeCredentialArn")(TdeCredentialArn)
    if (TdeCredentialPassword != null) __obj.updateDynamic("TdeCredentialPassword")(TdeCredentialPassword)
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds)
    __obj.asInstanceOf[CreateDBInstanceMessage]
  }
}

