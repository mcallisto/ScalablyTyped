package typings
package connectDashMongoLib.connectDashMongoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongooseConnectionOptions extends DefaultOptions {
  var mongooseConnection: mongooseLib.mongooseMod.Connection
}

object MongooseConnectionOptions {
  @scala.inline
  def apply(
    mongooseConnection: mongooseLib.mongooseMod.Connection,
    autoReconnect: js.UndefOr[scala.Boolean] = js.undefined,
    autoRemove: java.lang.String = null,
    autoRemoveInterval: scala.Int | scala.Double = null,
    collection: java.lang.String = null,
    hash: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    port: java.lang.String = null,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    stringify: js.UndefOr[scala.Boolean] = js.undefined,
    touchAfter: scala.Int | scala.Double = null,
    ttl: scala.Int | scala.Double = null,
    w: scala.Int | scala.Double = null
  ): MongooseConnectionOptions = {
    val __obj = js.Dynamic.literal(mongooseConnection = mongooseConnection)
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect)
    if (autoRemove != null) __obj.updateDynamic("autoRemove")(autoRemove)
    if (autoRemoveInterval != null) __obj.updateDynamic("autoRemoveInterval")(autoRemoveInterval.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection)
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify)
    if (touchAfter != null) __obj.updateDynamic("touchAfter")(touchAfter.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongooseConnectionOptions]
  }
}

