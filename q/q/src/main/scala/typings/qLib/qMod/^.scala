package typings
package qLib.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var longStackSupport: scala.Boolean = js.native
  var onerror: js.Function1[/* reason */ js.Any, scala.Unit] = js.native
  /**
    * Calling with nothing at all creates a void promise
    */
  def apply(): Promise[scala.Unit] = js.native
  /**
    * If value is a Q promise, returns the promise.
    * If value is a promise from another library it is coerced into a Q promise (where possible).
    * If value is not a promise, returns a promise that is fulfilled with value.
    */
  def apply[T](promise: js.Thenable[T] | T): Promise[T] = js.native
  def Promise[T](
    resolver: js.Function3[
      /* resolve */ js.Function1[/* val */ js.UndefOr[IWhenable[T]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      /* notify */ js.Function1[/* progress */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): qLib.qMod.Promise[T] = js.native
  def all[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[T]] = js.native
  def allResolved[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[Promise[T]]] = js.native
  def allSettled[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[PromiseState[T]]] = js.native
  @JSName("all")
  def all_AB[A, B](promises: IWhenable[js.Tuple2[A | IPromise[A], B | IPromise[B]]]): Promise[js.Tuple2[A, B]] = js.native
  @JSName("all")
  def all_ABC[A, B, C](promises: IWhenable[js.Tuple3[IWhenable[A], IWhenable[B], IWhenable[C]]]): Promise[js.Tuple3[A, B, C]] = js.native
  @JSName("all")
  def all_ABCD[A, B, C, D](promises: IWhenable[js.Tuple4[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D]]]): Promise[js.Tuple4[A, B, C, D]] = js.native
  @JSName("all")
  def all_ABCDE[A, B, C, D, E](
    promises: IWhenable[js.Tuple5[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D], IWhenable[E]]]
  ): Promise[js.Tuple5[A, B, C, D, E]] = js.native
  @JSName("all")
  def all_ABCDEF[A, B, C, D, E, F](
    promises: IWhenable[
      js.Tuple6[IWhenable[A], IWhenable[B], IWhenable[C], IWhenable[D], IWhenable[E], IWhenable[F]]
    ]
  ): Promise[js.Tuple6[A, B, C, D, E, F]] = js.native
  def async[T](generatorFunction: js.Any): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  def defer[T](): Deferred[T] = js.native
  def delay(ms: scala.Double): Promise[scala.Unit] = js.native
  def delay[T](promiseOrValue: T, ms: scala.Double): Promise[T] = js.native
  def delay[T](promiseOrValue: Promise[T], ms: scala.Double): Promise[T] = js.native
  def denodeify[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  def fbind[T](method: js.Function1[/* repeated */ js.Any, IWhenable[T]], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  def fcall[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = js.native
  def invoke[T](obj: js.Any, functionName: java.lang.String, args: js.Any*): Promise[T] = js.native
  def isFulfilled(promise: Promise[_]): scala.Boolean = js.native
  def isPending(promiseOrObject: js.Any): scala.Boolean = js.native
  def isPending(promiseOrObject: Promise[_]): scala.Boolean = js.native
  def isPromise(`object`: js.Any): /* is q.q.Promise<any> */ scala.Boolean = js.native
  def isPromiseAlike(`object`: js.Any): /* is q.q.IPromise<any> */ scala.Boolean = js.native
  def isRejected(promise: Promise[_]): scala.Boolean = js.native
  def mcall[T](obj: js.Any, functionName: java.lang.String, args: js.Any*): Promise[T] = js.native
  def nbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any, args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  def nearer[T](promise: Promise[T]): T = js.native
  def nextTick(callback: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  def nfapply[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Array[_]): Promise[T] = js.native
  def nfbind[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  def nfcall[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Promise[T] = js.native
  def ninvoke[T](nodeModule: js.Any, functionName: java.lang.String, args: js.Any*): Promise[T] = js.native
  def noConflict(): qLib.Fn_Promise = js.native
  def npost[T](nodeModule: js.Any, functionName: java.lang.String, args: js.Array[_]): Promise[T] = js.native
  def nsend[T](nodeModule: js.Any, functionName: java.lang.String, args: js.Any*): Promise[T] = js.native
  def promised[T](callback: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
  def race[T](promises: js.Array[IWhenable[T]]): Promise[T] = js.native
  def reject[T](): Promise[T] = js.native
  def reject[T](reason: js.Any): Promise[T] = js.native
  def resolve[T](): Promise[T] = js.native
  def resolve[T](`object`: IWhenable[T]): Promise[T] = js.native
  def send[T](obj: js.Any, functionName: java.lang.String, args: js.Any*): Promise[T] = js.native
  def spread[T, U](promises: js.Array[IWhenable[T]], onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]]): Promise[U] = js.native
  def spread[T, U](
    promises: js.Array[IWhenable[T]],
    onFulfilled: js.Function1[/* repeated */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = js.native
  def timeout[T](promise: Promise[T], ms: scala.Double): Promise[T] = js.native
  def timeout[T](promise: Promise[T], ms: scala.Double, message: java.lang.String): Promise[T] = js.native
  def `try`[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = js.native
  def when(): Promise[scala.Unit] = js.native
  def when[T](value: IWhenable[T]): Promise[T] = js.native
  def when[T, U](value: IWhenable[T], onFulfilled: js.Function1[/* val */ T, IWhenable[U]]): Promise[U] = js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]]
  ): Promise[U] = js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: js.Function1[/* reason */ js.Any, IWhenable[U]],
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
  def when[T, U](
    value: IWhenable[T],
    onFulfilled: js.Function1[/* val */ T, IWhenable[U]],
    onRejected: scala.Null,
    onProgress: js.Function1[/* progress */ js.Any, _]
  ): Promise[U] = js.native
}

