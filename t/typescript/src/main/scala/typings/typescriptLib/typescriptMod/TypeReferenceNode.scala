package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeReferenceNode
  extends NodeWithTypeArguments
     with TypeReferenceType {
  @JSName("kind")
  var kind_TypeReferenceNode: typescriptLib.typescriptMod.SyntaxKind.TypeReference = js.native
  var typeName: EntityName = js.native
}

