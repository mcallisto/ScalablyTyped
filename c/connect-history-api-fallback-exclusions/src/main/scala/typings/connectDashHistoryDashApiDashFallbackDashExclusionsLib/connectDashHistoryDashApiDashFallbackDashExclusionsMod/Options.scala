package typings
package connectDashHistoryDashApiDashFallbackDashExclusionsLib.connectDashHistoryDashApiDashFallbackDashExclusionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var disableDotRule: js.UndefOr[
    connectDashHistoryDashApiDashFallbackDashExclusionsLib.connectDashHistoryDashApiDashFallbackDashExclusionsLibNumbers.`true`
  ] = js.undefined
  var exclusions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var htmlAcceptHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var logger: js.UndefOr[connectDashHistoryDashApiDashFallbackDashExclusionsLib.Fn_Message] = js.undefined
  var rewrites: js.UndefOr[js.Array[Rewrite]] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    disableDotRule: connectDashHistoryDashApiDashFallbackDashExclusionsLib.connectDashHistoryDashApiDashFallbackDashExclusionsLibNumbers.`true` = null,
    exclusions: js.Array[java.lang.String] = null,
    htmlAcceptHeaders: js.Array[java.lang.String] = null,
    index: java.lang.String = null,
    logger: connectDashHistoryDashApiDashFallbackDashExclusionsLib.Fn_Message = null,
    rewrites: js.Array[Rewrite] = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (disableDotRule != null) __obj.updateDynamic("disableDotRule")(disableDotRule)
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions)
    if (htmlAcceptHeaders != null) __obj.updateDynamic("htmlAcceptHeaders")(htmlAcceptHeaders)
    if (index != null) __obj.updateDynamic("index")(index)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (rewrites != null) __obj.updateDynamic("rewrites")(rewrites)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

