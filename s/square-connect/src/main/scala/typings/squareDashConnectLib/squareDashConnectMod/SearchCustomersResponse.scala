package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchCustomersResponse")
@js.native
class SearchCustomersResponse () extends js.Object {
  /**
    * A pagination cursor that can be used during subsequent calls to SearchCustomers to retrieve the next set of
    * results associated with the original query. Pagination cursors are only present when a request succeeds and
    * additional results are available. See [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[java.lang.String] = js.native
  /**
    * An array of `Customer` objects that match a query.
    */
  var customers: js.UndefOr[js.Array[Customer]] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
}

