package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ElementAccessExpression")
@js.native
class ElementAccessExpression protected () extends AST {
  def this(expression: AST, argumentExpression: AST) = this()
  var argumentExpression: AST = js.native
  var expression: AST = js.native
  def structuralEquals(ast: ElementAccessExpression, includingPosition: scala.Boolean): scala.Boolean = js.native
}

