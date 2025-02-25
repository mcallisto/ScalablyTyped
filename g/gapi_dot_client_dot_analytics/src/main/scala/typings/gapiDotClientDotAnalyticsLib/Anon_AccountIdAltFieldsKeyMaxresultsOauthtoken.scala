package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken extends js.Object {
  /** Account ID to retrieve unsampled reports for. Must be a specific account ID, ~all is not supported. */
  var accountId: java.lang.String
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of unsampled reports to include in this response. */
  var `max-results`: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** View (Profile) ID to retrieve unsampled reports for. Must be a specific view (profile) ID, ~all is not supported. */
  var profileId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** An index of the first unsampled report to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter. */
  var `start-index`: js.UndefOr[scala.Double] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** Web property ID to retrieve unsampled reports for. Must be a specific web property ID, ~all is not supported. */
  var webPropertyId: java.lang.String
}

object Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    profileId: java.lang.String,
    webPropertyId: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    `max-results`: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    `start-index`: scala.Int | scala.Double = null,
    userIp: java.lang.String = null
  ): Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken = {
    val __obj = js.Dynamic.literal(accountId = accountId, profileId = profileId, webPropertyId = webPropertyId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (`start-index` != null) __obj.updateDynamic("start-index")(`start-index`.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken]
  }
}

