package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListNotificationsForRepoResponseItemSubject extends js.Object {
  var latest_comment_url: java.lang.String
  var title: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object ActivityListNotificationsForRepoResponseItemSubject {
  @scala.inline
  def apply(
    latest_comment_url: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): ActivityListNotificationsForRepoResponseItemSubject = {
    val __obj = js.Dynamic.literal(latest_comment_url = latest_comment_url, title = title, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivityListNotificationsForRepoResponseItemSubject]
  }
}

