package typings
package atGoogleDashCloudPubsubLib.buildSrcPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestConfig extends GetClientConfig {
  var gaxOpts: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any
  ] = js.undefined
  var method: java.lang.String
  var reqOpts: js.UndefOr[js.Object] = js.undefined
}

object RequestConfig {
  @scala.inline
  def apply(
    client: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.PublisherClient | atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.SubscriberClient,
    method: java.lang.String,
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any = null,
    reqOpts: js.Object = null
  ): RequestConfig = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], method = method)
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts)
    if (reqOpts != null) __obj.updateDynamic("reqOpts")(reqOpts)
    __obj.asInstanceOf[RequestConfig]
  }
}

