package typings
package nanoeventsLib.nanoeventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanoevents", JSImport.Namespace)
@js.native
class ^[T /* <: js.Object */] () extends NanoEvents[T] {
  /* CompleteClass */
  override def emit[U /* <: java.lang.String */](name: U, value: /* import warning: ImportType.apply Failed type conversion: T[U] */ js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def on[U /* <: java.lang.String */](
    name: U,
    callBack: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[U] */ /* arg */ js.Any, 
      _
    ]
  ): js.Function0[scala.Unit] = js.native
}

