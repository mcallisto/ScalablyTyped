package typings
package atGoogleDashCloudPubsubLib.buildSrcPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ClientConfig extends js.Object {
  var apiEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var servicePath: js.UndefOr[java.lang.String] = js.undefined
  var sslCreds: js.UndefOr[grpcLib.grpcMod.ChannelCredentials] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(
    apiEndpoint: java.lang.String = null,
    port: java.lang.String | scala.Double = null,
    servicePath: java.lang.String = null,
    sslCreds: grpcLib.grpcMod.ChannelCredentials = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal()
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath)
    if (sslCreds != null) __obj.updateDynamic("sslCreds")(sslCreds)
    __obj.asInstanceOf[ClientConfig]
  }
}

