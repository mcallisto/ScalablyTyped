package typings
package twilioDashSyncLib.twilioDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @alias Document
  * @classdesc Represents a Sync Document, the contents of which is a single JSON object.
  * Use the {@link Client#document} method to obtain a reference to a Sync Document.
  * @property {String} sid The immutable identifier of this document, assigned by the system.
  * @property {String} [uniqueName=null] An optional immutable identifier that may be assigned by the programmer
  * to this document during creation. Globally unique among other Documents.
  * @property {Date} dateUpdated Date when the Document was last updated.
  * @property {Object} value The contents of this document.
  *
  * @fires Document#removed
  * @fires Document#updated
  */
@JSImport("twilio-sync", "SyncDocument")
@js.native
class SyncDocument protected ()
  extends twilioDashSyncLib.libSyncdocumentMod.SyncDocument {
  def this(syncDocumentImpl: twilioDashSyncLib.libSyncdocumentMod.SyncDocumentImpl) = this()
}

/* static members */
@JSImport("twilio-sync", "SyncDocument")
@js.native
object SyncDocument extends js.Object {
  val `type`: java.lang.String = js.native
}

