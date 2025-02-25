package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackCommitHashTagNameErrorOnlyCallback extends js.Object {
  def apply(tagName: java.lang.String, commitHash: webgmeLib.GmeStorageNs.CommitHash): js.Promise[webgmeLib.GmeStorageNs.ErrorOnlyCallback] = js.native
  def apply(
    tagName: java.lang.String,
    commitHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeStorageNs.ErrorOnlyCallback
  ): scala.Unit = js.native
}

