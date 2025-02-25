package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchCatalogObjectsRequest")
@js.native
object SearchCatalogObjectsRequestNs extends js.Object {
  @js.native
  sealed trait ObjectTypesEnum extends js.Object
  
  @js.native
  object ObjectTypesEnum extends js.Object {
    @js.native
    sealed trait CATEGORY
      extends squareDashConnectLib.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum
    
    @js.native
    sealed trait DISCOUNT
      extends squareDashConnectLib.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum
    
    @js.native
    sealed trait IMAGE
      extends squareDashConnectLib.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum
    
    @js.native
    sealed trait ITEM
      extends squareDashConnectLib.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum
    
    @js.native
    sealed trait ITEM_VARIATION
      extends squareDashConnectLib.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum
    
    @js.native
    sealed trait MODIFIER
      extends squareDashConnectLib.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum
    
    @js.native
    sealed trait MODIFIER_LIST
      extends squareDashConnectLib.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum
    
    @js.native
    sealed trait TAX
      extends squareDashConnectLib.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum
    
    /* "CATEGORY" */ val CATEGORY: CATEGORY with java.lang.String = js.native
    /* "DISCOUNT" */ val DISCOUNT: DISCOUNT with java.lang.String = js.native
    /* "IMAGE" */ val IMAGE: IMAGE with java.lang.String = js.native
    /* "ITEM" */ val ITEM: ITEM with java.lang.String = js.native
    /* "ITEM_VARIATION" */ val ITEM_VARIATION: ITEM_VARIATION with java.lang.String = js.native
    /* "MODIFIER" */ val MODIFIER: MODIFIER with java.lang.String = js.native
    /* "MODIFIER_LIST" */ val MODIFIER_LIST: MODIFIER_LIST with java.lang.String = js.native
    /* "TAX" */ val TAX: TAX with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum with java.lang.String
      ] = js.native
  }
  
}

