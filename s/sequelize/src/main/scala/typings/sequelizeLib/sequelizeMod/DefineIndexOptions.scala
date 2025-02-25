package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineIndexOptions extends js.Object {
  /**
    * Pass CONCURRENT so other operations run while the index is created - PostgresSQL only. Default is false
    */
  var concurrently: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the index. Default is __
    */
  var indexName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set a type for the index, e.g. BTREE. See the documentation of the used dialect
    */
  var indexType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index type
    */
  var indicesType: js.UndefOr[IndexType] = js.undefined
  /**
    * A function that receives the sql query, e.g. console.log
    */
  var logging: js.UndefOr[js.Function] = js.undefined
  /**
    * The name of the index. Default is Default is <table>_<attr1>_<attr2>
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Index operator
    */
  var operator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For FULLTEXT columns set your parser
    */
  var parser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index type
    */
  var `type`: js.UndefOr[IndexType] = js.undefined
  /**
    * Create a unique index
    */
  var unique: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Create an unique index
    */
  var using: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A hash of attributes to limit your index(Filtered Indexes - MSSQL & PostgreSQL only)
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object DefineIndexOptions {
  @scala.inline
  def apply(
    concurrently: js.UndefOr[scala.Boolean] = js.undefined,
    indexName: java.lang.String = null,
    indexType: java.lang.String = null,
    indicesType: IndexType = null,
    logging: js.Function = null,
    name: java.lang.String = null,
    operator: java.lang.String = null,
    parser: java.lang.String = null,
    `type`: IndexType = null,
    unique: js.UndefOr[scala.Boolean] = js.undefined,
    using: java.lang.String = null,
    where: AnyWhereOptions = null
  ): DefineIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrently)) __obj.updateDynamic("concurrently")(concurrently)
    if (indexName != null) __obj.updateDynamic("indexName")(indexName)
    if (indexType != null) __obj.updateDynamic("indexType")(indexType)
    if (indicesType != null) __obj.updateDynamic("indicesType")(indicesType)
    if (logging != null) __obj.updateDynamic("logging")(logging)
    if (name != null) __obj.updateDynamic("name")(name)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    if (using != null) __obj.updateDynamic("using")(using)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[DefineIndexOptions]
  }
}

