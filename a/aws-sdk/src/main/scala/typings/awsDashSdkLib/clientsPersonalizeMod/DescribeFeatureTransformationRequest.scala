package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFeatureTransformationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the feature transformation to describe.
    */
  var featureTransformationArn: Arn
}

object DescribeFeatureTransformationRequest {
  @scala.inline
  def apply(featureTransformationArn: Arn): DescribeFeatureTransformationRequest = {
    val __obj = js.Dynamic.literal(featureTransformationArn = featureTransformationArn)
  
    __obj.asInstanceOf[DescribeFeatureTransformationRequest]
  }
}

