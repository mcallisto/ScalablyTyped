package typings
package apolloDashReactLib.libBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-react/lib/browser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compose(): js.Function1[/* a */ js.Any, _] = js.native
  def compose[R](f1: js.Function1[/* b */ js.Any, R], funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  def compose[F /* <: js.Function */](f: F): F = js.native
  def compose[R](funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  def compose[A, R](f1: js.Function1[/* b */ A, R], f2: reduxLib.reduxMod.Func0[A]): reduxLib.reduxMod.Func0[R] = js.native
  def compose[A, B, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: reduxLib.reduxMod.Func0[A]): reduxLib.reduxMod.Func0[R] = js.native
  def compose[A, T1, R](f1: js.Function1[/* b */ A, R], f2: reduxLib.reduxMod.Func1[T1, A]): reduxLib.reduxMod.Func1[T1, R] = js.native
  def compose[A, B, C, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: reduxLib.reduxMod.Func0[A]
  ): reduxLib.reduxMod.Func0[R] = js.native
  def compose[A, B, T1, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: reduxLib.reduxMod.Func1[T1, A]): reduxLib.reduxMod.Func1[T1, R] = js.native
  def compose[A, T1, T2, R](f1: js.Function1[/* b */ A, R], f2: reduxLib.reduxMod.Func2[T1, T2, A]): reduxLib.reduxMod.Func2[T1, T2, R] = js.native
  def compose[A, B, C, T1, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: reduxLib.reduxMod.Func1[T1, A]
  ): reduxLib.reduxMod.Func1[T1, R] = js.native
  def compose[A, B, T1, T2, R](
    f1: js.Function1[/* b */ B, R],
    f2: js.Function1[/* a */ A, B],
    f3: reduxLib.reduxMod.Func2[T1, T2, A]
  ): reduxLib.reduxMod.Func2[T1, T2, R] = js.native
  def compose[A, T1, T2, T3, R](f1: js.Function1[/* b */ A, R], f2: reduxLib.reduxMod.Func3[T1, T2, T3, A]): reduxLib.reduxMod.Func3[T1, T2, T3, R] = js.native
  def compose[A, B, C, T1, T2, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: reduxLib.reduxMod.Func2[T1, T2, A]
  ): reduxLib.reduxMod.Func2[T1, T2, R] = js.native
  def compose[A, B, T1, T2, T3, R](
    f1: js.Function1[/* b */ B, R],
    f2: js.Function1[/* a */ A, B],
    f3: reduxLib.reduxMod.Func3[T1, T2, T3, A]
  ): reduxLib.reduxMod.Func3[T1, T2, T3, R] = js.native
  def compose[A, B, C, T1, T2, T3, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: reduxLib.reduxMod.Func3[T1, T2, T3, A]
  ): reduxLib.reduxMod.Func3[T1, T2, T3, R] = js.native
  def graphql(document: typedDashGraphqlLib.graphqlMod.Document): js.Function1[/* WrappedComponent */ js.Any, _] = js.native
  def graphql(
    document: typedDashGraphqlLib.graphqlMod.Document,
    operationOptions: apolloDashReactLib.libGraphqlMod.OperationOption
  ): js.Function1[/* WrappedComponent */ js.Any, _] = js.native
  def withApollo(WrappedComponent: js.Any): js.Any = js.native
}

