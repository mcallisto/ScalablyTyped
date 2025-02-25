package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @publicApi
  */
@JSImport("@angular/core", "ComponentFactory")
@js.native
abstract class ComponentFactory[C] () extends js.Object {
  /**
    * The component's type
    */
  val componentType: Type[_] = js.native
  /**
    * The inputs of the component.
    */
  val inputs: js.Array[atAngularCoreLib.Anon_PropName] = js.native
  /**
    * Selector for all <ng-content> elements in the component.
    */
  val ngContentSelectors: js.Array[java.lang.String] = js.native
  /**
    * The outputs of the component.
    */
  val outputs: js.Array[atAngularCoreLib.Anon_PropName] = js.native
  /**
    * The component's HTML selector.
    */
  val selector: java.lang.String = js.native
  /**
    * Creates a new component.
    */
  def create(injector: Injector): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: js.Array[js.Array[_]]): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: js.Array[js.Array[_]], rootSelectorOrNode: java.lang.String): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[_]],
    rootSelectorOrNode: java.lang.String,
    ngModule: NgModuleRef[_]
  ): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: js.Array[js.Array[_]], rootSelectorOrNode: js.Any): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[_]],
    rootSelectorOrNode: js.Any,
    ngModule: NgModuleRef[_]
  ): ComponentRef[C] = js.native
}

