package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ELBv2
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ELBv2: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds the specified SSL server certificate to the certificate list for the specified HTTPS listener. If the certificate in already in the certificate list, the call is successful but the certificate is not added again. To get the certificate list for a listener, use DescribeListenerCertificates. To remove certificates from the certificate list for a listener, use RemoveListenerCertificates. To replace the default certificate for a listener, use ModifyListener. For more information, see SSL Certificates in the Application Load Balancers Guide.
    */
  def addListenerCertificates(): awsDashSdkLib.libRequestMod.Request[AddListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addListenerCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddListenerCertificatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified SSL server certificate to the certificate list for the specified HTTPS listener. If the certificate in already in the certificate list, the call is successful but the certificate is not added again. To get the certificate list for a listener, use DescribeListenerCertificates. To remove certificates from the certificate list for a listener, use RemoveListenerCertificates. To replace the default certificate for a listener, use ModifyListener. For more information, see SSL Certificates in the Application Load Balancers Guide.
    */
  def addListenerCertificates(params: AddListenerCertificatesInput): awsDashSdkLib.libRequestMod.Request[AddListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addListenerCertificates(
    params: AddListenerCertificatesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddListenerCertificatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load Balancers, Network Load Balancers, and your target groups. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, AddTags updates its value. To list the current tags for your resources, use DescribeTags. To remove tags from your resources, use RemoveTags.
    */
  def addTags(): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load Balancers, Network Load Balancers, and your target groups. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, AddTags updates its value. To list the current tags for your resources, use DescribeTags. To remove tags from your resources, use RemoveTags.
    */
  def addTags(params: AddTagsInput): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTags(
    params: AddTagsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a listener for the specified Application Load Balancer or Network Load Balancer. To update a listener, use ModifyListener. When you are finished with a listener, you can delete it using DeleteListener. If you are finished with both the listener and the load balancer, you can delete them both using DeleteLoadBalancer. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple listeners with the same settings, each call succeeds. For more information, see Listeners for Your Application Load Balancers in the Application Load Balancers Guide and Listeners for Your Network Load Balancers in the Network Load Balancers Guide.
    */
  def createListener(): awsDashSdkLib.libRequestMod.Request[CreateListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a listener for the specified Application Load Balancer or Network Load Balancer. To update a listener, use ModifyListener. When you are finished with a listener, you can delete it using DeleteListener. If you are finished with both the listener and the load balancer, you can delete them both using DeleteLoadBalancer. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple listeners with the same settings, each call succeeds. For more information, see Listeners for Your Application Load Balancers in the Application Load Balancers Guide and Listeners for Your Network Load Balancers in the Network Load Balancers Guide.
    */
  def createListener(params: CreateListenerInput): awsDashSdkLib.libRequestMod.Request[CreateListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createListener(
    params: CreateListenerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Application Load Balancer or a Network Load Balancer. When you create a load balancer, you can specify security groups, public subnets, IP address type, and tags. Otherwise, you could do so later using SetSecurityGroups, SetSubnets, SetIpAddressType, and AddTags. To create listeners for your load balancer, use CreateListener. To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using DeleteLoadBalancer. For limit information, see Limits for Your Application Load Balancer in the Application Load Balancers Guide and Limits for Your Network Load Balancer in the Network Load Balancers Guide. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple load balancers with the same settings, each call succeeds. For more information, see Application Load Balancers in the Application Load Balancers Guide and Network Load Balancers in the Network Load Balancers Guide.
    */
  def createLoadBalancer(): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoadBalancerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Application Load Balancer or a Network Load Balancer. When you create a load balancer, you can specify security groups, public subnets, IP address type, and tags. Otherwise, you could do so later using SetSecurityGroups, SetSubnets, SetIpAddressType, and AddTags. To create listeners for your load balancer, use CreateListener. To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using DeleteLoadBalancer. For limit information, see Limits for Your Application Load Balancer in the Application Load Balancers Guide and Limits for Your Network Load Balancer in the Network Load Balancers Guide. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple load balancers with the same settings, each call succeeds. For more information, see Application Load Balancers in the Application Load Balancers Guide and Network Load Balancers in the Network Load Balancers Guide.
    */
  def createLoadBalancer(params: CreateLoadBalancerInput): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoadBalancer(
    params: CreateLoadBalancerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoadBalancerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer. Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are performed. For more information, see Listener Rules in the Application Load Balancers Guide. To view your current rules, use DescribeRules. To update a rule, use ModifyRule. To set the priorities of your rules, use SetRulePriorities. To delete a rule, use DeleteRule.
    */
  def createRule(): awsDashSdkLib.libRequestMod.Request[CreateRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRuleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer. Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are performed. For more information, see Listener Rules in the Application Load Balancers Guide. To view your current rules, use DescribeRules. To update a rule, use ModifyRule. To set the priorities of your rules, use SetRulePriorities. To delete a rule, use DeleteRule.
    */
  def createRule(params: CreateRuleInput): awsDashSdkLib.libRequestMod.Request[CreateRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRule(
    params: CreateRuleInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRuleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a target group. To register targets with the target group, use RegisterTargets. To update the health check settings for the target group, use ModifyTargetGroup. To monitor the health of targets in the target group, use DescribeTargetHealth. To route traffic to the targets in a target group, specify the target group in an action using CreateListener or CreateRule. To delete a target group, use DeleteTargetGroup. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple target groups with the same settings, each call succeeds. For more information, see Target Groups for Your Application Load Balancers in the Application Load Balancers Guide or Target Groups for Your Network Load Balancers in the Network Load Balancers Guide.
    */
  def createTargetGroup(): awsDashSdkLib.libRequestMod.Request[CreateTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTargetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTargetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a target group. To register targets with the target group, use RegisterTargets. To update the health check settings for the target group, use ModifyTargetGroup. To monitor the health of targets in the target group, use DescribeTargetHealth. To route traffic to the targets in a target group, specify the target group in an action using CreateListener or CreateRule. To delete a target group, use DeleteTargetGroup. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple target groups with the same settings, each call succeeds. For more information, see Target Groups for Your Application Load Balancers in the Application Load Balancers Guide or Target Groups for Your Network Load Balancers in the Network Load Balancers Guide.
    */
  def createTargetGroup(params: CreateTargetGroupInput): awsDashSdkLib.libRequestMod.Request[CreateTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTargetGroup(
    params: CreateTargetGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTargetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified listener. Alternatively, your listener is deleted when you delete the load balancer to which it is attached, using DeleteLoadBalancer.
    */
  def deleteListener(): awsDashSdkLib.libRequestMod.Request[DeleteListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified listener. Alternatively, your listener is deleted when you delete the load balancer to which it is attached, using DeleteLoadBalancer.
    */
  def deleteListener(params: DeleteListenerInput): awsDashSdkLib.libRequestMod.Request[DeleteListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteListener(
    params: DeleteListenerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Application Load Balancer or Network Load Balancer and its attached listeners. You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has already been deleted, the call succeeds. Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or terminate them.
    */
  def deleteLoadBalancer(): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLoadBalancerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Application Load Balancer or Network Load Balancer and its attached listeners. You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has already been deleted, the call succeeds. Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or terminate them.
    */
  def deleteLoadBalancer(params: DeleteLoadBalancerInput): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoadBalancer(
    params: DeleteLoadBalancerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLoadBalancerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified rule.
    */
  def deleteRule(): awsDashSdkLib.libRequestMod.Request[DeleteRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRuleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified rule.
    */
  def deleteRule(params: DeleteRuleInput): awsDashSdkLib.libRequestMod.Request[DeleteRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRule(
    params: DeleteRuleInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRuleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified target group. You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any associated health checks.
    */
  def deleteTargetGroup(): awsDashSdkLib.libRequestMod.Request[DeleteTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTargetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTargetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified target group. You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any associated health checks.
    */
  def deleteTargetGroup(params: DeleteTargetGroupInput): awsDashSdkLib.libRequestMod.Request[DeleteTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTargetGroup(
    params: DeleteTargetGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTargetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no longer receive traffic from the load balancer.
    */
  def deregisterTargets(): awsDashSdkLib.libRequestMod.Request[DeregisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no longer receive traffic from the load balancer.
    */
  def deregisterTargets(params: DeregisterTargetsInput): awsDashSdkLib.libRequestMod.Request[DeregisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterTargets(
    params: DeregisterTargetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see Limits for Your Application Load Balancers in the Application Load Balancer Guide or Limits for Your Network Load Balancers in the Network Load Balancers Guide.
    */
  def describeAccountLimits(): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccountLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccountLimitsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see Limits for Your Application Load Balancers in the Application Load Balancer Guide or Limits for Your Network Load Balancers in the Network Load Balancers Guide.
    */
  def describeAccountLimits(params: DescribeAccountLimitsInput): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccountLimits(
    params: DescribeAccountLimitsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccountLimitsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the default certificate and the certificate list for the specified HTTPS listener. If the default certificate is also in the certificate list, it appears twice in the results (once with IsDefault set to true and once with IsDefault set to false). For more information, see SSL Certificates in the Application Load Balancers Guide.
    */
  def describeListenerCertificates(): awsDashSdkLib.libRequestMod.Request[DescribeListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeListenerCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeListenerCertificatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the default certificate and the certificate list for the specified HTTPS listener. If the default certificate is also in the certificate list, it appears twice in the results (once with IsDefault set to true and once with IsDefault set to false). For more information, see SSL Certificates in the Application Load Balancers Guide.
    */
  def describeListenerCertificates(params: DescribeListenerCertificatesInput): awsDashSdkLib.libRequestMod.Request[DescribeListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeListenerCertificates(
    params: DescribeListenerCertificatesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeListenerCertificatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified listeners or the listeners for the specified Application Load Balancer or Network Load Balancer. You must specify either a load balancer or one or more listeners. For an HTTPS or TLS listener, the output includes the default certificate for the listener. To describe the certificate list for the listener, use DescribeListenerCertificates.
    */
  def describeListeners(): awsDashSdkLib.libRequestMod.Request[DescribeListenersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeListeners(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeListenersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeListenersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified listeners or the listeners for the specified Application Load Balancer or Network Load Balancer. You must specify either a load balancer or one or more listeners. For an HTTPS or TLS listener, the output includes the default certificate for the listener. To describe the certificate list for the listener, use DescribeListenerCertificates.
    */
  def describeListeners(params: DescribeListenersInput): awsDashSdkLib.libRequestMod.Request[DescribeListenersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeListeners(
    params: DescribeListenersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeListenersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeListenersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the attributes for the specified Application Load Balancer or Network Load Balancer. For more information, see Load Balancer Attributes in the Application Load Balancers Guide or Load Balancer Attributes in the Network Load Balancers Guide.
    */
  def describeLoadBalancerAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancerAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancerAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the attributes for the specified Application Load Balancer or Network Load Balancer. For more information, see Load Balancer Attributes in the Application Load Balancers Guide or Load Balancer Attributes in the Network Load Balancers Guide.
    */
  def describeLoadBalancerAttributes(params: DescribeLoadBalancerAttributesInput): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancerAttributes(
    params: DescribeLoadBalancerAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancerAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified load balancers or all of your load balancers. To describe the listeners for a load balancer, use DescribeListeners. To describe the attributes for a load balancer, use DescribeLoadBalancerAttributes.
    */
  def describeLoadBalancers(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified load balancers or all of your load balancers. To describe the listeners for a load balancer, use DescribeListeners. To describe the attributes for a load balancer, use DescribeLoadBalancerAttributes.
    */
  def describeLoadBalancers(params: DescribeLoadBalancersInput): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancers(
    params: DescribeLoadBalancersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one or more rules.
    */
  def describeRules(): awsDashSdkLib.libRequestMod.Request[DescribeRulesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRulesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRulesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one or more rules.
    */
  def describeRules(params: DescribeRulesInput): awsDashSdkLib.libRequestMod.Request[DescribeRulesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRules(
    params: DescribeRulesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRulesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRulesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified policies or all policies used for SSL negotiation. For more information, see Security Policies in the Application Load Balancers Guide.
    */
  def describeSSLPolicies(): awsDashSdkLib.libRequestMod.Request[DescribeSSLPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSSLPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSSLPoliciesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSSLPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified policies or all policies used for SSL negotiation. For more information, see Security Policies in the Application Load Balancers Guide.
    */
  def describeSSLPolicies(params: DescribeSSLPoliciesInput): awsDashSdkLib.libRequestMod.Request[DescribeSSLPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeSSLPolicies(
    params: DescribeSSLPoliciesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeSSLPoliciesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeSSLPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the tags for the specified resources. You can describe the tags for one or more Application Load Balancers, Network Load Balancers, and target groups.
    */
  def describeTags(): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the tags for the specified resources. You can describe the tags for one or more Application Load Balancers, Network Load Balancers, and target groups.
    */
  def describeTags(params: DescribeTagsInput): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTags(
    params: DescribeTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the attributes for the specified target group. For more information, see Target Group Attributes in the Application Load Balancers Guide or Target Group Attributes in the Network Load Balancers Guide.
    */
  def describeTargetGroupAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTargetGroupAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTargetGroupAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the attributes for the specified target group. For more information, see Target Group Attributes in the Application Load Balancers Guide or Target Group Attributes in the Network Load Balancers Guide.
    */
  def describeTargetGroupAttributes(params: DescribeTargetGroupAttributesInput): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTargetGroupAttributes(
    params: DescribeTargetGroupAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTargetGroupAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified target groups or all of your target groups. By default, all target groups are described. Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the names of one or more target groups, or the ARNs of one or more target groups. To describe the targets for a target group, use DescribeTargetHealth. To describe the attributes of a target group, use DescribeTargetGroupAttributes.
    */
  def describeTargetGroups(): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTargetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTargetGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified target groups or all of your target groups. By default, all target groups are described. Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the names of one or more target groups, or the ARNs of one or more target groups. To describe the targets for a target group, use DescribeTargetHealth. To describe the attributes of a target group, use DescribeTargetGroupAttributes.
    */
  def describeTargetGroups(params: DescribeTargetGroupsInput): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTargetGroups(
    params: DescribeTargetGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTargetGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTargetGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the health of the specified targets or all of your targets.
    */
  def describeTargetHealth(): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTargetHealth(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTargetHealthOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the health of the specified targets or all of your targets.
    */
  def describeTargetHealth(params: DescribeTargetHealthInput): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTargetHealth(
    params: DescribeTargetHealthInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTargetHealthOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified properties of the specified listener. Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to HTTP, or from TLS to TCP, removes the security policy and default certificate properties. If you change the protocol from HTTP to HTTPS, or from TCP to TLS, you must add the security policy and default certificate properties.
    */
  def modifyListener(): awsDashSdkLib.libRequestMod.Request[ModifyListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified properties of the specified listener. Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to HTTP, or from TLS to TCP, removes the security policy and default certificate properties. If you change the protocol from HTTP to HTTPS, or from TCP to TLS, you must add the security policy and default certificate properties.
    */
  def modifyListener(params: ModifyListenerInput): awsDashSdkLib.libRequestMod.Request[ModifyListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyListener(
    params: ModifyListenerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified attributes of the specified Application Load Balancer or Network Load Balancer. If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that you do not modify retain their current values.
    */
  def modifyLoadBalancerAttributes(): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyLoadBalancerAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyLoadBalancerAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified attributes of the specified Application Load Balancer or Network Load Balancer. If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that you do not modify retain their current values.
    */
  def modifyLoadBalancerAttributes(params: ModifyLoadBalancerAttributesInput): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyLoadBalancerAttributes(
    params: ModifyLoadBalancerAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyLoadBalancerAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified rule. Any existing properties that you do not modify retain their current values. To modify the actions for the default rule, use ModifyListener.
    */
  def modifyRule(): awsDashSdkLib.libRequestMod.Request[ModifyRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyRuleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified rule. Any existing properties that you do not modify retain their current values. To modify the actions for the default rule, use ModifyListener.
    */
  def modifyRule(params: ModifyRuleInput): awsDashSdkLib.libRequestMod.Request[ModifyRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyRule(
    params: ModifyRuleInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyRuleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyRuleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the health checks used when evaluating the health state of the targets in the specified target group. To monitor the health of the targets, use DescribeTargetHealth.
    */
  def modifyTargetGroup(): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyTargetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyTargetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the health checks used when evaluating the health state of the targets in the specified target group. To monitor the health of the targets, use DescribeTargetHealth.
    */
  def modifyTargetGroup(params: ModifyTargetGroupInput): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyTargetGroup(
    params: ModifyTargetGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyTargetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified attributes of the specified target group.
    */
  def modifyTargetGroupAttributes(): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyTargetGroupAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyTargetGroupAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified attributes of the specified target group.
    */
  def modifyTargetGroupAttributes(params: ModifyTargetGroupAttributesInput): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyTargetGroupAttributes(
    params: ModifyTargetGroupAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyTargetGroupAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyTargetGroupAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers the specified targets with the specified target group. If the target is an EC2 instance, it must be in the running state when you register it. By default, the load balancer routes requests to registered targets using the protocol and port for the target group. Alternatively, you can override the port for a target when you register it. You can register each EC2 instance or IP address with the same target group multiple times using different ports. With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of these types by IP address. To remove a target from a target group, use DeregisterTargets.
    */
  def registerTargets(): awsDashSdkLib.libRequestMod.Request[RegisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers the specified targets with the specified target group. If the target is an EC2 instance, it must be in the running state when you register it. By default, the load balancer routes requests to registered targets using the protocol and port for the target group. Alternatively, you can override the port for a target when you register it. You can register each EC2 instance or IP address with the same target group multiple times using different ports. With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of these types by IP address. To remove a target from a target group, use DeregisterTargets.
    */
  def registerTargets(params: RegisterTargetsInput): awsDashSdkLib.libRequestMod.Request[RegisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerTargets(
    params: RegisterTargetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterTargetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified certificate from the certificate list for the specified HTTPS listener. You can't remove the default certificate for a listener. To replace the default certificate, call ModifyListener. To list the certificates for your listener, use DescribeListenerCertificates.
    */
  def removeListenerCertificates(): awsDashSdkLib.libRequestMod.Request[RemoveListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeListenerCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveListenerCertificatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified certificate from the certificate list for the specified HTTPS listener. You can't remove the default certificate for a listener. To replace the default certificate, call ModifyListener. To list the certificates for your listener, use DescribeListenerCertificates.
    */
  def removeListenerCertificates(params: RemoveListenerCertificatesInput): awsDashSdkLib.libRequestMod.Request[RemoveListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeListenerCertificates(
    params: RemoveListenerCertificatesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveListenerCertificatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveListenerCertificatesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified tags from the specified Elastic Load Balancing resource. To list the current tags for your resources, use DescribeTags.
    */
  def removeTags(): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified tags from the specified Elastic Load Balancing resource. To list the current tags for your resources, use DescribeTags.
    */
  def removeTags(params: RemoveTagsInput): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTags(
    params: RemoveTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load Balancer.
    */
  def setIpAddressType(): awsDashSdkLib.libRequestMod.Request[SetIpAddressTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setIpAddressType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetIpAddressTypeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetIpAddressTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load Balancer.
    */
  def setIpAddressType(params: SetIpAddressTypeInput): awsDashSdkLib.libRequestMod.Request[SetIpAddressTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setIpAddressType(
    params: SetIpAddressTypeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetIpAddressTypeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetIpAddressTypeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the priorities of the specified rules. You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that you do not specify retain their current priority.
    */
  def setRulePriorities(): awsDashSdkLib.libRequestMod.Request[SetRulePrioritiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setRulePriorities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetRulePrioritiesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetRulePrioritiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the priorities of the specified rules. You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that you do not specify retain their current priority.
    */
  def setRulePriorities(params: SetRulePrioritiesInput): awsDashSdkLib.libRequestMod.Request[SetRulePrioritiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setRulePriorities(
    params: SetRulePrioritiesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetRulePrioritiesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetRulePrioritiesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified security groups with the specified Application Load Balancer. The specified security groups override the previously associated security groups. You can't specify a security group for a Network Load Balancer.
    */
  def setSecurityGroups(): awsDashSdkLib.libRequestMod.Request[SetSecurityGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setSecurityGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetSecurityGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetSecurityGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified security groups with the specified Application Load Balancer. The specified security groups override the previously associated security groups. You can't specify a security group for a Network Load Balancer.
    */
  def setSecurityGroups(params: SetSecurityGroupsInput): awsDashSdkLib.libRequestMod.Request[SetSecurityGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setSecurityGroups(
    params: SetSecurityGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetSecurityGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetSecurityGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the Availability Zone for the specified public subnets for the specified Application Load Balancer. The specified subnets replace the previously enabled subnets. You can't change the subnets for a Network Load Balancer.
    */
  def setSubnets(): awsDashSdkLib.libRequestMod.Request[SetSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setSubnets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetSubnetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the Availability Zone for the specified public subnets for the specified Application Load Balancer. The specified subnets replace the previously enabled subnets. You can't change the subnets for a Network Load Balancer.
    */
  def setSubnets(params: SetSubnetsInput): awsDashSdkLib.libRequestMod.Request[SetSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setSubnets(
    params: SetSubnetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetSubnetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the loadBalancerAvailable state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancerAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerAvailable): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancerAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the loadBalancerAvailable state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancerAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerAvailable,
    params: DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancerAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerAvailable,
    params: DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the loadBalancerExists state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancerExists(state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerExists): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancerExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the loadBalancerExists state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancerExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerExists,
    params: DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancerExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerExists,
    params: DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the loadBalancersDeleted state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancersDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancersDeleted): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancersDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancersDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the loadBalancersDeleted state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancersDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancersDeleted,
    params: DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancersDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancersDeleted,
    params: DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the targetDeregistered state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_targetDeregistered(state: awsDashSdkLib.awsDashSdkLibStrings.targetDeregistered): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_targetDeregistered(
    state: awsDashSdkLib.awsDashSdkLibStrings.targetDeregistered,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTargetHealthOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the targetDeregistered state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_targetDeregistered(
    state: awsDashSdkLib.awsDashSdkLibStrings.targetDeregistered,
    params: DescribeTargetHealthInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_targetDeregistered(
    state: awsDashSdkLib.awsDashSdkLibStrings.targetDeregistered,
    params: DescribeTargetHealthInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTargetHealthOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the targetInService state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_targetInService(state: awsDashSdkLib.awsDashSdkLibStrings.targetInService): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_targetInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.targetInService,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTargetHealthOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the targetInService state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_targetInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.targetInService,
    params: DescribeTargetHealthInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_targetInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.targetInService,
    params: DescribeTargetHealthInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTargetHealthOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTargetHealthOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

