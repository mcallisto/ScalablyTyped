package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of connection.getStatementInfo().
  */
trait StatementInfo extends js.Object {
  /** Array of strings corresponding to the unique names of the bind variables used in the SQL statement. */
  var bindNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Extended metadata properties. */
  var metaData: js.UndefOr[js.Array[Metadata]] = js.undefined
  /** One of the SQL Statement Type Constants. */
  var statementType: js.UndefOr[scala.Double] = js.undefined
}

object StatementInfo {
  @scala.inline
  def apply(
    bindNames: js.Array[java.lang.String] = null,
    metaData: js.Array[Metadata] = null,
    statementType: scala.Int | scala.Double = null
  ): StatementInfo = {
    val __obj = js.Dynamic.literal()
    if (bindNames != null) __obj.updateDynamic("bindNames")(bindNames)
    if (metaData != null) __obj.updateDynamic("metaData")(metaData)
    if (statementType != null) __obj.updateDynamic("statementType")(statementType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatementInfo]
  }
}

