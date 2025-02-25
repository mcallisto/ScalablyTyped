package typings
package grammarkdownLib.distCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val emptyIterable: stdLib.IterableIterator[scala.Nothing] = js.native
  def binarySearch(array: js.Array[scala.Double], value: scala.Double): scala.Double = js.native
  def compare(x: js.Any, y: js.Any): grammarkdownLib.grammarkdownLibNumbers.`1` | grammarkdownLib.grammarkdownLibNumbers.`0` | grammarkdownLib.grammarkdownLibNumbers.`-1` = js.native
  def compareStrings(): grammarkdownLib.grammarkdownLibNumbers.`1` | grammarkdownLib.grammarkdownLibNumbers.`0` | grammarkdownLib.grammarkdownLibNumbers.`-1` = js.native
  def compareStrings(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], ignoreCase: scala.Boolean): grammarkdownLib.grammarkdownLibNumbers.`1` | grammarkdownLib.grammarkdownLibNumbers.`0` | grammarkdownLib.grammarkdownLibNumbers.`-1` = js.native
  def compareStrings(x: js.UndefOr[scala.Nothing], y: java.lang.String): grammarkdownLib.grammarkdownLibNumbers.`1` | grammarkdownLib.grammarkdownLibNumbers.`0` | grammarkdownLib.grammarkdownLibNumbers.`-1` = js.native
  def compareStrings(x: js.UndefOr[scala.Nothing], y: java.lang.String, ignoreCase: scala.Boolean): grammarkdownLib.grammarkdownLibNumbers.`1` | grammarkdownLib.grammarkdownLibNumbers.`0` | grammarkdownLib.grammarkdownLibNumbers.`-1` = js.native
  def compareStrings(x: java.lang.String): grammarkdownLib.grammarkdownLibNumbers.`1` | grammarkdownLib.grammarkdownLibNumbers.`0` | grammarkdownLib.grammarkdownLibNumbers.`-1` = js.native
  def compareStrings(x: java.lang.String, y: js.UndefOr[scala.Nothing], ignoreCase: scala.Boolean): grammarkdownLib.grammarkdownLibNumbers.`1` | grammarkdownLib.grammarkdownLibNumbers.`0` | grammarkdownLib.grammarkdownLibNumbers.`-1` = js.native
  def compareStrings(x: java.lang.String, y: java.lang.String): grammarkdownLib.grammarkdownLibNumbers.`1` | grammarkdownLib.grammarkdownLibNumbers.`0` | grammarkdownLib.grammarkdownLibNumbers.`-1` = js.native
  def compareStrings(x: java.lang.String, y: java.lang.String, ignoreCase: scala.Boolean): grammarkdownLib.grammarkdownLibNumbers.`1` | grammarkdownLib.grammarkdownLibNumbers.`0` | grammarkdownLib.grammarkdownLibNumbers.`-1` = js.native
  def concat[T](): js.UndefOr[js.Array[T]] = js.native
  def concat[T](a: js.UndefOr[scala.Nothing], b: js.Array[T]): js.Array[T] = js.native
  def concat[T](a: js.Array[T]): js.Array[T] = js.native
  def concat[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = js.native
  @JSName("concat")
  def `concat_T<union>`[T](a: js.UndefOr[scala.Nothing], b: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  @JSName("concat")
  def `concat_T<union>`[T](a: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  @JSName("concat")
  def `concat_T<union>`[T](a: js.Array[T], b: js.Array[T]): js.UndefOr[js.Array[T]] = js.native
  def first[T](): js.UndefOr[T] = js.native
  def first[T](iterable: js.Array[T]): js.UndefOr[T] = js.native
  def first[T](iterable: stdLib.Iterable[T]): js.UndefOr[T] = js.native
  def forEach[T, U](array: js.UndefOr[scala.Nothing], cb: js.Function1[/* value */ T, js.UndefOr[U]]): js.UndefOr[U] = js.native
  def forEach[T, U](array: js.Array[T], cb: js.Function1[/* value */ T, js.UndefOr[U]]): js.UndefOr[U] = js.native
  def forEachPossiblyAsync[T, U](iterable: stdLib.Iterable[T], callback: js.Function1[/* value */ T, js.UndefOr[js.Promise[U] | U]]): scala.Unit | js.Promise[scala.Unit] = js.native
  def isPromise[T](): /* is std.Promise<T> */ scala.Boolean = js.native
  def isPromise[T](value: T): /* is std.Promise<T> */ scala.Boolean = js.native
  def isPromise[T](value: js.Promise[T]): /* is std.Promise<T> */ scala.Boolean = js.native
  def last[T](): js.UndefOr[T] = js.native
  def last[T](iterable: js.Array[T]): js.UndefOr[T] = js.native
  def last[T](iterable: stdLib.Iterable[T]): js.UndefOr[T] = js.native
  def mapFromObject[T](`object`: DictionaryLike[T]): stdLib.Map[java.lang.String, T] = js.native
  def mapSet[K, V](map: stdLib.Map[K, V], key: K, value: V): V = js.native
  def mapSet[K /* <: js.Object */, V](map: stdLib.WeakMap[K, V], key: K, value: V): V = js.native
  def only[T](): js.UndefOr[T] = js.native
  def only[T](iterable: js.Array[T]): js.UndefOr[T] = js.native
  def only[T](iterable: stdLib.Iterable[T]): js.UndefOr[T] = js.native
  def pipe[T, U](result: T, next: js.Function1[js.UndefOr[/* value */ T], js.UndefOr[js.Promise[U] | U]]): U | js.Promise[U] = js.native
  def pipe[T, U](
    result: js.UndefOr[scala.Nothing],
    next: js.Function1[js.UndefOr[T], js.UndefOr[js.Promise[U] | U]]
  ): U | js.Promise[U] = js.native
  def pipe[T, U](
    result: js.Promise[T],
    next: js.Function1[js.UndefOr[/* value */ T], js.UndefOr[js.Promise[U] | U]]
  ): U | js.Promise[U] = js.native
  def promiseFinally[T](promise: js.Promise[T], onFinally: js.Function0[scala.Unit]): js.Promise[T] = js.native
  def stableSort[T](array: js.Array[T], comparer: js.Function2[/* a */ T, /* b */ T, scala.Double]): js.Array[T] = js.native
}

