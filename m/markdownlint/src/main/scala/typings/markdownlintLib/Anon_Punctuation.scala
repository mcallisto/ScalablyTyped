package typings
package markdownlintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Punctuation extends js.Object {
  var punctuation: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Punctuation {
  @scala.inline
  def apply(punctuation: java.lang.String = null): Anon_Punctuation = {
    val __obj = js.Dynamic.literal()
    if (punctuation != null) __obj.updateDynamic("punctuation")(punctuation)
    __obj.asInstanceOf[Anon_Punctuation]
  }
}

