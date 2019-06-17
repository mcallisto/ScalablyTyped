package typings
package vueDashRouterLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: vueLib.typesVueMod.Vue */] extends js.Object {
  var beforeRouteEnter: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavigationGuard<V> */ js.Any
  ] = js.undefined
  var beforeRouteLeave: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavigationGuard<V> */ js.Any
  ] = js.undefined
  var beforeRouteUpdate: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavigationGuard<V> */ js.Any
  ] = js.undefined
  var router: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VueRouter */ js.Any
  ] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: vueLib.typesVueMod.Vue */](
    beforeRouteEnter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavigationGuard<V> */ js.Any = null,
    beforeRouteLeave: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavigationGuard<V> */ js.Any = null,
    beforeRouteUpdate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavigationGuard<V> */ js.Any = null,
    router: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VueRouter */ js.Any = null
  ): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (beforeRouteEnter != null) __obj.updateDynamic("beforeRouteEnter")(beforeRouteEnter)
    if (beforeRouteLeave != null) __obj.updateDynamic("beforeRouteLeave")(beforeRouteLeave)
    if (beforeRouteUpdate != null) __obj.updateDynamic("beforeRouteUpdate")(beforeRouteUpdate)
    if (router != null) __obj.updateDynamic("router")(router)
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

