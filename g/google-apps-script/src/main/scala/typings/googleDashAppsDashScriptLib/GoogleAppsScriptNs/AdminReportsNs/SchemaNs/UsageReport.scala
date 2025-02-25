package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReport extends js.Object {
  var date: js.UndefOr[java.lang.String] = js.undefined
  var entity: js.UndefOr[UsageReportEntity] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var parameters: js.UndefOr[js.Array[UsageReportParameters]] = js.undefined
}

object UsageReport {
  @scala.inline
  def apply(
    date: java.lang.String = null,
    entity: UsageReportEntity = null,
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    parameters: js.Array[UsageReportParameters] = null
  ): UsageReport = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[UsageReport]
  }
}

