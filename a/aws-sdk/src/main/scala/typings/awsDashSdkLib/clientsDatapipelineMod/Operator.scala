package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator extends js.Object {
  /**
    *  The logical operation to be performed: equal (EQ), equal reference (REF_EQ), less than or equal (LE), greater than or equal (GE), or between (BETWEEN). Equal reference (REF_EQ) can be used only with reference fields. The other comparison types can be used only with String fields. The comparison types you can use apply only to certain object fields, as detailed below.   The comparison operators EQ and REF_EQ act on the following fields:   name @sphere parent @componentParent @instanceParent @status @scheduledStartTime @scheduledEndTime @actualStartTime @actualEndTime   The comparison operators GE, LE, and BETWEEN act on the following fields:   @scheduledStartTime @scheduledEndTime @actualStartTime @actualEndTime  Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name fields, you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS Data Pipeline. User-defined fields that you add to a pipeline should prefix their name with the string "my".
    */
  var `type`: js.UndefOr[OperatorType] = js.undefined
  /**
    * The value that the actual field value will be compared with.
    */
  var values: js.UndefOr[stringList] = js.undefined
}

object Operator {
  @scala.inline
  def apply(`type`: OperatorType = null, values: stringList = null): Operator = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Operator]
  }
}

