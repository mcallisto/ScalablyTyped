package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexDocumentsRequest extends js.Object {
  var DomainName: awsDashSdkLib.clientsCloudsearchMod.DomainName
}

object IndexDocumentsRequest {
  @scala.inline
  def apply(DomainName: DomainName): IndexDocumentsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[IndexDocumentsRequest]
  }
}

