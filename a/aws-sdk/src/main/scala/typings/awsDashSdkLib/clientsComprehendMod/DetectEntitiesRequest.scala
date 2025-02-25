package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectEntitiesRequest extends js.Object {
  /**
    * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in the same language.
    */
  var LanguageCode: awsDashSdkLib.clientsComprehendMod.LanguageCode
  /**
    * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var Text: String
}

object DetectEntitiesRequest {
  @scala.inline
  def apply(LanguageCode: LanguageCode, Text: String): DetectEntitiesRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text)
  
    __obj.asInstanceOf[DetectEntitiesRequest]
  }
}

