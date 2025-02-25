package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureScore extends Entity {
  /** Active user count of the given tenant. */
  var activeUserCount: js.UndefOr[scala.Double] = js.undefined
  /** Average score by different scopes (for example, average by industry, average by seating) and control category (Identity, Data, Device, Apps, Infrastructure) within the scope. */
  var averageComparativeScores: js.UndefOr[js.Array[AverageComparativeScore]] = js.undefined
  /** GUID string for tenant ID. */
  var azureTenantId: js.UndefOr[java.lang.String] = js.undefined
  /** Contains tenant scores for a set of controls. */
  var controlScores: js.UndefOr[js.Array[ControlScore]] = js.undefined
  /** The date when the entity is created. */
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Tenant current attained score on specified date. */
  var currentScore: js.UndefOr[scala.Double] = js.undefined
  /** Microsoft-provided services for the tenant (for example, Exchange online, Skype, Sharepoint). */
  var enabledServices: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Licensed user count of the given tenant. */
  var licensedUserCount: js.UndefOr[scala.Double] = js.undefined
  /** Tenant maximum possible score on specified date. */
  var maxScore: js.UndefOr[scala.Double] = js.undefined
  /** Complex type containing details about the security product/service vendor, provider, and subprovider (for example, vendor=Microsoft; provider=SecureScore). Required. */
  var vendorInformation: js.UndefOr[SecurityVendorInformation] = js.undefined
}

object SecureScore {
  @scala.inline
  def apply(
    activeUserCount: scala.Int | scala.Double = null,
    averageComparativeScores: js.Array[AverageComparativeScore] = null,
    azureTenantId: java.lang.String = null,
    controlScores: js.Array[ControlScore] = null,
    createdDateTime: java.lang.String = null,
    currentScore: scala.Int | scala.Double = null,
    enabledServices: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    licensedUserCount: scala.Int | scala.Double = null,
    maxScore: scala.Int | scala.Double = null,
    vendorInformation: SecurityVendorInformation = null
  ): SecureScore = {
    val __obj = js.Dynamic.literal()
    if (activeUserCount != null) __obj.updateDynamic("activeUserCount")(activeUserCount.asInstanceOf[js.Any])
    if (averageComparativeScores != null) __obj.updateDynamic("averageComparativeScores")(averageComparativeScores)
    if (azureTenantId != null) __obj.updateDynamic("azureTenantId")(azureTenantId)
    if (controlScores != null) __obj.updateDynamic("controlScores")(controlScores)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (currentScore != null) __obj.updateDynamic("currentScore")(currentScore.asInstanceOf[js.Any])
    if (enabledServices != null) __obj.updateDynamic("enabledServices")(enabledServices)
    if (id != null) __obj.updateDynamic("id")(id)
    if (licensedUserCount != null) __obj.updateDynamic("licensedUserCount")(licensedUserCount.asInstanceOf[js.Any])
    if (maxScore != null) __obj.updateDynamic("maxScore")(maxScore.asInstanceOf[js.Any])
    if (vendorInformation != null) __obj.updateDynamic("vendorInformation")(vendorInformation)
    __obj.asInstanceOf[SecureScore]
  }
}

