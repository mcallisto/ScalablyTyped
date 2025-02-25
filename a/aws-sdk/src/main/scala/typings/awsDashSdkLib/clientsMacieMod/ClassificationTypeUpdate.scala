package typings
package awsDashSdkLib.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassificationTypeUpdate extends js.Object {
  /**
    * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins performing continuous classification after a bucket is successfully associated with Amazon Macie. 
    */
  var continuous: js.UndefOr[S3ContinuousClassificationType] = js.undefined
  /**
    * A one-time classification of all of the existing objects in a specified S3 bucket. 
    */
  var oneTime: js.UndefOr[S3OneTimeClassificationType] = js.undefined
}

object ClassificationTypeUpdate {
  @scala.inline
  def apply(continuous: S3ContinuousClassificationType = null, oneTime: S3OneTimeClassificationType = null): ClassificationTypeUpdate = {
    val __obj = js.Dynamic.literal()
    if (continuous != null) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (oneTime != null) __obj.updateDynamic("oneTime")(oneTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationTypeUpdate]
  }
}

