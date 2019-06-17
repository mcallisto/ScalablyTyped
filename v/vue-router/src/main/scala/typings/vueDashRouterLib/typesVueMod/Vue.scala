package typings
package vueDashRouterLib.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vue extends js.Object {
  @JSName("$route")
  var $route: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Route */ js.Any
  @JSName("$router")
  var $router: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VueRouter */ js.Any
}

object Vue {
  @scala.inline
  def apply(
    $route: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Route */ js.Any,
    $router: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VueRouter */ js.Any
  ): Vue = {
    val __obj = js.Dynamic.literal($route = $route, $router = $router)
  
    __obj.asInstanceOf[Vue]
  }
}

