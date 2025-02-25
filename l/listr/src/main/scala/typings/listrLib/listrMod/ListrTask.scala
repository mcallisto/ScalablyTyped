package typings
package listrLib.listrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrTask extends js.Object {
  var enabled: js.UndefOr[
    js.Function2[
      /* ctx */ js.Any, 
      /* task */ ListrTaskWrapper, 
      scala.Boolean | js.Promise[scala.Boolean] | rxjsLib.rxjsMod.Observable[scala.Boolean]
    ]
  ] = js.undefined
  var output: js.UndefOr[java.lang.String] = js.undefined
  var skip: js.UndefOr[
    js.Function2[
      /* ctx */ js.Any, 
      /* task */ ListrTaskWrapper, 
      scala.Boolean | js.Promise[scala.Boolean] | java.lang.String | scala.Unit | rxjsLib.rxjsMod.Observable[scala.Boolean]
    ]
  ] = js.undefined
  var title: java.lang.String
  def task(ctx: js.Any, task: ListrTaskWrapper): scala.Unit | java.lang.String | js.Promise[_] | nodeLib.streamMod.Readable | Listr | rxjsLib.rxjsMod.Observable[_]
}

object ListrTask {
  @scala.inline
  def apply(
    task: (js.Any, ListrTaskWrapper) => scala.Unit | java.lang.String | js.Promise[_] | nodeLib.streamMod.Readable | Listr | rxjsLib.rxjsMod.Observable[_],
    title: java.lang.String,
    enabled: (/* ctx */ js.Any, /* task */ ListrTaskWrapper) => scala.Boolean | js.Promise[scala.Boolean] | rxjsLib.rxjsMod.Observable[scala.Boolean] = null,
    output: java.lang.String = null,
    skip: (/* ctx */ js.Any, /* task */ ListrTaskWrapper) => scala.Boolean | js.Promise[scala.Boolean] | java.lang.String | scala.Unit | rxjsLib.rxjsMod.Observable[scala.Boolean] = null
  ): ListrTask = {
    val __obj = js.Dynamic.literal(task = js.Any.fromFunction2(task), title = title)
    if (enabled != null) __obj.updateDynamic("enabled")(js.Any.fromFunction2(enabled))
    if (output != null) __obj.updateDynamic("output")(output)
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction2(skip))
    __obj.asInstanceOf[ListrTask]
  }
}

