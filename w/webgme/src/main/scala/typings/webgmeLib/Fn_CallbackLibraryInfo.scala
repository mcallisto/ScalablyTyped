package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackLibraryInfo extends js.Object {
  def apply(
    node: webgmeLib.CoreNs.Node,
    name: webgmeLib.GmeCommonNs.Name,
    libraryRootHash: java.lang.String,
    libraryInfo: webgmeLib.GmeClassesNs.LibraryInfo
  ): js.Promise[webgmeLib.CoreNs.DataObject] = js.native
  def apply(
    node: webgmeLib.CoreNs.Node,
    name: webgmeLib.GmeCommonNs.Name,
    libraryRootHash: java.lang.String,
    libraryInfo: webgmeLib.GmeClassesNs.LibraryInfo,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
}

