package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectOptions extends js.Object {
  var enc: js.UndefOr[js.Any] = js.undefined
}

object PutObjectOptions {
  @scala.inline
  def apply(enc: js.Any = null): PutObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (enc != null) __obj.updateDynamic("enc")(enc)
    __obj.asInstanceOf[PutObjectOptions]
  }
}

