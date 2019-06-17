package typings
package atGoogleDashCloudPubsubLib.buildSrcPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishOptions extends js.Object {
  var batching: js.UndefOr[BatchPublishOptions] = js.undefined
  var gaxOpts: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any
  ] = js.undefined
}

object PublishOptions {
  @scala.inline
  def apply(
    batching: BatchPublishOptions = null,
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any = null
  ): PublishOptions = {
    val __obj = js.Dynamic.literal()
    if (batching != null) __obj.updateDynamic("batching")(batching)
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts)
    __obj.asInstanceOf[PublishOptions]
  }
}

