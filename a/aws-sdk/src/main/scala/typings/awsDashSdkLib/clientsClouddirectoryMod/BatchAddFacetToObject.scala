package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAddFacetToObject extends js.Object {
  /**
    * The attributes to set on the object.
    */
  var ObjectAttributeList: AttributeKeyAndValueList
  /**
    * A reference to the object being mutated.
    */
  var ObjectReference: awsDashSdkLib.clientsClouddirectoryMod.ObjectReference
  /**
    * Represents the facet being added to the object.
    */
  var SchemaFacet: awsDashSdkLib.clientsClouddirectoryMod.SchemaFacet
}

object BatchAddFacetToObject {
  @scala.inline
  def apply(
    ObjectAttributeList: AttributeKeyAndValueList,
    ObjectReference: ObjectReference,
    SchemaFacet: SchemaFacet
  ): BatchAddFacetToObject = {
    val __obj = js.Dynamic.literal(ObjectAttributeList = ObjectAttributeList, ObjectReference = ObjectReference, SchemaFacet = SchemaFacet)
  
    __obj.asInstanceOf[BatchAddFacetToObject]
  }
}

