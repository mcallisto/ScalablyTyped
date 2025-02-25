package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchVariantsRequest extends js.Object {
  /**
    * Only return variant calls which belong to call sets with these ids.
    * Leaving this blank returns all variant calls. If a variant has no
    * calls belonging to any of these call sets, it won't be returned at all.
    */
  var callSetIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The end of the window, 0-based exclusive. If unspecified or 0, defaults to
    * the length of the reference.
    */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of calls to return in a single page. Note that this
    * limit may be exceeded in the event that a matching variant contains more
    * calls than the requested maximum. If unspecified, defaults to 5000. The
    * maximum value is 10000.
    */
  var maxCalls: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of variants to return in a single page. If unspecified,
    * defaults to 5000. The maximum value is 10000.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Required. Only return variants in this reference sequence. */
  var referenceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The beginning of the window (0-based, inclusive) for which
    * overlapping variants should be returned. If unspecified, defaults to 0.
    */
  var start: js.UndefOr[java.lang.String] = js.undefined
  /** Only return variants which have exactly this name. */
  var variantName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * At most one variant set ID must be provided. Only variants from this
    * variant set will be returned. If omitted, a call set id must be included in
    * the request.
    */
  var variantSetIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SearchVariantsRequest {
  @scala.inline
  def apply(
    callSetIds: js.Array[java.lang.String] = null,
    end: java.lang.String = null,
    maxCalls: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    referenceName: java.lang.String = null,
    start: java.lang.String = null,
    variantName: java.lang.String = null,
    variantSetIds: js.Array[java.lang.String] = null
  ): SearchVariantsRequest = {
    val __obj = js.Dynamic.literal()
    if (callSetIds != null) __obj.updateDynamic("callSetIds")(callSetIds)
    if (end != null) __obj.updateDynamic("end")(end)
    if (maxCalls != null) __obj.updateDynamic("maxCalls")(maxCalls.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName)
    if (start != null) __obj.updateDynamic("start")(start)
    if (variantName != null) __obj.updateDynamic("variantName")(variantName)
    if (variantSetIds != null) __obj.updateDynamic("variantSetIds")(variantSetIds)
    __obj.asInstanceOf[SearchVariantsRequest]
  }
}

