package typings
package pDashLogLib.pDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: pDashLogLib.Anon_Catch = js.native
  /**
  	Log the value of a promise. Use this in a `.then()` method.
  	@param logger - The logger to use. Any return value or exception is ignored. Default: `console.log`.
  	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
  	@example
  	```
  	import pLog = require('p-log');
  	Promise.resolve('unicorn')
  		.then(pLog()) // Logs `unicorn`
  		.then(value => {
  			// `value` is still `unicorn`
  		});
  	```
  	*/
  def apply[ValueType](): js.Function1[/* value */ ValueType, js.Promise[ValueType]] = js.native
  def apply[ValueType](logger: Logger): js.Function1[/* value */ ValueType, js.Promise[ValueType]] = js.native
  /**
  	Log the error of a promise. Use this in a `.catch()` method.
  	@param logger - The logger to use. Any return value or exception is ignored. Default: `console.log`.
  	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
  	@example
  	```
  	const pLog = require('p-log');
  	Promise.resolve()
  		.then(() => {
  			throw new Error('pony');
  		})
  		.catch(pLog.catch()) // Logs `Error: pony`
  		.catch(error => {
  			// `error` is still `Error: pony`
  		});
  	```
  	*/
  def `catch`(): js.Function1[/* error */ js.Any, js.Promise[scala.Nothing]] = js.native
  def `catch`(logger: Logger): js.Function1[/* error */ js.Any, js.Promise[scala.Nothing]] = js.native
  /**
  	Log the value of a promise. Use this in a `.then()` method.
  	@param logger - The logger to use. Any return value or exception is ignored. Default: `console.log`.
  	@returns A [thunk](https://en.wikipedia.org/wiki/Thunk) that returns a `Promise`.
  	@example
  	```
  	import pLog = require('p-log');
  	Promise.resolve('unicorn')
  		.then(pLog()) // Logs `unicorn`
  		.then(value => {
  			// `value` is still `unicorn`
  		});
  	```
  	*/
  // TODO: Remove this for the next major release
  def default[ValueType](): js.Function1[/* value */ ValueType, js.Promise[ValueType]] = js.native
  def default[ValueType](logger: Logger): js.Function1[/* value */ ValueType, js.Promise[ValueType]] = js.native
}

