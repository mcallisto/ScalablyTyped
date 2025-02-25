package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartSpec extends js.Object {
  var connectorLineStyle: js.UndefOr[LineStyle] = js.undefined
  var domain: js.UndefOr[WaterfallChartDomain] = js.undefined
  var firstValueIsTotal: js.UndefOr[scala.Boolean] = js.undefined
  var hideConnectorLines: js.UndefOr[scala.Boolean] = js.undefined
  var series: js.UndefOr[js.Array[WaterfallChartSeries]] = js.undefined
  var stackedType: js.UndefOr[java.lang.String] = js.undefined
}

object WaterfallChartSpec {
  @scala.inline
  def apply(
    connectorLineStyle: LineStyle = null,
    domain: WaterfallChartDomain = null,
    firstValueIsTotal: js.UndefOr[scala.Boolean] = js.undefined,
    hideConnectorLines: js.UndefOr[scala.Boolean] = js.undefined,
    series: js.Array[WaterfallChartSeries] = null,
    stackedType: java.lang.String = null
  ): WaterfallChartSpec = {
    val __obj = js.Dynamic.literal()
    if (connectorLineStyle != null) __obj.updateDynamic("connectorLineStyle")(connectorLineStyle)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(firstValueIsTotal)) __obj.updateDynamic("firstValueIsTotal")(firstValueIsTotal)
    if (!js.isUndefined(hideConnectorLines)) __obj.updateDynamic("hideConnectorLines")(hideConnectorLines)
    if (series != null) __obj.updateDynamic("series")(series)
    if (stackedType != null) __obj.updateDynamic("stackedType")(stackedType)
    __obj.asInstanceOf[WaterfallChartSpec]
  }
}

