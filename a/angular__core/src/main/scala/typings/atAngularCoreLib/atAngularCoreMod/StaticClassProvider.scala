package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return an instance of `useClass` for a token.
  *
  * For more details, see the ["Dependency Injection Guide"](guide/dependency-injection).
  *
  * @usageNotes
  *
  * ### Example
  *
  * {@example core/di/ts/provider_spec.ts region='StaticClassProvider'}
  *
  * Note that following two providers are not equal:
  *
  * {@example core/di/ts/provider_spec.ts region='StaticClassProviderDifference'}
  *
  * ### Multi-value example
  *
  * {@example core/di/ts/provider_spec.ts region='MultiProviderAspect'}
  *
  * @publicApi
  */
trait StaticClassProvider
  extends StaticClassSansProvider
     with _StaticProvider {
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

object StaticClassProvider {
  @scala.inline
  def apply(
    deps: js.Array[_],
    provide: js.Any,
    useClass: Type[_],
    multi: js.UndefOr[scala.Boolean] = js.undefined
  ): StaticClassProvider = {
    val __obj = js.Dynamic.literal(deps = deps, provide = provide, useClass = useClass)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    __obj.asInstanceOf[StaticClassProvider]
  }
}

