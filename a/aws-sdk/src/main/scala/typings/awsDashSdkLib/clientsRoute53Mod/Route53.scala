package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route53
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Route53: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Associates an Amazon VPC with a private hosted zone.   To perform the association, the VPC and the private hosted zone must already exist. You can't convert a public hosted zone into a private hosted zone.   If you want to associate a VPC that was created by using one AWS account with a private hosted zone that was created by using a different account, the AWS account that created the private hosted zone must first submit a CreateVPCAssociationAuthorization request. Then the account that created the VPC must submit an AssociateVPCWithHostedZone request. 
    */
  def associateVPCWithHostedZone(): awsDashSdkLib.libRequestMod.Request[AssociateVPCWithHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateVPCWithHostedZone(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateVPCWithHostedZoneResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateVPCWithHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates an Amazon VPC with a private hosted zone.   To perform the association, the VPC and the private hosted zone must already exist. You can't convert a public hosted zone into a private hosted zone.   If you want to associate a VPC that was created by using one AWS account with a private hosted zone that was created by using a different account, the AWS account that created the private hosted zone must first submit a CreateVPCAssociationAuthorization request. Then the account that created the VPC must submit an AssociateVPCWithHostedZone request. 
    */
  def associateVPCWithHostedZone(params: AssociateVPCWithHostedZoneRequest): awsDashSdkLib.libRequestMod.Request[AssociateVPCWithHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateVPCWithHostedZone(
    params: AssociateVPCWithHostedZoneRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateVPCWithHostedZoneResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateVPCWithHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates, changes, or deletes a resource record set, which contains authoritative DNS information for a specified domain name or subdomain name. For example, you can use ChangeResourceRecordSets to create a resource record set that routes traffic for test.example.com to a web server that has an IP address of 192.0.2.44.  Change Batches and Transactional Changes  The request body must include a document with a ChangeResourceRecordSetsRequest element. The request body contains a list of change items, known as a change batch. Change batches are considered transactional changes. When using the Amazon Route 53 API to change resource record sets, Route 53 either makes all or none of the changes in a change batch request. This ensures that Route 53 never partially implements the intended changes to the resource record sets in a hosted zone.  For example, a change batch request that deletes the CNAME record for www.example.com and creates an alias resource record set for www.example.com. Route 53 deletes the first resource record set and creates the second resource record set in a single operation. If either the DELETE or the CREATE action fails, then both changes (plus any other changes in the batch) fail, and the original CNAME record continues to exist.  Due to the nature of transactional changes, you can't delete the same resource record set more than once in a single change batch. If you attempt to delete the same change batch more than once, Route 53 returns an InvalidChangeBatch error.   Traffic Flow  To create resource record sets for complex routing configurations, use either the traffic flow visual editor in the Route 53 console or the API actions for traffic policies and traffic policy instances. Save the configuration as a traffic policy, then associate the traffic policy with one or more domain names (such as example.com) or subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones. You can roll back the updates if the new configuration isn't performing as expected. For more information, see Using Traffic Flow to Route DNS Traffic in the Amazon Route 53 Developer Guide.  Create, Delete, and Upsert  Use ChangeResourceRecordsSetsRequest to perform the following actions:    CREATE: Creates a resource record set that has the specified values.    DELETE: Deletes an existing resource record set that has the specified values.    UPSERT: If a resource record set does not already exist, AWS creates it. If a resource set does exist, Route 53 updates it with the values in the request.     Syntaxes for Creating, Updating, and Deleting Resource Record Sets  The syntax for a request depends on the type of resource record set that you want to create, delete, or update, such as weighted, alias, or failover. The XML elements in your request must appear in the order listed in the syntax.  For an example for each type of resource record set, see "Examples." Don't refer to the syntax in the "Parameter Syntax" section, which includes all of the elements for every kind of resource record set that you can create, delete, or update by using ChangeResourceRecordSets.   Change Propagation to Route 53 DNS Servers  When you submit a ChangeResourceRecordSets request, Route 53 propagates your changes to all of the Route 53 authoritative DNS servers. While your changes are propagating, GetChange returns a status of PENDING. When propagation is complete, GetChange returns a status of INSYNC. Changes generally propagate to all Route 53 name servers within 60 seconds. For more information, see GetChange.  Limits on ChangeResourceRecordSets Requests  For information about the limits on a ChangeResourceRecordSets request, see Limits in the Amazon Route 53 Developer Guide.
    */
  def changeResourceRecordSets(): awsDashSdkLib.libRequestMod.Request[ChangeResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def changeResourceRecordSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ChangeResourceRecordSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ChangeResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates, changes, or deletes a resource record set, which contains authoritative DNS information for a specified domain name or subdomain name. For example, you can use ChangeResourceRecordSets to create a resource record set that routes traffic for test.example.com to a web server that has an IP address of 192.0.2.44.  Change Batches and Transactional Changes  The request body must include a document with a ChangeResourceRecordSetsRequest element. The request body contains a list of change items, known as a change batch. Change batches are considered transactional changes. When using the Amazon Route 53 API to change resource record sets, Route 53 either makes all or none of the changes in a change batch request. This ensures that Route 53 never partially implements the intended changes to the resource record sets in a hosted zone.  For example, a change batch request that deletes the CNAME record for www.example.com and creates an alias resource record set for www.example.com. Route 53 deletes the first resource record set and creates the second resource record set in a single operation. If either the DELETE or the CREATE action fails, then both changes (plus any other changes in the batch) fail, and the original CNAME record continues to exist.  Due to the nature of transactional changes, you can't delete the same resource record set more than once in a single change batch. If you attempt to delete the same change batch more than once, Route 53 returns an InvalidChangeBatch error.   Traffic Flow  To create resource record sets for complex routing configurations, use either the traffic flow visual editor in the Route 53 console or the API actions for traffic policies and traffic policy instances. Save the configuration as a traffic policy, then associate the traffic policy with one or more domain names (such as example.com) or subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones. You can roll back the updates if the new configuration isn't performing as expected. For more information, see Using Traffic Flow to Route DNS Traffic in the Amazon Route 53 Developer Guide.  Create, Delete, and Upsert  Use ChangeResourceRecordsSetsRequest to perform the following actions:    CREATE: Creates a resource record set that has the specified values.    DELETE: Deletes an existing resource record set that has the specified values.    UPSERT: If a resource record set does not already exist, AWS creates it. If a resource set does exist, Route 53 updates it with the values in the request.     Syntaxes for Creating, Updating, and Deleting Resource Record Sets  The syntax for a request depends on the type of resource record set that you want to create, delete, or update, such as weighted, alias, or failover. The XML elements in your request must appear in the order listed in the syntax.  For an example for each type of resource record set, see "Examples." Don't refer to the syntax in the "Parameter Syntax" section, which includes all of the elements for every kind of resource record set that you can create, delete, or update by using ChangeResourceRecordSets.   Change Propagation to Route 53 DNS Servers  When you submit a ChangeResourceRecordSets request, Route 53 propagates your changes to all of the Route 53 authoritative DNS servers. While your changes are propagating, GetChange returns a status of PENDING. When propagation is complete, GetChange returns a status of INSYNC. Changes generally propagate to all Route 53 name servers within 60 seconds. For more information, see GetChange.  Limits on ChangeResourceRecordSets Requests  For information about the limits on a ChangeResourceRecordSets request, see Limits in the Amazon Route 53 Developer Guide.
    */
  def changeResourceRecordSets(params: ChangeResourceRecordSetsRequest): awsDashSdkLib.libRequestMod.Request[ChangeResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def changeResourceRecordSets(
    params: ChangeResourceRecordSetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ChangeResourceRecordSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ChangeResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds, edits, or deletes tags for a health check or a hosted zone. For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  def changeTagsForResource(): awsDashSdkLib.libRequestMod.Request[ChangeTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def changeTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ChangeTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ChangeTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds, edits, or deletes tags for a health check or a hosted zone. For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  def changeTagsForResource(params: ChangeTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ChangeTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def changeTagsForResource(
    params: ChangeTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ChangeTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ChangeTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new health check. For information about adding health checks to resource record sets, see HealthCheckId in ChangeResourceRecordSets.   ELB Load Balancers  If you're registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you configure settings for an ELB health check, which performs a similar function to a Route 53 health check.  Private Hosted Zones  You can associate health checks with failover resource record sets in a private hosted zone. Note the following:   Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP address, you must assign a public IP address to the instance in the VPC.   You can configure a health checker to check the health of an external resource that the instance relies on, such as a database server.   You can create a CloudWatch metric, associate an alarm with the metric, and then create a health check that is based on the state of the alarm. For example, you might create a CloudWatch metric that checks the status of the Amazon EC2 StatusCheckFailed metric, add an alarm to the metric, and then create a health check that is based on the state of the alarm. For information about creating CloudWatch metrics and alarms by using the CloudWatch console, see the Amazon CloudWatch User Guide.  
    */
  def createHealthCheck(): awsDashSdkLib.libRequestMod.Request[CreateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHealthCheck(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHealthCheckResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new health check. For information about adding health checks to resource record sets, see HealthCheckId in ChangeResourceRecordSets.   ELB Load Balancers  If you're registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you configure settings for an ELB health check, which performs a similar function to a Route 53 health check.  Private Hosted Zones  You can associate health checks with failover resource record sets in a private hosted zone. Note the following:   Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP address, you must assign a public IP address to the instance in the VPC.   You can configure a health checker to check the health of an external resource that the instance relies on, such as a database server.   You can create a CloudWatch metric, associate an alarm with the metric, and then create a health check that is based on the state of the alarm. For example, you might create a CloudWatch metric that checks the status of the Amazon EC2 StatusCheckFailed metric, add an alarm to the metric, and then create a health check that is based on the state of the alarm. For information about creating CloudWatch metrics and alarms by using the CloudWatch console, see the Amazon CloudWatch User Guide.  
    */
  def createHealthCheck(params: CreateHealthCheckRequest): awsDashSdkLib.libRequestMod.Request[CreateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHealthCheck(
    params: CreateHealthCheckRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHealthCheckResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new public or private hosted zone. You create records in a public hosted zone to define how you want to route traffic on the internet for a domain, such as example.com, and its subdomains (apex.example.com, acme.example.com). You create records in a private hosted zone to define how you want to route traffic for a domain and its subdomains within one or more Amazon Virtual Private Clouds (Amazon VPCs).   You can't convert a public hosted zone to a private hosted zone or vice versa. Instead, you must create a new hosted zone with the same name and create new resource record sets.  For more information about charges for hosted zones, see Amazon Route 53 Pricing. Note the following:   You can't create a hosted zone for a top-level domain (TLD) such as .com.   For public hosted zones, Amazon Route 53 automatically creates a default SOA record and four NS records for the zone. For more information about SOA and NS records, see NS and SOA Records that Route 53 Creates for a Hosted Zone in the Amazon Route 53 Developer Guide. If you want to use the same name servers for multiple public hosted zones, you can optionally associate a reusable delegation set with the hosted zone. See the DelegationSetId element.   If your domain is registered with a registrar other than Route 53, you must update the name servers with your registrar to make Route 53 the DNS service for the domain. For more information, see Migrating DNS Service for an Existing Domain to Amazon Route 53 in the Amazon Route 53 Developer Guide.    When you submit a CreateHostedZone request, the initial status of the hosted zone is PENDING. For public hosted zones, this means that the NS and SOA records are not yet available on all Route 53 DNS servers. When the NS and SOA records are available, the status of the zone changes to INSYNC.
    */
  def createHostedZone(): awsDashSdkLib.libRequestMod.Request[CreateHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHostedZone(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHostedZoneResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new public or private hosted zone. You create records in a public hosted zone to define how you want to route traffic on the internet for a domain, such as example.com, and its subdomains (apex.example.com, acme.example.com). You create records in a private hosted zone to define how you want to route traffic for a domain and its subdomains within one or more Amazon Virtual Private Clouds (Amazon VPCs).   You can't convert a public hosted zone to a private hosted zone or vice versa. Instead, you must create a new hosted zone with the same name and create new resource record sets.  For more information about charges for hosted zones, see Amazon Route 53 Pricing. Note the following:   You can't create a hosted zone for a top-level domain (TLD) such as .com.   For public hosted zones, Amazon Route 53 automatically creates a default SOA record and four NS records for the zone. For more information about SOA and NS records, see NS and SOA Records that Route 53 Creates for a Hosted Zone in the Amazon Route 53 Developer Guide. If you want to use the same name servers for multiple public hosted zones, you can optionally associate a reusable delegation set with the hosted zone. See the DelegationSetId element.   If your domain is registered with a registrar other than Route 53, you must update the name servers with your registrar to make Route 53 the DNS service for the domain. For more information, see Migrating DNS Service for an Existing Domain to Amazon Route 53 in the Amazon Route 53 Developer Guide.    When you submit a CreateHostedZone request, the initial status of the hosted zone is PENDING. For public hosted zones, this means that the NS and SOA records are not yet available on all Route 53 DNS servers. When the NS and SOA records are available, the status of the zone changes to INSYNC.
    */
  def createHostedZone(params: CreateHostedZoneRequest): awsDashSdkLib.libRequestMod.Request[CreateHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHostedZone(
    params: CreateHostedZoneRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHostedZoneResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a configuration for DNS query logging. After you create a query logging configuration, Amazon Route 53 begins to publish log data to an Amazon CloudWatch Logs log group. DNS query logs contain information about the queries that Route 53 receives for a specified public hosted zone, such as the following:   Route 53 edge location that responded to the DNS query   Domain or subdomain that was requested   DNS record type, such as A or AAAA   DNS response code, such as NoError or ServFail     Log Group and Resource Policy  Before you create a query logging configuration, perform the following operations.  If you create a query logging configuration using the Route 53 console, Route 53 performs these operations automatically.    Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you create a query logging configuration. Note the following:   You must create the log group in the us-east-1 region.   You must use the same AWS account to create the log group and the hosted zone that you want to configure query logging for.   When you create log groups for query logging, we recommend that you use a consistent prefix, for example:  /aws/route53/hosted zone name   In the next step, you'll create a resource policy, which controls access to one or more log groups and the associated AWS resources, such as Route 53 hosted zones. There's a limit on the number of resource policies that you can create, so we recommend that you use a consistent prefix so you can use the same resource policy for all the log groups that you create for query logging.     Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs to create log streams and to send query logs to log streams. For the value of Resource, specify the ARN for the log group that you created in the previous step. To use the same resource policy for all the CloudWatch Logs log groups that you created for query logging configurations, replace the hosted zone name with *, for example:  arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *   You can't use the CloudWatch console to create or edit a resource policy. You must use the CloudWatch API, one of the AWS SDKs, or the AWS CLI.     Log Streams and Edge Locations  When Route 53 finishes creating the configuration for DNS query logging, it does the following:   Creates a log stream for an edge location the first time that the edge location responds to DNS queries for the specified hosted zone. That log stream is used to log all queries that Route 53 responds to for that edge location.   Begins to send query logs to the applicable log stream.   The name of each log stream is in the following format:   hosted zone ID/edge location code   The edge location code is a three-letter code and an arbitrarily assigned number, for example, DFW3. The three-letter code typically corresponds with the International Air Transport Association airport code for an airport near the edge location. (These abbreviations might change in the future.) For a list of edge locations, see "The Route 53 Global Network" on the Route 53 Product Details page.  Queries That Are Logged  Query logs contain only the queries that DNS resolvers forward to Route 53. If a DNS resolver has already cached the response to a query (such as the IP address for a load balancer for example.com), the resolver will continue to return the cached response. It doesn't forward another query to Route 53 until the TTL for the corresponding resource record set expires. Depending on how many DNS queries are submitted for a resource record set, and depending on the TTL for that resource record set, query logs might contain information about only one query out of every several thousand queries that are submitted to DNS. For more information about how DNS works, see Routing Internet Traffic to Your Website or Web Application in the Amazon Route 53 Developer Guide.  Log File Format  For a list of the values in each query log and the format of each value, see Logging DNS Queries in the Amazon Route 53 Developer Guide.  Pricing  For information about charges for query logs, see Amazon CloudWatch Pricing.  How to Stop Logging  If you want Route 53 to stop sending query logs to CloudWatch Logs, delete the query logging configuration. For more information, see DeleteQueryLoggingConfig.  
    */
  def createQueryLoggingConfig(): awsDashSdkLib.libRequestMod.Request[CreateQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createQueryLoggingConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateQueryLoggingConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a configuration for DNS query logging. After you create a query logging configuration, Amazon Route 53 begins to publish log data to an Amazon CloudWatch Logs log group. DNS query logs contain information about the queries that Route 53 receives for a specified public hosted zone, such as the following:   Route 53 edge location that responded to the DNS query   Domain or subdomain that was requested   DNS record type, such as A or AAAA   DNS response code, such as NoError or ServFail     Log Group and Resource Policy  Before you create a query logging configuration, perform the following operations.  If you create a query logging configuration using the Route 53 console, Route 53 performs these operations automatically.    Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you create a query logging configuration. Note the following:   You must create the log group in the us-east-1 region.   You must use the same AWS account to create the log group and the hosted zone that you want to configure query logging for.   When you create log groups for query logging, we recommend that you use a consistent prefix, for example:  /aws/route53/hosted zone name   In the next step, you'll create a resource policy, which controls access to one or more log groups and the associated AWS resources, such as Route 53 hosted zones. There's a limit on the number of resource policies that you can create, so we recommend that you use a consistent prefix so you can use the same resource policy for all the log groups that you create for query logging.     Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs to create log streams and to send query logs to log streams. For the value of Resource, specify the ARN for the log group that you created in the previous step. To use the same resource policy for all the CloudWatch Logs log groups that you created for query logging configurations, replace the hosted zone name with *, for example:  arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/ *   You can't use the CloudWatch console to create or edit a resource policy. You must use the CloudWatch API, one of the AWS SDKs, or the AWS CLI.     Log Streams and Edge Locations  When Route 53 finishes creating the configuration for DNS query logging, it does the following:   Creates a log stream for an edge location the first time that the edge location responds to DNS queries for the specified hosted zone. That log stream is used to log all queries that Route 53 responds to for that edge location.   Begins to send query logs to the applicable log stream.   The name of each log stream is in the following format:   hosted zone ID/edge location code   The edge location code is a three-letter code and an arbitrarily assigned number, for example, DFW3. The three-letter code typically corresponds with the International Air Transport Association airport code for an airport near the edge location. (These abbreviations might change in the future.) For a list of edge locations, see "The Route 53 Global Network" on the Route 53 Product Details page.  Queries That Are Logged  Query logs contain only the queries that DNS resolvers forward to Route 53. If a DNS resolver has already cached the response to a query (such as the IP address for a load balancer for example.com), the resolver will continue to return the cached response. It doesn't forward another query to Route 53 until the TTL for the corresponding resource record set expires. Depending on how many DNS queries are submitted for a resource record set, and depending on the TTL for that resource record set, query logs might contain information about only one query out of every several thousand queries that are submitted to DNS. For more information about how DNS works, see Routing Internet Traffic to Your Website or Web Application in the Amazon Route 53 Developer Guide.  Log File Format  For a list of the values in each query log and the format of each value, see Logging DNS Queries in the Amazon Route 53 Developer Guide.  Pricing  For information about charges for query logs, see Amazon CloudWatch Pricing.  How to Stop Logging  If you want Route 53 to stop sending query logs to CloudWatch Logs, delete the query logging configuration. For more information, see DeleteQueryLoggingConfig.  
    */
  def createQueryLoggingConfig(params: CreateQueryLoggingConfigRequest): awsDashSdkLib.libRequestMod.Request[CreateQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createQueryLoggingConfig(
    params: CreateQueryLoggingConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateQueryLoggingConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones. If a hosted zoned ID is specified, CreateReusableDelegationSet marks the delegation set associated with that zone as reusable.  You can't associate a reusable delegation set with a private hosted zone.  For information about using a reusable delegation set to configure white label name servers, see Configuring White Label Name Servers. The process for migrating existing hosted zones to use a reusable delegation set is comparable to the process for configuring white label name servers. You need to perform the following steps:   Create a reusable delegation set.   Recreate hosted zones, and reduce the TTL to 60 seconds or less.   Recreate resource record sets in the new hosted zones.   Change the registrar's name servers to use the name servers for the new hosted zones.   Monitor traffic for the website or application.   Change TTLs back to their original values.   If you want to migrate existing hosted zones to use a reusable delegation set, the existing hosted zones can't use any of the name servers that are assigned to the reusable delegation set. If one or more hosted zones do use one or more name servers that are assigned to the reusable delegation set, you can do one of the following:   For small numbers of hosted zones—up to a few hundred—it's relatively easy to create reusable delegation sets until you get one that has four name servers that don't overlap with any of the name servers in your hosted zones.   For larger numbers of hosted zones, the easiest solution is to use more than one reusable delegation set.   For larger numbers of hosted zones, you can also migrate hosted zones that have overlapping name servers to hosted zones that don't have overlapping name servers, then migrate the hosted zones again to use the reusable delegation set.  
    */
  def createReusableDelegationSet(): awsDashSdkLib.libRequestMod.Request[CreateReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createReusableDelegationSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateReusableDelegationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones. If a hosted zoned ID is specified, CreateReusableDelegationSet marks the delegation set associated with that zone as reusable.  You can't associate a reusable delegation set with a private hosted zone.  For information about using a reusable delegation set to configure white label name servers, see Configuring White Label Name Servers. The process for migrating existing hosted zones to use a reusable delegation set is comparable to the process for configuring white label name servers. You need to perform the following steps:   Create a reusable delegation set.   Recreate hosted zones, and reduce the TTL to 60 seconds or less.   Recreate resource record sets in the new hosted zones.   Change the registrar's name servers to use the name servers for the new hosted zones.   Monitor traffic for the website or application.   Change TTLs back to their original values.   If you want to migrate existing hosted zones to use a reusable delegation set, the existing hosted zones can't use any of the name servers that are assigned to the reusable delegation set. If one or more hosted zones do use one or more name servers that are assigned to the reusable delegation set, you can do one of the following:   For small numbers of hosted zones—up to a few hundred—it's relatively easy to create reusable delegation sets until you get one that has four name servers that don't overlap with any of the name servers in your hosted zones.   For larger numbers of hosted zones, the easiest solution is to use more than one reusable delegation set.   For larger numbers of hosted zones, you can also migrate hosted zones that have overlapping name servers to hosted zones that don't have overlapping name servers, then migrate the hosted zones again to use the reusable delegation set.  
    */
  def createReusableDelegationSet(params: CreateReusableDelegationSetRequest): awsDashSdkLib.libRequestMod.Request[CreateReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createReusableDelegationSet(
    params: CreateReusableDelegationSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateReusableDelegationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as example.com) or one subdomain name (such as www.example.com).
    */
  def createTrafficPolicy(): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTrafficPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTrafficPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as example.com) or one subdomain name (such as www.example.com).
    */
  def createTrafficPolicy(params: CreateTrafficPolicyRequest): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTrafficPolicy(
    params: CreateTrafficPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTrafficPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates resource record sets in a specified hosted zone based on the settings in a specified traffic policy version. In addition, CreateTrafficPolicyInstance associates the resource record sets with a specified domain name (such as example.com) or subdomain name (such as www.example.com). Amazon Route 53 responds to DNS queries for the domain or subdomain name by using the resource record sets that CreateTrafficPolicyInstance created.
    */
  def createTrafficPolicyInstance(): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTrafficPolicyInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTrafficPolicyInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates resource record sets in a specified hosted zone based on the settings in a specified traffic policy version. In addition, CreateTrafficPolicyInstance associates the resource record sets with a specified domain name (such as example.com) or subdomain name (such as www.example.com). Amazon Route 53 responds to DNS queries for the domain or subdomain name by using the resource record sets that CreateTrafficPolicyInstance created.
    */
  def createTrafficPolicyInstance(params: CreateTrafficPolicyInstanceRequest): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTrafficPolicyInstance(
    params: CreateTrafficPolicyInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTrafficPolicyInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new version of an existing traffic policy. When you create a new version of a traffic policy, you specify the ID of the traffic policy that you want to update and a JSON-formatted document that describes the new version. You use traffic policies to create multiple DNS resource record sets for one domain name (such as example.com) or one subdomain name (such as www.example.com). You can create a maximum of 1000 versions of a traffic policy. If you reach the limit and need to create another version, you'll need to start a new traffic policy.
    */
  def createTrafficPolicyVersion(): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTrafficPolicyVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTrafficPolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new version of an existing traffic policy. When you create a new version of a traffic policy, you specify the ID of the traffic policy that you want to update and a JSON-formatted document that describes the new version. You use traffic policies to create multiple DNS resource record sets for one domain name (such as example.com) or one subdomain name (such as www.example.com). You can create a maximum of 1000 versions of a traffic policy. If you reach the limit and need to create another version, you'll need to start a new traffic policy.
    */
  def createTrafficPolicyVersion(params: CreateTrafficPolicyVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTrafficPolicyVersion(
    params: CreateTrafficPolicyVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTrafficPolicyVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTrafficPolicyVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Authorizes the AWS account that created a specified VPC to submit an AssociateVPCWithHostedZone request to associate the VPC with a specified hosted zone that was created by a different account. To submit a CreateVPCAssociationAuthorization request, you must use the account that created the hosted zone. After you authorize the association, use the account that created the VPC to submit an AssociateVPCWithHostedZone request.  If you want to associate multiple VPCs that you created by using one account with a hosted zone that you created by using a different account, you must submit one authorization request for each VPC. 
    */
  def createVPCAssociationAuthorization(): awsDashSdkLib.libRequestMod.Request[CreateVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createVPCAssociationAuthorization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateVPCAssociationAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Authorizes the AWS account that created a specified VPC to submit an AssociateVPCWithHostedZone request to associate the VPC with a specified hosted zone that was created by a different account. To submit a CreateVPCAssociationAuthorization request, you must use the account that created the hosted zone. After you authorize the association, use the account that created the VPC to submit an AssociateVPCWithHostedZone request.  If you want to associate multiple VPCs that you created by using one account with a hosted zone that you created by using a different account, you must submit one authorization request for each VPC. 
    */
  def createVPCAssociationAuthorization(params: CreateVPCAssociationAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[CreateVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createVPCAssociationAuthorization(
    params: CreateVPCAssociationAuthorizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateVPCAssociationAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a health check.  Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one or more resource record sets. If you delete a health check and you don't update the associated resource record sets, the future status of the health check can't be predicted and may change. This will affect the routing of DNS queries for your DNS failover configuration. For more information, see Replacing and Deleting Health Checks in the Amazon Route 53 Developer Guide. 
    */
  def deleteHealthCheck(): awsDashSdkLib.libRequestMod.Request[DeleteHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteHealthCheck(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteHealthCheckResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a health check.  Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one or more resource record sets. If you delete a health check and you don't update the associated resource record sets, the future status of the health check can't be predicted and may change. This will affect the routing of DNS queries for your DNS failover configuration. For more information, see Replacing and Deleting Health Checks in the Amazon Route 53 Developer Guide. 
    */
  def deleteHealthCheck(params: DeleteHealthCheckRequest): awsDashSdkLib.libRequestMod.Request[DeleteHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteHealthCheck(
    params: DeleteHealthCheckRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteHealthCheckResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a hosted zone. If the hosted zone was created by another service, such as AWS Cloud Map, see Deleting Public Hosted Zones That Were Created by Another Service in the Amazon Route 53 Developer Guide for information about how to delete it. (The process is the same for public and private hosted zones that were created by another service.) If you want to keep your domain registration but you want to stop routing internet traffic to your website or web application, we recommend that you delete resource record sets in the hosted zone instead of deleting the hosted zone.  If you delete a hosted zone, you can't undelete it. You must create a new hosted zone and update the name servers for your domain registration, which can require up to 48 hours to take effect. (If you delegated responsibility for a subdomain to a hosted zone and you delete the child hosted zone, you must update the name servers in the parent hosted zone.) In addition, if you delete a hosted zone, someone could hijack the domain and route traffic to their own resources using your domain name.  If you want to avoid the monthly charge for the hosted zone, you can transfer DNS service for the domain to a free DNS service. When you transfer DNS service, you have to update the name servers for the domain registration. If the domain is registered with Route 53, see UpdateDomainNameservers for information about how to replace Route 53 name servers with name servers for the new DNS service. If the domain is registered with another registrar, use the method provided by the registrar to update name servers for the domain registration. For more information, perform an internet search on "free DNS service." You can delete a hosted zone only if it contains only the default SOA record and NS resource record sets. If the hosted zone contains other resource record sets, you must delete them before you can delete the hosted zone. If you try to delete a hosted zone that contains other resource record sets, the request fails, and Route 53 returns a HostedZoneNotEmpty error. For information about deleting records from your hosted zone, see ChangeResourceRecordSets. To verify that the hosted zone has been deleted, do one of the following:   Use the GetHostedZone action to request information about the hosted zone.   Use the ListHostedZones action to get a list of the hosted zones associated with the current AWS account.  
    */
  def deleteHostedZone(): awsDashSdkLib.libRequestMod.Request[DeleteHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteHostedZone(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteHostedZoneResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a hosted zone. If the hosted zone was created by another service, such as AWS Cloud Map, see Deleting Public Hosted Zones That Were Created by Another Service in the Amazon Route 53 Developer Guide for information about how to delete it. (The process is the same for public and private hosted zones that were created by another service.) If you want to keep your domain registration but you want to stop routing internet traffic to your website or web application, we recommend that you delete resource record sets in the hosted zone instead of deleting the hosted zone.  If you delete a hosted zone, you can't undelete it. You must create a new hosted zone and update the name servers for your domain registration, which can require up to 48 hours to take effect. (If you delegated responsibility for a subdomain to a hosted zone and you delete the child hosted zone, you must update the name servers in the parent hosted zone.) In addition, if you delete a hosted zone, someone could hijack the domain and route traffic to their own resources using your domain name.  If you want to avoid the monthly charge for the hosted zone, you can transfer DNS service for the domain to a free DNS service. When you transfer DNS service, you have to update the name servers for the domain registration. If the domain is registered with Route 53, see UpdateDomainNameservers for information about how to replace Route 53 name servers with name servers for the new DNS service. If the domain is registered with another registrar, use the method provided by the registrar to update name servers for the domain registration. For more information, perform an internet search on "free DNS service." You can delete a hosted zone only if it contains only the default SOA record and NS resource record sets. If the hosted zone contains other resource record sets, you must delete them before you can delete the hosted zone. If you try to delete a hosted zone that contains other resource record sets, the request fails, and Route 53 returns a HostedZoneNotEmpty error. For information about deleting records from your hosted zone, see ChangeResourceRecordSets. To verify that the hosted zone has been deleted, do one of the following:   Use the GetHostedZone action to request information about the hosted zone.   Use the ListHostedZones action to get a list of the hosted zones associated with the current AWS account.  
    */
  def deleteHostedZone(params: DeleteHostedZoneRequest): awsDashSdkLib.libRequestMod.Request[DeleteHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteHostedZone(
    params: DeleteHostedZoneRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteHostedZoneResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a configuration for DNS query logging. If you delete a configuration, Amazon Route 53 stops sending query logs to CloudWatch Logs. Route 53 doesn't delete any logs that are already in CloudWatch Logs. For more information about DNS query logs, see CreateQueryLoggingConfig.
    */
  def deleteQueryLoggingConfig(): awsDashSdkLib.libRequestMod.Request[DeleteQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteQueryLoggingConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteQueryLoggingConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a configuration for DNS query logging. If you delete a configuration, Amazon Route 53 stops sending query logs to CloudWatch Logs. Route 53 doesn't delete any logs that are already in CloudWatch Logs. For more information about DNS query logs, see CreateQueryLoggingConfig.
    */
  def deleteQueryLoggingConfig(params: DeleteQueryLoggingConfigRequest): awsDashSdkLib.libRequestMod.Request[DeleteQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteQueryLoggingConfig(
    params: DeleteQueryLoggingConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteQueryLoggingConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a reusable delegation set.  You can delete a reusable delegation set only if it isn't associated with any hosted zones.  To verify that the reusable delegation set is not associated with any hosted zones, submit a GetReusableDelegationSet request and specify the ID of the reusable delegation set that you want to delete.
    */
  def deleteReusableDelegationSet(): awsDashSdkLib.libRequestMod.Request[DeleteReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReusableDelegationSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReusableDelegationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a reusable delegation set.  You can delete a reusable delegation set only if it isn't associated with any hosted zones.  To verify that the reusable delegation set is not associated with any hosted zones, submit a GetReusableDelegationSet request and specify the ID of the reusable delegation set that you want to delete.
    */
  def deleteReusableDelegationSet(params: DeleteReusableDelegationSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteReusableDelegationSet(
    params: DeleteReusableDelegationSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteReusableDelegationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a traffic policy.
    */
  def deleteTrafficPolicy(): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTrafficPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTrafficPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a traffic policy.
    */
  def deleteTrafficPolicy(params: DeleteTrafficPolicyRequest): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTrafficPolicy(
    params: DeleteTrafficPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTrafficPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you created the instance.  In the Route 53 console, traffic policy instances are known as policy records. 
    */
  def deleteTrafficPolicyInstance(): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTrafficPolicyInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTrafficPolicyInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you created the instance.  In the Route 53 console, traffic policy instances are known as policy records. 
    */
  def deleteTrafficPolicyInstance(params: DeleteTrafficPolicyInstanceRequest): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTrafficPolicyInstance(
    params: DeleteTrafficPolicyInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTrafficPolicyInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes authorization to submit an AssociateVPCWithHostedZone request to associate a specified VPC with a hosted zone that was created by a different account. You must use the account that created the hosted zone to submit a DeleteVPCAssociationAuthorization request.  Sending this request only prevents the AWS account that created the VPC from associating the VPC with the Amazon Route 53 hosted zone in the future. If the VPC is already associated with the hosted zone, DeleteVPCAssociationAuthorization won't disassociate the VPC from the hosted zone. If you want to delete an existing association, use DisassociateVPCFromHostedZone. 
    */
  def deleteVPCAssociationAuthorization(): awsDashSdkLib.libRequestMod.Request[DeleteVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVPCAssociationAuthorization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteVPCAssociationAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes authorization to submit an AssociateVPCWithHostedZone request to associate a specified VPC with a hosted zone that was created by a different account. You must use the account that created the hosted zone to submit a DeleteVPCAssociationAuthorization request.  Sending this request only prevents the AWS account that created the VPC from associating the VPC with the Amazon Route 53 hosted zone in the future. If the VPC is already associated with the hosted zone, DeleteVPCAssociationAuthorization won't disassociate the VPC from the hosted zone. If you want to delete an existing association, use DisassociateVPCFromHostedZone. 
    */
  def deleteVPCAssociationAuthorization(params: DeleteVPCAssociationAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[DeleteVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVPCAssociationAuthorization(
    params: DeleteVPCAssociationAuthorizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteVPCAssociationAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteVPCAssociationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a VPC from a Amazon Route 53 private hosted zone. Note the following:   You can't disassociate the last VPC from a private hosted zone.   You can't convert a private hosted zone into a public hosted zone.   You can submit a DisassociateVPCFromHostedZone request using either the account that created the hosted zone or the account that created the VPC.  
    */
  def disassociateVPCFromHostedZone(): awsDashSdkLib.libRequestMod.Request[DisassociateVPCFromHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateVPCFromHostedZone(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateVPCFromHostedZoneResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateVPCFromHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a VPC from a Amazon Route 53 private hosted zone. Note the following:   You can't disassociate the last VPC from a private hosted zone.   You can't convert a private hosted zone into a public hosted zone.   You can submit a DisassociateVPCFromHostedZone request using either the account that created the hosted zone or the account that created the VPC.  
    */
  def disassociateVPCFromHostedZone(params: DisassociateVPCFromHostedZoneRequest): awsDashSdkLib.libRequestMod.Request[DisassociateVPCFromHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateVPCFromHostedZone(
    params: DisassociateVPCFromHostedZoneRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateVPCFromHostedZoneResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateVPCFromHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified limit for the current account, for example, the maximum number of health checks that you can create using the account. For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.  You can also view account limits in AWS Trusted Advisor. Sign in to the AWS Management Console and open the Trusted Advisor console at https://console.aws.amazon.com/trustedadvisor/. Then choose Service limits in the navigation pane. 
    */
  def getAccountLimit(): awsDashSdkLib.libRequestMod.Request[GetAccountLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAccountLimit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAccountLimitResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAccountLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified limit for the current account, for example, the maximum number of health checks that you can create using the account. For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.  You can also view account limits in AWS Trusted Advisor. Sign in to the AWS Management Console and open the Trusted Advisor console at https://console.aws.amazon.com/trustedadvisor/. Then choose Service limits in the navigation pane. 
    */
  def getAccountLimit(params: GetAccountLimitRequest): awsDashSdkLib.libRequestMod.Request[GetAccountLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAccountLimit(
    params: GetAccountLimitRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAccountLimitResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAccountLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the current status of a change batch request. The status is one of the following values:    PENDING indicates that the changes in this request have not propagated to all Amazon Route 53 DNS servers. This is the initial status of all change batch requests.    INSYNC indicates that the changes have propagated to all Route 53 DNS servers.   
    */
  def getChange(): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getChange(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetChangeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the current status of a change batch request. The status is one of the following values:    PENDING indicates that the changes in this request have not propagated to all Amazon Route 53 DNS servers. This is the initial status of all change batch requests.    INSYNC indicates that the changes have propagated to all Route 53 DNS servers.   
    */
  def getChange(params: GetChangeRequest): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getChange(
    params: GetChangeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetChangeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *   GetCheckerIpRanges still works, but we recommend that you download ip-ranges.json, which includes IP address ranges for all AWS services. For more information, see IP Address Ranges of Amazon Route 53 Servers in the Amazon Route 53 Developer Guide. 
    */
  def getCheckerIpRanges(): awsDashSdkLib.libRequestMod.Request[GetCheckerIpRangesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCheckerIpRanges(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCheckerIpRangesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCheckerIpRangesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *   GetCheckerIpRanges still works, but we recommend that you download ip-ranges.json, which includes IP address ranges for all AWS services. For more information, see IP Address Ranges of Amazon Route 53 Servers in the Amazon Route 53 Developer Guide. 
    */
  def getCheckerIpRanges(params: GetCheckerIpRangesRequest): awsDashSdkLib.libRequestMod.Request[GetCheckerIpRangesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCheckerIpRanges(
    params: GetCheckerIpRangesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCheckerIpRangesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCheckerIpRangesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets. Use the following syntax to determine whether a continent is supported for geolocation:  GET /2013-04-01/geolocation?continentcode=two-letter abbreviation for a continent   Use the following syntax to determine whether a country is supported for geolocation:  GET /2013-04-01/geolocation?countrycode=two-character country code   Use the following syntax to determine whether a subdivision of a country is supported for geolocation:  GET /2013-04-01/geolocation?countrycode=two-character country code&amp;subdivisioncode=subdivision code  
    */
  def getGeoLocation(): awsDashSdkLib.libRequestMod.Request[GetGeoLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGeoLocation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGeoLocationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGeoLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets. Use the following syntax to determine whether a continent is supported for geolocation:  GET /2013-04-01/geolocation?continentcode=two-letter abbreviation for a continent   Use the following syntax to determine whether a country is supported for geolocation:  GET /2013-04-01/geolocation?countrycode=two-character country code   Use the following syntax to determine whether a subdivision of a country is supported for geolocation:  GET /2013-04-01/geolocation?countrycode=two-character country code&amp;subdivisioncode=subdivision code  
    */
  def getGeoLocation(params: GetGeoLocationRequest): awsDashSdkLib.libRequestMod.Request[GetGeoLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGeoLocation(
    params: GetGeoLocationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGeoLocationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGeoLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specified health check.
    */
  def getHealthCheck(): awsDashSdkLib.libRequestMod.Request[GetHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHealthCheck(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHealthCheckResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specified health check.
    */
  def getHealthCheck(params: GetHealthCheckRequest): awsDashSdkLib.libRequestMod.Request[GetHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHealthCheck(
    params: GetHealthCheckRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHealthCheckResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the number of health checks that are associated with the current AWS account.
    */
  def getHealthCheckCount(): awsDashSdkLib.libRequestMod.Request[GetHealthCheckCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHealthCheckCount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHealthCheckCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the number of health checks that are associated with the current AWS account.
    */
  def getHealthCheckCount(params: GetHealthCheckCountRequest): awsDashSdkLib.libRequestMod.Request[GetHealthCheckCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHealthCheckCount(
    params: GetHealthCheckCountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHealthCheckCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the reason that a specified health check failed most recently.
    */
  def getHealthCheckLastFailureReason(): awsDashSdkLib.libRequestMod.Request[GetHealthCheckLastFailureReasonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHealthCheckLastFailureReason(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHealthCheckLastFailureReasonResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckLastFailureReasonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the reason that a specified health check failed most recently.
    */
  def getHealthCheckLastFailureReason(params: GetHealthCheckLastFailureReasonRequest): awsDashSdkLib.libRequestMod.Request[GetHealthCheckLastFailureReasonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHealthCheckLastFailureReason(
    params: GetHealthCheckLastFailureReasonRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHealthCheckLastFailureReasonResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckLastFailureReasonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets status of a specified health check. 
    */
  def getHealthCheckStatus(): awsDashSdkLib.libRequestMod.Request[GetHealthCheckStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHealthCheckStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHealthCheckStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets status of a specified health check. 
    */
  def getHealthCheckStatus(params: GetHealthCheckStatusRequest): awsDashSdkLib.libRequestMod.Request[GetHealthCheckStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHealthCheckStatus(
    params: GetHealthCheckStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHealthCheckStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHealthCheckStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specified hosted zone including the four name servers assigned to the hosted zone.
    */
  def getHostedZone(): awsDashSdkLib.libRequestMod.Request[GetHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHostedZone(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHostedZoneResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specified hosted zone including the four name servers assigned to the hosted zone.
    */
  def getHostedZone(params: GetHostedZoneRequest): awsDashSdkLib.libRequestMod.Request[GetHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHostedZone(
    params: GetHostedZoneRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHostedZoneResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the number of hosted zones that are associated with the current AWS account.
    */
  def getHostedZoneCount(): awsDashSdkLib.libRequestMod.Request[GetHostedZoneCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHostedZoneCount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHostedZoneCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHostedZoneCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the number of hosted zones that are associated with the current AWS account.
    */
  def getHostedZoneCount(params: GetHostedZoneCountRequest): awsDashSdkLib.libRequestMod.Request[GetHostedZoneCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHostedZoneCount(
    params: GetHostedZoneCountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHostedZoneCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHostedZoneCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified limit for a specified hosted zone, for example, the maximum number of records that you can create in the hosted zone.  For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
    */
  def getHostedZoneLimit(): awsDashSdkLib.libRequestMod.Request[GetHostedZoneLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHostedZoneLimit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHostedZoneLimitResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHostedZoneLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified limit for a specified hosted zone, for example, the maximum number of records that you can create in the hosted zone.  For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
    */
  def getHostedZoneLimit(params: GetHostedZoneLimitRequest): awsDashSdkLib.libRequestMod.Request[GetHostedZoneLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getHostedZoneLimit(
    params: GetHostedZoneLimitRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetHostedZoneLimitResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetHostedZoneLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specified configuration for DNS query logging. For more information about DNS query logs, see CreateQueryLoggingConfig and Logging DNS Queries.
    */
  def getQueryLoggingConfig(): awsDashSdkLib.libRequestMod.Request[GetQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getQueryLoggingConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetQueryLoggingConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specified configuration for DNS query logging. For more information about DNS query logs, see CreateQueryLoggingConfig and Logging DNS Queries.
    */
  def getQueryLoggingConfig(params: GetQueryLoggingConfigRequest): awsDashSdkLib.libRequestMod.Request[GetQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getQueryLoggingConfig(
    params: GetQueryLoggingConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetQueryLoggingConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetQueryLoggingConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a specified reusable delegation set, including the four name servers that are assigned to the delegation set.
    */
  def getReusableDelegationSet(): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getReusableDelegationSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetReusableDelegationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a specified reusable delegation set, including the four name servers that are assigned to the delegation set.
    */
  def getReusableDelegationSet(params: GetReusableDelegationSetRequest): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getReusableDelegationSet(
    params: GetReusableDelegationSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetReusableDelegationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the maximum number of hosted zones that you can associate with the specified reusable delegation set. For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
    */
  def getReusableDelegationSetLimit(): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getReusableDelegationSetLimit(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetReusableDelegationSetLimitResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the maximum number of hosted zones that you can associate with the specified reusable delegation set. For the default limit, see Limits in the Amazon Route 53 Developer Guide. To request a higher limit, open a case.
    */
  def getReusableDelegationSetLimit(params: GetReusableDelegationSetLimitRequest): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getReusableDelegationSetLimit(
    params: GetReusableDelegationSetLimitRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetReusableDelegationSetLimitResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetReusableDelegationSetLimitResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specific traffic policy version.
    */
  def getTrafficPolicy(): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTrafficPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTrafficPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specific traffic policy version.
    */
  def getTrafficPolicy(params: GetTrafficPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTrafficPolicy(
    params: GetTrafficPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTrafficPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specified traffic policy instance.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.   In the Route 53 console, traffic policy instances are known as policy records. 
    */
  def getTrafficPolicyInstance(): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTrafficPolicyInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTrafficPolicyInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specified traffic policy instance.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.   In the Route 53 console, traffic policy instances are known as policy records. 
    */
  def getTrafficPolicyInstance(params: GetTrafficPolicyInstanceRequest): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTrafficPolicyInstance(
    params: GetTrafficPolicyInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTrafficPolicyInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the number of traffic policy instances that are associated with the current AWS account.
    */
  def getTrafficPolicyInstanceCount(): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTrafficPolicyInstanceCount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTrafficPolicyInstanceCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the number of traffic policy instances that are associated with the current AWS account.
    */
  def getTrafficPolicyInstanceCount(params: GetTrafficPolicyInstanceCountRequest): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTrafficPolicyInstanceCount(
    params: GetTrafficPolicyInstanceCountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTrafficPolicyInstanceCountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTrafficPolicyInstanceCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of supported geographic locations. Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order immediately after the corresponding country.
    */
  def listGeoLocations(): awsDashSdkLib.libRequestMod.Request[ListGeoLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGeoLocations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGeoLocationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGeoLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of supported geographic locations. Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order immediately after the corresponding country.
    */
  def listGeoLocations(params: ListGeoLocationsRequest): awsDashSdkLib.libRequestMod.Request[ListGeoLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGeoLocations(
    params: ListGeoLocationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGeoLocationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGeoLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve a list of the health checks that are associated with the current AWS account. 
    */
  def listHealthChecks(): awsDashSdkLib.libRequestMod.Request[ListHealthChecksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHealthChecks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHealthChecksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHealthChecksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve a list of the health checks that are associated with the current AWS account. 
    */
  def listHealthChecks(params: ListHealthChecksRequest): awsDashSdkLib.libRequestMod.Request[ListHealthChecksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHealthChecks(
    params: ListHealthChecksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHealthChecksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHealthChecksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of the public and private hosted zones that are associated with the current AWS account. The response includes a HostedZones child element for each hosted zone. Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use the maxitems parameter to list them in groups of up to 100.
    */
  def listHostedZones(): awsDashSdkLib.libRequestMod.Request[ListHostedZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHostedZones(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHostedZonesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHostedZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of the public and private hosted zones that are associated with the current AWS account. The response includes a HostedZones child element for each hosted zone. Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use the maxitems parameter to list them in groups of up to 100.
    */
  def listHostedZones(params: ListHostedZonesRequest): awsDashSdkLib.libRequestMod.Request[ListHostedZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHostedZones(
    params: ListHostedZonesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHostedZonesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHostedZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of your hosted zones in lexicographic order. The response includes a HostedZones child element for each hosted zone created by the current AWS account.   ListHostedZonesByName sorts hosted zones by name with the labels reversed. For example:  com.example.www.  Note the trailing dot, which can change the sort order in some circumstances. If the domain name includes escape characters or Punycode, ListHostedZonesByName alphabetizes the domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database. For example, to create a hosted zone for exämple.com, you specify ex\344mple.com for the domain name. ListHostedZonesByName alphabetizes it as:  com.ex\344mple.  The labels are reversed and alphabetized using the escaped value. For more information about valid domain name formats, including internationalized domain names, see DNS Domain Name Format in the Amazon Route 53 Developer Guide. Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the MaxItems parameter to list them in groups of up to 100. The response includes values that help navigate from one group of MaxItems hosted zones to the next:   The DNSName and HostedZoneId elements in the response contain the values, if any, specified for the dnsname and hostedzoneid parameters in the request that produced the current response.   The MaxItems element in the response contains the value, if any, that you specified for the maxitems parameter in the request that produced the current response.   If the value of IsTruncated in the response is true, there are more hosted zones associated with the current AWS account.  If IsTruncated is false, this response includes the last hosted zone that is associated with the current account. The NextDNSName element and NextHostedZoneId elements are omitted from the response.   The NextDNSName and NextHostedZoneId elements in the response contain the domain name and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If you want to list more hosted zones, make another call to ListHostedZonesByName, and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively.  
    */
  def listHostedZonesByName(): awsDashSdkLib.libRequestMod.Request[ListHostedZonesByNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHostedZonesByName(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHostedZonesByNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHostedZonesByNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of your hosted zones in lexicographic order. The response includes a HostedZones child element for each hosted zone created by the current AWS account.   ListHostedZonesByName sorts hosted zones by name with the labels reversed. For example:  com.example.www.  Note the trailing dot, which can change the sort order in some circumstances. If the domain name includes escape characters or Punycode, ListHostedZonesByName alphabetizes the domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database. For example, to create a hosted zone for exämple.com, you specify ex\344mple.com for the domain name. ListHostedZonesByName alphabetizes it as:  com.ex\344mple.  The labels are reversed and alphabetized using the escaped value. For more information about valid domain name formats, including internationalized domain names, see DNS Domain Name Format in the Amazon Route 53 Developer Guide. Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the MaxItems parameter to list them in groups of up to 100. The response includes values that help navigate from one group of MaxItems hosted zones to the next:   The DNSName and HostedZoneId elements in the response contain the values, if any, specified for the dnsname and hostedzoneid parameters in the request that produced the current response.   The MaxItems element in the response contains the value, if any, that you specified for the maxitems parameter in the request that produced the current response.   If the value of IsTruncated in the response is true, there are more hosted zones associated with the current AWS account.  If IsTruncated is false, this response includes the last hosted zone that is associated with the current account. The NextDNSName element and NextHostedZoneId elements are omitted from the response.   The NextDNSName and NextHostedZoneId elements in the response contain the domain name and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If you want to list more hosted zones, make another call to ListHostedZonesByName, and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively.  
    */
  def listHostedZonesByName(params: ListHostedZonesByNameRequest): awsDashSdkLib.libRequestMod.Request[ListHostedZonesByNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHostedZonesByName(
    params: ListHostedZonesByNameRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHostedZonesByNameResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHostedZonesByNameResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the configurations for DNS query logging that are associated with the current AWS account or the configuration that is associated with a specified hosted zone. For more information about DNS query logs, see CreateQueryLoggingConfig. Additional information, including the format of DNS query logs, appears in Logging DNS Queries in the Amazon Route 53 Developer Guide.
    */
  def listQueryLoggingConfigs(): awsDashSdkLib.libRequestMod.Request[ListQueryLoggingConfigsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listQueryLoggingConfigs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListQueryLoggingConfigsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListQueryLoggingConfigsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the configurations for DNS query logging that are associated with the current AWS account or the configuration that is associated with a specified hosted zone. For more information about DNS query logs, see CreateQueryLoggingConfig. Additional information, including the format of DNS query logs, appears in Logging DNS Queries in the Amazon Route 53 Developer Guide.
    */
  def listQueryLoggingConfigs(params: ListQueryLoggingConfigsRequest): awsDashSdkLib.libRequestMod.Request[ListQueryLoggingConfigsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listQueryLoggingConfigs(
    params: ListQueryLoggingConfigsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListQueryLoggingConfigsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListQueryLoggingConfigsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the resource record sets in a specified hosted zone.  ListResourceRecordSets returns up to 100 resource record sets at a time in ASCII order, beginning at a position specified by the name and type elements.  Sort order   ListResourceRecordSets sorts results first by DNS name with the labels reversed, for example:  com.example.www.  Note the trailing dot, which can change the sort order when the record name contains characters that appear before . (decimal 46) in the ASCII table. These characters include the following: ! " # $ % &amp; ' ( ) * + , -  When multiple records have the same DNS name, ListResourceRecordSets sorts results by the record type.  Specifying where to start listing records  You can use the name and type elements to specify the resource record set that the list begins with:  If you do not specify Name or Type  The results begin with the first resource record set that the hosted zone contains.  If you specify Name but not Type  The results begin with the first resource record set in the list whose name is greater than or equal to Name.  If you specify Type but not Name  Amazon Route 53 returns the InvalidInput error.  If you specify both Name and Type  The results begin with the first resource record set in the list whose name is greater than or equal to Name, and whose type is greater than or equal to Type.    Resource record sets that are PENDING  This action returns the most current version of the records. This includes records that are PENDING, and that are not yet available on all Route 53 DNS servers.  Changing resource record sets  To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do not submit a ChangeResourceRecordSets request while you're paging through the results of a ListResourceRecordSets request. If you do, some pages may display results without the latest changes while other pages display results with the latest changes.  Displaying the next page of results  If a ListResourceRecordSets command returns more than one page of results, the value of IsTruncated is true. To display the next page of results, get the values of NextRecordName, NextRecordType, and NextRecordIdentifier (if any) from the response. Then submit another ListResourceRecordSets request, and specify those values for StartRecordName, StartRecordType, and StartRecordIdentifier.
    */
  def listResourceRecordSets(): awsDashSdkLib.libRequestMod.Request[ListResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceRecordSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceRecordSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the resource record sets in a specified hosted zone.  ListResourceRecordSets returns up to 100 resource record sets at a time in ASCII order, beginning at a position specified by the name and type elements.  Sort order   ListResourceRecordSets sorts results first by DNS name with the labels reversed, for example:  com.example.www.  Note the trailing dot, which can change the sort order when the record name contains characters that appear before . (decimal 46) in the ASCII table. These characters include the following: ! " # $ % &amp; ' ( ) * + , -  When multiple records have the same DNS name, ListResourceRecordSets sorts results by the record type.  Specifying where to start listing records  You can use the name and type elements to specify the resource record set that the list begins with:  If you do not specify Name or Type  The results begin with the first resource record set that the hosted zone contains.  If you specify Name but not Type  The results begin with the first resource record set in the list whose name is greater than or equal to Name.  If you specify Type but not Name  Amazon Route 53 returns the InvalidInput error.  If you specify both Name and Type  The results begin with the first resource record set in the list whose name is greater than or equal to Name, and whose type is greater than or equal to Type.    Resource record sets that are PENDING  This action returns the most current version of the records. This includes records that are PENDING, and that are not yet available on all Route 53 DNS servers.  Changing resource record sets  To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do not submit a ChangeResourceRecordSets request while you're paging through the results of a ListResourceRecordSets request. If you do, some pages may display results without the latest changes while other pages display results with the latest changes.  Displaying the next page of results  If a ListResourceRecordSets command returns more than one page of results, the value of IsTruncated is true. To display the next page of results, get the values of NextRecordName, NextRecordType, and NextRecordIdentifier (if any) from the response. Then submit another ListResourceRecordSets request, and specify those values for StartRecordName, StartRecordType, and StartRecordIdentifier.
    */
  def listResourceRecordSets(params: ListResourceRecordSetsRequest): awsDashSdkLib.libRequestMod.Request[ListResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceRecordSets(
    params: ListResourceRecordSetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceRecordSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceRecordSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of the reusable delegation sets that are associated with the current AWS account.
    */
  def listReusableDelegationSets(): awsDashSdkLib.libRequestMod.Request[ListReusableDelegationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listReusableDelegationSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListReusableDelegationSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListReusableDelegationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of the reusable delegation sets that are associated with the current AWS account.
    */
  def listReusableDelegationSets(params: ListReusableDelegationSetsRequest): awsDashSdkLib.libRequestMod.Request[ListReusableDelegationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listReusableDelegationSets(
    params: ListReusableDelegationSetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListReusableDelegationSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListReusableDelegationSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists tags for one health check or hosted zone.  For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists tags for one health check or hosted zone.  For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists tags for up to 10 health checks or hosted zones. For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  def listTagsForResources(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists tags for up to 10 health checks or hosted zones. For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  def listTagsForResources(params: ListTagsForResourcesRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResources(
    params: ListTagsForResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the latest version for every traffic policy that is associated with the current AWS account. Policies are listed in the order that they were created in. 
    */
  def listTrafficPolicies(): awsDashSdkLib.libRequestMod.Request[ListTrafficPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTrafficPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrafficPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTrafficPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the latest version for every traffic policy that is associated with the current AWS account. Policies are listed in the order that they were created in. 
    */
  def listTrafficPolicies(params: ListTrafficPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListTrafficPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTrafficPolicies(
    params: ListTrafficPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrafficPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTrafficPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the traffic policy instances that you created by using the current AWS account.  After you submit an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
    */
  def listTrafficPolicyInstances(): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTrafficPolicyInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrafficPolicyInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the traffic policy instances that you created by using the current AWS account.  After you submit an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
    */
  def listTrafficPolicyInstances(params: ListTrafficPolicyInstancesRequest): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTrafficPolicyInstances(
    params: ListTrafficPolicyInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrafficPolicyInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the traffic policy instances that you created in a specified hosted zone.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
    */
  def listTrafficPolicyInstancesByHostedZone(): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTrafficPolicyInstancesByHostedZone(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrafficPolicyInstancesByHostedZoneResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the traffic policy instances that you created in a specified hosted zone.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
    */
  def listTrafficPolicyInstancesByHostedZone(params: ListTrafficPolicyInstancesByHostedZoneRequest): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTrafficPolicyInstancesByHostedZone(
    params: ListTrafficPolicyInstancesByHostedZoneRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrafficPolicyInstancesByHostedZoneResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByHostedZoneResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the traffic policy instances that you created by using a specify traffic policy version.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
    */
  def listTrafficPolicyInstancesByPolicy(): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTrafficPolicyInstancesByPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrafficPolicyInstancesByPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the traffic policy instances that you created by using a specify traffic policy version.  After you submit a CreateTrafficPolicyInstance or an UpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the traffic policy definition. For more information, see the State response element.  Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can use the MaxItems parameter to list them in groups of up to 100.
    */
  def listTrafficPolicyInstancesByPolicy(params: ListTrafficPolicyInstancesByPolicyRequest): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTrafficPolicyInstancesByPolicy(
    params: ListTrafficPolicyInstancesByPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrafficPolicyInstancesByPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyInstancesByPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about all of the versions for a specified traffic policy. Traffic policy versions are listed in numerical order by VersionNumber.
    */
  def listTrafficPolicyVersions(): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTrafficPolicyVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrafficPolicyVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about all of the versions for a specified traffic policy. Traffic policy versions are listed in numerical order by VersionNumber.
    */
  def listTrafficPolicyVersions(params: ListTrafficPolicyVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTrafficPolicyVersions(
    params: ListTrafficPolicyVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTrafficPolicyVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTrafficPolicyVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted zone because you've submitted one or more CreateVPCAssociationAuthorization requests.  The response includes a VPCs element with a VPC child element for each VPC that can be associated with the hosted zone.
    */
  def listVPCAssociationAuthorizations(): awsDashSdkLib.libRequestMod.Request[ListVPCAssociationAuthorizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listVPCAssociationAuthorizations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListVPCAssociationAuthorizationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListVPCAssociationAuthorizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted zone because you've submitted one or more CreateVPCAssociationAuthorization requests.  The response includes a VPCs element with a VPC child element for each VPC that can be associated with the hosted zone.
    */
  def listVPCAssociationAuthorizations(params: ListVPCAssociationAuthorizationsRequest): awsDashSdkLib.libRequestMod.Request[ListVPCAssociationAuthorizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listVPCAssociationAuthorizations(
    params: ListVPCAssociationAuthorizationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListVPCAssociationAuthorizationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListVPCAssociationAuthorizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask. 
    */
  def testDNSAnswer(): awsDashSdkLib.libRequestMod.Request[TestDNSAnswerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testDNSAnswer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestDNSAnswerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestDNSAnswerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask. 
    */
  def testDNSAnswer(params: TestDNSAnswerRequest): awsDashSdkLib.libRequestMod.Request[TestDNSAnswerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def testDNSAnswer(
    params: TestDNSAnswerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TestDNSAnswerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TestDNSAnswerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing health check. Note that some values can't be updated.  For more information about updating health checks, see Creating, Updating, and Deleting Health Checks in the Amazon Route 53 Developer Guide.
    */
  def updateHealthCheck(): awsDashSdkLib.libRequestMod.Request[UpdateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateHealthCheck(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateHealthCheckResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing health check. Note that some values can't be updated.  For more information about updating health checks, see Creating, Updating, and Deleting Health Checks in the Amazon Route 53 Developer Guide.
    */
  def updateHealthCheck(params: UpdateHealthCheckRequest): awsDashSdkLib.libRequestMod.Request[UpdateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateHealthCheck(
    params: UpdateHealthCheckRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateHealthCheckResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateHealthCheckResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the comment for a specified hosted zone.
    */
  def updateHostedZoneComment(): awsDashSdkLib.libRequestMod.Request[UpdateHostedZoneCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateHostedZoneComment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateHostedZoneCommentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateHostedZoneCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the comment for a specified hosted zone.
    */
  def updateHostedZoneComment(params: UpdateHostedZoneCommentRequest): awsDashSdkLib.libRequestMod.Request[UpdateHostedZoneCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateHostedZoneComment(
    params: UpdateHostedZoneCommentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateHostedZoneCommentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateHostedZoneCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the comment for a specified traffic policy version.
    */
  def updateTrafficPolicyComment(): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTrafficPolicyComment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTrafficPolicyCommentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the comment for a specified traffic policy version.
    */
  def updateTrafficPolicyComment(params: UpdateTrafficPolicyCommentRequest): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTrafficPolicyComment(
    params: UpdateTrafficPolicyCommentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTrafficPolicyCommentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyCommentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the resource record sets in a specified hosted zone that were created based on the settings in a specified traffic policy version. When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root resource record set name (such as example.com) while it replaces one group of resource record sets with another. Route 53 performs the following operations:   Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true regardless of how significant the differences are between the existing resource record sets and the new resource record sets.    When all of the new resource record sets have been created, Route 53 starts to respond to DNS queries for the root resource record set name (such as example.com) by using the new resource record sets.   Route 53 deletes the old group of resource record sets that are associated with the root resource record set name.  
    */
  def updateTrafficPolicyInstance(): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTrafficPolicyInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTrafficPolicyInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the resource record sets in a specified hosted zone that were created based on the settings in a specified traffic policy version. When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root resource record set name (such as example.com) while it replaces one group of resource record sets with another. Route 53 performs the following operations:   Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true regardless of how significant the differences are between the existing resource record sets and the new resource record sets.    When all of the new resource record sets have been created, Route 53 starts to respond to DNS queries for the root resource record set name (such as example.com) by using the new resource record sets.   Route 53 deletes the old group of resource record sets that are associated with the root resource record set name.  
    */
  def updateTrafficPolicyInstance(params: UpdateTrafficPolicyInstanceRequest): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTrafficPolicyInstance(
    params: UpdateTrafficPolicyInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTrafficPolicyInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTrafficPolicyInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the resourceRecordSetsChanged state by periodically calling the underlying Route53.getChangeoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_resourceRecordSetsChanged(state: awsDashSdkLib.awsDashSdkLibStrings.resourceRecordSetsChanged): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_resourceRecordSetsChanged(
    state: awsDashSdkLib.awsDashSdkLibStrings.resourceRecordSetsChanged,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetChangeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the resourceRecordSetsChanged state by periodically calling the underlying Route53.getChangeoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_resourceRecordSetsChanged(
    state: awsDashSdkLib.awsDashSdkLibStrings.resourceRecordSetsChanged,
    params: GetChangeRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_resourceRecordSetsChanged(
    state: awsDashSdkLib.awsDashSdkLibStrings.resourceRecordSetsChanged,
    params: GetChangeRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetChangeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetChangeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

