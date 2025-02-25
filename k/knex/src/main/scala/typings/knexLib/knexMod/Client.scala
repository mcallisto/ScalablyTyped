package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Clients
//
@JSImport("knex", "Client")
@js.native
class Client protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(config: Config) = this()
  var config: Config = js.native
  var connectionSettings: js.Object = js.native
  var dialect: java.lang.String = js.native
  var driverName: java.lang.String = js.native
  def acquireRawConnection(): js.Promise[_] = js.native
  def destroyRawConnection(connection: js.Any): js.Promise[scala.Unit] = js.native
  def validateConnection(connection: js.Any): js.Promise[scala.Boolean] = js.native
}

