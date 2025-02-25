package typings
package luaparseLib.libAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallStatement
  extends _Statement
     with Base[luaparseLib.luaparseLibStrings.CallStatement] {
  var expression: CallExpression | StringCallExpression | TableCallExpression
}

object CallStatement {
  @scala.inline
  def apply(
    expression: CallExpression | StringCallExpression | TableCallExpression,
    `type`: luaparseLib.luaparseLibStrings.CallStatement
  ): CallStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CallStatement]
  }
}

