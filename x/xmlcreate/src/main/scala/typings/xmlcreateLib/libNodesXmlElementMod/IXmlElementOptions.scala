package typings
package xmlcreateLib.libNodesXmlElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlElementOptions extends js.Object {
  /**
    * The name of the element.
    */
  var name: java.lang.String
  /**
    * Whether to replace any invalid characters in the name of the element
    * with the Unicode replacement character. By default, this is disabled.
    */
  var replaceInvalidCharsInName: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to use a self-closing tag if this element is empty.
    *
    * For example, use:
    * ```xml
    * <element/>
    * ```
    * instead of:
    * ```xml
    * <element></element>
    * ```
    *
    * By default, this is enabled.
    */
  var useSelfClosingTagIfEmpty: js.UndefOr[scala.Boolean] = js.undefined
}

object IXmlElementOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    replaceInvalidCharsInName: js.UndefOr[scala.Boolean] = js.undefined,
    useSelfClosingTagIfEmpty: js.UndefOr[scala.Boolean] = js.undefined
  ): IXmlElementOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(replaceInvalidCharsInName)) __obj.updateDynamic("replaceInvalidCharsInName")(replaceInvalidCharsInName)
    if (!js.isUndefined(useSelfClosingTagIfEmpty)) __obj.updateDynamic("useSelfClosingTagIfEmpty")(useSelfClosingTagIfEmpty)
    __obj.asInstanceOf[IXmlElementOptions]
  }
}

