package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPSetDescriptor extends js.Object {
  /**
    * Specify IPV4 or IPV6.
    */
  var Type: IPSetDescriptorType
  /**
    * Specify an IPv4 address by using CIDR notation. For example:   To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify 192.0.2.44/32.   To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify 192.0.2.0/24.   For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing. Specify an IPv6 address by using CIDR notation. For example:   To configure AWS WAF to allow, block, or count requests that originated from the IP address 1111:0000:0000:0000:0000:0000:0000:0111, specify 1111:0000:0000:0000:0000:0000:0000:0111/128.   To configure AWS WAF to allow, block, or count requests that originated from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify 1111:0000:0000:0000:0000:0000:0000:0000/64.  
    */
  var Value: IPSetDescriptorValue
}

object IPSetDescriptor {
  @scala.inline
  def apply(Type: IPSetDescriptorType, Value: IPSetDescriptorValue): IPSetDescriptor = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value)
  
    __obj.asInstanceOf[IPSetDescriptor]
  }
}

