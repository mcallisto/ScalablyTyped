package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagListMessage extends js.Object {
  /**
    * A list of cost allocation tags as key-value pairs.
    */
  var TagList: js.UndefOr[TagList] = js.undefined
}

object TagListMessage {
  @scala.inline
  def apply(TagList: TagList = null): TagListMessage = {
    val __obj = js.Dynamic.literal()
    if (TagList != null) __obj.updateDynamic("TagList")(TagList)
    __obj.asInstanceOf[TagListMessage]
  }
}

