package typings
package loginDashWithDashAmazonDashSdkDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeRequest
  extends AuthorizeRequestBase[CodeRequest]
     with AuthorizeRequest {
  /**
    * An authorization code that can be exchanged for an access token.
    */
  var code: java.lang.String = js.native
  /**
    * The state value provided to authorize using the options object.
    */
  var state: java.lang.String = js.native
}

