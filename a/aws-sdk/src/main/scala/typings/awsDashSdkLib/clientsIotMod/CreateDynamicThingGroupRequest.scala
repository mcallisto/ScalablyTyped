package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDynamicThingGroupRequest extends js.Object {
  /**
    * The dynamic thing group index name.  Currently one index is supported: "AWS_Things". 
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  /**
    * The dynamic thing group search query string. See Query Syntax for information about query string syntax.
    */
  var queryString: QueryString
  /**
    * The dynamic thing group query version.  Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this value. 
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
  /**
    * Metadata which can be used to manage the dynamic thing group.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * The dynamic thing group name to create.
    */
  var thingGroupName: ThingGroupName
  /**
    * The dynamic thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined
}

object CreateDynamicThingGroupRequest {
  @scala.inline
  def apply(
    queryString: QueryString,
    thingGroupName: ThingGroupName,
    indexName: IndexName = null,
    queryVersion: QueryVersion = null,
    tags: TagList = null,
    thingGroupProperties: ThingGroupProperties = null
  ): CreateDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString, thingGroupName = thingGroupName)
    if (indexName != null) __obj.updateDynamic("indexName")(indexName)
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (thingGroupProperties != null) __obj.updateDynamic("thingGroupProperties")(thingGroupProperties)
    __obj.asInstanceOf[CreateDynamicThingGroupRequest]
  }
}

