package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceManagementExchangeConnector extends Entity {
  /** The name of the server hosting the Exchange Connector. */
  var connectorServerName: js.UndefOr[java.lang.String] = js.undefined
  /** An alias assigned to the Exchange server */
  var exchangeAlias: js.UndefOr[java.lang.String] = js.undefined
  /** The type of Exchange Connector Configured. Possible values are: onPremises, hosted, serviceToService, dedicated. */
  var exchangeConnectorType: js.UndefOr[DeviceManagementExchangeConnectorType] = js.undefined
  /** Exchange Organization to the Exchange server */
  var exchangeOrganization: js.UndefOr[java.lang.String] = js.undefined
  /** Last sync time for the Exchange Connector */
  var lastSyncDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Email address used to configure the Service To Service Exchange Connector. */
  var primarySmtpAddress: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the Exchange server. */
  var serverName: js.UndefOr[java.lang.String] = js.undefined
  /** Exchange Connector Status. Possible values are: none, connectionPending, connected, disconnected. */
  var status: js.UndefOr[DeviceManagementExchangeConnectorStatus] = js.undefined
  /** The version of the ExchangeConnectorAgent */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceManagementExchangeConnector {
  @scala.inline
  def apply(
    connectorServerName: java.lang.String = null,
    exchangeAlias: java.lang.String = null,
    exchangeConnectorType: DeviceManagementExchangeConnectorType = null,
    exchangeOrganization: java.lang.String = null,
    id: java.lang.String = null,
    lastSyncDateTime: java.lang.String = null,
    primarySmtpAddress: java.lang.String = null,
    serverName: java.lang.String = null,
    status: DeviceManagementExchangeConnectorStatus = null,
    version: java.lang.String = null
  ): DeviceManagementExchangeConnector = {
    val __obj = js.Dynamic.literal()
    if (connectorServerName != null) __obj.updateDynamic("connectorServerName")(connectorServerName)
    if (exchangeAlias != null) __obj.updateDynamic("exchangeAlias")(exchangeAlias)
    if (exchangeConnectorType != null) __obj.updateDynamic("exchangeConnectorType")(exchangeConnectorType)
    if (exchangeOrganization != null) __obj.updateDynamic("exchangeOrganization")(exchangeOrganization)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastSyncDateTime != null) __obj.updateDynamic("lastSyncDateTime")(lastSyncDateTime)
    if (primarySmtpAddress != null) __obj.updateDynamic("primarySmtpAddress")(primarySmtpAddress)
    if (serverName != null) __obj.updateDynamic("serverName")(serverName)
    if (status != null) __obj.updateDynamic("status")(status)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DeviceManagementExchangeConnector]
  }
}

