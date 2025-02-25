package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConstraintsForPortfolioInput extends js.Object {
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
    * The portfolio identifier.
    */
  var PortfolioId: Id
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
}

object ListConstraintsForPortfolioInput {
  @scala.inline
  def apply(
    PortfolioId: Id,
    AcceptLanguage: AcceptLanguage = null,
    PageSize: js.UndefOr[PageSize] = js.undefined,
    PageToken: PageToken = null,
    ProductId: Id = null
  ): ListConstraintsForPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId)
    __obj.asInstanceOf[ListConstraintsForPortfolioInput]
  }
}

