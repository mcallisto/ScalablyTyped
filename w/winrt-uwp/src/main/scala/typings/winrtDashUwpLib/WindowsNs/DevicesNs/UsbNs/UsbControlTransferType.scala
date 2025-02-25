package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UsbControlTransferType extends js.Object

/** Defines constants that indicate the type of USB control transfer: standard, class, or vendor. */
@JSGlobal("Windows.Devices.Usb.UsbControlTransferType")
@js.native
object UsbControlTransferType extends js.Object {
  /** Indicates a class-specific USB control request described by a specific device class specification. */
  @js.native
  sealed trait `class`
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbControlTransferType
  
  /** Indicates a standard USB control request that the app can send to obtain information about the device, its configurations, interfaces, and endpoints. The standard requests are described in section 9.4 of the Universal Serial Bus (USB) specification (www.usb.org). */
  @js.native
  sealed trait standard
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbControlTransferType
  
  /** Indicates a vendor-specified USB control request and depends on the requests supported by the device. */
  @js.native
  sealed trait vendor
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbControlTransferType
  
  /* 1 */ val `class`: `class` with scala.Double = js.native
  /* 0 */ val standard: standard with scala.Double = js.native
  /* 2 */ val vendor: vendor with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbControlTransferType with scala.Double
  ] = js.native
}

