package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCacheEngineVersionsMessage extends js.Object {
  /**
    * The name of a specific cache parameter group family to return details for. Valid values are: memcached1.4 | memcached1.5 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 |  Constraints:   Must be 1 to 255 alphanumeric characters   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens  
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    * If true, specifies that only the default version of the specified engine or engine and major version combination is to be returned.
    */
  var DefaultOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The cache engine to return. Valid values: memcached | redis 
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * The cache engine version to return. Example: 1.4.14 
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}

object DescribeCacheEngineVersionsMessage {
  @scala.inline
  def apply(
    CacheParameterGroupFamily: String = null,
    DefaultOnly: js.UndefOr[Boolean] = js.undefined,
    Engine: String = null,
    EngineVersion: String = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  ): DescribeCacheEngineVersionsMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheParameterGroupFamily != null) __obj.updateDynamic("CacheParameterGroupFamily")(CacheParameterGroupFamily)
    if (!js.isUndefined(DefaultOnly)) __obj.updateDynamic("DefaultOnly")(DefaultOnly)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    __obj.asInstanceOf[DescribeCacheEngineVersionsMessage]
  }
}

