package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotCaches extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): PivotCache = js.native
  def Add(SourceType: XlPivotTableSourceType): PivotCache = js.native
  def Add(SourceType: XlPivotTableSourceType, SourceData: js.Any): PivotCache = js.native
  @JSName("Create")
  def Create_1(SourceType: activexDashExcelLib.activexDashExcelLibNumbers.`1`, SourceData: java.lang.String): PivotCache = js.native
  @JSName("Create")
  def Create_1(
    SourceType: activexDashExcelLib.activexDashExcelLibNumbers.`1`,
    SourceData: java.lang.String,
    Version: XlPivotTableVersionList
  ): PivotCache = js.native
  @JSName("Create")
  def Create_2(SourceType: activexDashExcelLib.activexDashExcelLibNumbers.`2`, SourceData: WorkbookConnection): PivotCache = js.native
  @JSName("Create")
  def Create_2(
    SourceType: activexDashExcelLib.activexDashExcelLibNumbers.`2`,
    SourceData: WorkbookConnection,
    Version: XlPivotTableVersionList
  ): PivotCache = js.native
  @JSName("Create")
  def Create_3(SourceType: activexDashExcelLib.activexDashExcelLibNumbers.`3`, SourceData: java.lang.String): PivotCache = js.native
  @JSName("Create")
  def Create_3(
    SourceType: activexDashExcelLib.activexDashExcelLibNumbers.`3`,
    SourceData: java.lang.String,
    Version: XlPivotTableVersionList
  ): PivotCache = js.native
  def Item(Index: scala.Double): PivotCache = js.native
  def _Default(Index: js.Any): PivotCache = js.native
}

