package typings
package atPhosphorVirtualdomLib.atPhosphorVirtualdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/virtualdom", "VirtualElement")
@js.native
class VirtualElement protected () extends VirtualNode {
  /**
    * Construct a new virtual element node.
    *
    * @param tag - The element tag name.
    *
    * @param attrs - The element attributes.
    *
    * @param children - The element children.
    */
  def this(tag: java.lang.String, attrs: ElementAttrs, children: js.Array[VirtualNode]) = this()
  /**
    * The attributes for the element.
    */
  val attrs: ElementAttrs = js.native
  /**
    * The children for the element.
    */
  val children: js.Array[VirtualNode] = js.native
  /**
    * The tag name for the element.
    */
  val tag: java.lang.String = js.native
  /**
    * The type of the node.
    *
    * This value can be used as a type guard for discriminating the
    * `VirtualNode` union type.
    */
  val `type`: atPhosphorVirtualdomLib.atPhosphorVirtualdomLibStrings.element = js.native
}

