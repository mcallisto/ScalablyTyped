package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object handlebarsLib {
  // NOTE: for backward compatibility of this typing
  type HandlebarsTemplateDelegate[T] = handlebarsLib.HandlebarsNs.TemplateDelegate[T]
  type HandlebarsTemplates = org.scalablytyped.runtime.StringDictionary[HandlebarsTemplateDelegate[js.Any]]
  // for backward compatibility of this typing
  type RuntimeOptions = handlebarsLib.HandlebarsNs.RuntimeOptions
}
