package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions[T] extends AsyncOptions[T] {
  var defer: js.UndefOr[scala.Boolean] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply[T](
    debugLabel: java.lang.String = null,
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    deferFn: DeferFn[T] = null,
    dispatcher: (/* action */ AsyncAction[T], /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], scala.Unit], /* props */ js.Object) => scala.Unit = null,
    initialValue: T = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    onReject: /* error */ stdLib.Error => scala.Unit = null,
    onResolve: T => scala.Unit = null,
    promise: js.Promise[T] = null,
    promiseFn: PromiseFn[T] = null,
    reducer: (/* state */ AsyncState[T], /* action */ AsyncAction[T], /* internalReducer */ js.Function2[/* state */ AsyncState[T], /* action */ AsyncAction[T], AsyncState[T]]) => AsyncState[T] = null,
    watch: js.Any = null,
    watchFn: (/* props */ js.Object, /* prevProps */ js.Object) => _ = null
  ): FetchOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (debugLabel != null) __obj.updateDynamic("debugLabel")(debugLabel)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (deferFn != null) __obj.updateDynamic("deferFn")(deferFn)
    if (dispatcher != null) __obj.updateDynamic("dispatcher")(js.Any.fromFunction3(dispatcher))
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1(onReject))
    if (onResolve != null) __obj.updateDynamic("onResolve")(js.Any.fromFunction1(onResolve))
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (promiseFn != null) __obj.updateDynamic("promiseFn")(promiseFn)
    if (reducer != null) __obj.updateDynamic("reducer")(js.Any.fromFunction3(reducer))
    if (watch != null) __obj.updateDynamic("watch")(watch)
    if (watchFn != null) __obj.updateDynamic("watchFn")(js.Any.fromFunction2(watchFn))
    __obj.asInstanceOf[FetchOptions[T]]
  }
}

