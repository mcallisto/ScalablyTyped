package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDecorator
  extends org.scalablytyped.runtime.Instantiable0[js.Any]
     with org.scalablytyped.runtime.Instantiable1[/* bindingPropertyName */ java.lang.String, js.Any] {
  /**
    * Decorator that marks a class field as an output property and supplies configuration metadata.
    * The DOM property bound to the output property is automatically updated during change detection.
    *
    * @usageNotes
    *
    * You can supply an optional name to use in templates when the
    * component is instantiated, that maps to the
    * name of the bound property. By default, the original
    * name of the bound property is used for output binding.
    *
    * See `Input` decorator for an example of providing a binding name.
    *
    */
  def apply(): js.Any = js.native
  def apply(bindingPropertyName: java.lang.String): js.Any = js.native
}

