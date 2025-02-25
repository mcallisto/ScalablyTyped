package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootData extends js.Object {
  var errorHandler: ErrorHandler
  var injector: Injector
  var ngModule: NgModuleRef[_]
  var projectableNodes: js.Array[js.Array[_]]
  var renderer: Renderer2
  var rendererFactory: RendererFactory2
  var sanitizer: Sanitizer
  var selectorOrNode: js.Any
}

object RootData {
  @scala.inline
  def apply(
    errorHandler: ErrorHandler,
    injector: Injector,
    ngModule: NgModuleRef[_],
    projectableNodes: js.Array[js.Array[_]],
    renderer: Renderer2,
    rendererFactory: RendererFactory2,
    sanitizer: Sanitizer,
    selectorOrNode: js.Any
  ): RootData = {
    val __obj = js.Dynamic.literal(errorHandler = errorHandler, injector = injector, ngModule = ngModule, projectableNodes = projectableNodes, renderer = renderer, rendererFactory = rendererFactory, sanitizer = sanitizer, selectorOrNode = selectorOrNode)
  
    __obj.asInstanceOf[RootData]
  }
}

