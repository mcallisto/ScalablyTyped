package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactAnnotationStoreAccessType extends js.Object

/** Specifies if the app can read and write all annotations or only those belonging to the app itself. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotationStoreAccessType")
@js.native
object ContactAnnotationStoreAccessType extends js.Object {
  /** All contact annotations. */
  @js.native
  sealed trait allAnnotationsReadWrite
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationStoreAccessType
  
  /** Only local app contact annotations. */
  @js.native
  sealed trait appAnnotationsReadWrite
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationStoreAccessType
  
  /* 1 */ val allAnnotationsReadWrite: allAnnotationsReadWrite with scala.Double = js.native
  /* 0 */ val appAnnotationsReadWrite: appAnnotationsReadWrite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAnnotationStoreAccessType with scala.Double
  ] = js.native
}

