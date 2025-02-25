package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSDocTypeLiteral extends JSDocType {
  /** If true, then this type literal represents an *array* of its type. */
  var isArrayType: js.UndefOr[scala.Boolean] = js.native
  var jsDocPropertyTags: js.UndefOr[js.Array[JSDocPropertyLikeTag]] = js.native
  @JSName("kind")
  var kind_JSDocTypeLiteral: typescriptLib.typescriptMod.SyntaxKind.JSDocTypeLiteral = js.native
}

