package typings
package atTensorflowTfjsDashDataLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVConfig extends js.Object {
  /**
    * A dictionary whose key is column names, value is an object stating if this
    * column is required, column's data type, default value, and if this column
    * is label. If provided, keys must correspond to names provided in
    * `columnNames` or inferred from the file header lines. If any column is
    * marked as label, the .csv() API will return an array of two items: the
    * first item is a dict of features key/value pairs, the second item is a dict
    * of labels key/value pairs. If no column is marked as label returns a dict
    * of features only.
    *
    * Has the following fields:
    * - `required` If value in this column is required. If set to `true`, throw
    * an error when it finds an empty value.
    *
    * - `dtype` Data type of this column. Could be int32, float32, bool, or
    * string.
    *
    * - `default` Default value of this column.
    *
    * - `isLabel` Whether this column is label instead of features. If isLabel is
    * `true` for at least one column, the element in returned `CSVDataset` will
    * be an object of {xs: features, ys: labels}: xs is a dict of features
    * key/value pairs, ys is a dict of labels key/value pairs. If no column is
    * marked as label, returns a dict of features only.
    */
  var columnConfigs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ColumnConfig]] = js.undefined
  /**
    * A list of strings that corresponds to the CSV column names, in order. If
    * provided, it ignores the column names inferred from the header row. If not
    * provided, infers the column names from the first row of the records. If
    * `hasHeader` is false and `columnNames` is not provided, this method will
    * throw an error.
    */
  var columnNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If true, only columns provided in `columnConfigs` will be parsed and
    * provided during iteration.
    */
  var configuredColumnsOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, delimiter field should be null. Parsing delimiter is whitespace
    * and treat continuous multiple whitespace as one delimiter.
    */
  var delimWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The string used to parse each line of the input file.
    */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A boolean value that indicates whether the first row of provided CSV file
    * is a header line with column names, and should not be included in the data.
    */
  var hasHeader: js.UndefOr[scala.Boolean] = js.undefined
}

object CSVConfig {
  @scala.inline
  def apply(
    columnConfigs: org.scalablytyped.runtime.StringDictionary[ColumnConfig] = null,
    columnNames: js.Array[java.lang.String] = null,
    configuredColumnsOnly: js.UndefOr[scala.Boolean] = js.undefined,
    delimWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    delimiter: java.lang.String = null,
    hasHeader: js.UndefOr[scala.Boolean] = js.undefined
  ): CSVConfig = {
    val __obj = js.Dynamic.literal()
    if (columnConfigs != null) __obj.updateDynamic("columnConfigs")(columnConfigs)
    if (columnNames != null) __obj.updateDynamic("columnNames")(columnNames)
    if (!js.isUndefined(configuredColumnsOnly)) __obj.updateDynamic("configuredColumnsOnly")(configuredColumnsOnly)
    if (!js.isUndefined(delimWhitespace)) __obj.updateDynamic("delimWhitespace")(delimWhitespace)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(hasHeader)) __obj.updateDynamic("hasHeader")(hasHeader)
    __obj.asInstanceOf[CSVConfig]
  }
}

