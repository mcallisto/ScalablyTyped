package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutBindingContext extends js.Object {
  @JSName("$component")
  var $component: js.Any = js.native
  @JSName("$componentTemplateNodes")
  var $componentTemplateNodes: js.Array[stdLib.Node] = js.native
  @JSName("$data")
  var $data: js.Any = js.native
  @JSName("$index")
  var $index: js.UndefOr[KnockoutObservable[scala.Double]] = js.native
  @JSName("$parent")
  var $parent: js.Any = js.native
  @JSName("$parentContext")
  var $parentContext: js.UndefOr[KnockoutBindingContext] = js.native
  @JSName("$parents")
  var $parents: js.Array[_] = js.native
  @JSName("$rawData")
  var $rawData: js.Any | KnockoutObservable[_] = js.native
  @JSName("$root")
  var $root: js.Any = js.native
  /**
    * This returns a new binding context whose viewmodel is the first parameter and whose $parentContext is the current bindingContext. 
    * @param dataItemOrAccessor The binding context of the children.
    * @param dataItemAlias An alias for the data item in descendant contexts.
    * @param extendCallback Function to be called.
    * @param options Further options.
    */
  def createChildContext(dataItemOrAccessor: js.Any): js.Any = js.native
  def createChildContext(dataItemOrAccessor: js.Any, dataItemAlias: java.lang.String): js.Any = js.native
  def createChildContext(dataItemOrAccessor: js.Any, dataItemAlias: java.lang.String, extendCallback: js.Function): js.Any = js.native
  def createChildContext(
    dataItemOrAccessor: js.Any,
    dataItemAlias: java.lang.String,
    extendCallback: js.Function,
    options: Anon_ExportDependencies
  ): js.Any = js.native
  def extend(properties: js.Function0[org.scalablytyped.runtime.StringDictionary[_]]): KnockoutBindingContext = js.native
  /**
    * Clones the current Binding Context, adding extra properties to it.
    * @param properties object with properties to be added in the binding context.
    */
  def extend(properties: org.scalablytyped.runtime.StringDictionary[js.Any]): KnockoutBindingContext = js.native
}

