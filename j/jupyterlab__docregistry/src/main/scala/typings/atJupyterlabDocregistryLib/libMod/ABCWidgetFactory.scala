package typings
package atJupyterlabDocregistryLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib", "ABCWidgetFactory")
@js.native
abstract class ABCWidgetFactory[T /* <: atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel] */, U /* <: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel */] protected ()
  extends atJupyterlabDocregistryLib.libDefaultMod.ABCWidgetFactory[T, U] {
  /**
    * Construct a new `ABCWidgetFactory`.
    */
  def this(options: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IWidgetFactoryOptions[T]) = this()
}

