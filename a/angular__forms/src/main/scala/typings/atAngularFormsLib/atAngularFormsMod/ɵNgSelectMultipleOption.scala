package typings
package atAngularFormsLib.atAngularFormsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description
  * Marks `<option>` as dynamic, so Angular can be notified when options change.
  *
  * @see `SelectMultipleControlValueAccessor`
  *
  * @ngModule ReactiveFormsModule
  * @ngModule FormsModule
  * @publicApi
  */
@JSImport("@angular/forms", "ɵNgSelectMultipleOption")
@js.native
class ɵNgSelectMultipleOption protected ()
  extends atAngularCoreLib.atAngularCoreMod.OnDestroy {
  def this(_element: atAngularCoreLib.atAngularCoreMod.ElementRef[_], _renderer: atAngularCoreLib.atAngularCoreMod.Renderer2, _select: SelectMultipleControlValueAccessor) = this()
  var _element: js.Any = js.native
  var _renderer: js.Any = js.native
  var _select: js.Any = js.native
  var id: java.lang.String = js.native
  /**
    * @description
    * Tracks the value bound to the option element. Unlike the value binding,
    * ngValue supports binding to objects.
    */
  var ngValue: js.Any = js.native
  /**
    * @description
    * Tracks simple string values bound to the option element.
    * For objects, use the `ngValue` input binding.
    */
  var value: js.Any = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
}

