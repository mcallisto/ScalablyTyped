package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataDescriptor extends js.Object {
  def apply(metadataDescriptor: webgmeLib.BlobsNs.BlobMetadataDescriptor): js.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  def apply(
    metadataDescriptor: webgmeLib.BlobsNs.BlobMetadataDescriptor,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): scala.Unit = js.native
}

