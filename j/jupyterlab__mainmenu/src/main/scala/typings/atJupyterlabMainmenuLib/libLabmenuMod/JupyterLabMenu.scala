package typings
package atJupyterlabMainmenuLib.libLabmenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/labmenu", "JupyterLabMenu")
@js.native
class JupyterLabMenu protected () extends IJupyterLabMenu {
  /**
    * Construct a new menu.
    *
    * @param options - Options for the phosphor menu.
    *
    * @param includeSeparators - whether to include separators between the
    *   groups that are added to the menu.
    */
  def this(options: atPhosphorWidgetsLib.libMenuMod.MenuNs.IOptions) = this()
  def this(options: atPhosphorWidgetsLib.libMenuMod.MenuNs.IOptions, includeSeparators: scala.Boolean) = this()
  var _groups: js.Any = js.native
  var _includeSeparators: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * The underlying Phosphor menu.
    */
  val menu: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Menu = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
}

