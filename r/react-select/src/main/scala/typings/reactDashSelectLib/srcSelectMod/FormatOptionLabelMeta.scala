package typings
package reactDashSelectLib.srcSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptionLabelMeta[OptionType] extends js.Object {
  var context: FormatOptionLabelContext
  var inputValue: java.lang.String
  var selectValue: reactDashSelectLib.srcTypesMod.ValueType[OptionType]
}

object FormatOptionLabelMeta {
  @scala.inline
  def apply[OptionType](
    context: FormatOptionLabelContext,
    inputValue: java.lang.String,
    selectValue: reactDashSelectLib.srcTypesMod.ValueType[OptionType]
  ): FormatOptionLabelMeta[OptionType] = {
    val __obj = js.Dynamic.literal(context = context, inputValue = inputValue, selectValue = selectValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormatOptionLabelMeta[OptionType]]
  }
}

