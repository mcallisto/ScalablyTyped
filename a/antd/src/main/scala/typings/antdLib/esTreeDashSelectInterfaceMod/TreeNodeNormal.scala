package typings
package antdLib.esTreeDashSelectInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeNodeNormal extends js.Object {
  var children: js.UndefOr[js.Array[TreeNodeNormal]] = js.undefined
  var disableCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var isLeaf: js.UndefOr[scala.Boolean] = js.undefined
  var key: java.lang.String
  /**
    * @deprecated Please use `title` instead.
    */
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var value: TreeNodeValue
}

object TreeNodeNormal {
  @scala.inline
  def apply(
    key: java.lang.String,
    value: TreeNodeValue,
    children: js.Array[TreeNodeNormal] = null,
    disableCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    isLeaf: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNode = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    title: reactLib.reactMod.ReactNode = null
  ): TreeNodeNormal = {
    val __obj = js.Dynamic.literal(key = key, value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeNormal]
  }
}

