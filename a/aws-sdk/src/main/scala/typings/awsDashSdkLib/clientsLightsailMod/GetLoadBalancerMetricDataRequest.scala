package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerMetricDataRequest extends js.Object {
  /**
    * The end time of the period.
    */
  var endTime: timestamp
  /**
    * The name of the load balancer.
    */
  var loadBalancerName: ResourceName
  /**
    * The metric about which you want to return information. Valid values are listed below, along with the most useful statistics to include in your request.     ClientTLSNegotiationErrorCount  - The number of TLS connections initiated by the client that did not establish a session with the load balancer. Possible causes include a mismatch of ciphers or protocols.  Statistics: The most useful statistic is Sum.     HealthyHostCount  - The number of target instances that are considered healthy.  Statistics: The most useful statistic are Average, Minimum, and Maximum.     UnhealthyHostCount  - The number of target instances that are considered unhealthy.  Statistics: The most useful statistic are Average, Minimum, and Maximum.     HTTPCode_LB_4XX_Count  - The number of HTTP 4XX client error codes that originate from the load balancer. Client errors are generated when requests are malformed or incomplete. These requests have not been received by the target instance. This count does not include any response codes generated by the target instances.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_LB_5XX_Count  - The number of HTTP 5XX server error codes that originate from the load balancer. This count does not include any response codes generated by the target instances.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_Instance_2XX_Count  - The number of HTTP response codes generated by the target instances. This does not include any response codes generated by the load balancer.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_Instance_3XX_Count  - The number of HTTP response codes generated by the target instances. This does not include any response codes generated by the load balancer.   Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_Instance_4XX_Count  - The number of HTTP response codes generated by the target instances. This does not include any response codes generated by the load balancer.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     HTTPCode_Instance_5XX_Count  - The number of HTTP response codes generated by the target instances. This does not include any response codes generated by the load balancer.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.     InstanceResponseTime  - The time elapsed, in seconds, after the request leaves the load balancer until a response from the target instance is received.  Statistics: The most useful statistic is Average.     RejectedConnectionCount  - The number of connections that were rejected because the load balancer had reached its maximum number of connections.  Statistics: The most useful statistic is Sum.     RequestCount  - The number of requests processed over IPv4. This count includes only the requests with a response generated by a target instance of the load balancer.  Statistics: The most useful statistic is Sum. Note that Minimum, Maximum, and Average all return 1.  
    */
  var metricName: LoadBalancerMetricName
  /**
    * The granularity, in seconds, of the returned data points.
    */
  var period: MetricPeriod
  /**
    * The start time of the period.
    */
  var startTime: timestamp
  /**
    * An array of statistics that you want to request metrics for. Valid values are listed below.     SampleCount  - The count (number) of data points used for the statistical calculation.     Average  - The value of Sum / SampleCount during the specified period. By comparing this statistic with the Minimum and Maximum, you can determine the full scope of a metric and how close the average use is to the Minimum and Maximum. This comparison helps you to know when to increase or decrease your resources as needed.     Sum  - All values submitted for the matching metric added together. This statistic can be useful for determining the total volume of a metric.     Minimum  - The lowest value observed during the specified period. You can use this value to determine low volumes of activity for your application.     Maximum  - The highest value observed during the specified period. You can use this value to determine high volumes of activity for your application.  
    */
  var statistics: MetricStatisticList
  /**
    * The unit for the time period request. Valid values are listed below.
    */
  var unit: MetricUnit
}

object GetLoadBalancerMetricDataRequest {
  @scala.inline
  def apply(
    endTime: timestamp,
    loadBalancerName: ResourceName,
    metricName: LoadBalancerMetricName,
    period: MetricPeriod,
    startTime: timestamp,
    statistics: MetricStatisticList,
    unit: MetricUnit
  ): GetLoadBalancerMetricDataRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime, loadBalancerName = loadBalancerName, metricName = metricName.asInstanceOf[js.Any], period = period, startTime = startTime, statistics = statistics, unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLoadBalancerMetricDataRequest]
  }
}

