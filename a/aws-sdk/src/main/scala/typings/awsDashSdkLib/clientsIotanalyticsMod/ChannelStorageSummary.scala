package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelStorageSummary extends js.Object {
  /**
    * Used to store channel data in an S3 bucket that you manage.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedChannelS3StorageSummary] = js.undefined
  /**
    * Used to store channel data in an S3 bucket managed by the AWS IoT Analytics service.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedChannelS3StorageSummary] = js.undefined
}

object ChannelStorageSummary {
  @scala.inline
  def apply(
    customerManagedS3: CustomerManagedChannelS3StorageSummary = null,
    serviceManagedS3: ServiceManagedChannelS3StorageSummary = null
  ): ChannelStorageSummary = {
    val __obj = js.Dynamic.literal()
    if (customerManagedS3 != null) __obj.updateDynamic("customerManagedS3")(customerManagedS3)
    if (serviceManagedS3 != null) __obj.updateDynamic("serviceManagedS3")(serviceManagedS3)
    __obj.asInstanceOf[ChannelStorageSummary]
  }
}

