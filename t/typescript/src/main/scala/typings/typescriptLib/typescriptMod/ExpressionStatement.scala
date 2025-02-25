package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionStatement
  extends Statement
     with JSDocContainer
     with _HasJSDoc {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_ExpressionStatement: typescriptLib.typescriptMod.SyntaxKind.ExpressionStatement = js.native
}

