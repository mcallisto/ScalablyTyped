package typings
package tempyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  /**
  			_You usually won't need this option. Specify it only when actually needed._
  			Filename. Mutually exclusive with the `extension` option.
  			*/
  val name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Name]
  }
}

