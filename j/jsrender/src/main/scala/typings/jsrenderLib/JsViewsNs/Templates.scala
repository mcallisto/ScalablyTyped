package typings
package jsrenderLib.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Templates
@js.native
trait Templates extends Store[Template, TemplateSetter] {
  def apply(markupOrSelectorOrOptions: java.lang.String, parentTmpl: Template): Template = js.native
  def apply(markupOrSelectorOrOptions: TemplateOptions): Template = js.native
  def apply(markupOrSelectorOrOptions: TemplateOptions, parentTmpl: Template): Template = js.native
}

