package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "FunctionCall")
@js.native
class FunctionCall protected () extends AST {
  def this(span: ParseSpan, target: AST, args: js.Array[_]) = this()
  def this(span: ParseSpan, target: scala.Null, args: js.Array[_]) = this()
  var args: js.Array[_] = js.native
  var target: AST | scala.Null = js.native
}

