package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetHookParams extends js.Object {
  var hook_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposGetHookParams {
  @scala.inline
  def apply(hook_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposGetHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetHookParams]
  }
}

