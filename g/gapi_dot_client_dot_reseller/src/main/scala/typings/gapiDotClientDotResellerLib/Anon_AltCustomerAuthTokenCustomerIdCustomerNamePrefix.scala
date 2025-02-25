package typings
package gapiDotClientDotResellerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCustomerAuthTokenCustomerIdCustomerNamePrefix extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The customerAuthToken query string is required when creating a resold account that transfers a direct customer's subscription or transfers another
    * reseller customer's subscription to your reseller management. This is a hexadecimal authentication token needed to complete the subscription transfer.
    * For more information, see the administrator help center.
    */
  var customerAuthToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a
    * key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    */
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When retrieving all of your subscriptions and filtering for specific customers, you can enter a prefix for a customer name. Using an example customer
    * group that includes exam.com, example20.com and example.com:
    * - exa -- Returns all customer names that start with 'exa' which could include exam.com, example20.com, and example.com. A name prefix is similar to
    * using a regular expression's asterisk, exa&#42;.
    * - example -- Returns example20.com and example.com.
    */
  var customerNamePrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When retrieving a large list, the maxResults is the maximum number of results per page. The nextPageToken value takes you to the next page. The default
    * is 20.
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Token to specify next page in the list */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltCustomerAuthTokenCustomerIdCustomerNamePrefix {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    customerAuthToken: java.lang.String = null,
    customerId: java.lang.String = null,
    customerNamePrefix: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltCustomerAuthTokenCustomerIdCustomerNamePrefix = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (customerAuthToken != null) __obj.updateDynamic("customerAuthToken")(customerAuthToken)
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (customerNamePrefix != null) __obj.updateDynamic("customerNamePrefix")(customerNamePrefix)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCustomerAuthTokenCustomerIdCustomerNamePrefix]
  }
}

