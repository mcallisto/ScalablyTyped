package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRay extends Service {
  var config: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use GetTraceSummaries to get a list of trace IDs.
    */
  def batchGetTraces(): awsDashSdkLib.libRequestMod.Request[BatchGetTracesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetTraces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetTracesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetTracesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use GetTraceSummaries to get a list of trace IDs.
    */
  def batchGetTraces(params: BatchGetTracesRequest): awsDashSdkLib.libRequestMod.Request[BatchGetTracesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetTraces(
    params: BatchGetTracesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetTracesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetTracesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a group resource with a name and a filter expression. 
    */
  def createGroup(): awsDashSdkLib.libRequestMod.Request[CreateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a group resource with a name and a filter expression. 
    */
  def createGroup(params: CreateGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.
    */
  def createSamplingRule(): awsDashSdkLib.libRequestMod.Request[CreateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSamplingRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSamplingRuleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.
    */
  def createSamplingRule(params: CreateSamplingRuleRequest): awsDashSdkLib.libRequestMod.Request[CreateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSamplingRule(
    params: CreateSamplingRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSamplingRuleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a group resource.
    */
  def deleteGroup(): awsDashSdkLib.libRequestMod.Request[DeleteGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a group resource.
    */
  def deleteGroup(params: DeleteGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a sampling rule.
    */
  def deleteSamplingRule(): awsDashSdkLib.libRequestMod.Request[DeleteSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSamplingRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSamplingRuleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a sampling rule.
    */
  def deleteSamplingRule(params: DeleteSamplingRuleRequest): awsDashSdkLib.libRequestMod.Request[DeleteSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSamplingRule(
    params: DeleteSamplingRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSamplingRuleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current encryption configuration for X-Ray data.
    */
  def getEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[GetEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEncryptionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current encryption configuration for X-Ray data.
    */
  def getEncryptionConfig(params: GetEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[GetEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEncryptionConfig(
    params: GetEncryptionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves group resource details.
    */
  def getGroup(): awsDashSdkLib.libRequestMod.Request[GetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetGroupResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves group resource details.
    */
  def getGroup(params: GetGroupRequest): awsDashSdkLib.libRequestMod.Request[GetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroup(
    params: GetGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetGroupResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all active group details.
    */
  def getGroups(): awsDashSdkLib.libRequestMod.Request[GetGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroups(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetGroupsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all active group details.
    */
  def getGroups(params: GetGroupsRequest): awsDashSdkLib.libRequestMod.Request[GetGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroups(
    params: GetGroupsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetGroupsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all sampling rules.
    */
  def getSamplingRules(): awsDashSdkLib.libRequestMod.Request[GetSamplingRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSamplingRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSamplingRulesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSamplingRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all sampling rules.
    */
  def getSamplingRules(params: GetSamplingRulesRequest): awsDashSdkLib.libRequestMod.Request[GetSamplingRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSamplingRules(
    params: GetSamplingRulesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSamplingRulesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSamplingRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about recent sampling results for all sampling rules.
    */
  def getSamplingStatisticSummaries(): awsDashSdkLib.libRequestMod.Request[GetSamplingStatisticSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSamplingStatisticSummaries(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSamplingStatisticSummariesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSamplingStatisticSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about recent sampling results for all sampling rules.
    */
  def getSamplingStatisticSummaries(params: GetSamplingStatisticSummariesRequest): awsDashSdkLib.libRequestMod.Request[GetSamplingStatisticSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSamplingStatisticSummaries(
    params: GetSamplingStatisticSummariesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSamplingStatisticSummariesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSamplingStatisticSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Requests a sampling quota for rules that the service is using to sample requests. 
    */
  def getSamplingTargets(): awsDashSdkLib.libRequestMod.Request[GetSamplingTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSamplingTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSamplingTargetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSamplingTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Requests a sampling quota for rules that the service is using to sample requests. 
    */
  def getSamplingTargets(params: GetSamplingTargetsRequest): awsDashSdkLib.libRequestMod.Request[GetSamplingTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSamplingTargets(
    params: GetSamplingTargetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSamplingTargetsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSamplingTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.
    */
  def getServiceGraph(): awsDashSdkLib.libRequestMod.Request[GetServiceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getServiceGraph(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetServiceGraphResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetServiceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.
    */
  def getServiceGraph(params: GetServiceGraphRequest): awsDashSdkLib.libRequestMod.Request[GetServiceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getServiceGraph(
    params: GetServiceGraphRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetServiceGraphResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetServiceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get an aggregation of service statistics defined by a specific time range.
    */
  def getTimeSeriesServiceStatistics(): awsDashSdkLib.libRequestMod.Request[GetTimeSeriesServiceStatisticsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTimeSeriesServiceStatistics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTimeSeriesServiceStatisticsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTimeSeriesServiceStatisticsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get an aggregation of service statistics defined by a specific time range.
    */
  def getTimeSeriesServiceStatistics(params: GetTimeSeriesServiceStatisticsRequest): awsDashSdkLib.libRequestMod.Request[GetTimeSeriesServiceStatisticsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTimeSeriesServiceStatistics(
    params: GetTimeSeriesServiceStatisticsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTimeSeriesServiceStatisticsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTimeSeriesServiceStatisticsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a service graph for one or more specific trace IDs.
    */
  def getTraceGraph(): awsDashSdkLib.libRequestMod.Request[GetTraceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTraceGraph(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTraceGraphResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTraceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a service graph for one or more specific trace IDs.
    */
  def getTraceGraph(params: GetTraceGraphRequest): awsDashSdkLib.libRequestMod.Request[GetTraceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTraceGraph(
    params: GetTraceGraphRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTraceGraphResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTraceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to BatchGetTraces. A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through api.example.com:  service("api.example.com")  This filter expression finds traces that have an annotation named account with the value 12345:  annotation.account = "12345"  For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in the AWS X-Ray Developer Guide.
    */
  def getTraceSummaries(): awsDashSdkLib.libRequestMod.Request[GetTraceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTraceSummaries(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTraceSummariesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTraceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to BatchGetTraces. A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through api.example.com:  service("api.example.com")  This filter expression finds traces that have an annotation named account with the value 12345:  annotation.account = "12345"  For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in the AWS X-Ray Developer Guide.
    */
  def getTraceSummaries(params: GetTraceSummariesRequest): awsDashSdkLib.libRequestMod.Request[GetTraceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTraceSummaries(
    params: GetTraceSummariesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTraceSummariesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTraceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the encryption configuration for X-Ray data.
    */
  def putEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[PutEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putEncryptionConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the encryption configuration for X-Ray data.
    */
  def putEncryptionConfig(params: PutEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[PutEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putEncryptionConfig(
    params: PutEncryptionConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutEncryptionConfigResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by the AWS X-Ray daemon to upload telemetry.
    */
  def putTelemetryRecords(): awsDashSdkLib.libRequestMod.Request[PutTelemetryRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putTelemetryRecords(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutTelemetryRecordsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutTelemetryRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by the AWS X-Ray daemon to upload telemetry.
    */
  def putTelemetryRecords(params: PutTelemetryRecordsRequest): awsDashSdkLib.libRequestMod.Request[PutTelemetryRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putTelemetryRecords(
    params: PutTelemetryRecordsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutTelemetryRecordsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutTelemetryRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments. Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment Documents in the AWS X-Ray Developer Guide.  Required Segment Document Fields     name - The name of the service that handled the request.    id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.    trace_id - A unique identifier that connects all segments and subsegments originating from a single client request.    start_time - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.    end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.    in_progress - Set to true instead of specifying an end_time to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.   A trace_id consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:  Trace ID Format    The version number, i.e. 1.   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.  
    */
  def putTraceSegments(): awsDashSdkLib.libRequestMod.Request[PutTraceSegmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putTraceSegments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutTraceSegmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutTraceSegmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments. Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment Documents in the AWS X-Ray Developer Guide.  Required Segment Document Fields     name - The name of the service that handled the request.    id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.    trace_id - A unique identifier that connects all segments and subsegments originating from a single client request.    start_time - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.    end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.    in_progress - Set to true instead of specifying an end_time to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.   A trace_id consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:  Trace ID Format    The version number, i.e. 1.   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.  
    */
  def putTraceSegments(params: PutTraceSegmentsRequest): awsDashSdkLib.libRequestMod.Request[PutTraceSegmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putTraceSegments(
    params: PutTraceSegmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutTraceSegmentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutTraceSegmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a group resource.
    */
  def updateGroup(): awsDashSdkLib.libRequestMod.Request[UpdateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a group resource.
    */
  def updateGroup(params: UpdateGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGroup(
    params: UpdateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGroupResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies a sampling rule's configuration.
    */
  def updateSamplingRule(): awsDashSdkLib.libRequestMod.Request[UpdateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSamplingRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSamplingRuleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies a sampling rule's configuration.
    */
  def updateSamplingRule(params: UpdateSamplingRuleRequest): awsDashSdkLib.libRequestMod.Request[UpdateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSamplingRule(
    params: UpdateSamplingRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSamplingRuleResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

