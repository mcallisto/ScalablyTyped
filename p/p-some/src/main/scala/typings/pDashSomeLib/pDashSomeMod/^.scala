package typings
package pDashSomeLib.pDashSomeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-some", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var AggregateError: AggregateErrorConstructor = js.native
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: pDashSomeLib.Anon_AggregateError = js.native
  /**
  	Wait for a specified number of promises to be fulfilled.
  	@param values - An `Iterable` collection of promises/values to wait for. If you pass in cancelable promises, specifically promises with a `.cancel()` method, that method will be called for the promises that are still unfulfilled when the returned `Promise` is either fulfilled or rejected.
  	@returns A [cancelable `Promise`](https://github.com/sindresorhus/p-cancelable) that is fulfilled when `count` promises from `input` are fulfilled. The fulfilled value is an `Array` of the values from the `input` promises in the order they were fulfilled. If it becomes impossible to satisfy `count`, for example, too many promises rejected, it will reject with an [`AggregateError`](https://github.com/sindresorhus/aggregate-error) error.
  	@example
  	```
  	import got = require('got');
  	import pSome = require('p-some');
  	(async () => {
  		const input = [
  			got.head('github.com').then(() => 'github'),
  			got.head('google.com').then(() => 'google'),
  			got.head('twitter.com').then(() => 'twitter'),
  			got.head('medium.com').then(() => 'medium')
  		];
  		const [first, second] = await pSome(input, {count: 2});
  		console.log(first, second);
  		//=> 'google twitter'
  	})();
  	```
  	*/
  def apply[T](values: stdLib.Iterable[Value[T]], options: Options[T]): CancelablePromise[js.Array[T]] = js.native
  /**
  	Wait for a specified number of promises to be fulfilled.
  	@param values - An `Iterable` collection of promises/values to wait for. If you pass in cancelable promises, specifically promises with a `.cancel()` method, that method will be called for the promises that are still unfulfilled when the returned `Promise` is either fulfilled or rejected.
  	@returns A [cancelable `Promise`](https://github.com/sindresorhus/p-cancelable) that is fulfilled when `count` promises from `input` are fulfilled. The fulfilled value is an `Array` of the values from the `input` promises in the order they were fulfilled. If it becomes impossible to satisfy `count`, for example, too many promises rejected, it will reject with an [`AggregateError`](https://github.com/sindresorhus/aggregate-error) error.
  	@example
  	```
  	import got = require('got');
  	import pSome = require('p-some');
  	(async () => {
  		const input = [
  			got.head('github.com').then(() => 'github'),
  			got.head('google.com').then(() => 'google'),
  			got.head('twitter.com').then(() => 'twitter'),
  			got.head('medium.com').then(() => 'medium')
  		];
  		const [first, second] = await pSome(input, {count: 2});
  		console.log(first, second);
  		//=> 'google twitter'
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release
  def default[T](values: stdLib.Iterable[Value[T]], options: Options[T]): CancelablePromise[js.Array[T]] = js.native
}

