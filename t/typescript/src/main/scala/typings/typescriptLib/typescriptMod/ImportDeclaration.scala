package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDeclaration extends Statement {
  var importClause: js.UndefOr[ImportClause] = js.native
  @JSName("kind")
  var kind_ImportDeclaration: typescriptLib.typescriptMod.SyntaxKind.ImportDeclaration = js.native
  /** If this is not a StringLiteral it will be a grammar error. */
  var moduleSpecifier: Expression = js.native
  @JSName("parent")
  var parent_ImportDeclaration: SourceFile | ModuleBlock = js.native
}

