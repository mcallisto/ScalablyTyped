package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberAttributeConstraintsType extends js.Object {
  /**
    * The maximum value of an attribute that is of the number data type.
    */
  var MaxValue: js.UndefOr[StringType] = js.undefined
  /**
    * The minimum value of an attribute that is of the number data type.
    */
  var MinValue: js.UndefOr[StringType] = js.undefined
}

object NumberAttributeConstraintsType {
  @scala.inline
  def apply(MaxValue: StringType = null, MinValue: StringType = null): NumberAttributeConstraintsType = {
    val __obj = js.Dynamic.literal()
    if (MaxValue != null) __obj.updateDynamic("MaxValue")(MaxValue)
    if (MinValue != null) __obj.updateDynamic("MinValue")(MinValue)
    __obj.asInstanceOf[NumberAttributeConstraintsType]
  }
}

