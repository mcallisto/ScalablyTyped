package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFlatMapDepth1x2 extends js.Object {
  def apply(iteratee: java.lang.String): js.Array[_] = js.native
  def apply(iteratee: java.lang.String, collection: js.Object): js.Array[_] = js.native
  def apply(iteratee: js.Object): js.Array[scala.Boolean] = js.native
  def apply(iteratee: js.Object, collection: js.Object): js.Array[scala.Boolean] = js.native
  def apply(iteratee: lodashLib.lodashMod.__): LodashFlatMapDepth3x6 = js.native
  def apply(iteratee: lodashLib.lodashMod.__, collection: js.Object): LodashFlatMapDepth3x6 = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.__, collection: T): LodashFlatMapDepth2x6[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashFlatMapDepth1x6[T] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[
      /* value */ T, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): js.Array[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[
      /* value */ T, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    collection: lodashLib.lodashMod.List[T]
  ): js.Array[TResult] = js.native
}

