package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait DeclareOpaqueType
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier
  var supertype: FlowType | scala.Null
  var typeParameters: TypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_DeclareOpaqueType: atBabelTypesLib.atBabelTypesLibStrings.DeclareOpaqueType
}

object DeclareOpaqueType {
  @scala.inline
  def apply(
    id: Identifier,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.DeclareOpaqueType,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    supertype: FlowType = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): DeclareOpaqueType = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (supertype != null) __obj.updateDynamic("supertype")(supertype)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[DeclareOpaqueType]
  }
}

