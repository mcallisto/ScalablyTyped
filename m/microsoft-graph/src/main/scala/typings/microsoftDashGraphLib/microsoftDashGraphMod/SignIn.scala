package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignIn extends Entity {
  /** App name displayed in the Azure Portal. */
  var appDisplayName: js.UndefOr[java.lang.String] = js.undefined
  /** Unique GUID representing the app ID in the Azure Active Directory. */
  var appId: js.UndefOr[java.lang.String] = js.undefined
  var appliedConditionalAccessPolicies: js.UndefOr[js.Array[AppliedConditionalAccessPolicy]] = js.undefined
  /** Identifies the legacy client used for sign-in activity.  Includes Browser, Exchange Active Sync, modern clients, IMAP, MAPI, SMTP, and POP. */
  var clientAppUsed: js.UndefOr[java.lang.String] = js.undefined
  /** Reports status of an activated conditional access policy. Possible values are: success, failure, notApplied, and unknownFutureValue. */
  var conditionalAccessStatus: js.UndefOr[ConditionalAccessStatus] = js.undefined
  /** The request ID sent from the client when the sign-in is initiated; used to troubleshoot sign-in activity. */
  var correlationId: js.UndefOr[java.lang.String] = js.undefined
  /** Date and time (UTC) the sign-in was initiated. Example: midnight on Jan 1, 2014 is reported as '2014-01-01T00:00:00Z'. */
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Device information from where the sign-in occurred; includes device ID, operating system, and browser. */
  var deviceDetail: js.UndefOr[DeviceDetail] = js.undefined
  /** IP address of the client used to sign in. */
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates if a sign-in is interactive or not. */
  var isInteractive: js.UndefOr[scala.Boolean] = js.undefined
  /** Provides the city, state, and country code where the sign-in originated. */
  var location: js.UndefOr[SignInLocation] = js.undefined
  /** Name of the resource the user signed into. */
  var resourceDisplayName: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the resource that the user signed into. */
  var resourceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provides the 'reason' behind a specific state of a risky user, sign-in or a risk event.
    * The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset,
    * adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, unknownFutureValue.
    * The value none means that no action has been performed on the user or sign-in so far.
    * Note: Details for this property require an Azure AD Premium P2 license. Other licenses return the value hidden.
    */
  var riskDetail: js.UndefOr[RiskDetail] = js.undefined
  /**
    * Risk event types associated with the sign-in. The possible values are: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress,
    * unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, and unknownFutureValue.
    */
  var riskEventTypes: js.UndefOr[js.Array[RiskEventType]] = js.undefined
  /**
    * Aggregated risk level. The possible values are: none, low, medium, high, hidden, and unknownFutureValue.
    * The value hidden means the user or sign-in was not enabled for Azure AD Identity Protection.
    * Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers will be returned hidden.
    */
  var riskLevelAggregated: js.UndefOr[RiskLevel] = js.undefined
  /**
    * Risk level during sign-in. The possible values are: none, low, medium, high, hidden, and unknownFutureValue.
    * The value hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Note: Details for this property are only available for Azure AD Premium P2 customers.
    * All other customers will be returned hidden.
    */
  var riskLevelDuringSignIn: js.UndefOr[RiskLevel] = js.undefined
  /** Reports status of the risky user, sign-in, or a risk event. The possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue. */
  var riskState: js.UndefOr[RiskState] = js.undefined
  /** Sign-in status. Possible values include Success and Failure. */
  var status: js.UndefOr[SignInStatus] = js.undefined
  /** Display name of the user that initiated the sign-in. */
  var userDisplayName: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the user that initiated the sign-in. */
  var userId: js.UndefOr[java.lang.String] = js.undefined
  /** User principal name of the user that initiated the sign-in. */
  var userPrincipalName: js.UndefOr[java.lang.String] = js.undefined
}

object SignIn {
  @scala.inline
  def apply(
    appDisplayName: java.lang.String = null,
    appId: java.lang.String = null,
    appliedConditionalAccessPolicies: js.Array[AppliedConditionalAccessPolicy] = null,
    clientAppUsed: java.lang.String = null,
    conditionalAccessStatus: ConditionalAccessStatus = null,
    correlationId: java.lang.String = null,
    createdDateTime: java.lang.String = null,
    deviceDetail: DeviceDetail = null,
    id: java.lang.String = null,
    ipAddress: java.lang.String = null,
    isInteractive: js.UndefOr[scala.Boolean] = js.undefined,
    location: SignInLocation = null,
    resourceDisplayName: java.lang.String = null,
    resourceId: java.lang.String = null,
    riskDetail: RiskDetail = null,
    riskEventTypes: js.Array[RiskEventType] = null,
    riskLevelAggregated: RiskLevel = null,
    riskLevelDuringSignIn: RiskLevel = null,
    riskState: RiskState = null,
    status: SignInStatus = null,
    userDisplayName: java.lang.String = null,
    userId: java.lang.String = null,
    userPrincipalName: java.lang.String = null
  ): SignIn = {
    val __obj = js.Dynamic.literal()
    if (appDisplayName != null) __obj.updateDynamic("appDisplayName")(appDisplayName)
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (appliedConditionalAccessPolicies != null) __obj.updateDynamic("appliedConditionalAccessPolicies")(appliedConditionalAccessPolicies)
    if (clientAppUsed != null) __obj.updateDynamic("clientAppUsed")(clientAppUsed)
    if (conditionalAccessStatus != null) __obj.updateDynamic("conditionalAccessStatus")(conditionalAccessStatus)
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (deviceDetail != null) __obj.updateDynamic("deviceDetail")(deviceDetail)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (location != null) __obj.updateDynamic("location")(location)
    if (resourceDisplayName != null) __obj.updateDynamic("resourceDisplayName")(resourceDisplayName)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (riskDetail != null) __obj.updateDynamic("riskDetail")(riskDetail)
    if (riskEventTypes != null) __obj.updateDynamic("riskEventTypes")(riskEventTypes)
    if (riskLevelAggregated != null) __obj.updateDynamic("riskLevelAggregated")(riskLevelAggregated)
    if (riskLevelDuringSignIn != null) __obj.updateDynamic("riskLevelDuringSignIn")(riskLevelDuringSignIn)
    if (riskState != null) __obj.updateDynamic("riskState")(riskState)
    if (status != null) __obj.updateDynamic("status")(status)
    if (userDisplayName != null) __obj.updateDynamic("userDisplayName")(userDisplayName)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    __obj.asInstanceOf[SignIn]
  }
}

