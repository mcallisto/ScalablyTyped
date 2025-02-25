package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// union combinator
//
@js.native
trait Union[T] extends Type[T] {
  @JSName("meta")
  var meta_Union: tcombLib.Anon_IdentityKindNameTypesArray[T] = js.native
  @JSName("update")
  var update_Original: Update[T] = js.native
  def dispatch(x: js.Any): Constructor[T] = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

