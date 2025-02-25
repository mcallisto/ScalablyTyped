package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockDeviceMapping extends js.Object {
  /**
    * The device name exposed to the EC2 instance (for example, /dev/sdh or xvdh). For more information, see Device Naming on Linux Instances in the Amazon EC2 User Guide for Linux Instances.
    */
  var DeviceName: XmlStringMaxLen255
  /**
    * The information about the Amazon EBS volume.
    */
  var Ebs: js.UndefOr[Ebs] = js.undefined
  /**
    * Suppresses a device mapping. If this parameter is true for the root device, the instance might fail the EC2 health check. In that case, Amazon EC2 Auto Scaling launches a replacement instance.
    */
  var NoDevice: js.UndefOr[NoDevice] = js.undefined
  /**
    * The name of the virtual device (for example, ephemeral0).
    */
  var VirtualName: js.UndefOr[XmlStringMaxLen255] = js.undefined
}

object BlockDeviceMapping {
  @scala.inline
  def apply(
    DeviceName: XmlStringMaxLen255,
    Ebs: Ebs = null,
    NoDevice: js.UndefOr[NoDevice] = js.undefined,
    VirtualName: XmlStringMaxLen255 = null
  ): BlockDeviceMapping = {
    val __obj = js.Dynamic.literal(DeviceName = DeviceName)
    if (Ebs != null) __obj.updateDynamic("Ebs")(Ebs)
    if (!js.isUndefined(NoDevice)) __obj.updateDynamic("NoDevice")(NoDevice)
    if (VirtualName != null) __obj.updateDynamic("VirtualName")(VirtualName)
    __obj.asInstanceOf[BlockDeviceMapping]
  }
}

