package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "ConfigDescriptor")
@js.native
class ConfigDescriptor () extends js.Object {
  /** Identifier value for this configuration. */
  var bConfigurationValue: scala.Double = js.native
  /** Descriptor type. */
  var bDescriptorType: scala.Double = js.native
  /** Size of this descriptor (in bytes) */
  var bLength: scala.Double = js.native
  /** Maximum power consumption of the USB device from this bus in this configuration when the device is fully operation. */
  var bMaxPower: scala.Double = js.native
  /** Number of interfaces supported by this configuration. */
  var bNumInterfaces: scala.Double = js.native
  /** Configuration characteristics. */
  var bmAttributes: scala.Double = js.native
  /** Extra descriptors. */
  var extra: nodeLib.Buffer = js.native
  /** Index of string descriptor describing this configuration. */
  var iConfiguration: scala.Double = js.native
  /** Array of interfaces supported by this configuration. */
  var interfaces: js.Array[js.Array[InterfaceDescriptor]] = js.native
  /** Total length of data returned for this configuration. */
  var wTotalLength: scala.Double = js.native
}

