package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FecOutputSettings extends js.Object {
  /**
    * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix.  The number of transport stream packets per column error correction packet. Must be between 4 and 20, inclusive.
    */
  var ColumnDepth: js.UndefOr[__integerMin4Max20] = js.undefined
  /**
    * Enables column only or column and row based FEC
    */
  var IncludeFec: js.UndefOr[FecOutputIncludeFec] = js.undefined
  /**
    * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix.  Must be between 1 and 20, inclusive. If only Column FEC is used, then larger values increase robustness.  If Row FEC is used, then this is the number of transport stream packets per row error correction packet, and the value must be between 4 and 20, inclusive, if includeFec is columnAndRow. If includeFec is column, this value must be 1 to 20, inclusive.
    */
  var RowLength: js.UndefOr[__integerMin1Max20] = js.undefined
}

object FecOutputSettings {
  @scala.inline
  def apply(
    ColumnDepth: js.UndefOr[__integerMin4Max20] = js.undefined,
    IncludeFec: FecOutputIncludeFec = null,
    RowLength: js.UndefOr[__integerMin1Max20] = js.undefined
  ): FecOutputSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ColumnDepth)) __obj.updateDynamic("ColumnDepth")(ColumnDepth)
    if (IncludeFec != null) __obj.updateDynamic("IncludeFec")(IncludeFec.asInstanceOf[js.Any])
    if (!js.isUndefined(RowLength)) __obj.updateDynamic("RowLength")(RowLength)
    __obj.asInstanceOf[FecOutputSettings]
  }
}

