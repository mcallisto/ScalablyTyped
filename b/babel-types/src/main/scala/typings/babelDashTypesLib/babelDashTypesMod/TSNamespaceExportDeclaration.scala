package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSNamespaceExportDeclaration
  extends Node
     with Statement {
  var id: Identifier
  @JSName("type")
  var type_TSNamespaceExportDeclaration: babelDashTypesLib.babelDashTypesLibStrings.TSNamespaceExportDeclaration
}

object TSNamespaceExportDeclaration {
  @scala.inline
  def apply(
    end: scala.Double,
    id: Identifier,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSNamespaceExportDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(end = end, id = id, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSNamespaceExportDeclaration]
  }
}

