package typings
package atKeyvRedisLib.atKeyvRedisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends redisLib.redisMod.ClientOpts {
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    auth_pass: java.lang.String = null,
    connect_timeout: scala.Int | scala.Double = null,
    db: java.lang.String | scala.Double = null,
    detect_buffers: js.UndefOr[scala.Boolean] = js.undefined,
    enable_offline_queue: js.UndefOr[scala.Boolean] = js.undefined,
    family: java.lang.String = null,
    host: java.lang.String = null,
    max_attempts: scala.Int | scala.Double = null,
    no_ready_check: js.UndefOr[scala.Boolean] = js.undefined,
    parser: java.lang.String = null,
    password: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    rename_commands: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    retry_max_delay: scala.Int | scala.Double = null,
    retry_strategy: redisLib.redisMod.RetryStrategy = null,
    retry_unfulfilled_commands: js.UndefOr[scala.Boolean] = js.undefined,
    return_buffers: js.UndefOr[scala.Boolean] = js.undefined,
    socket_initialdelay: scala.Int | scala.Double = null,
    socket_keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    string_numbers: js.UndefOr[scala.Boolean] = js.undefined,
    tls: js.Any = null,
    uri: java.lang.String = null,
    url: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (auth_pass != null) __obj.updateDynamic("auth_pass")(auth_pass)
    if (connect_timeout != null) __obj.updateDynamic("connect_timeout")(connect_timeout.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (!js.isUndefined(detect_buffers)) __obj.updateDynamic("detect_buffers")(detect_buffers)
    if (!js.isUndefined(enable_offline_queue)) __obj.updateDynamic("enable_offline_queue")(enable_offline_queue)
    if (family != null) __obj.updateDynamic("family")(family)
    if (host != null) __obj.updateDynamic("host")(host)
    if (max_attempts != null) __obj.updateDynamic("max_attempts")(max_attempts.asInstanceOf[js.Any])
    if (!js.isUndefined(no_ready_check)) __obj.updateDynamic("no_ready_check")(no_ready_check)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (password != null) __obj.updateDynamic("password")(password)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (rename_commands != null) __obj.updateDynamic("rename_commands")(rename_commands)
    if (retry_max_delay != null) __obj.updateDynamic("retry_max_delay")(retry_max_delay.asInstanceOf[js.Any])
    if (retry_strategy != null) __obj.updateDynamic("retry_strategy")(retry_strategy)
    if (!js.isUndefined(retry_unfulfilled_commands)) __obj.updateDynamic("retry_unfulfilled_commands")(retry_unfulfilled_commands)
    if (!js.isUndefined(return_buffers)) __obj.updateDynamic("return_buffers")(return_buffers)
    if (socket_initialdelay != null) __obj.updateDynamic("socket_initialdelay")(socket_initialdelay.asInstanceOf[js.Any])
    if (!js.isUndefined(socket_keepalive)) __obj.updateDynamic("socket_keepalive")(socket_keepalive)
    if (!js.isUndefined(string_numbers)) __obj.updateDynamic("string_numbers")(string_numbers)
    if (tls != null) __obj.updateDynamic("tls")(tls)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Options]
  }
}

