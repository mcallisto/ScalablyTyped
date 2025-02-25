package typings
package preactLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "Component")
@js.native
abstract class Component[P, S] () extends js.Object {
  def this(props: P) = this()
  def this(props: P, context: js.Any) = this()
  var base: js.UndefOr[stdLib.HTMLElement] = js.native
  var componentDidMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* previousProps */ P, /* previousState */ S, /* previousContext */ js.Any, scala.Unit]
  ] = js.native
  var componentWillMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ P, /* nextContext */ js.Any, scala.Unit]] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any, scala.Unit]
  ] = js.native
  var context: js.Any = js.native
  var getChildContext: js.UndefOr[js.Function0[js.Object]] = js.native
  var props: RenderableProps[P, _] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any, scala.Boolean]
  ] = js.native
  var state: S = js.native
  def forceUpdate(): scala.Unit = js.native
  def forceUpdate(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def render(): ComponentChild = js.native
  def render(props: RenderableProps[P, _]): ComponentChild = js.native
  def render(props: RenderableProps[P, _], state: S): ComponentChild = js.native
  def render(props: RenderableProps[P, _], state: S, context: js.Any): ComponentChild = js.native
  def setState[K /* <: java.lang.String */](fn: js.Function2[/* prevState */ S, /* props */ P, stdLib.Pick[S, K]]): scala.Unit = js.native
  def setState[K /* <: java.lang.String */](
    fn: js.Function2[/* prevState */ S, /* props */ P, stdLib.Pick[S, K]],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setState[K /* <: java.lang.String */](state: stdLib.Pick[S, K]): scala.Unit = js.native
  def setState[K /* <: java.lang.String */](state: stdLib.Pick[S, K], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

/* static members */
@JSImport("preact", "Component")
@js.native
object Component extends js.Object {
  var defaultProps: js.UndefOr[js.Any] = js.native
  var displayName: js.UndefOr[java.lang.String] = js.native
}

