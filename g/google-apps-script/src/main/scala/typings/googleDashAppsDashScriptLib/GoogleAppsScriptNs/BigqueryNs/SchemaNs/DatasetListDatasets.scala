package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetListDatasets extends js.Object {
  var datasetReference: js.UndefOr[DatasetReference] = js.undefined
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.UndefOr[js.Object] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
}

object DatasetListDatasets {
  @scala.inline
  def apply(
    datasetReference: DatasetReference = null,
    friendlyName: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    labels: js.Object = null,
    location: java.lang.String = null
  ): DatasetListDatasets = {
    val __obj = js.Dynamic.literal()
    if (datasetReference != null) __obj.updateDynamic("datasetReference")(datasetReference)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[DatasetListDatasets]
  }
}

