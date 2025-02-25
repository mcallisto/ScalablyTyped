package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offering extends js.Object {
  /**
    * Unique offering ARN, e.g. 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g. 'USD'
    */
  var CurrencyCode: js.UndefOr[__string] = js.undefined
  /**
    * Lease duration, e.g. '12'
    */
  var Duration: js.UndefOr[__integer] = js.undefined
  /**
    * Units for duration, e.g. 'MONTHS'
    */
  var DurationUnits: js.UndefOr[OfferingDurationUnits] = js.undefined
  /**
    * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT offering
    */
  var FixedPrice: js.UndefOr[__double] = js.undefined
  /**
    * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
    */
  var OfferingDescription: js.UndefOr[__string] = js.undefined
  /**
    * Unique offering ID, e.g. '87654321'
    */
  var OfferingId: js.UndefOr[__string] = js.undefined
  /**
    * Offering type, e.g. 'NO_UPFRONT'
    */
  var OfferingType: js.UndefOr[OfferingType] = js.undefined
  /**
    * AWS region, e.g. 'us-west-2'
    */
  var Region: js.UndefOr[__string] = js.undefined
  /**
    * Resource configuration details
    */
  var ResourceSpecification: js.UndefOr[ReservationResourceSpecification] = js.undefined
  /**
    * Recurring usage charge for each reserved resource, e.g. '157.0'
    */
  var UsagePrice: js.UndefOr[__double] = js.undefined
}

object Offering {
  @scala.inline
  def apply(
    Arn: __string = null,
    CurrencyCode: __string = null,
    Duration: js.UndefOr[__integer] = js.undefined,
    DurationUnits: OfferingDurationUnits = null,
    FixedPrice: js.UndefOr[__double] = js.undefined,
    OfferingDescription: __string = null,
    OfferingId: __string = null,
    OfferingType: OfferingType = null,
    Region: __string = null,
    ResourceSpecification: ReservationResourceSpecification = null,
    UsagePrice: js.UndefOr[__double] = js.undefined
  ): Offering = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (DurationUnits != null) __obj.updateDynamic("DurationUnits")(DurationUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice)
    if (OfferingDescription != null) __obj.updateDynamic("OfferingDescription")(OfferingDescription)
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId)
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (ResourceSpecification != null) __obj.updateDynamic("ResourceSpecification")(ResourceSpecification)
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice)
    __obj.asInstanceOf[Offering]
  }
}

