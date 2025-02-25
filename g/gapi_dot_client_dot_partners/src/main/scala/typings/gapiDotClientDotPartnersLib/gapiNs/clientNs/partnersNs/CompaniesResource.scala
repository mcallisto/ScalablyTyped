package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompaniesResource extends js.Object {
  var leads: LeadsResource
  /** Gets a company. */
  def get(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAddress): gapiDotClientLib.gapiNs.clientNs.Request[GetCompanyResponse]
  /** Lists companies. */
  def list(request: gapiDotClientDotPartnersLib.Anon_AccesstokenAddressAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListCompaniesResponse]
}

object CompaniesResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotPartnersLib.Anon_AccesstokenAddress => gapiDotClientLib.gapiNs.clientNs.Request[GetCompanyResponse],
    leads: LeadsResource,
    list: gapiDotClientDotPartnersLib.Anon_AccesstokenAddressAlt => gapiDotClientLib.gapiNs.clientNs.Request[ListCompaniesResponse]
  ): CompaniesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), leads = leads, list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CompaniesResource]
  }
}

