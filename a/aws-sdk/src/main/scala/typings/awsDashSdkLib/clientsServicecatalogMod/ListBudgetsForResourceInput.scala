package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBudgetsForResourceInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * The resource identifier.
    */
  var ResourceId: Id
}

object ListBudgetsForResourceInput {
  @scala.inline
  def apply(
    ResourceId: Id,
    AcceptLanguage: AcceptLanguage = null,
    PageSize: js.UndefOr[PageSize] = js.undefined,
    PageToken: PageToken = null
  ): ListBudgetsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    __obj.asInstanceOf[ListBudgetsForResourceInput]
  }
}

