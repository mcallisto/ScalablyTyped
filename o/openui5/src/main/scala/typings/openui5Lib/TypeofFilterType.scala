package typings
package openui5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofFilterType extends js.Object {
  /**
    * Filters which are changed by the application
    */
  var Application: js.Any
  /**
    * Filters which are set by the different controls
    */
  var Control: js.Any
}

object TypeofFilterType {
  @scala.inline
  def apply(Application: js.Any, Control: js.Any): TypeofFilterType = {
    val __obj = js.Dynamic.literal(Application = Application, Control = Control)
  
    __obj.asInstanceOf[TypeofFilterType]
  }
}

