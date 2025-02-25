package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenData extends js.Object {
  /** The children to be rendered. */
  var children: reactLib.reactMod.ReactNode
  /* The data of the selected option. */
  var data: js.Any
  /** props passed to the wrapping element for the group. */
  var innerProps: reactDashSelectLib.srcComponentsOptionMod.InnerProps
  /** Inner ref to DOM Node */
  var innerRef: reactDashSelectLib.srcTypesMod.InnerRef
  /* Text to be displayed representing the option. */
  var label: java.lang.String
  /* Type is used by the menu to determine whether this is an option or a group.
    In the case of option this is always `option`. */
  var `type`: reactDashSelectLib.reactDashSelectLibStrings.option
}

object Anon_ChildrenData {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    data: js.Any,
    innerProps: reactDashSelectLib.srcComponentsOptionMod.InnerProps,
    innerRef: reactDashSelectLib.srcTypesMod.InnerRef,
    label: java.lang.String,
    `type`: reactDashSelectLib.reactDashSelectLibStrings.option
  ): Anon_ChildrenData = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data, innerProps = innerProps, innerRef = innerRef.asInstanceOf[js.Any], label = label)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ChildrenData]
  }
}

