package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMergeStrategy extends js.Object

@JSGlobal("GoogleAppsScript.Charts.ChartMergeStrategy")
@js.native
object ChartMergeStrategy extends js.Object {
  @js.native
  sealed trait MERGE_COLUMNS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy
  
  @js.native
  sealed trait MERGE_ROWS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy
  
  /* 0 */ val MERGE_COLUMNS: MERGE_COLUMNS with scala.Double = js.native
  /* 1 */ val MERGE_ROWS: MERGE_ROWS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy with scala.Double
  ] = js.native
}

