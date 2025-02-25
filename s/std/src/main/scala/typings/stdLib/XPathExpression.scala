package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface is a compiled XPath expression that can be evaluated on a document or specific node to return information its DOM tree. */
@js.native
trait XPathExpression extends js.Object {
  def evaluate(contextNode: Node): XPathResult = js.native
  def evaluate(contextNode: Node, `type`: scala.Double): XPathResult = js.native
  def evaluate(contextNode: Node, `type`: scala.Double, result: XPathResult): XPathResult = js.native
}

@JSGlobal("XPathExpression")
@js.native
class XPathExpressionCls () extends XPathExpression

@JSGlobal("XPathExpression")
@js.native
object XPathExpression
  extends org.scalablytyped.runtime.Instantiable0[XPathExpression]

