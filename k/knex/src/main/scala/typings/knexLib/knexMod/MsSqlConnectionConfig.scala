package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Config object for mssql: see https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/mssql/index.d.ts
trait MsSqlConnectionConfig extends js.Object {
  var connectionTimeout: js.UndefOr[scala.Double] = js.undefined
  var database: java.lang.String
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var driver: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[knexLib.Anon_AbortTransactionOnError] = js.undefined
  var parseJSON: js.UndefOr[scala.Boolean] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var pool: js.UndefOr[knexLib.Anon_AcquireTimeoutMillis] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var requestTimeout: js.UndefOr[scala.Double] = js.undefined
  var server: java.lang.String
  var stream: js.UndefOr[scala.Boolean] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object MsSqlConnectionConfig {
  @scala.inline
  def apply(
    database: java.lang.String,
    server: java.lang.String,
    connectionTimeout: scala.Int | scala.Double = null,
    domain: java.lang.String = null,
    driver: java.lang.String = null,
    options: knexLib.Anon_AbortTransactionOnError = null,
    parseJSON: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    pool: knexLib.Anon_AcquireTimeoutMillis = null,
    port: scala.Int | scala.Double = null,
    requestTimeout: scala.Int | scala.Double = null,
    stream: js.UndefOr[scala.Boolean] = js.undefined,
    user: java.lang.String = null
  ): MsSqlConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database, server = server)
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (driver != null) __obj.updateDynamic("driver")(driver)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(parseJSON)) __obj.updateDynamic("parseJSON")(parseJSON)
    if (password != null) __obj.updateDynamic("password")(password)
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[MsSqlConnectionConfig]
  }
}

