package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassProvider
  extends ClassSansProvider
     with _Provider {
  /**
    * If true, then injector returns an array of instances. This is useful to allow multiple
    * providers spread across many files to provide configuration information to a common token.
    */
  var multi: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An injection token. (Typically an instance of `Type` or `InjectionToken`, but can be `any`).
    */
  var provide: js.Any
}

object ClassProvider {
  @scala.inline
  def apply(provide: js.Any, useClass: Type[_], multi: js.UndefOr[scala.Boolean] = js.undefined): ClassProvider = {
    val __obj = js.Dynamic.literal(provide = provide, useClass = useClass)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    __obj.asInstanceOf[ClassProvider]
  }
}

