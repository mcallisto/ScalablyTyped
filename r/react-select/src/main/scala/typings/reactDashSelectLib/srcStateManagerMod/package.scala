package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcStateManagerMod {
  type GetOptionType[T] = js.Any
  type StateProps[T /* <: reactDashSelectLib.srcSelectMod.Props[_] */] = stdLib.Pick[
    T, 
    stdLib.Exclude[
      java.lang.String, 
      reactDashSelectLib.reactDashSelectLibStrings.inputValue | reactDashSelectLib.reactDashSelectLibStrings.value | reactDashSelectLib.reactDashSelectLibStrings.menuIsOpen | reactDashSelectLib.reactDashSelectLibStrings.onChange | reactDashSelectLib.reactDashSelectLibStrings.onInputChange | reactDashSelectLib.reactDashSelectLibStrings.onMenuClose | reactDashSelectLib.reactDashSelectLibStrings.onMenuOpen
    ]
  ]
}
