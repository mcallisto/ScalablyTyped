package typings
package vuexLib.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vue extends js.Object {
  @JSName("$store")
  var $store: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Store<any> */ js.Any
}

object Vue {
  @scala.inline
  def apply(
    $store: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Store<any> */ js.Any
  ): Vue = {
    val __obj = js.Dynamic.literal($store = $store)
  
    __obj.asInstanceOf[Vue]
  }
}

