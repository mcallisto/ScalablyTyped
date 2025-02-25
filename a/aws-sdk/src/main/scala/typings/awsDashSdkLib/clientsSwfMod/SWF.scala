package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SWF
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SWF: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Returns the number of closed workflow executions within the given domain that meet the specified filtering criteria.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def countClosedWorkflowExecutions(): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def countClosedWorkflowExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowExecutionCount, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the number of closed workflow executions within the given domain that meet the specified filtering criteria.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def countClosedWorkflowExecutions(params: CountClosedWorkflowExecutionsInput): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def countClosedWorkflowExecutions(
    params: CountClosedWorkflowExecutionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowExecutionCount, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the number of open workflow executions within the given domain that meet the specified filtering criteria.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def countOpenWorkflowExecutions(): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def countOpenWorkflowExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowExecutionCount, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the number of open workflow executions within the given domain that meet the specified filtering criteria.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def countOpenWorkflowExecutions(params: CountOpenWorkflowExecutionsInput): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def countOpenWorkflowExecutions(
    params: CountOpenWorkflowExecutionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowExecutionCount, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the estimated number of activity tasks in the specified task list. The count returned is an approximation and isn't guaranteed to be exact. If you specify a task list that no activity task was ever scheduled in then 0 is returned.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def countPendingActivityTasks(): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def countPendingActivityTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PendingTaskCount, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the estimated number of activity tasks in the specified task list. The count returned is an approximation and isn't guaranteed to be exact. If you specify a task list that no activity task was ever scheduled in then 0 is returned.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def countPendingActivityTasks(params: CountPendingActivityTasksInput): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def countPendingActivityTasks(
    params: CountPendingActivityTasksInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PendingTaskCount, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the estimated number of decision tasks in the specified task list. The count returned is an approximation and isn't guaranteed to be exact. If you specify a task list that no decision task was ever scheduled in then 0 is returned.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def countPendingDecisionTasks(): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def countPendingDecisionTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PendingTaskCount, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the estimated number of decision tasks in the specified task list. The count returned is an approximation and isn't guaranteed to be exact. If you specify a task list that no decision task was ever scheduled in then 0 is returned.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def countPendingDecisionTasks(params: CountPendingDecisionTasksInput): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def countPendingDecisionTasks(
    params: CountPendingDecisionTasksInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PendingTaskCount, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PendingTaskCount, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecates the specified activity type. After an activity type has been deprecated, you cannot create new tasks of that activity type. Tasks of this type that were scheduled before the type was deprecated continue to run.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def deprecateActivityType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deprecateActivityType(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecates the specified activity type. After an activity type has been deprecated, you cannot create new tasks of that activity type. Tasks of this type that were scheduled before the type was deprecated continue to run.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def deprecateActivityType(params: DeprecateActivityTypeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deprecateActivityType(
    params: DeprecateActivityTypeInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecates the specified domain. After a domain has been deprecated it cannot be used to create new workflow executions or register new types. However, you can still use visibility actions on this domain. Deprecating a domain also deprecates all activity and workflow types registered in the domain. Executions that were started before the domain was deprecated continues to run.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def deprecateDomain(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deprecateDomain(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecates the specified domain. After a domain has been deprecated it cannot be used to create new workflow executions or register new types. However, you can still use visibility actions on this domain. Deprecating a domain also deprecates all activity and workflow types registered in the domain. Executions that were started before the domain was deprecated continues to run.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def deprecateDomain(params: DeprecateDomainInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deprecateDomain(
    params: DeprecateDomainInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecates the specified workflow type. After a workflow type has been deprecated, you cannot create new executions of that type. Executions that were started before the type was deprecated continues to run. A deprecated workflow type may still be used when calling visibility actions.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def deprecateWorkflowType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deprecateWorkflowType(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecates the specified workflow type. After a workflow type has been deprecated, you cannot create new executions of that type. Executions that were started before the type was deprecated continues to run. A deprecated workflow type may still be used when calling visibility actions.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def deprecateWorkflowType(params: DeprecateWorkflowTypeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deprecateWorkflowType(
    params: DeprecateWorkflowTypeInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified activity type. This includes configuration settings provided when the type was registered and other general information about the type.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def describeActivityType(): awsDashSdkLib.libRequestMod.Request[ActivityTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeActivityType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ActivityTypeDetail, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ActivityTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified activity type. This includes configuration settings provided when the type was registered and other general information about the type.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def describeActivityType(params: DescribeActivityTypeInput): awsDashSdkLib.libRequestMod.Request[ActivityTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeActivityType(
    params: DescribeActivityTypeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ActivityTypeDetail, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ActivityTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified domain, including description and status.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def describeDomain(): awsDashSdkLib.libRequestMod.Request[DomainDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDomain(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainDetail, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DomainDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified domain, including description and status.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def describeDomain(params: DescribeDomainInput): awsDashSdkLib.libRequestMod.Request[DomainDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDomain(
    params: DescribeDomainInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainDetail, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DomainDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified workflow execution including its type and some statistics.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def describeWorkflowExecution(): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeWorkflowExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowExecutionDetail, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified workflow execution including its type and some statistics.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def describeWorkflowExecution(params: DescribeWorkflowExecutionInput): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeWorkflowExecution(
    params: DescribeWorkflowExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowExecutionDetail, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified workflow type. This includes configuration settings specified when the type was registered and other information such as creation date, current status, etc.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def describeWorkflowType(): awsDashSdkLib.libRequestMod.Request[WorkflowTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeWorkflowType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowTypeDetail, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified workflow type. This includes configuration settings specified when the type was registered and other information such as creation date, current status, etc.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def describeWorkflowType(params: DescribeWorkflowTypeInput): awsDashSdkLib.libRequestMod.Request[WorkflowTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeWorkflowType(
    params: DescribeWorkflowTypeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowTypeDetail, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowTypeDetail, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the history of the specified workflow execution. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def getWorkflowExecutionHistory(): awsDashSdkLib.libRequestMod.Request[History, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWorkflowExecutionHistory(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ History, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[History, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the history of the specified workflow execution. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def getWorkflowExecutionHistory(params: GetWorkflowExecutionHistoryInput): awsDashSdkLib.libRequestMod.Request[History, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWorkflowExecutionHistory(
    params: GetWorkflowExecutionHistoryInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ History, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[History, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all activities registered in the specified domain that match the specified name and registration status. The result includes information like creation date, current status of the activity, etc. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def listActivityTypes(): awsDashSdkLib.libRequestMod.Request[ActivityTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listActivityTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ActivityTypeInfos, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ActivityTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all activities registered in the specified domain that match the specified name and registration status. The result includes information like creation date, current status of the activity, etc. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def listActivityTypes(params: ListActivityTypesInput): awsDashSdkLib.libRequestMod.Request[ActivityTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listActivityTypes(
    params: ListActivityTypesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ActivityTypeInfos, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ActivityTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of closed workflow executions in the specified domain that meet the filtering criteria. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def listClosedWorkflowExecutions(): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listClosedWorkflowExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowExecutionInfos, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of closed workflow executions in the specified domain that meet the filtering criteria. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def listClosedWorkflowExecutions(params: ListClosedWorkflowExecutionsInput): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listClosedWorkflowExecutions(
    params: ListClosedWorkflowExecutionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowExecutionInfos, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of domains registered in the account. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains. The element must be set to arn:aws:swf::AccountID:domain/ *, where AccountID is the account ID, with no dashes.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def listDomains(): awsDashSdkLib.libRequestMod.Request[DomainInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDomains(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainInfos, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DomainInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of domains registered in the account. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains. The element must be set to arn:aws:swf::AccountID:domain/ *, where AccountID is the account ID, with no dashes.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def listDomains(params: ListDomainsInput): awsDashSdkLib.libRequestMod.Request[DomainInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDomains(
    params: ListDomainsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DomainInfos, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DomainInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of open workflow executions in the specified domain that meet the filtering criteria. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def listOpenWorkflowExecutions(): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOpenWorkflowExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowExecutionInfos, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of open workflow executions in the specified domain that meet the filtering criteria. The results may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken returned by the initial call.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagFilter.tag: String constraint. The key is swf:tagFilter.tag.    typeFilter.name: String constraint. The key is swf:typeFilter.name.    typeFilter.version: String constraint. The key is swf:typeFilter.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def listOpenWorkflowExecutions(params: ListOpenWorkflowExecutionsInput): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOpenWorkflowExecutions(
    params: ListOpenWorkflowExecutionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowExecutionInfos, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowExecutionInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List tags for a given domain.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List tags for a given domain.
    */
  def listTagsForResource(params: ListTagsForResourceInput): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about workflow types in the specified domain. The results may be split into multiple pages that can be retrieved by making the call repeatedly.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def listWorkflowTypes(): awsDashSdkLib.libRequestMod.Request[WorkflowTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listWorkflowTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowTypeInfos, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about workflow types in the specified domain. The results may be split into multiple pages that can be retrieved by making the call repeatedly.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def listWorkflowTypes(params: ListWorkflowTypesInput): awsDashSdkLib.libRequestMod.Request[WorkflowTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listWorkflowTypes(
    params: ListWorkflowTypesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ WorkflowTypeInfos, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[WorkflowTypeInfos, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by workers to get an ActivityTask from the specified activity taskList. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available. The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns an empty result. An empty result, in this context, means that an ActivityTask is returned, but that the value of taskToken is an empty string. If a task is returned, the worker should use its type to identify and process it correctly.  Workers should set their client side socket timeout to at least 70 seconds (10 seconds higher than the maximum time service may hold the poll request).   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def pollForActivityTask(): awsDashSdkLib.libRequestMod.Request[ActivityTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def pollForActivityTask(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ActivityTask, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ActivityTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by workers to get an ActivityTask from the specified activity taskList. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available. The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns an empty result. An empty result, in this context, means that an ActivityTask is returned, but that the value of taskToken is an empty string. If a task is returned, the worker should use its type to identify and process it correctly.  Workers should set their client side socket timeout to at least 70 seconds (10 seconds higher than the maximum time service may hold the poll request).   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def pollForActivityTask(params: PollForActivityTaskInput): awsDashSdkLib.libRequestMod.Request[ActivityTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def pollForActivityTask(
    params: PollForActivityTaskInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ActivityTask, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ActivityTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by deciders to get a DecisionTask from the specified decision taskList. A decision task may be returned for any open workflow execution that is using the specified task list. The task includes a paginated view of the history of the workflow execution. The decider should use the workflow type and the history to determine how to properly handle the task. This action initiates a long poll, where the service holds the HTTP connection open and responds as soon a task becomes available. If no decision task is available in the specified task list before the timeout of 60 seconds expires, an empty result is returned. An empty result, in this context, means that a DecisionTask is returned, but that the value of taskToken is an empty string.  Deciders should set their client side socket timeout to at least 70 seconds (10 seconds higher than the timeout).   Because the number of workflow history events for a single workflow execution might be very large, the result returned might be split up across a number of pages. To retrieve subsequent pages, make additional calls to PollForDecisionTask using the nextPageToken returned by the initial call. Note that you do not call GetWorkflowExecutionHistory with this nextPageToken. Instead, call PollForDecisionTask again.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def pollForDecisionTask(): awsDashSdkLib.libRequestMod.Request[DecisionTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def pollForDecisionTask(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DecisionTask, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DecisionTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by deciders to get a DecisionTask from the specified decision taskList. A decision task may be returned for any open workflow execution that is using the specified task list. The task includes a paginated view of the history of the workflow execution. The decider should use the workflow type and the history to determine how to properly handle the task. This action initiates a long poll, where the service holds the HTTP connection open and responds as soon a task becomes available. If no decision task is available in the specified task list before the timeout of 60 seconds expires, an empty result is returned. An empty result, in this context, means that a DecisionTask is returned, but that the value of taskToken is an empty string.  Deciders should set their client side socket timeout to at least 70 seconds (10 seconds higher than the timeout).   Because the number of workflow history events for a single workflow execution might be very large, the result returned might be split up across a number of pages. To retrieve subsequent pages, make additional calls to PollForDecisionTask using the nextPageToken returned by the initial call. Note that you do not call GetWorkflowExecutionHistory with this nextPageToken. Instead, call PollForDecisionTask again.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the taskList.name parameter by using a Condition element with the swf:taskList.name key to allow the action to access only certain task lists.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def pollForDecisionTask(params: PollForDecisionTaskInput): awsDashSdkLib.libRequestMod.Request[DecisionTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def pollForDecisionTask(
    params: PollForDecisionTaskInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DecisionTask, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DecisionTask, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by activity workers to report to the service that the ActivityTask represented by the specified taskToken is still making progress. The worker can also specify details of the progress, for example percent complete, using the details parameter. This action can also be used by the worker as a mechanism to check if cancellation is being requested for the activity task. If a cancellation is being attempted for the specified task, then the boolean cancelRequested flag returned by the service is set to true. This action resets the taskHeartbeatTimeout clock. The taskHeartbeatTimeout is specified in RegisterActivityType. This action doesn't in itself create an event in the workflow execution history. However, if the task times out, the workflow execution history contains a ActivityTaskTimedOut event that contains the information from the last heartbeat generated by the activity worker.  The taskStartToCloseTimeout of an activity type is the maximum duration of an activity task, regardless of the number of RecordActivityTaskHeartbeat requests received. The taskStartToCloseTimeout is also specified in RegisterActivityType.   This operation is only useful for long-lived activities to report liveliness of the task and to determine if a cancellation is being attempted.   If the cancelRequested flag returns true, a cancellation is being attempted. If the worker can cancel the activity, it should respond with RespondActivityTaskCanceled. Otherwise, it should ignore the cancellation request.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def recordActivityTaskHeartbeat(): awsDashSdkLib.libRequestMod.Request[ActivityTaskStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def recordActivityTaskHeartbeat(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ActivityTaskStatus, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ActivityTaskStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by activity workers to report to the service that the ActivityTask represented by the specified taskToken is still making progress. The worker can also specify details of the progress, for example percent complete, using the details parameter. This action can also be used by the worker as a mechanism to check if cancellation is being requested for the activity task. If a cancellation is being attempted for the specified task, then the boolean cancelRequested flag returned by the service is set to true. This action resets the taskHeartbeatTimeout clock. The taskHeartbeatTimeout is specified in RegisterActivityType. This action doesn't in itself create an event in the workflow execution history. However, if the task times out, the workflow execution history contains a ActivityTaskTimedOut event that contains the information from the last heartbeat generated by the activity worker.  The taskStartToCloseTimeout of an activity type is the maximum duration of an activity task, regardless of the number of RecordActivityTaskHeartbeat requests received. The taskStartToCloseTimeout is also specified in RegisterActivityType.   This operation is only useful for long-lived activities to report liveliness of the task and to determine if a cancellation is being attempted.   If the cancelRequested flag returns true, a cancellation is being attempted. If the worker can cancel the activity, it should respond with RespondActivityTaskCanceled. Otherwise, it should ignore the cancellation request.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def recordActivityTaskHeartbeat(params: RecordActivityTaskHeartbeatInput): awsDashSdkLib.libRequestMod.Request[ActivityTaskStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def recordActivityTaskHeartbeat(
    params: RecordActivityTaskHeartbeatInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ActivityTaskStatus, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ActivityTaskStatus, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a new activity type along with its configuration settings in the specified domain.  A TypeAlreadyExists fault is returned if the type already exists in the domain. You cannot change any configuration settings of the type after its registration, and it must be registered as a new version.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.    name: String constraint. The key is swf:name.    version: String constraint. The key is swf:version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def registerActivityType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerActivityType(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a new activity type along with its configuration settings in the specified domain.  A TypeAlreadyExists fault is returned if the type already exists in the domain. You cannot change any configuration settings of the type after its registration, and it must be registered as a new version.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.    name: String constraint. The key is swf:name.    version: String constraint. The key is swf:version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def registerActivityType(params: RegisterActivityTypeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerActivityType(
    params: RegisterActivityTypeInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a new domain.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   You cannot use an IAM policy to control domain access for this action. The name of the domain being registered is available as the resource of this action.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def registerDomain(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerDomain(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a new domain.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   You cannot use an IAM policy to control domain access for this action. The name of the domain being registered is available as the resource of this action.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def registerDomain(params: RegisterDomainInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerDomain(
    params: RegisterDomainInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a new workflow type and its configuration settings in the specified domain. The retention period for the workflow history is set by the RegisterDomain action.  If the type already exists, then a TypeAlreadyExists fault is returned. You cannot change the configuration settings of a workflow type once it is registered and it must be registered as a new version.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.    name: String constraint. The key is swf:name.    version: String constraint. The key is swf:version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def registerWorkflowType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerWorkflowType(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a new workflow type and its configuration settings in the specified domain. The retention period for the workflow history is set by the RegisterDomain action.  If the type already exists, then a TypeAlreadyExists fault is returned. You cannot change the configuration settings of a workflow type once it is registered and it must be registered as a new version.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    defaultTaskList.name: String constraint. The key is swf:defaultTaskList.name.    name: String constraint. The key is swf:name.    version: String constraint. The key is swf:version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def registerWorkflowType(params: RegisterWorkflowTypeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerWorkflowType(
    params: RegisterWorkflowTypeInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Records a WorkflowExecutionCancelRequested event in the currently running workflow execution identified by the given domain, workflowId, and runId. This logically requests the cancellation of the workflow execution as a whole. It is up to the decider to take appropriate actions when it receives an execution history with this event.  If the runId isn't specified, the WorkflowExecutionCancelRequested event is recorded in the history of the current open workflow execution with the specified workflowId in the domain.   Because this action allows the workflow to properly clean up and gracefully close, it should be used instead of TerminateWorkflowExecution when possible.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def requestCancelWorkflowExecution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def requestCancelWorkflowExecution(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Records a WorkflowExecutionCancelRequested event in the currently running workflow execution identified by the given domain, workflowId, and runId. This logically requests the cancellation of the workflow execution as a whole. It is up to the decider to take appropriate actions when it receives an execution history with this event.  If the runId isn't specified, the WorkflowExecutionCancelRequested event is recorded in the history of the current open workflow execution with the specified workflowId in the domain.   Because this action allows the workflow to properly clean up and gracefully close, it should be used instead of TerminateWorkflowExecution when possible.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def requestCancelWorkflowExecution(params: RequestCancelWorkflowExecutionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def requestCancelWorkflowExecution(
    params: RequestCancelWorkflowExecutionInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by workers to tell the service that the ActivityTask identified by the taskToken was successfully canceled. Additional details can be provided using the details argument. These details (if provided) appear in the ActivityTaskCanceled event added to the workflow history.  Only use this operation if the canceled flag of a RecordActivityTaskHeartbeat request returns true and if the activity can be safely undone or abandoned.  A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def respondActivityTaskCanceled(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def respondActivityTaskCanceled(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by workers to tell the service that the ActivityTask identified by the taskToken was successfully canceled. Additional details can be provided using the details argument. These details (if provided) appear in the ActivityTaskCanceled event added to the workflow history.  Only use this operation if the canceled flag of a RecordActivityTaskHeartbeat request returns true and if the activity can be safely undone or abandoned.  A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def respondActivityTaskCanceled(params: RespondActivityTaskCanceledInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def respondActivityTaskCanceled(
    params: RespondActivityTaskCanceledInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by workers to tell the service that the ActivityTask identified by the taskToken completed successfully with a result (if provided). The result appears in the ActivityTaskCompleted event in the workflow history.  If the requested task doesn't complete successfully, use RespondActivityTaskFailed instead. If the worker finds that the task is canceled through the canceled flag returned by RecordActivityTaskHeartbeat, it should cancel the task, clean up and then call RespondActivityTaskCanceled.  A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def respondActivityTaskCompleted(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def respondActivityTaskCompleted(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by workers to tell the service that the ActivityTask identified by the taskToken completed successfully with a result (if provided). The result appears in the ActivityTaskCompleted event in the workflow history.  If the requested task doesn't complete successfully, use RespondActivityTaskFailed instead. If the worker finds that the task is canceled through the canceled flag returned by RecordActivityTaskHeartbeat, it should cancel the task, clean up and then call RespondActivityTaskCanceled.  A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def respondActivityTaskCompleted(params: RespondActivityTaskCompletedInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def respondActivityTaskCompleted(
    params: RespondActivityTaskCompletedInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by workers to tell the service that the ActivityTask identified by the taskToken has failed with reason (if specified). The reason and details appear in the ActivityTaskFailed event added to the workflow history. A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def respondActivityTaskFailed(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def respondActivityTaskFailed(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by workers to tell the service that the ActivityTask identified by the taskToken has failed with reason (if specified). The reason and details appear in the ActivityTaskFailed event added to the workflow history. A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as open while a worker is processing it. A task is closed after it has been specified in a call to RespondActivityTaskCompleted, RespondActivityTaskCanceled, RespondActivityTaskFailed, or the task has timed out.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def respondActivityTaskFailed(params: RespondActivityTaskFailedInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def respondActivityTaskFailed(
    params: RespondActivityTaskFailedInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by deciders to tell the service that the DecisionTask identified by the taskToken has successfully completed. The decisions argument specifies the list of decisions made while processing the task. A DecisionTaskCompleted event is added to the workflow history. The executionContext specified is attached to the event in the workflow execution history.  Access Control  If an IAM policy grants permission to use RespondDecisionTaskCompleted, it can express permissions for the list of decisions in the decisions parameter. Each of the decisions has one or more parameters, much like a regular API call. To allow for policies to be as readable as possible, you can express permissions on decisions as if they were actual API calls, including applying conditions to some parameters. For more information, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def respondDecisionTaskCompleted(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def respondDecisionTaskCompleted(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by deciders to tell the service that the DecisionTask identified by the taskToken has successfully completed. The decisions argument specifies the list of decisions made while processing the task. A DecisionTaskCompleted event is added to the workflow history. The executionContext specified is attached to the event in the workflow execution history.  Access Control  If an IAM policy grants permission to use RespondDecisionTaskCompleted, it can express permissions for the list of decisions in the decisions parameter. Each of the decisions has one or more parameters, much like a regular API call. To allow for policies to be as readable as possible, you can express permissions on decisions as if they were actual API calls, including applying conditions to some parameters. For more information, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def respondDecisionTaskCompleted(params: RespondDecisionTaskCompletedInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def respondDecisionTaskCompleted(
    params: RespondDecisionTaskCompletedInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Records a WorkflowExecutionSignaled event in the workflow execution history and creates a decision task for the workflow execution identified by the given domain, workflowId and runId. The event is recorded with the specified user defined signalName and input (if provided).  If a runId isn't specified, then the WorkflowExecutionSignaled event is recorded in the history of the current open workflow with the matching workflowId in the domain.   If the specified workflow execution isn't open, this method fails with UnknownResource.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def signalWorkflowExecution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def signalWorkflowExecution(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Records a WorkflowExecutionSignaled event in the workflow execution history and creates a decision task for the workflow execution identified by the given domain, workflowId and runId. The event is recorded with the specified user defined signalName and input (if provided).  If a runId isn't specified, then the WorkflowExecutionSignaled event is recorded in the history of the current open workflow with the matching workflowId in the domain.   If the specified workflow execution isn't open, this method fails with UnknownResource.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def signalWorkflowExecution(params: SignalWorkflowExecutionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def signalWorkflowExecution(
    params: SignalWorkflowExecutionInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an execution of the workflow type in the specified domain using the provided workflowId and input data. This action returns the newly started workflow execution.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagList.member.0: The key is swf:tagList.member.0.    tagList.member.1: The key is swf:tagList.member.1.    tagList.member.2: The key is swf:tagList.member.2.    tagList.member.3: The key is swf:tagList.member.3.    tagList.member.4: The key is swf:tagList.member.4.    taskList: String constraint. The key is swf:taskList.name.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def startWorkflowExecution(): awsDashSdkLib.libRequestMod.Request[Run, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startWorkflowExecution(callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Run, scala.Unit]): awsDashSdkLib.libRequestMod.Request[Run, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an execution of the workflow type in the specified domain using the provided workflowId and input data. This action returns the newly started workflow execution.  Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    tagList.member.0: The key is swf:tagList.member.0.    tagList.member.1: The key is swf:tagList.member.1.    tagList.member.2: The key is swf:tagList.member.2.    tagList.member.3: The key is swf:tagList.member.3.    tagList.member.4: The key is swf:tagList.member.4.    taskList: String constraint. The key is swf:taskList.name.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def startWorkflowExecution(params: StartWorkflowExecutionInput): awsDashSdkLib.libRequestMod.Request[Run, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startWorkflowExecution(
    params: StartWorkflowExecutionInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ Run, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[Run, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add a tag to a Amazon SWF domain.  Amazon SWF supports a maximum of 50 tags per resource. 
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add a tag to a Amazon SWF domain.  Amazon SWF supports a maximum of 50 tags per resource. 
    */
  def tagResource(params: TagResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Records a WorkflowExecutionTerminated event and forces closure of the workflow execution identified by the given domain, runId, and workflowId. The child policy, registered with the workflow type or specified when starting this execution, is applied to any open child workflow executions of this workflow execution.  If the identified workflow execution was in progress, it is terminated immediately.   If a runId isn't specified, then the WorkflowExecutionTerminated event is recorded in the history of the current open workflow with the matching workflowId in the domain.   You should consider using RequestCancelWorkflowExecution action instead because it allows the workflow to gracefully close while TerminateWorkflowExecution doesn't.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def terminateWorkflowExecution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def terminateWorkflowExecution(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Records a WorkflowExecutionTerminated event and forces closure of the workflow execution identified by the given domain, runId, and workflowId. The child policy, registered with the workflow type or specified when starting this execution, is applied to any open child workflow executions of this workflow execution.  If the identified workflow execution was in progress, it is terminated immediately.   If a runId isn't specified, then the WorkflowExecutionTerminated event is recorded in the history of the current open workflow with the matching workflowId in the domain.   You should consider using RequestCancelWorkflowExecution action instead because it allows the workflow to gracefully close while TerminateWorkflowExecution doesn't.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def terminateWorkflowExecution(params: TerminateWorkflowExecutionInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def terminateWorkflowExecution(
    params: TerminateWorkflowExecutionInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Undeprecates a previously deprecated activity type. After an activity type has been undeprecated, you can create new tasks of that activity type.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def undeprecateActivityType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def undeprecateActivityType(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Undeprecates a previously deprecated activity type. After an activity type has been undeprecated, you can create new tasks of that activity type.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    activityType.name: String constraint. The key is swf:activityType.name.    activityType.version: String constraint. The key is swf:activityType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def undeprecateActivityType(params: UndeprecateActivityTypeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def undeprecateActivityType(
    params: UndeprecateActivityTypeInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Undeprecates a previously deprecated domain. After a domain has been undeprecated it can be used to create new workflow executions or register new types.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def undeprecateDomain(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def undeprecateDomain(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Undeprecates a previously deprecated domain. After a domain has been undeprecated it can be used to create new workflow executions or register new types.  This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   You cannot use an IAM policy to constrain this action's parameters.   If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def undeprecateDomain(params: UndeprecateDomainInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def undeprecateDomain(
    params: UndeprecateDomainInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Undeprecates a previously deprecated workflow type. After a workflow type has been undeprecated, you can create new executions of that type.   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def undeprecateWorkflowType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def undeprecateWorkflowType(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Undeprecates a previously deprecated workflow type. After a workflow type has been undeprecated, you can create new executions of that type.   This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates and changes.   Access Control  You can use IAM policies to control this action's access to Amazon SWF resources as follows:   Use a Resource element with the domain name to limit the action to only specified domains.   Use an Action element to allow or deny permission to call this action.   Constrain the following parameters by using a Condition element with the appropriate keys.    workflowType.name: String constraint. The key is swf:workflowType.name.    workflowType.version: String constraint. The key is swf:workflowType.version.     If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action fails. The associated event attribute's cause parameter is set to OPERATION_NOT_PERMITTED. For details and example IAM policies, see Using IAM to Manage Access to Amazon SWF Workflows in the Amazon SWF Developer Guide.
    */
  def undeprecateWorkflowType(params: UndeprecateWorkflowTypeInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def undeprecateWorkflowType(
    params: UndeprecateWorkflowTypeInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove a tag from a Amazon SWF domain.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove a tag from a Amazon SWF domain.
    */
  def untagResource(params: UntagResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

