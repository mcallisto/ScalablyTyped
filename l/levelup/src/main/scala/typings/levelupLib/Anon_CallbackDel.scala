package typings
package levelupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackDel extends js.Object {
  def del(
    key: /* import warning: ImportType.apply Failed type conversion: infer K */ js.Any,
    options: /* import warning: ImportType.apply Failed type conversion: infer O */ js.Any,
    callback: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback
  ): scala.Unit
}

object Anon_CallbackDel {
  @scala.inline
  def apply(
    del: (/* import warning: ImportType.apply Failed type conversion: infer K */ js.Any, /* import warning: ImportType.apply Failed type conversion: infer O */ js.Any, abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback) => scala.Unit
  ): Anon_CallbackDel = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction3(del))
  
    __obj.asInstanceOf[Anon_CallbackDel]
  }
}

