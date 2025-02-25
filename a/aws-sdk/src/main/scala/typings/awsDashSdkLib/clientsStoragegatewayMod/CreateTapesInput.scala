package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTapesInput extends js.Object {
  /**
    * A unique identifier that you use to retry a request. If you retry a request, use the same ClientToken you specified in the initial request.  Using the same ClientToken prevents creating the tape multiple times. 
    */
  var ClientToken: awsDashSdkLib.clientsStoragegatewayMod.ClientToken
  /**
    * The unique Amazon Resource Name (ARN) that represents the gateway to associate the virtual tapes with. Use the ListGateways operation to return a list of gateways for your account and region.
    */
  var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.GatewayARN
  /**
    * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[KMSKey] = js.undefined
  /**
    * The number of virtual tapes that you want to create.
    */
  var NumTapesToCreate: awsDashSdkLib.clientsStoragegatewayMod.NumTapesToCreate
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: js.UndefOr[PoolId] = js.undefined
  /**
    * A list of up to 50 tags that can be assigned to a virtual tape. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * A prefix that you append to the barcode of the virtual tape you are creating. This prefix makes the barcode unique.  The prefix must be 1 to 4 characters in length and must be one of the uppercase letters from A to Z. 
    */
  var TapeBarcodePrefix: awsDashSdkLib.clientsStoragegatewayMod.TapeBarcodePrefix
  /**
    * The size, in bytes, of the virtual tapes that you want to create.  The size must be aligned by gigabyte (1024*1024*1024 byte). 
    */
  var TapeSizeInBytes: TapeSize
}

object CreateTapesInput {
  @scala.inline
  def apply(
    ClientToken: ClientToken,
    GatewayARN: GatewayARN,
    NumTapesToCreate: NumTapesToCreate,
    TapeBarcodePrefix: TapeBarcodePrefix,
    TapeSizeInBytes: TapeSize,
    KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
    KMSKey: KMSKey = null,
    PoolId: PoolId = null,
    Tags: Tags = null
  ): CreateTapesInput = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken, GatewayARN = GatewayARN, NumTapesToCreate = NumTapesToCreate, TapeBarcodePrefix = TapeBarcodePrefix, TapeSizeInBytes = TapeSizeInBytes)
    if (!js.isUndefined(KMSEncrypted)) __obj.updateDynamic("KMSEncrypted")(KMSEncrypted)
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey)
    if (PoolId != null) __obj.updateDynamic("PoolId")(PoolId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateTapesInput]
  }
}

