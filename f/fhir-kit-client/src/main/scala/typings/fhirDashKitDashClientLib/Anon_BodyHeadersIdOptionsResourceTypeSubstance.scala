package typings
package fhirDashKitDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersIdOptionsResourceTypeSubstance extends js.Object {
  var body: fhirLib.fhirNs.Substance
  var headers: js.UndefOr[requestLib.requestMod.Headers] = js.undefined
  var id: java.lang.String
  var options: js.UndefOr[requestLib.requestMod.Options] = js.undefined
  var resourceType: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.Substance
}

object Anon_BodyHeadersIdOptionsResourceTypeSubstance {
  @scala.inline
  def apply(
    body: fhirLib.fhirNs.Substance,
    id: java.lang.String,
    resourceType: fhirDashKitDashClientLib.fhirDashKitDashClientLibStrings.Substance,
    headers: requestLib.requestMod.Headers = null,
    options: requestLib.requestMod.Options = null
  ): Anon_BodyHeadersIdOptionsResourceTypeSubstance = {
    val __obj = js.Dynamic.literal(body = body, id = id, resourceType = resourceType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersIdOptionsResourceTypeSubstance]
  }
}

