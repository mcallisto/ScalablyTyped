package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WalletItemAppAssociation extends js.Object

/** Defines values used by the GetAppStatusForItem method indicating if an app is installed for the specified WalletItem . */
@JSGlobal("Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation")
@js.native
object WalletItemAppAssociation extends js.Object {
  /** The app for the wallet item is installed on this device. */
  @js.native
  sealed trait appInstalled
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.SystemNs.WalletItemAppAssociation
  
  /** An app exists for the wallet item, but it is not installed on the device. */
  @js.native
  sealed trait appNotInstalled
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.SystemNs.WalletItemAppAssociation
  
  /** There is no app associated with the wallet item. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.SystemNs.WalletItemAppAssociation
  
  /* 1 */ val appInstalled: appInstalled with scala.Double = js.native
  /* 2 */ val appNotInstalled: appNotInstalled with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs.SystemNs.WalletItemAppAssociation with scala.Double
  ] = js.native
}

