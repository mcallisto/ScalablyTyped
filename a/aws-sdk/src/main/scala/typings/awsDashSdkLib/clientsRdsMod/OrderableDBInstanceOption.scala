package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderableDBInstanceOption extends js.Object {
  /**
    * A list of Availability Zones for a DB instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  /**
    * A list of the available processor features for the DB instance class of a DB instance.
    */
  var AvailableProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.undefined
  /**
    * The DB instance class for a DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  /**
    * The engine type of a DB instance.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * The engine version of a DB instance.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The license model for a DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  /**
    * Maximum total provisioned IOPS for a DB instance.
    */
  var MaxIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Maximum provisioned IOPS per GiB for a DB instance.
    */
  var MaxIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined
  /**
    * Maximum storage size for a DB instance.
    */
  var MaxStorageSize: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Minimum total provisioned IOPS for a DB instance.
    */
  var MinIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Minimum provisioned IOPS per GiB for a DB instance.
    */
  var MinIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined
  /**
    * Minimum storage size for a DB instance.
    */
  var MinStorageSize: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Indicates whether a DB instance is Multi-AZ capable.
    */
  var MultiAZCapable: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether a DB instance can have a Read Replica.
    */
  var ReadReplicaCapable: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the storage type for a DB instance.
    */
  var StorageType: js.UndefOr[String] = js.undefined
  /**
    * A list of the supported DB engine modes.
    */
  var SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined
  /**
    * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
    */
  var SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether a DB instance supports IAM database authentication.
    */
  var SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether a DB instance supports provisioned IOPS.
    */
  var SupportsIops: js.UndefOr[Boolean] = js.undefined
  /**
    * True if a DB instance supports Performance Insights, otherwise false.
    */
  var SupportsPerformanceInsights: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not Amazon RDS can automatically scale storage for DB instances that use the specified instance class.
    */
  var SupportsStorageAutoscaling: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * Indicates whether a DB instance supports encrypted storage.
    */
  var SupportsStorageEncryption: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether a DB instance is in a VPC.
    */
  var Vpc: js.UndefOr[Boolean] = js.undefined
}

object OrderableDBInstanceOption {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZoneList = null,
    AvailableProcessorFeatures: AvailableProcessorFeatureList = null,
    DBInstanceClass: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    LicenseModel: String = null,
    MaxIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined,
    MaxIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined,
    MaxStorageSize: js.UndefOr[IntegerOptional] = js.undefined,
    MinIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined,
    MinIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined,
    MinStorageSize: js.UndefOr[IntegerOptional] = js.undefined,
    MultiAZCapable: js.UndefOr[Boolean] = js.undefined,
    ReadReplicaCapable: js.UndefOr[Boolean] = js.undefined,
    StorageType: String = null,
    SupportedEngineModes: EngineModeList = null,
    SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.undefined,
    SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.undefined,
    SupportsIops: js.UndefOr[Boolean] = js.undefined,
    SupportsPerformanceInsights: js.UndefOr[Boolean] = js.undefined,
    SupportsStorageAutoscaling: js.UndefOr[BooleanOptional] = js.undefined,
    SupportsStorageEncryption: js.UndefOr[Boolean] = js.undefined,
    Vpc: js.UndefOr[Boolean] = js.undefined
  ): OrderableDBInstanceOption = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (AvailableProcessorFeatures != null) __obj.updateDynamic("AvailableProcessorFeatures")(AvailableProcessorFeatures)
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel)
    if (!js.isUndefined(MaxIopsPerDbInstance)) __obj.updateDynamic("MaxIopsPerDbInstance")(MaxIopsPerDbInstance)
    if (!js.isUndefined(MaxIopsPerGib)) __obj.updateDynamic("MaxIopsPerGib")(MaxIopsPerGib)
    if (!js.isUndefined(MaxStorageSize)) __obj.updateDynamic("MaxStorageSize")(MaxStorageSize)
    if (!js.isUndefined(MinIopsPerDbInstance)) __obj.updateDynamic("MinIopsPerDbInstance")(MinIopsPerDbInstance)
    if (!js.isUndefined(MinIopsPerGib)) __obj.updateDynamic("MinIopsPerGib")(MinIopsPerGib)
    if (!js.isUndefined(MinStorageSize)) __obj.updateDynamic("MinStorageSize")(MinStorageSize)
    if (!js.isUndefined(MultiAZCapable)) __obj.updateDynamic("MultiAZCapable")(MultiAZCapable)
    if (!js.isUndefined(ReadReplicaCapable)) __obj.updateDynamic("ReadReplicaCapable")(ReadReplicaCapable)
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType)
    if (SupportedEngineModes != null) __obj.updateDynamic("SupportedEngineModes")(SupportedEngineModes)
    if (!js.isUndefined(SupportsEnhancedMonitoring)) __obj.updateDynamic("SupportsEnhancedMonitoring")(SupportsEnhancedMonitoring)
    if (!js.isUndefined(SupportsIAMDatabaseAuthentication)) __obj.updateDynamic("SupportsIAMDatabaseAuthentication")(SupportsIAMDatabaseAuthentication)
    if (!js.isUndefined(SupportsIops)) __obj.updateDynamic("SupportsIops")(SupportsIops)
    if (!js.isUndefined(SupportsPerformanceInsights)) __obj.updateDynamic("SupportsPerformanceInsights")(SupportsPerformanceInsights)
    if (!js.isUndefined(SupportsStorageAutoscaling)) __obj.updateDynamic("SupportsStorageAutoscaling")(SupportsStorageAutoscaling)
    if (!js.isUndefined(SupportsStorageEncryption)) __obj.updateDynamic("SupportsStorageEncryption")(SupportsStorageEncryption)
    if (!js.isUndefined(Vpc)) __obj.updateDynamic("Vpc")(Vpc)
    __obj.asInstanceOf[OrderableDBInstanceOption]
  }
}

