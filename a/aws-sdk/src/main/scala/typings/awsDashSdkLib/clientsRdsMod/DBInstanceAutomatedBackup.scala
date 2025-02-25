package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBInstanceAutomatedBackup extends js.Object {
  /**
    * Specifies the allocated storage size in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  /**
    * The Availability Zone that the automated backup was created in. For information on AWS Regions and Availability Zones, see Regions and Availability Zones.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the automated backup.
    */
  var DBInstanceArn: js.UndefOr[String] = js.undefined
  /**
    * The customer id of the instance that is/was associated with the automated backup. 
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
    */
  var DbiResourceId: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the automated backup is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the database engine for this automated backup.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * The version of the database engine for the automated backup.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides the date and time that the DB instance was created. 
    */
  var InstanceCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The IOPS (I/O operations per second) value for the automated backup. 
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key. 
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * License model information for the automated backup.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  /**
    * The license model of an automated backup.
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  /**
    * The option group the automated backup is associated with. If omitted, the default option group for the engine specified is used.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  /**
    * The port number that the automated backup used for connections. Default: Inherits from the source DB instance Valid Values: 1150-65535 
    */
  var Port: js.UndefOr[Integer] = js.undefined
  /**
    * The AWS Region associated with the automated backup.
    */
  var Region: js.UndefOr[String] = js.undefined
  /**
    * Earliest and latest time an instance can be restored to.
    */
  var RestoreWindow: js.UndefOr[RestoreWindow] = js.undefined
  /**
    * Provides a list of status information for an automated backup:    active - automated backups for current instances    retained - automated backups for deleted instances    creating - automated backups that are waiting for the first automated snapshot to be available.  
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * Specifies the storage type associated with the automated backup.
    */
  var StorageType: js.UndefOr[String] = js.undefined
  /**
    * The ARN from the key store with which the automated backup is associated for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.undefined
  /**
    * The time zone of the automated backup. In most cases, the Timezone element is empty. Timezone content appears only for Microsoft SQL Server DB instances that were created with a time zone specified.
    */
  var Timezone: js.UndefOr[String] = js.undefined
  /**
    * Provides the VPC ID associated with the DB instance
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object DBInstanceAutomatedBackup {
  @scala.inline
  def apply(
    AllocatedStorage: js.UndefOr[Integer] = js.undefined,
    AvailabilityZone: String = null,
    DBInstanceArn: String = null,
    DBInstanceIdentifier: String = null,
    DbiResourceId: String = null,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    Engine: String = null,
    EngineVersion: String = null,
    IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
    InstanceCreateTime: TStamp = null,
    Iops: js.UndefOr[IntegerOptional] = js.undefined,
    KmsKeyId: String = null,
    LicenseModel: String = null,
    MasterUsername: String = null,
    OptionGroupName: String = null,
    Port: js.UndefOr[Integer] = js.undefined,
    Region: String = null,
    RestoreWindow: RestoreWindow = null,
    Status: String = null,
    StorageType: String = null,
    TdeCredentialArn: String = null,
    Timezone: String = null,
    VpcId: String = null
  ): DBInstanceAutomatedBackup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllocatedStorage)) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (DBInstanceArn != null) __obj.updateDynamic("DBInstanceArn")(DBInstanceArn)
    if (DBInstanceIdentifier != null) __obj.updateDynamic("DBInstanceIdentifier")(DBInstanceIdentifier)
    if (DbiResourceId != null) __obj.updateDynamic("DbiResourceId")(DbiResourceId)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (!js.isUndefined(IAMDatabaseAuthenticationEnabled)) __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(IAMDatabaseAuthenticationEnabled)
    if (InstanceCreateTime != null) __obj.updateDynamic("InstanceCreateTime")(InstanceCreateTime)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel)
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername)
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (RestoreWindow != null) __obj.updateDynamic("RestoreWindow")(RestoreWindow)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType)
    if (TdeCredentialArn != null) __obj.updateDynamic("TdeCredentialArn")(TdeCredentialArn)
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[DBInstanceAutomatedBackup]
  }
}

