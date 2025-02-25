package typings
package dynamodbLib.modelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dynamodb/Model", "Item")
@js.native
class Item protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(attrs: js.Object, table: js.Any) = this()
  def destroy(options: js.Any): js.Promise[_] = js.native
  def destroy(options: js.Any, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def get(name: java.lang.String): js.Any = js.native
  def save(): js.Promise[_] = js.native
  def save(callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
  def set(params: js.Any): this.type = js.native
  def toJSON(): js.Object = js.native
  def update(options: js.Any): js.Promise[_] = js.native
  def update(options: js.Any, callback: dynamodbLib.callbackMod.Callback): scala.Unit = js.native
}

