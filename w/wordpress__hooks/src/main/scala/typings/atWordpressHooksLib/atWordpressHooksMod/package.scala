package typings
package atWordpressHooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atWordpressHooksMod {
  type ActionCallback = js.Function1[/* repeated */ js.Any, scala.Unit]
  type CurrentHook = js.Function0[java.lang.String | scala.Null]
  type DidHook = js.Function1[/* hookName */ java.lang.String, scala.Double]
  type DoingHook = js.Function1[/* hookName */ js.UndefOr[java.lang.String], scala.Boolean]
  type FilterCallback = js.Function2[/* firstArg */ js.Any, /* repeated */ js.Any, scala.Double | java.lang.String]
  type HasHook = js.Function1[/* hookName */ java.lang.String, scala.Boolean]
  type HookMap[T /* <: js.Function1[/* repeated */ js.Any, _] */] = atWordpressHooksLib.Anon_Current[T] with (stdLib.Record[java.lang.String, js.UndefOr[js.Array[Hook[T]]]])
  type RemoveHook = js.Function2[/* hookName */ java.lang.String, /* namespace */ java.lang.String, scala.Double]
  type RunHook = js.Function3[
    /* hookName */ java.lang.String, 
    /* firstArg */ js.UndefOr[js.Any], 
    /* repeated */ js.Any, 
    scala.Double | java.lang.String
  ]
}
