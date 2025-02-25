package typings
package atPulumiAwsLib.rdsGetSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotResult extends js.Object {
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: scala.Double
  /**
    * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
    */
  val availabilityZone: java.lang.String
  val dbInstanceIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the DB snapshot.
    */
  val dbSnapshotArn: java.lang.String
  val dbSnapshotIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies whether the DB snapshot is encrypted.
    */
  val encrypted: scala.Boolean
  /**
    * Specifies the name of the database engine.
    */
  val engine: java.lang.String
  /**
    * Specifies the version of the database engine.
    */
  val engineVersion: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val includePublic: js.UndefOr[scala.Boolean] = js.undefined
  val includeShared: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  val iops: scala.Double
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: java.lang.String
  /**
    * License model information for the restored DB instance.
    */
  val licenseModel: java.lang.String
  val mostRecent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Provides the option group name for the DB snapshot.
    */
  val optionGroupName: java.lang.String
  val port: scala.Double
  /**
    * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  val snapshotCreateTime: java.lang.String
  val snapshotType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
    */
  val sourceDbSnapshotIdentifier: java.lang.String
  /**
    * The region that the DB snapshot was created in or copied from.
    */
  val sourceRegion: java.lang.String
  /**
    * Specifies the status of this DB snapshot.
    */
  val status: java.lang.String
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val storageType: java.lang.String
  /**
    * Specifies the ID of the VPC associated with the DB snapshot.
    */
  val vpcId: java.lang.String
}

object GetSnapshotResult {
  @scala.inline
  def apply(
    allocatedStorage: scala.Double,
    availabilityZone: java.lang.String,
    dbSnapshotArn: java.lang.String,
    encrypted: scala.Boolean,
    engine: java.lang.String,
    engineVersion: java.lang.String,
    id: java.lang.String,
    iops: scala.Double,
    kmsKeyId: java.lang.String,
    licenseModel: java.lang.String,
    optionGroupName: java.lang.String,
    port: scala.Double,
    snapshotCreateTime: java.lang.String,
    sourceDbSnapshotIdentifier: java.lang.String,
    sourceRegion: java.lang.String,
    status: java.lang.String,
    storageType: java.lang.String,
    vpcId: java.lang.String,
    dbInstanceIdentifier: java.lang.String = null,
    dbSnapshotIdentifier: java.lang.String = null,
    includePublic: js.UndefOr[scala.Boolean] = js.undefined,
    includeShared: js.UndefOr[scala.Boolean] = js.undefined,
    mostRecent: js.UndefOr[scala.Boolean] = js.undefined,
    snapshotType: java.lang.String = null
  ): GetSnapshotResult = {
    val __obj = js.Dynamic.literal(allocatedStorage = allocatedStorage, availabilityZone = availabilityZone, dbSnapshotArn = dbSnapshotArn, encrypted = encrypted, engine = engine, engineVersion = engineVersion, id = id, iops = iops, kmsKeyId = kmsKeyId, licenseModel = licenseModel, optionGroupName = optionGroupName, port = port, snapshotCreateTime = snapshotCreateTime, sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier, sourceRegion = sourceRegion, status = status, storageType = storageType, vpcId = vpcId)
    if (dbInstanceIdentifier != null) __obj.updateDynamic("dbInstanceIdentifier")(dbInstanceIdentifier)
    if (dbSnapshotIdentifier != null) __obj.updateDynamic("dbSnapshotIdentifier")(dbSnapshotIdentifier)
    if (!js.isUndefined(includePublic)) __obj.updateDynamic("includePublic")(includePublic)
    if (!js.isUndefined(includeShared)) __obj.updateDynamic("includeShared")(includeShared)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (snapshotType != null) __obj.updateDynamic("snapshotType")(snapshotType)
    __obj.asInstanceOf[GetSnapshotResult]
  }
}

