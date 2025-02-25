package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsyncPropertyValidator extends js.Object {
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.undefined
  var isAsync: scala.Boolean
  var tagName: js.UndefOr[java.lang.String] = js.undefined
  def isAcceptable(s: js.Any): qLib.qMod.Promise[scala.Boolean]
}

object IAsyncPropertyValidator {
  @scala.inline
  def apply(
    isAcceptable: js.Any => qLib.qMod.Promise[scala.Boolean],
    isAsync: scala.Boolean,
    customMessage: IErrorCustomMessage = null,
    tagName: java.lang.String = null
  ): IAsyncPropertyValidator = {
    val __obj = js.Dynamic.literal(isAcceptable = js.Any.fromFunction1(isAcceptable), isAsync = isAsync)
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[IAsyncPropertyValidator]
  }
}

