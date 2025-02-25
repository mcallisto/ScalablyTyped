package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactListOtherAppWriteAccess extends js.Object

/** Specifies the level of contact write access granted to other apps. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactListOtherAppWriteAccess")
@js.native
object ContactListOtherAppWriteAccess extends js.Object {
  /** No write access is granted. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListOtherAppWriteAccess
  
  /** Other apps can only write system contacts. */
  @js.native
  sealed trait systemOnly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListOtherAppWriteAccess
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val systemOnly: systemOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListOtherAppWriteAccess with scala.Double
  ] = js.native
}

