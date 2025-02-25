package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertions extends js.Object {
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). Comes with power-assert. */
  @JSName("assert")
  var assert_Original: AssertAssertion = js.native
  /** Assert that `actual` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  @JSName("deepEqual")
  var deepEqual_Original: DeepEqualAssertion = js.native
  /** Fail the test. */
  @JSName("fail")
  var fail_Original: FailAssertion = js.native
  /** Assert that `actual` is strictly false. */
  @JSName("false")
  var false_Original: FalseAssertion = js.native
  /** Assert that `actual` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy). */
  @JSName("falsy")
  var falsy_Original: FalsyAssertion = js.native
  /**
  	 * Assert that `actual` is [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  @JSName("is")
  var is_Original: IsAssertion = js.native
  /** Assert that `actual` is not [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  @JSName("notDeepEqual")
  var notDeepEqual_Original: NotDeepEqualAssertion = js.native
  /** Assert that `string` does not match the regular expression. */
  @JSName("notRegex")
  var notRegex_Original: NotRegexAssertion = js.native
  /** Assert that the async function does not throw, or that the promise does not reject. Must be awaited. */
  @JSName("notThrowsAsync")
  var notThrowsAsync_Original: NotThrowsAsyncAssertion = js.native
  /** Assert that the function does not throw. */
  @JSName("notThrows")
  var notThrows_Original: NotThrowsAssertion = js.native
  /**
  	 * Assert that `actual` is not [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  @JSName("not")
  var not_Original: NotAssertion = js.native
  /** Count a passing assertion. */
  @JSName("pass")
  var pass_Original: PassAssertion = js.native
  /** Assert that `string` matches the regular expression. */
  @JSName("regex")
  var regex_Original: RegexAssertion = js.native
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details), or if
  	 * necessary record a new snapshot.
  	 */
  @JSName("snapshot")
  var snapshot_Original: SnapshotAssertion = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  @JSName("throwsAsync")
  var throwsAsync_Original: ThrowsAsyncAssertion = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 */
  @JSName("throws")
  var throws_Original: ThrowsAssertion = js.native
  /** Assert that `actual` is strictly true. */
  @JSName("true")
  var true_Original: TrueAssertion = js.native
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). */
  @JSName("truthy")
  var truthy_Original: TruthyAssertion = js.native
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). Comes with power-assert. */
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). Comes with power-assert. */
  def assert(actual: js.Any): scala.Unit = js.native
  def assert(actual: js.Any, message: java.lang.String): scala.Unit = js.native
  /** Assert that `actual` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  /** Assert that `actual` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  def deepEqual[ValueType](actual: ValueType, expected: ValueType): scala.Unit = js.native
  def deepEqual[ValueType](actual: ValueType, expected: ValueType, message: java.lang.String): scala.Unit = js.native
  /** Fail the test. */
  /** Fail the test. */
  def fail(): scala.Unit = js.native
  def fail(message: java.lang.String): scala.Unit = js.native
  /** Assert that `actual` is strictly false. */
  /** Assert that `actual` is strictly false. */
  def `false`(actual: js.Any): scala.Unit = js.native
  def `false`(actual: js.Any, message: java.lang.String): scala.Unit = js.native
  /** Assert that `actual` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy). */
  /** Assert that `actual` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy). */
  def falsy(actual: js.Any): scala.Unit = js.native
  def falsy(actual: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
  	 * Assert that `actual` is [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  /**
  	 * Assert that `actual` is [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  def is[ValueType](actual: ValueType, expected: ValueType): scala.Unit = js.native
  def is[ValueType](actual: ValueType, expected: ValueType, message: java.lang.String): scala.Unit = js.native
  /**
  	 * Assert that `actual` is not [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  /**
  	 * Assert that `actual` is not [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  def not[ValueType](actual: ValueType, expected: ValueType): scala.Unit = js.native
  def not[ValueType](actual: ValueType, expected: ValueType, message: java.lang.String): scala.Unit = js.native
  /** Assert that `actual` is not [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  /** Assert that `actual` is not [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  def notDeepEqual[ValueType](actual: ValueType, expected: ValueType): scala.Unit = js.native
  def notDeepEqual[ValueType](actual: ValueType, expected: ValueType, message: java.lang.String): scala.Unit = js.native
  /** Assert that `string` does not match the regular expression. */
  /** Assert that `string` does not match the regular expression. */
  def notRegex(string: java.lang.String, regex: stdLib.RegExp): scala.Unit = js.native
  def notRegex(string: java.lang.String, regex: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  /** Assert that the function does not throw. */
  /** Assert that the function does not throw. */
  def notThrows(fn: js.Function0[_]): scala.Unit = js.native
  def notThrows(fn: js.Function0[_], message: java.lang.String): scala.Unit = js.native
  /** Assert that the async function does not throw. You must await the result. */
  /** Assert that the async function does not throw, or that the promise does not reject. Must be awaited. */
  def notThrowsAsync(fn: js.Function0[js.Thenable[_]]): js.Promise[scala.Unit] = js.native
  def notThrowsAsync(fn: js.Function0[js.Thenable[_]], message: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Assert that the promise does not reject. You must await the result. */
  /** Assert that the async function does not throw, or that the promise does not reject. Must be awaited. */
  def notThrowsAsync(promise: js.Thenable[_]): js.Promise[scala.Unit] = js.native
  def notThrowsAsync(promise: js.Thenable[_], message: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Count a passing assertion. */
  /** Count a passing assertion. */
  def pass(): scala.Unit = js.native
  def pass(message: java.lang.String): scala.Unit = js.native
  /** Assert that `string` matches the regular expression. */
  /** Assert that `string` matches the regular expression. */
  def regex(string: java.lang.String, regex: stdLib.RegExp): scala.Unit = js.native
  def regex(string: java.lang.String, regex: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details), or if
  	 * necessary record a new snapshot.
  	 */
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details), or if
  	 * necessary record a new snapshot.
  	 */
  def snapshot(expected: js.Any): scala.Unit = js.native
  def snapshot(expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details) (selected
  	 * through `options.id` if provided), or if necessary record a new snapshot.
  	 */
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details), or if
  	 * necessary record a new snapshot.
  	 */
  def snapshot(expected: js.Any, options: SnapshotOptions): scala.Unit = js.native
  def snapshot(expected: js.Any, options: SnapshotOptions, message: java.lang.String): scala.Unit = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 */
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 */
  def throws[ThrownError /* <: stdLib.Error */](fn: js.Function0[_]): ThrownError = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must be an instance of the given constructor.
  	 */
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 */
  def throws[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], constructor: Constructor): ThrownError = js.native
  def throws[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], constructor: Constructor, message: java.lang.String): ThrownError = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must have a message equal to `errorMessage`.
  	 */
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 */
  def throws[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], errorMessage: java.lang.String): ThrownError = js.native
  def throws[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], errorMessage: java.lang.String, message: java.lang.String): ThrownError = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must satisfy all expectations.
  	 */
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 */
  def throws[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], expectations: ThrowsExpectation): ThrownError = js.native
  def throws[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], expectations: ThrowsExpectation, message: java.lang.String): ThrownError = js.native
  def throws[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], expectations: scala.Null, message: java.lang.String): ThrownError = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must have a message that matches the regular expression.
  	 */
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 */
  def throws[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], regex: stdLib.RegExp): ThrownError = js.native
  def throws[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], regex: stdLib.RegExp, message: java.lang.String): ThrownError = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]]): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must be an instance of the given constructor.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], constructor: Constructor): js.Promise[ThrownError] = js.native
  def throwsAsync[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], constructor: Constructor, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must have a message equal to `errorMessage`.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], errorMessage: java.lang.String): js.Promise[ThrownError] = js.native
  def throwsAsync[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], errorMessage: java.lang.String, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must satisfy all expectations.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], expectations: ThrowsExpectation): js.Promise[ThrownError] = js.native
  def throwsAsync[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], expectations: ThrowsExpectation, message: java.lang.String): js.Promise[ThrownError] = js.native
  def throwsAsync[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], expectations: scala.Null, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must have a message that matches the regular expression.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], regex: stdLib.RegExp): js.Promise[ThrownError] = js.native
  def throwsAsync[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], regex: stdLib.RegExp, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_]): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must be an instance of the given constructor.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], constructor: Constructor): js.Promise[ThrownError] = js.native
  def throwsAsync[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], constructor: Constructor, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must have a message equal to `errorMessage`.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], errorMessage: java.lang.String): js.Promise[ThrownError] = js.native
  def throwsAsync[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], errorMessage: java.lang.String, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must satisfy all expectations.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], expectations: ThrowsExpectation): js.Promise[ThrownError] = js.native
  def throwsAsync[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], expectations: ThrowsExpectation, message: java.lang.String): js.Promise[ThrownError] = js.native
  def throwsAsync[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], expectations: scala.Null, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must have a message that matches the regular expression.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], regex: stdLib.RegExp): js.Promise[ThrownError] = js.native
  def throwsAsync[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], regex: stdLib.RegExp, message: java.lang.String): js.Promise[ThrownError] = js.native
  /** Assert that `actual` is strictly true. */
  /** Assert that `actual` is strictly true. */
  def `true`(actual: js.Any): scala.Unit = js.native
  def `true`(actual: js.Any, message: java.lang.String): scala.Unit = js.native
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). */
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). */
  def truthy(actual: js.Any): scala.Unit = js.native
  def truthy(actual: js.Any, message: java.lang.String): scala.Unit = js.native
}

