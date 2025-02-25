package typings
package atPulumiPulumiLib.outputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/output", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Output: OutputConstructor = js.native
  def all[T](ds: js.Array[js.UndefOr[Input[T]]]): Output[js.Array[Unwrap[T]]] = js.native
  def all[T](`val`: stdLib.Record[java.lang.String, Input[T]]): Output[stdLib.Record[java.lang.String, Unwrap[T]]] = js.native
  def all[T1, T2](values: js.Tuple2[js.UndefOr[Input[T1]], js.UndefOr[Input[T2]]]): Output[js.Tuple2[Unwrap[T1], Unwrap[T2]]] = js.native
  def all[T1, T2, T3](values: js.Tuple3[js.UndefOr[Input[T1]], js.UndefOr[Input[T2]], js.UndefOr[Input[T3]]]): Output[js.Tuple3[Unwrap[T1], Unwrap[T2], Unwrap[T3]]] = js.native
  def all[T1, T2, T3, T4](
    values: js.Tuple4[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]]
    ]
  ): Output[js.Tuple4[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4]]] = js.native
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]]
    ]
  ): Output[js.Tuple5[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5]]] = js.native
  def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]], 
      js.UndefOr[Input[T6]]
    ]
  ): Output[
    js.Tuple6[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6]]
  ] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]], 
      js.UndefOr[Input[T6]], 
      js.UndefOr[Input[T7]]
    ]
  ): Output[
    js.Tuple7[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6], Unwrap[T7]]
  ] = js.native
  def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]], 
      js.UndefOr[Input[T6]], 
      js.UndefOr[Input[T7]], 
      js.UndefOr[Input[T8]]
    ]
  ): Output[
    js.Tuple8[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6], Unwrap[T7], Unwrap[T8]]
  ] = js.native
  def concat(params: Input[_]*): Output[java.lang.String] = js.native
  def interpolate(literals: stdLib.TemplateStringsArray, placeholders: Input[_]*): Output[java.lang.String] = js.native
  def output[T](): Output[Unwrap[js.UndefOr[T]]] = js.native
  def output[T](`val`: Input[T]): Output[Unwrap[T]] = js.native
  def secret[T](): Output[Unwrap[js.UndefOr[T]]] = js.native
  def secret[T](`val`: Input[T]): Output[Unwrap[T]] = js.native
}

