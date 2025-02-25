package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostfixUnaryExpression extends UpdateExpression {
  @JSName("kind")
  var kind_PostfixUnaryExpression: typescriptLib.typescriptMod.SyntaxKind.PostfixUnaryExpression = js.native
  var operand: LeftHandSideExpression = js.native
  var operator: PostfixUnaryOperator = js.native
}

