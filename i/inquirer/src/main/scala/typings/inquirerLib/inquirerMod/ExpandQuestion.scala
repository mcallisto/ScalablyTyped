package typings
package inquirerLib.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'choices' | 'pageSize' ]: inquirer.inquirer.QuestionOptions<A>[P]} */ trait ExpandQuestion[A]
  extends QuestionCommon[A]
     with Question[A] {
  var `type`: inquirerLib.inquirerLibStrings.expand
}

object ExpandQuestion {
  @scala.inline
  def apply[A](
    `type`: inquirerLib.inquirerLibStrings.expand,
    default: java.lang.String | scala.Double | scala.Boolean | js.Array[_] | (js.Function1[A, _ | js.Promise[_]]) = null,
    message: java.lang.String | (js.Function1[A, java.lang.String]) = null,
    name: java.lang.String = null,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null,
    when: scala.Boolean | (js.Function1[A, scala.Boolean | js.Promise[scala.Boolean]]) = null
  ): ExpandQuestion[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandQuestion[A]]
  }
}

