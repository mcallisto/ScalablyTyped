package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRestoreStatus extends js.Object {
  /**
    * The identifier of the Amazon Redshift cluster that the table is being restored to.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * A description of the status of the table restore request. Status values include SUCCEEDED, FAILED, CANCELED, PENDING, IN_PROGRESS.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The name of the table to create as a result of the table restore request.
    */
  var NewTableName: js.UndefOr[String] = js.undefined
  /**
    * The amount of data restored to the new table so far, in megabytes (MB).
    */
  var ProgressInMegaBytes: js.UndefOr[LongOptional] = js.undefined
  /**
    * The time that the table restore request was made, in Universal Coordinated Time (UTC).
    */
  var RequestTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The identifier of the snapshot that the table is being restored from.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The name of the source database that contains the table being restored.
    */
  var SourceDatabaseName: js.UndefOr[String] = js.undefined
  /**
    * The name of the source schema that contains the table being restored.
    */
  var SourceSchemaName: js.UndefOr[String] = js.undefined
  /**
    * The name of the source table being restored.
    */
  var SourceTableName: js.UndefOr[String] = js.undefined
  /**
    * A value that describes the current state of the table restore request. Valid Values: SUCCEEDED, FAILED, CANCELED, PENDING, IN_PROGRESS 
    */
  var Status: js.UndefOr[TableRestoreStatusType] = js.undefined
  /**
    * The unique identifier for the table restore request.
    */
  var TableRestoreRequestId: js.UndefOr[String] = js.undefined
  /**
    * The name of the database to restore the table to.
    */
  var TargetDatabaseName: js.UndefOr[String] = js.undefined
  /**
    * The name of the schema to restore the table to.
    */
  var TargetSchemaName: js.UndefOr[String] = js.undefined
  /**
    * The total amount of data to restore to the new table, in megabytes (MB).
    */
  var TotalDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined
}

object TableRestoreStatus {
  @scala.inline
  def apply(
    ClusterIdentifier: String = null,
    Message: String = null,
    NewTableName: String = null,
    ProgressInMegaBytes: js.UndefOr[LongOptional] = js.undefined,
    RequestTime: TStamp = null,
    SnapshotIdentifier: String = null,
    SourceDatabaseName: String = null,
    SourceSchemaName: String = null,
    SourceTableName: String = null,
    Status: TableRestoreStatusType = null,
    TableRestoreRequestId: String = null,
    TargetDatabaseName: String = null,
    TargetSchemaName: String = null,
    TotalDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined
  ): TableRestoreStatus = {
    val __obj = js.Dynamic.literal()
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (NewTableName != null) __obj.updateDynamic("NewTableName")(NewTableName)
    if (!js.isUndefined(ProgressInMegaBytes)) __obj.updateDynamic("ProgressInMegaBytes")(ProgressInMegaBytes)
    if (RequestTime != null) __obj.updateDynamic("RequestTime")(RequestTime)
    if (SnapshotIdentifier != null) __obj.updateDynamic("SnapshotIdentifier")(SnapshotIdentifier)
    if (SourceDatabaseName != null) __obj.updateDynamic("SourceDatabaseName")(SourceDatabaseName)
    if (SourceSchemaName != null) __obj.updateDynamic("SourceSchemaName")(SourceSchemaName)
    if (SourceTableName != null) __obj.updateDynamic("SourceTableName")(SourceTableName)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TableRestoreRequestId != null) __obj.updateDynamic("TableRestoreRequestId")(TableRestoreRequestId)
    if (TargetDatabaseName != null) __obj.updateDynamic("TargetDatabaseName")(TargetDatabaseName)
    if (TargetSchemaName != null) __obj.updateDynamic("TargetSchemaName")(TargetSchemaName)
    if (!js.isUndefined(TotalDataInMegaBytes)) __obj.updateDynamic("TotalDataInMegaBytes")(TotalDataInMegaBytes)
    __obj.asInstanceOf[TableRestoreStatus]
  }
}

