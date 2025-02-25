package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionTypeNode
  extends TypeNode
     with UnionOrIntersectionTypeNode {
  @JSName("kind")
  var kind_UnionTypeNode: typescriptLib.typescriptMod.SyntaxKind.UnionType = js.native
  var types: NodeArray[TypeNode] = js.native
}

