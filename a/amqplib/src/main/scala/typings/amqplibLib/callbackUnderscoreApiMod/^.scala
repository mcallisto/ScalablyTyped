package typings
package amqplibLib.callbackUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amqplib/callback_api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(callback: js.Function2[/* err */ js.Any, /* connection */ Connection, scala.Unit]): scala.Unit = js.native
  def connect(
    url: amqplibLib.propertiesMod.OptionsNs.Connect,
    callback: js.Function2[/* err */ js.Any, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  def connect(
    url: amqplibLib.propertiesMod.OptionsNs.Connect,
    socketOptions: js.Any,
    callback: js.Function2[/* err */ js.Any, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  def connect(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  def connect(
    url: java.lang.String,
    socketOptions: js.Any,
    callback: js.Function2[/* err */ js.Any, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
}

