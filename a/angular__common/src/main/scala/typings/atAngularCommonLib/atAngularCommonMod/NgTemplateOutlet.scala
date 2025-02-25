package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgTemplateOutlet")
@js.native
class NgTemplateOutlet protected ()
  extends atAngularCoreLib.atAngularCoreMod.OnChanges {
  def this(_viewContainerRef: atAngularCoreLib.atAngularCoreMod.ViewContainerRef) = this()
  var _hasContextShapeChanged: js.Any = js.native
  /**
    * We need to re-create existing embedded view if:
    * - templateRef has changed
    * - context has changes
    *
    * We mark context object as changed when the corresponding object
    * shape changes (new properties are added or existing properties are removed).
    * In other words we consider context with the same properties as "the same" even
    * if object reference changes (see https://github.com/angular/angular/issues/13407).
    */
  var _shouldRecreateView: js.Any = js.native
  var _updateExistingContext: js.Any = js.native
  var _viewContainerRef: js.Any = js.native
  var _viewRef: js.Any = js.native
  /**
    * A string defining the template reference and optionally the context object for the template.
    */
  var ngTemplateOutlet: atAngularCoreLib.atAngularCoreMod.TemplateRef[_] | scala.Null = js.native
  /**
    * A context object to attach to the {@link EmbeddedViewRef}. This should be an
    * object, the object's keys will be available for binding by the local template `let`
    * declarations.
    * Using the key `$implicit` in the context object will set its value as default.
    */
  var ngTemplateOutletContext: js.Object | scala.Null = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: atAngularCoreLib.atAngularCoreMod.SimpleChanges): scala.Unit = js.native
}

