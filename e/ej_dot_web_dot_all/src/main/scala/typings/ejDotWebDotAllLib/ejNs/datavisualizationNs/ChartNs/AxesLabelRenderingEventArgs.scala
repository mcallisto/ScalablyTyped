package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesLabelRenderingEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** axis - Instance of the corresponding axis.        label - Arguments of axis label value and text.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the chart model object.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AxesLabelRenderingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): AxesLabelRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AxesLabelRenderingEventArgs]
  }
}

