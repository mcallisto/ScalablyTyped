package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumDeclaration
  extends DeclarationStatement
     with JSDocContainer
     with _HasJSDoc {
  @JSName("kind")
  var kind_EnumDeclaration: typescriptLib.typescriptMod.SyntaxKind.EnumDeclaration = js.native
  var members: NodeArray[EnumMember] = js.native
  @JSName("name")
  var name_EnumDeclaration: Identifier = js.native
}

