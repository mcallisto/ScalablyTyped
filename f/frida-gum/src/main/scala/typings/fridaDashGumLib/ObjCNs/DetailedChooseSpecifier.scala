package typings
package fridaDashGumLib.ObjCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedChooseSpecifier extends js.Object {
  /**
    * Which class to look for instances of. E.g.: `ObjC.classes.UIButton`.
    */
  var `class`: Object
  /**
    * Whether you’re also interested in subclasses matching the given class selector.
    *
    * The default is to also include subclasses.
    */
  var subclasses: js.UndefOr[scala.Boolean] = js.undefined
}

object DetailedChooseSpecifier {
  @scala.inline
  def apply(`class`: Object, subclasses: js.UndefOr[scala.Boolean] = js.undefined): DetailedChooseSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("class")(`class`)
    if (!js.isUndefined(subclasses)) __obj.updateDynamic("subclasses")(subclasses)
    __obj.asInstanceOf[DetailedChooseSpecifier]
  }
}

