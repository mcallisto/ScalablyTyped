package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackFiles extends js.Object {
  def apply(files: org.scalablytyped.runtime.StringDictionary[webgmeLib.BlobsNs.ObjectBlob]): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash] | java.lang.String] = js.native
  def apply(
    files: org.scalablytyped.runtime.StringDictionary[webgmeLib.BlobsNs.ObjectBlob],
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]
  ): scala.Unit = js.native
}

