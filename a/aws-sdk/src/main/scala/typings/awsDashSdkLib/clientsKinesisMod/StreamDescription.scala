package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamDescription extends js.Object {
  /**
    * The server-side encryption type used on the stream. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.  
    */
  var EncryptionType: js.UndefOr[EncryptionType] = js.undefined
  /**
    * Represents the current enhanced monitoring settings of the stream.
    */
  var EnhancedMonitoring: EnhancedMonitoringList
  /**
    * If set to true, more shards in the stream are available to describe.
    */
  var HasMoreShards: BooleanObject
  /**
    * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.   Key ARN example: arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012    Alias ARN example: arn:aws:kms:us-east-1:123456789012:alias/MyAliasName    Globally unique key ID example: 12345678-1234-1234-1234-123456789012    Alias name example: alias/MyAliasName    Master key owned by Kinesis Data Streams: alias/aws/kinesis   
    */
  var KeyId: js.UndefOr[KeyId] = js.undefined
  /**
    * The current retention period, in hours.
    */
  var RetentionPeriodHours: awsDashSdkLib.clientsKinesisMod.RetentionPeriodHours
  /**
    * The shards that comprise the stream.
    */
  var Shards: ShardList
  /**
    * The Amazon Resource Name (ARN) for the stream being described.
    */
  var StreamARN: awsDashSdkLib.clientsKinesisMod.StreamARN
  /**
    * The approximate time that the stream was created.
    */
  var StreamCreationTimestamp: Timestamp
  /**
    * The name of the stream being described.
    */
  var StreamName: awsDashSdkLib.clientsKinesisMod.StreamName
  /**
    * The current status of the stream being described. The stream status is one of the following states:    CREATING - The stream is being created. Kinesis Data Streams immediately returns and sets StreamStatus to CREATING.    DELETING - The stream is being deleted. The specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.    ACTIVE - The stream exists and is ready for read and write operations or deletion. You should perform read and write operations only on an ACTIVE stream.    UPDATING - Shards in the stream are being merged or split. Read and write operations continue to work while the stream is in the UPDATING state.  
    */
  var StreamStatus: awsDashSdkLib.clientsKinesisMod.StreamStatus
}

object StreamDescription {
  @scala.inline
  def apply(
    EnhancedMonitoring: EnhancedMonitoringList,
    HasMoreShards: BooleanObject,
    RetentionPeriodHours: RetentionPeriodHours,
    Shards: ShardList,
    StreamARN: StreamARN,
    StreamCreationTimestamp: Timestamp,
    StreamName: StreamName,
    StreamStatus: StreamStatus,
    EncryptionType: EncryptionType = null,
    KeyId: KeyId = null
  ): StreamDescription = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring, HasMoreShards = HasMoreShards, RetentionPeriodHours = RetentionPeriodHours, Shards = Shards, StreamARN = StreamARN, StreamCreationTimestamp = StreamCreationTimestamp, StreamName = StreamName, StreamStatus = StreamStatus.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    __obj.asInstanceOf[StreamDescription]
  }
}

