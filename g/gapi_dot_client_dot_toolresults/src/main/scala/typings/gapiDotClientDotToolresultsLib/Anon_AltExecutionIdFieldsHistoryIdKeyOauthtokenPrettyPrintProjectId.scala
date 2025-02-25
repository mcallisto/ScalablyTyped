package typings
package gapiDotClientDotToolresultsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrintProjectId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Execution id.
    *
    * Required.
    */
  var executionId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A History id.
    *
    * Required.
    */
  var historyId: java.lang.String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A Project id.
    *
    * Required.
    */
  var projectId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A unique request ID for server to detect duplicated requests. For example, a UUID.
    *
    * Optional, but strongly recommended.
    */
  var requestId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Step id.
    *
    * Required.
    */
  var stepId: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrintProjectId {
  @scala.inline
  def apply(
    executionId: java.lang.String,
    historyId: java.lang.String,
    projectId: java.lang.String,
    stepId: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    requestId: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrintProjectId = {
    val __obj = js.Dynamic.literal(executionId = executionId, historyId = historyId, projectId = projectId, stepId = stepId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrintProjectId]
  }
}

