package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServicePort contains information on service's port.
  */
trait ServicePort extends js.Object {
  /**
    * The name of this port within the service. This must be a DNS_LABEL. All ports within a
    * ServiceSpec must have unique names. This maps to the 'Name' field in EndpointPort objects.
    * Optional if only one ServicePort is defined on this service.
    */
  val name: java.lang.String
  /**
    * The port on each node on which this service is exposed when type=NodePort or LoadBalancer.
    * Usually assigned by the system. If specified, it will be allocated to the service if unused
    * or else creation of the service will fail. Default is to auto-allocate a port if the
    * ServiceType of this Service requires one. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
    */
  val nodePort: scala.Double
  /**
    * The port that will be exposed by this service.
    */
  val port: scala.Double
  /**
    * The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP.
    */
  val protocol: java.lang.String
  /**
    * Number or name of the port to access on the pods targeted by the service. Number must be in
    * the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked
    * up as a named port in the target Pod's container ports. If this is not specified, the value
    * of the 'port' field is used (an identity map). This field is ignored for services with
    * clusterIP=None, and should be omitted or set equal to the 'port' field. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
    */
  val targetPort: scala.Double | java.lang.String
}

object ServicePort {
  @scala.inline
  def apply(
    name: java.lang.String,
    nodePort: scala.Double,
    port: scala.Double,
    protocol: java.lang.String,
    targetPort: scala.Double | java.lang.String
  ): ServicePort = {
    val __obj = js.Dynamic.literal(name = name, nodePort = nodePort, port = port, protocol = protocol, targetPort = targetPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServicePort]
  }
}

