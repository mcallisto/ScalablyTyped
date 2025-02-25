package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.Expression because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _expressionBrand */ @js.native
trait ArrowFunction
  extends FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with SignatureDeclaration
     with _HasJSDoc {
  var _expressionBrand: js.Any = js.native
  @JSName("body")
  var body_ArrowFunction: ConciseBody = js.native
  var equalsGreaterThanToken: EqualsGreaterThanToken = js.native
  @JSName("kind")
  var kind_ArrowFunction: typescriptLib.typescriptMod.SyntaxKind.ArrowFunction = js.native
}

