package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentQuery
  extends Accessor
     with JSONSupport {
  /**
    * The file format that is supported by query attachment. For example, `image/jpeg`. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) for more information on supported attachment types.  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#attachmentTypes)
    */
  var attachmentTypes: js.Array[java.lang.String] = js.native
  /**
    * An array of globalIds for the features in the layer being queried. The query results will return attachments only for specified global ids.  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#globalIds)
    */
  var globalIds: js.Array[scala.Double] = js.native
  /**
    * The number of features to retrieve. This option should be used in conjunction with the [start property](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#start). Use this to implement paging (i.e. to retrieve "pages" of results when querying). Default Value is `10`.  If not provided, but an instance of AttachmentQuery has a `start` property, then the default value of `num` is `maxRecordCount`. The maximum value for this parameter is the value of the layer's `maxRecordCount` of the service, which can be found at the REST endpoint of the feature layer.  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#num)
    */
  var num: scala.Double = js.native
  /**
    * An array of objectIds of the features to be queried for attachments. When the feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property is `false`, it only accepts a single `objectId`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#objectIds)
    */
  var objectIds: js.Array[scala.Double] = js.native
  /**
    * If `true`, the [exif information](http://www.cipa.jp/std/documents/e/DC-008-Translation-2016-E.pdf) for the attachment will be included in [attachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html#exifInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#returnMetadata)
    *
    * @default false
    */
  var returnMetadata: scala.Boolean = js.native
  /**
    * The file size of the attachment is specified in bytes. You can enter a file size range [1000,15000] to query for attachments. The query result will return all attachments within the specified file size range (1000 - 15000).  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#size)
    */
  var size: js.Array[scala.Double] = js.native
  /**
    * This option fetches query results by skipping a specified number of records. The query results start from the next record. The default value is `0`. This parameter only applies when the feature layer's [capabilities.query.supportsPagination](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`. You can use this option to fetch records that are beyond `maxRecordCount`.  Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#start)
    */
  var start: scala.Double = js.native
  /**
    * The `where` clause to be applied to the layer. Only features that satisfy the `where` clause and are in the list of [objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#objectIds) will be returned. Requires an ArcGIS Server service 10.5 or greater and feature layer's [capabilities.query.supportsAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) to be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html#where)
    */
  var where: java.lang.String = js.native
}

@JSGlobal("__esri.AttachmentQuery")
@js.native
/**
  * This class defines parameters for executing queries for feature attachments from a [feature layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Once an AttachmentQuery object's properties are defined, it can then be passed into the [QueryTask.executeAttachmentQuery()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#executeAttachmentQuery) or [FeatureLayer.queryAttachments()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryAttachments) methods, which will return [attachmentInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html) grouped by the source feature objectIds.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html)
  */
class AttachmentQueryCls () extends AttachmentQuery {
  def this(properties: AttachmentQueryProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

