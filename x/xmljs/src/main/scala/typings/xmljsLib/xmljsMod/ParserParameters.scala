package typings
package xmljsLib.xmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserParameters extends js.Object {
  /**
    * Turn the tagsNames to lowercase
    */
  var lowercaseTagnames: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disables xml namespaces
    */
  var noNamespaces: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Do not normalize whitespaces in text
    */
  var noNormalizeWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable position tracing of sax
    */
  var noTracing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Do not trimtext and comment nodes
    */
  var noTrim: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whenever or not to use a strict parser
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow only predefined entities
    */
  var strictEntities: js.UndefOr[scala.Boolean] = js.undefined
}

object ParserParameters {
  @scala.inline
  def apply(
    lowercaseTagnames: js.UndefOr[scala.Boolean] = js.undefined,
    noNamespaces: js.UndefOr[scala.Boolean] = js.undefined,
    noNormalizeWhitespaces: js.UndefOr[scala.Boolean] = js.undefined,
    noTracing: js.UndefOr[scala.Boolean] = js.undefined,
    noTrim: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    strictEntities: js.UndefOr[scala.Boolean] = js.undefined
  ): ParserParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lowercaseTagnames)) __obj.updateDynamic("lowercaseTagnames")(lowercaseTagnames)
    if (!js.isUndefined(noNamespaces)) __obj.updateDynamic("noNamespaces")(noNamespaces)
    if (!js.isUndefined(noNormalizeWhitespaces)) __obj.updateDynamic("noNormalizeWhitespaces")(noNormalizeWhitespaces)
    if (!js.isUndefined(noTracing)) __obj.updateDynamic("noTracing")(noTracing)
    if (!js.isUndefined(noTrim)) __obj.updateDynamic("noTrim")(noTrim)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(strictEntities)) __obj.updateDynamic("strictEntities")(strictEntities)
    __obj.asInstanceOf[ParserParameters]
  }
}

