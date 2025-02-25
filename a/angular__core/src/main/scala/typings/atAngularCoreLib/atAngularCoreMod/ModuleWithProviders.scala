package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleWithProviders[T] extends js.Object {
  var ngModule: Type[T]
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
}

object ModuleWithProviders {
  @scala.inline
  def apply[T](ngModule: Type[T], providers: js.Array[Provider] = null): ModuleWithProviders[T] = {
    val __obj = js.Dynamic.literal(ngModule = ngModule)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    __obj.asInstanceOf[ModuleWithProviders[T]]
  }
}

