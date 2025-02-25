package typings
package qDashRetryLib.qDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var longStackSupport: scala.Boolean = js.native
  var onerror: js.Function1[/* reason */ js.Any, scala.Unit] = js.native
  /**
    * Calling with nothing at all creates a void promise
    */
  def apply(): qLib.qMod.Promise[scala.Unit] = js.native
  /**
    * If value is a Q promise, returns the promise.
    * If value is a promise from another library it is coerced into a Q promise (where possible).
    * If value is not a promise, returns a promise that is fulfilled with value.
    */
  def apply[T](promise: js.Thenable[T] | T): qLib.qMod.Promise[T] = js.native
  def Promise[T](
    resolver: js.Function3[
      /* resolve */ js.Function1[/* val */ js.UndefOr[qLib.qMod.IWhenable[T]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      /* notify */ js.Function1[/* progress */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): qLib.qMod.Promise[T] = js.native
  def all[T](promises: qLib.qMod.IWhenable[js.Array[qLib.qMod.IWhenable[T]]]): qLib.qMod.Promise[js.Array[T]] = js.native
  def allResolved[T](promises: qLib.qMod.IWhenable[js.Array[qLib.qMod.IWhenable[T]]]): qLib.qMod.Promise[js.Array[qLib.qMod.Promise[T]]] = js.native
  def allSettled[T](promises: qLib.qMod.IWhenable[js.Array[qLib.qMod.IWhenable[T]]]): qLib.qMod.Promise[js.Array[qLib.qMod.PromiseState[T]]] = js.native
  @JSName("all")
  def all_AB[A, B](promises: qLib.qMod.IWhenable[js.Tuple2[A | qLib.qMod.IPromise[A], B | qLib.qMod.IPromise[B]]]): qLib.qMod.Promise[js.Tuple2[A, B]] = js.native
  @JSName("all")
  def all_ABC[A, B, C](
    promises: qLib.qMod.IWhenable[
      js.Tuple3[qLib.qMod.IWhenable[A], qLib.qMod.IWhenable[B], qLib.qMod.IWhenable[C]]
    ]
  ): qLib.qMod.Promise[js.Tuple3[A, B, C]] = js.native
  @JSName("all")
  def all_ABCD[A, B, C, D](
    promises: qLib.qMod.IWhenable[
      js.Tuple4[
        qLib.qMod.IWhenable[A], 
        qLib.qMod.IWhenable[B], 
        qLib.qMod.IWhenable[C], 
        qLib.qMod.IWhenable[D]
      ]
    ]
  ): qLib.qMod.Promise[js.Tuple4[A, B, C, D]] = js.native
  @JSName("all")
  def all_ABCDE[A, B, C, D, E](
    promises: qLib.qMod.IWhenable[
      js.Tuple5[
        qLib.qMod.IWhenable[A], 
        qLib.qMod.IWhenable[B], 
        qLib.qMod.IWhenable[C], 
        qLib.qMod.IWhenable[D], 
        qLib.qMod.IWhenable[E]
      ]
    ]
  ): qLib.qMod.Promise[js.Tuple5[A, B, C, D, E]] = js.native
  @JSName("all")
  def all_ABCDEF[A, B, C, D, E, F](
    promises: qLib.qMod.IWhenable[
      js.Tuple6[
        qLib.qMod.IWhenable[A], 
        qLib.qMod.IWhenable[B], 
        qLib.qMod.IWhenable[C], 
        qLib.qMod.IWhenable[D], 
        qLib.qMod.IWhenable[E], 
        qLib.qMod.IWhenable[F]
      ]
    ]
  ): qLib.qMod.Promise[js.Tuple6[A, B, C, D, E, F]] = js.native
  def async[T](generatorFunction: js.Any): js.Function1[/* repeated */ js.Any, qLib.qMod.Promise[T]] = js.native
  def defer[T](): qLib.qMod.Deferred[T] = js.native
  def delay(ms: scala.Double): qLib.qMod.Promise[scala.Unit] = js.native
  def delay[T](promiseOrValue: T, ms: scala.Double): qLib.qMod.Promise[T] = js.native
  def delay[T](promiseOrValue: qLib.qMod.Promise[T], ms: scala.Double): qLib.qMod.Promise[T] = js.native
  def denodeify[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, qLib.qMod.Promise[T]] = js.native
  def fbind[T](method: js.Function1[/* repeated */ js.Any, qLib.qMod.IWhenable[T]], args: js.Any*): js.Function1[/* repeated */ js.Any, qLib.qMod.Promise[T]] = js.native
  def fcall[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): qLib.qMod.Promise[T] = js.native
  def invoke[T](obj: js.Any, functionName: java.lang.String, args: js.Any*): qLib.qMod.Promise[T] = js.native
  def isFulfilled(promise: qLib.qMod.Promise[_]): scala.Boolean = js.native
  def isPending(promiseOrObject: js.Any): scala.Boolean = js.native
  def isPending(promiseOrObject: qLib.qMod.Promise[_]): scala.Boolean = js.native
  def isPromise(`object`: js.Any): /* is q.q.Promise<any> */ scala.Boolean = js.native
  def isPromiseAlike(`object`: js.Any): /* is q.q.IPromise<any> */ scala.Boolean = js.native
  def isRejected(promise: qLib.qMod.Promise[_]): scala.Boolean = js.native
  def mcall[T](obj: js.Any, functionName: java.lang.String, args: js.Any*): qLib.qMod.Promise[T] = js.native
  def nbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any, args: js.Any*): js.Function1[/* repeated */ js.Any, qLib.qMod.Promise[T]] = js.native
  def nearer[T](promise: qLib.qMod.Promise[T]): T = js.native
  def nextTick(callback: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def nfapply[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Array[_]): qLib.qMod.Promise[T] = js.native
  def nfbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, qLib.qMod.Promise[T]] = js.native
  def nfcall[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): qLib.qMod.Promise[T] = js.native
  def ninvoke[T](nodeModule: js.Any, functionName: java.lang.String, args: js.Any*): qLib.qMod.Promise[T] = js.native
  def noConflict(): qLib.Fn_Promise = js.native
  def npost[T](nodeModule: js.Any, functionName: java.lang.String, args: js.Array[_]): qLib.qMod.Promise[T] = js.native
  def nsend[T](nodeModule: js.Any, functionName: java.lang.String, args: js.Any*): qLib.qMod.Promise[T] = js.native
  def promised[T](callback: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, qLib.qMod.Promise[T]] = js.native
  def race[T](promises: js.Array[qLib.qMod.IWhenable[T]]): qLib.qMod.Promise[T] = js.native
  def reject[T](): qLib.qMod.Promise[T] = js.native
  def reject[T](reason: js.Any): qLib.qMod.Promise[T] = js.native
  def resolve[T](): qLib.qMod.Promise[T] = js.native
  def resolve[T](`object`: qLib.qMod.IWhenable[T]): qLib.qMod.Promise[T] = js.native
  def retry[U](process: js.Function0[qLib.qMod.IPromise[U] | U]): qDashRetryLib.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](process: js.Function0[qLib.qMod.IPromise[U] | U], limit: scala.Double): qDashRetryLib.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function0[qLib.qMod.IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ scala.Double, scala.Unit]
  ): qDashRetryLib.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function0[qLib.qMod.IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ scala.Double, scala.Unit],
    limit: scala.Double
  ): qDashRetryLib.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function0[qLib.qMod.IPromise[U] | U],
    onFail: js.Function2[/* reason */ js.Any, /* retries */ scala.Double, scala.Unit],
    options: qDashRetryLib.qDashRetryMod.qMod.IRetryOptions
  ): qDashRetryLib.qDashRetryMod.qMod.Promise[U] = js.native
  def retry[U](
    process: js.Function0[qLib.qMod.IPromise[U] | U],
    options: qDashRetryLib.qDashRetryMod.qMod.IRetryOptions
  ): qDashRetryLib.qDashRetryMod.qMod.Promise[U] = js.native
  def send[T](obj: js.Any, functionName: java.lang.String, args: js.Any*): qLib.qMod.Promise[T] = js.native
  def spread[T, U](
    promises: js.Array[qLib.qMod.IWhenable[T]],
    onFulfilled: js.Function1[/* repeated */ T, qLib.qMod.IWhenable[U]]
  ): qLib.qMod.Promise[U] = js.native
  def spread[T, U](
    promises: js.Array[qLib.qMod.IWhenable[T]],
    onFulfilled: js.Function1[/* repeated */ T, qLib.qMod.IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, qLib.qMod.IWhenable[U]]
  ): qLib.qMod.Promise[U] = js.native
  def timeout[T](promise: qLib.qMod.Promise[T], ms: scala.Double): qLib.qMod.Promise[T] = js.native
  def timeout[T](promise: qLib.qMod.Promise[T], ms: scala.Double, message: java.lang.String): qLib.qMod.Promise[T] = js.native
  def `try`[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): qLib.qMod.Promise[T] = js.native
  def when(): qLib.qMod.Promise[scala.Unit] = js.native
  def when[T](value: qLib.qMod.IWhenable[T]): qLib.qMod.Promise[T] = js.native
  def when[T, U](value: qLib.qMod.IWhenable[T], onFulfilled: js.Function1[/* val */ T, qLib.qMod.IWhenable[U]]): qLib.qMod.Promise[U] = js.native
  def when[T, U](
    value: qLib.qMod.IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, qLib.qMod.IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, qLib.qMod.IWhenable[U]]
  ): qLib.qMod.Promise[U] = js.native
  def when[T, U](
    value: qLib.qMod.IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, qLib.qMod.IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, qLib.qMod.IWhenable[U]],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): qLib.qMod.Promise[U] = js.native
  def when[T, U](
    value: qLib.qMod.IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, qLib.qMod.IWhenable[U]],
    onRejected: scala.Null,
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): qLib.qMod.Promise[U] = js.native
}

