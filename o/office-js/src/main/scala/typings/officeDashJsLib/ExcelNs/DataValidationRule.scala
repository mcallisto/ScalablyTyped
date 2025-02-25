package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Data validation rule contains different types of data validation. You can only use one of them at a time according the Excel.DataValidationType.
  *
  * [Api set: ExcelApi 1.8]
  */
trait DataValidationRule extends js.Object {
  /**
    *
    * Custom data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var custom: js.UndefOr[CustomDataValidation] = js.undefined
  /**
    *
    * Date data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var date: js.UndefOr[DateTimeDataValidation] = js.undefined
  /**
    *
    * Decimal data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var decimal: js.UndefOr[BasicDataValidation] = js.undefined
  /**
    *
    * List data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var list: js.UndefOr[ListDataValidation] = js.undefined
  /**
    *
    * TextLength data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textLength: js.UndefOr[BasicDataValidation] = js.undefined
  /**
    *
    * Time data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var time: js.UndefOr[DateTimeDataValidation] = js.undefined
  /**
    *
    * WholeNumber data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var wholeNumber: js.UndefOr[BasicDataValidation] = js.undefined
}

object DataValidationRule {
  @scala.inline
  def apply(
    custom: CustomDataValidation = null,
    date: DateTimeDataValidation = null,
    decimal: BasicDataValidation = null,
    list: ListDataValidation = null,
    textLength: BasicDataValidation = null,
    time: DateTimeDataValidation = null,
    wholeNumber: BasicDataValidation = null
  ): DataValidationRule = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (date != null) __obj.updateDynamic("date")(date)
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (list != null) __obj.updateDynamic("list")(list)
    if (textLength != null) __obj.updateDynamic("textLength")(textLength)
    if (time != null) __obj.updateDynamic("time")(time)
    if (wholeNumber != null) __obj.updateDynamic("wholeNumber")(wholeNumber)
    __obj.asInstanceOf[DataValidationRule]
  }
}

