package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackKey extends js.Object {
  def apply(key: java.lang.String): js.Promise[webgmeLib.GmeStorageNs.CommitObject] = js.native
  /** Hash of object to load. */
  def apply(
    key: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitObject]
  ): scala.Unit = js.native
}

