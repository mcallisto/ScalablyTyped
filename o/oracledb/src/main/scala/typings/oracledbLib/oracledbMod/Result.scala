package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information regarding the outcome of a successful connection.execute().
  */
trait Result extends js.Object {
  /**
    * For SELECT statements, this contains an array of objects describing details of columns for the select list.
    * For non queries, this property is undefined.
    *
    * Each column’s name is always given. If the oracledb.extendedMetaData or execute() option extendedMetaData
    * are true then additional information is included.
    */
  var metaData: js.Array[Metadata]
  /**
    * This contains the output values of OUT and IN OUT binds. If bindParams is passed as an array,
    * then outBinds is returned as an array. If bindParams is passed as an object,
    * then outBinds is returned as an object. If there are no OUT or IN OUT binds, the value is undefined.
    */
  var outBinds: (stdLib.Record[java.lang.String, _]) | js.Array[_]
  /**
    * For SELECT statements when the resultSet option is true, use the resultSet object to fetch rows.
    *
    * When using this option, resultSet.close() must be called when the ResultSet is no longer needed.
    * This is true whether or not rows have been fetched from the ResultSet.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#resultsetclass
    * @see https://oracle.github.io/node-oracledb/doc/api.html#resultsethandling
    */
  var resultSet: ResultSet
  /**
    * For SELECT statements using direct fetches, rows contains an array of fetched rows.
    * It will be NULL if there is an error or the SQL statement was not a SELECT statement.
    * By default, the rows are in an array of column value arrays, but this can be changed to arrays
    * of objects by setting outFormat to oracledb.OBJECT. If a single row is fetched,
    * then rows is an array that contains one single row.
    *
    * The number of rows returned is limited by oracledb.maxRows or the maxRows option in an execute() call.
    * If maxRows is 0, then the number of rows is limited by Node.js memory constraints.
    */
  var rows: js.Array[js.Array[_] | (stdLib.Record[java.lang.String, _])]
  /**
    * For DML statements (including SELECT FOR UPDATE) this contains the number of rows affected,
    * for example the number of rows inserted. For non-DML statements such as queries and PL/SQL statements,
    * rowsAffected is undefined.
    */
  var rowsAffected: scala.Double
}

object Result {
  @scala.inline
  def apply(
    metaData: js.Array[Metadata],
    outBinds: (stdLib.Record[java.lang.String, _]) | js.Array[_],
    resultSet: ResultSet,
    rows: js.Array[js.Array[_] | (stdLib.Record[java.lang.String, _])],
    rowsAffected: scala.Double
  ): Result = {
    val __obj = js.Dynamic.literal(metaData = metaData, outBinds = outBinds.asInstanceOf[js.Any], resultSet = resultSet, rows = rows, rowsAffected = rowsAffected)
  
    __obj.asInstanceOf[Result]
  }
}

