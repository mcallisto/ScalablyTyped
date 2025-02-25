package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadObjectRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).
    */
  var IfMatch: js.UndefOr[IfMatch] = js.undefined
  /**
    * Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).
    */
  var IfModifiedSince: js.UndefOr[IfModifiedSince] = js.undefined
  /**
    * Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).
    */
  var IfNoneMatch: js.UndefOr[IfNoneMatch] = js.undefined
  /**
    * Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).
    */
  var IfUnmodifiedSince: js.UndefOr[IfUnmodifiedSince] = js.undefined
  /**
    * 
    */
  var Key: ObjectKey
  /**
    * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' HEAD request for the part specified. Useful querying about the size of the part and the number of parts in this object.
    */
  var PartNumber: js.UndefOr[PartNumber] = js.undefined
  /**
    * Downloads the specified range bytes of an object. For more information about the HTTP Range header, go to http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.
    */
  var Range: js.UndefOr[Range] = js.undefined
  var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  /**
    * Specifies the algorithm to use to when encrypting the object (e.g., AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
  /**
    * VersionId used to reference a specific version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object HeadObjectRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    IfMatch: IfMatch = null,
    IfModifiedSince: IfModifiedSince = null,
    IfNoneMatch: IfNoneMatch = null,
    IfUnmodifiedSince: IfUnmodifiedSince = null,
    PartNumber: js.UndefOr[PartNumber] = js.undefined,
    Range: Range = null,
    RequestPayer: RequestPayer = null,
    SSECustomerAlgorithm: SSECustomerAlgorithm = null,
    SSECustomerKey: SSECustomerKey = null,
    SSECustomerKeyMD5: SSECustomerKeyMD5 = null,
    VersionId: ObjectVersionId = null
  ): HeadObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    if (IfModifiedSince != null) __obj.updateDynamic("IfModifiedSince")(IfModifiedSince)
    if (IfNoneMatch != null) __obj.updateDynamic("IfNoneMatch")(IfNoneMatch)
    if (IfUnmodifiedSince != null) __obj.updateDynamic("IfUnmodifiedSince")(IfUnmodifiedSince)
    if (!js.isUndefined(PartNumber)) __obj.updateDynamic("PartNumber")(PartNumber)
    if (Range != null) __obj.updateDynamic("Range")(Range)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm)
    if (SSECustomerKey != null) __obj.updateDynamic("SSECustomerKey")(SSECustomerKey.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[HeadObjectRequest]
  }
}

