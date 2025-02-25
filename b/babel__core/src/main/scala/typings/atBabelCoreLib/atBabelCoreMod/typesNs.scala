package typings
package atBabelCoreLib.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", "types")
@js.native
object typesNs extends js.Object {
  def anyTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.AnyTypeAnnotation = js.native
  def argumentPlaceholder(): atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder = js.native
  def arrayExpression(): atBabelTypesLib.atBabelTypesMod.ArrayExpression = js.native
  def arrayExpression(
    elements: js.Array[
      scala.Null | atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.ArrayExpression = js.native
  def arrayPattern(elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike]): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayPattern(
    elements: js.Array[atBabelTypesLib.atBabelTypesMod.PatternLike],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def arrayTypeAnnotation(elementType: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.ArrayTypeAnnotation = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop,
    typeParameters: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop,
    typeParameters: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def assignmentExpression(
    operator: java.lang.String,
    left: atBabelTypesLib.atBabelTypesMod.LVal,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.AssignmentExpression = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.ArrayPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.ArrayPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.ArrayPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.ArrayPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.ArrayPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.Identifier,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.Identifier,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.Identifier,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.Identifier,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.Identifier,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.ObjectPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.ObjectPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.ObjectPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.ObjectPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def assignmentPattern(
    left: atBabelTypesLib.atBabelTypesMod.ObjectPattern,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def awaitExpression(argument: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.AwaitExpression = js.native
  def bigIntLiteral(value: java.lang.String): atBabelTypesLib.atBabelTypesMod.BigIntLiteral = js.native
  def binaryExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`+` | atBabelCoreLib.atBabelCoreLibStrings.`-` | atBabelCoreLib.atBabelCoreLibStrings.`/` | atBabelCoreLib.atBabelCoreLibStrings.`%` | atBabelCoreLib.atBabelCoreLibStrings.`*` | atBabelCoreLib.atBabelCoreLibStrings.`**` | atBabelCoreLib.atBabelCoreLibStrings.`&` | atBabelCoreLib.atBabelCoreLibStrings.`|` | atBabelCoreLib.atBabelCoreLibStrings.`>>` | atBabelCoreLib.atBabelCoreLibStrings.`>>>` | atBabelCoreLib.atBabelCoreLibStrings.`<<` | atBabelCoreLib.atBabelCoreLibStrings.`_backtick^_backtick` | atBabelCoreLib.atBabelCoreLibStrings.`==` | atBabelCoreLib.atBabelCoreLibStrings.`===` | atBabelCoreLib.atBabelCoreLibStrings.`!=` | atBabelCoreLib.atBabelCoreLibStrings.`!==` | atBabelCoreLib.atBabelCoreLibStrings.in | atBabelCoreLib.atBabelCoreLibStrings.instanceof | atBabelCoreLib.atBabelCoreLibStrings.`>` | atBabelCoreLib.atBabelCoreLibStrings.`<` | atBabelCoreLib.atBabelCoreLibStrings.`>=` | atBabelCoreLib.atBabelCoreLibStrings.`<=`,
    left: atBabelTypesLib.atBabelTypesMod.Expression,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.BinaryExpression = js.native
  def bindExpression(`object`: js.Any, callee: js.Any): atBabelTypesLib.atBabelTypesMod.BindExpression = js.native
  def blockStatement(body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement]): atBabelTypesLib.atBabelTypesMod.BlockStatement = js.native
  def blockStatement(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive]
  ): atBabelTypesLib.atBabelTypesMod.BlockStatement = js.native
  def booleanLiteral(value: scala.Boolean): atBabelTypesLib.atBabelTypesMod.BooleanLiteral = js.native
  def booleanLiteralTypeAnnotation(value: scala.Boolean): atBabelTypesLib.atBabelTypesMod.BooleanLiteralTypeAnnotation = js.native
  def booleanTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.BooleanTypeAnnotation = js.native
  def breakStatement(): atBabelTypesLib.atBabelTypesMod.BreakStatement = js.native
  def breakStatement(label: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.BreakStatement = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ]
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: scala.Null,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: scala.Null,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def callExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: scala.Null,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  @JSName("callExpression")
  def callExpression_false(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  @JSName("callExpression")
  def callExpression_false(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  @JSName("callExpression")
  def callExpression_false(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  @JSName("callExpression")
  def callExpression_false(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  @JSName("callExpression")
  def callExpression_true(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  @JSName("callExpression")
  def callExpression_true(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  @JSName("callExpression")
  def callExpression_true(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  @JSName("callExpression")
  def callExpression_true(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def catchClause(param: js.UndefOr[scala.Nothing], body: atBabelTypesLib.atBabelTypesMod.BlockStatement): atBabelTypesLib.atBabelTypesMod.CatchClause = js.native
  def catchClause(
    param: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.CatchClause = js.native
  def catchClause(param: scala.Null, body: atBabelTypesLib.atBabelTypesMod.BlockStatement): atBabelTypesLib.atBabelTypesMod.CatchClause = js.native
  def classBody(
    body: js.Array[
      atBabelTypesLib.atBabelTypesMod.ClassMethod | atBabelTypesLib.atBabelTypesMod.ClassPrivateMethod | atBabelTypesLib.atBabelTypesMod.ClassProperty | atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty | atBabelTypesLib.atBabelTypesMod.TSDeclareMethod | atBabelTypesLib.atBabelTypesMod.TSIndexSignature
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassBody = js.native
  def classDeclaration(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    superClass: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.Decorator] | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    declare: js.UndefOr[scala.Boolean | scala.Null],
    _implements: js.UndefOr[
      (js.Array[
        atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
      ]) | scala.Null
    ],
    mixins: js.UndefOr[js.Any | scala.Null],
    superTypeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation | atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation | scala.Null
    ],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassDeclaration = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    superClass: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation | atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[scala.Nothing],
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(id: scala.Null, superClass: scala.Null, body: atBabelTypesLib.atBabelTypesMod.ClassBody): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classExpression(
    id: scala.Null,
    superClass: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ClassBody,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    _implements: js.Array[
      atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments | atBabelTypesLib.atBabelTypesMod.ClassImplements
    ],
    mixins: js.Any,
    superTypeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def classImplements(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.ClassImplements = js.native
  def classImplements(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.ClassImplements = js.native
  def classMethod(
    kind: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.get | atBabelCoreLib.atBabelCoreLibStrings.set | atBabelCoreLib.atBabelCoreLibStrings.method | atBabelCoreLib.atBabelCoreLibStrings.constructor
    ],
    key: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.StringLiteral | atBabelTypesLib.atBabelTypesMod.NumericLiteral | atBabelTypesLib.atBabelTypesMod.Expression,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    computed: js.UndefOr[scala.Boolean],
    _static: js.UndefOr[scala.Boolean | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    access: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    accessibility: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    async: js.UndefOr[scala.Boolean],
    decorators: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.Decorator] | scala.Null],
    generator: js.UndefOr[scala.Boolean],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    returnType: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ]
  ): atBabelTypesLib.atBabelTypesMod.ClassMethod = js.native
  def classPrivateMethod(
    kind: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.get | atBabelCoreLib.atBabelCoreLibStrings.set | atBabelCoreLib.atBabelCoreLibStrings.method | atBabelCoreLib.atBabelCoreLibStrings.constructor
    ],
    key: atBabelTypesLib.atBabelTypesMod.PrivateName,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    _static: js.UndefOr[scala.Boolean | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    access: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    accessibility: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    async: js.UndefOr[scala.Boolean],
    computed: js.UndefOr[scala.Boolean],
    decorators: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.Decorator] | scala.Null],
    generator: js.UndefOr[scala.Boolean],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    returnType: js.UndefOr[js.Any | scala.Null],
    typeParameters: js.UndefOr[js.Any | scala.Null]
  ): atBabelTypesLib.atBabelTypesMod.ClassPrivateMethod = js.native
  def classPrivateProperty(key: atBabelTypesLib.atBabelTypesMod.PrivateName): atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty = js.native
  def classPrivateProperty(
    key: atBabelTypesLib.atBabelTypesMod.PrivateName,
    value: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty = js.native
  def classProperty(
    key: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.StringLiteral | atBabelTypesLib.atBabelTypesMod.NumericLiteral | atBabelTypesLib.atBabelTypesMod.Expression,
    value: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    typeAnnotation: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    decorators: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.Decorator] | scala.Null],
    computed: js.UndefOr[scala.Boolean],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    accessibility: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    definite: js.UndefOr[scala.Boolean | scala.Null],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    readonly: js.UndefOr[scala.Boolean | scala.Null],
    _static: js.UndefOr[scala.Boolean | scala.Null]
  ): atBabelTypesLib.atBabelTypesMod.ClassProperty = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.AnyTypeAnnotation): atBabelTypesLib.atBabelTypesMod.AnyTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder): atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ArrayExpression): atBabelTypesLib.atBabelTypesMod.ArrayExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ArrayPattern): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ArrayTypeAnnotation): atBabelTypesLib.atBabelTypesMod.ArrayTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.AssignmentExpression): atBabelTypesLib.atBabelTypesMod.AssignmentExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.AssignmentPattern): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.AwaitExpression): atBabelTypesLib.atBabelTypesMod.AwaitExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.BigIntLiteral): atBabelTypesLib.atBabelTypesMod.BigIntLiteral = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.BinaryExpression): atBabelTypesLib.atBabelTypesMod.BinaryExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.BindExpression): atBabelTypesLib.atBabelTypesMod.BindExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.BlockStatement): atBabelTypesLib.atBabelTypesMod.BlockStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.BooleanLiteral): atBabelTypesLib.atBabelTypesMod.BooleanLiteral = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.BooleanLiteralTypeAnnotation): atBabelTypesLib.atBabelTypesMod.BooleanLiteralTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.BooleanTypeAnnotation): atBabelTypesLib.atBabelTypesMod.BooleanTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.BreakStatement): atBabelTypesLib.atBabelTypesMod.BreakStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.CallExpression): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.CatchClause): atBabelTypesLib.atBabelTypesMod.CatchClause = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ClassBody): atBabelTypesLib.atBabelTypesMod.ClassBody = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ClassDeclaration): atBabelTypesLib.atBabelTypesMod.ClassDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ClassExpression): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ClassImplements): atBabelTypesLib.atBabelTypesMod.ClassImplements = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ClassMethod): atBabelTypesLib.atBabelTypesMod.ClassMethod = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ClassPrivateMethod): atBabelTypesLib.atBabelTypesMod.ClassPrivateMethod = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty): atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ClassProperty): atBabelTypesLib.atBabelTypesMod.ClassProperty = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ConditionalExpression): atBabelTypesLib.atBabelTypesMod.ConditionalExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ContinueStatement): atBabelTypesLib.atBabelTypesMod.ContinueStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DebuggerStatement): atBabelTypesLib.atBabelTypesMod.DebuggerStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DeclareClass): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration): atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DeclareFunction): atBabelTypesLib.atBabelTypesMod.DeclareFunction = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DeclareInterface): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DeclareModule): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DeclareModuleExports): atBabelTypesLib.atBabelTypesMod.DeclareModuleExports = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType): atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias): atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DeclareVariable): atBabelTypesLib.atBabelTypesMod.DeclareVariable = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DeclaredPredicate): atBabelTypesLib.atBabelTypesMod.DeclaredPredicate = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.Decorator): atBabelTypesLib.atBabelTypesMod.Decorator = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.Directive): atBabelTypesLib.atBabelTypesMod.Directive = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DirectiveLiteral): atBabelTypesLib.atBabelTypesMod.DirectiveLiteral = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DoExpression): atBabelTypesLib.atBabelTypesMod.DoExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.DoWhileStatement): atBabelTypesLib.atBabelTypesMod.DoWhileStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.EmptyStatement): atBabelTypesLib.atBabelTypesMod.EmptyStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.EmptyTypeAnnotation): atBabelTypesLib.atBabelTypesMod.EmptyTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ExistsTypeAnnotation): atBabelTypesLib.atBabelTypesMod.ExistsTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ExportAllDeclaration): atBabelTypesLib.atBabelTypesMod.ExportAllDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration): atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier): atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier): atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ExportSpecifier): atBabelTypesLib.atBabelTypesMod.ExportSpecifier = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ExpressionStatement): atBabelTypesLib.atBabelTypesMod.ExpressionStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.File): atBabelTypesLib.atBabelTypesMod.File = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ForInStatement): atBabelTypesLib.atBabelTypesMod.ForInStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ForOfStatement): atBabelTypesLib.atBabelTypesMod.ForOfStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ForStatement): atBabelTypesLib.atBabelTypesMod.ForStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.FunctionDeclaration): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.FunctionExpression): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.FunctionTypeParam): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation): atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.IfStatement): atBabelTypesLib.atBabelTypesMod.IfStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.Import): atBabelTypesLib.atBabelTypesMod.Import = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ImportDeclaration): atBabelTypesLib.atBabelTypesMod.ImportDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier): atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier): atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ImportSpecifier): atBabelTypesLib.atBabelTypesMod.ImportSpecifier = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.InferredPredicate): atBabelTypesLib.atBabelTypesMod.InferredPredicate = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.InterfaceExtends): atBabelTypesLib.atBabelTypesMod.InterfaceExtends = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation): atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.InterpreterDirective): atBabelTypesLib.atBabelTypesMod.InterpreterDirective = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.IntersectionTypeAnnotation): atBabelTypesLib.atBabelTypesMod.IntersectionTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXAttribute): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXClosingElement): atBabelTypesLib.atBabelTypesMod.JSXClosingElement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXClosingFragment): atBabelTypesLib.atBabelTypesMod.JSXClosingFragment = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXElement): atBabelTypesLib.atBabelTypesMod.JSXElement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXEmptyExpression): atBabelTypesLib.atBabelTypesMod.JSXEmptyExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer): atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXFragment): atBabelTypesLib.atBabelTypesMod.JSXFragment = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXIdentifier): atBabelTypesLib.atBabelTypesMod.JSXIdentifier = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression): atBabelTypesLib.atBabelTypesMod.JSXMemberExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName): atBabelTypesLib.atBabelTypesMod.JSXNamespacedName = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXOpeningElement): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXOpeningFragment): atBabelTypesLib.atBabelTypesMod.JSXOpeningFragment = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute): atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXSpreadChild): atBabelTypesLib.atBabelTypesMod.JSXSpreadChild = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.JSXText): atBabelTypesLib.atBabelTypesMod.JSXText = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.LabeledStatement): atBabelTypesLib.atBabelTypesMod.LabeledStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.LogicalExpression): atBabelTypesLib.atBabelTypesMod.LogicalExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.MemberExpression): atBabelTypesLib.atBabelTypesMod.MemberExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.MetaProperty): atBabelTypesLib.atBabelTypesMod.MetaProperty = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.MixedTypeAnnotation): atBabelTypesLib.atBabelTypesMod.MixedTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.NewExpression): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.Noop): atBabelTypesLib.atBabelTypesMod.Noop = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.NullLiteral): atBabelTypesLib.atBabelTypesMod.NullLiteral = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.NullLiteralTypeAnnotation): atBabelTypesLib.atBabelTypesMod.NullLiteralTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.NullableTypeAnnotation): atBabelTypesLib.atBabelTypesMod.NullableTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.NumberLiteralTypeAnnotation): atBabelTypesLib.atBabelTypesMod.NumberLiteralTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.NumberTypeAnnotation): atBabelTypesLib.atBabelTypesMod.NumberTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.NumericLiteral): atBabelTypesLib.atBabelTypesMod.NumericLiteral = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ObjectExpression): atBabelTypesLib.atBabelTypesMod.ObjectExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ObjectMethod): atBabelTypesLib.atBabelTypesMod.ObjectMethod = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ObjectPattern): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ObjectProperty): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty): atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot): atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty): atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.OpaqueType): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.OptionalCallExpression): atBabelTypesLib.atBabelTypesMod.OptionalCallExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.OptionalMemberExpression): atBabelTypesLib.atBabelTypesMod.OptionalMemberExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ParenthesizedExpression): atBabelTypesLib.atBabelTypesMod.ParenthesizedExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.PipelineBareFunction): atBabelTypesLib.atBabelTypesMod.PipelineBareFunction = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.PipelinePrimaryTopicReference): atBabelTypesLib.atBabelTypesMod.PipelinePrimaryTopicReference = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.PipelineTopicExpression): atBabelTypesLib.atBabelTypesMod.PipelineTopicExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.Placeholder): atBabelTypesLib.atBabelTypesMod.Placeholder = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.PrivateName): atBabelTypesLib.atBabelTypesMod.PrivateName = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.Program): atBabelTypesLib.atBabelTypesMod.Program = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier): atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.RegExpLiteral): atBabelTypesLib.atBabelTypesMod.RegExpLiteral = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.RestElement): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ReturnStatement): atBabelTypesLib.atBabelTypesMod.ReturnStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.SequenceExpression): atBabelTypesLib.atBabelTypesMod.SequenceExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.SpreadElement): atBabelTypesLib.atBabelTypesMod.SpreadElement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.StringLiteral = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.StringLiteralTypeAnnotation): atBabelTypesLib.atBabelTypesMod.StringLiteralTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.StringTypeAnnotation): atBabelTypesLib.atBabelTypesMod.StringTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.Super): atBabelTypesLib.atBabelTypesMod.Super = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.SwitchCase): atBabelTypesLib.atBabelTypesMod.SwitchCase = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.SwitchStatement): atBabelTypesLib.atBabelTypesMod.SwitchStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSAnyKeyword): atBabelTypesLib.atBabelTypesMod.TSAnyKeyword = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSArrayType): atBabelTypesLib.atBabelTypesMod.TSArrayType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSAsExpression): atBabelTypesLib.atBabelTypesMod.TSAsExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSBooleanKeyword): atBabelTypesLib.atBabelTypesMod.TSBooleanKeyword = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSConditionalType): atBabelTypesLib.atBabelTypesMod.TSConditionalType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSConstructorType): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSDeclareFunction): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSDeclareMethod): atBabelTypesLib.atBabelTypesMod.TSDeclareMethod = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSEnumMember): atBabelTypesLib.atBabelTypesMod.TSEnumMember = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSExportAssignment): atBabelTypesLib.atBabelTypesMod.TSExportAssignment = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments): atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference): atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSFunctionType): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration): atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSImportType): atBabelTypesLib.atBabelTypesMod.TSImportType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSIndexSignature): atBabelTypesLib.atBabelTypesMod.TSIndexSignature = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSIndexedAccessType): atBabelTypesLib.atBabelTypesMod.TSIndexedAccessType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSInferType): atBabelTypesLib.atBabelTypesMod.TSInferType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody): atBabelTypesLib.atBabelTypesMod.TSInterfaceBody = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSIntersectionType): atBabelTypesLib.atBabelTypesMod.TSIntersectionType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSLiteralType): atBabelTypesLib.atBabelTypesMod.TSLiteralType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSMappedType): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSMethodSignature): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSModuleBlock): atBabelTypesLib.atBabelTypesMod.TSModuleBlock = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSNamespaceExportDeclaration): atBabelTypesLib.atBabelTypesMod.TSNamespaceExportDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSNeverKeyword): atBabelTypesLib.atBabelTypesMod.TSNeverKeyword = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSNonNullExpression): atBabelTypesLib.atBabelTypesMod.TSNonNullExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSNullKeyword): atBabelTypesLib.atBabelTypesMod.TSNullKeyword = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSNumberKeyword): atBabelTypesLib.atBabelTypesMod.TSNumberKeyword = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSObjectKeyword): atBabelTypesLib.atBabelTypesMod.TSObjectKeyword = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSOptionalType): atBabelTypesLib.atBabelTypesMod.TSOptionalType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSParameterProperty): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSParenthesizedType): atBabelTypesLib.atBabelTypesMod.TSParenthesizedType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSPropertySignature): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSQualifiedName): atBabelTypesLib.atBabelTypesMod.TSQualifiedName = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSRestType): atBabelTypesLib.atBabelTypesMod.TSRestType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSStringKeyword): atBabelTypesLib.atBabelTypesMod.TSStringKeyword = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSSymbolKeyword): atBabelTypesLib.atBabelTypesMod.TSSymbolKeyword = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSThisType): atBabelTypesLib.atBabelTypesMod.TSThisType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSTupleType): atBabelTypesLib.atBabelTypesMod.TSTupleType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation): atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSTypeAssertion): atBabelTypesLib.atBabelTypesMod.TSTypeAssertion = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSTypeLiteral): atBabelTypesLib.atBabelTypesMod.TSTypeLiteral = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSTypeOperator): atBabelTypesLib.atBabelTypesMod.TSTypeOperator = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSTypeParameter): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration): atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation): atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSTypePredicate): atBabelTypesLib.atBabelTypesMod.TSTypePredicate = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSTypeQuery): atBabelTypesLib.atBabelTypesMod.TSTypeQuery = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSTypeReference): atBabelTypesLib.atBabelTypesMod.TSTypeReference = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSUndefinedKeyword): atBabelTypesLib.atBabelTypesMod.TSUndefinedKeyword = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSUnionType): atBabelTypesLib.atBabelTypesMod.TSUnionType = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSUnknownKeyword): atBabelTypesLib.atBabelTypesMod.TSUnknownKeyword = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TSVoidKeyword): atBabelTypesLib.atBabelTypesMod.TSVoidKeyword = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression): atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TemplateElement): atBabelTypesLib.atBabelTypesMod.TemplateElement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TemplateLiteral): atBabelTypesLib.atBabelTypesMod.TemplateLiteral = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ThisExpression): atBabelTypesLib.atBabelTypesMod.ThisExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ThisTypeAnnotation): atBabelTypesLib.atBabelTypesMod.ThisTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.ThrowStatement): atBabelTypesLib.atBabelTypesMod.ThrowStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TryStatement): atBabelTypesLib.atBabelTypesMod.TryStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TupleTypeAnnotation): atBabelTypesLib.atBabelTypesMod.TupleTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TypeAlias): atBabelTypesLib.atBabelTypesMod.TypeAlias = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TypeAnnotation): atBabelTypesLib.atBabelTypesMod.TypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TypeCastExpression): atBabelTypesLib.atBabelTypesMod.TypeCastExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TypeParameter): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration): atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation): atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.TypeofTypeAnnotation): atBabelTypesLib.atBabelTypesMod.TypeofTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.UnaryExpression): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.UnionTypeAnnotation): atBabelTypesLib.atBabelTypesMod.UnionTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.UpdateExpression): atBabelTypesLib.atBabelTypesMod.UpdateExpression = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.VariableDeclaration): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.VariableDeclarator): atBabelTypesLib.atBabelTypesMod.VariableDeclarator = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.Variance): atBabelTypesLib.atBabelTypesMod.Variance = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.VoidTypeAnnotation): atBabelTypesLib.atBabelTypesMod.VoidTypeAnnotation = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.WhileStatement): atBabelTypesLib.atBabelTypesMod.WhileStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.WithStatement): atBabelTypesLib.atBabelTypesMod.WithStatement = js.native
  def clone(n: atBabelTypesLib.atBabelTypesMod.YieldExpression): atBabelTypesLib.atBabelTypesMod.YieldExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.AnyTypeAnnotation): atBabelTypesLib.atBabelTypesMod.AnyTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder): atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ArrayExpression): atBabelTypesLib.atBabelTypesMod.ArrayExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ArrayPattern): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ArrayTypeAnnotation): atBabelTypesLib.atBabelTypesMod.ArrayTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.AssignmentExpression): atBabelTypesLib.atBabelTypesMod.AssignmentExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.AssignmentPattern): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.AwaitExpression): atBabelTypesLib.atBabelTypesMod.AwaitExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.BigIntLiteral): atBabelTypesLib.atBabelTypesMod.BigIntLiteral = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.BinaryExpression): atBabelTypesLib.atBabelTypesMod.BinaryExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.BindExpression): atBabelTypesLib.atBabelTypesMod.BindExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.BlockStatement): atBabelTypesLib.atBabelTypesMod.BlockStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.BooleanLiteral): atBabelTypesLib.atBabelTypesMod.BooleanLiteral = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.BooleanLiteralTypeAnnotation): atBabelTypesLib.atBabelTypesMod.BooleanLiteralTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.BooleanTypeAnnotation): atBabelTypesLib.atBabelTypesMod.BooleanTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.BreakStatement): atBabelTypesLib.atBabelTypesMod.BreakStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.CallExpression): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.CatchClause): atBabelTypesLib.atBabelTypesMod.CatchClause = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ClassBody): atBabelTypesLib.atBabelTypesMod.ClassBody = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ClassDeclaration): atBabelTypesLib.atBabelTypesMod.ClassDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ClassExpression): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ClassImplements): atBabelTypesLib.atBabelTypesMod.ClassImplements = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ClassMethod): atBabelTypesLib.atBabelTypesMod.ClassMethod = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ClassPrivateMethod): atBabelTypesLib.atBabelTypesMod.ClassPrivateMethod = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty): atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ClassProperty): atBabelTypesLib.atBabelTypesMod.ClassProperty = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ConditionalExpression): atBabelTypesLib.atBabelTypesMod.ConditionalExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ContinueStatement): atBabelTypesLib.atBabelTypesMod.ContinueStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DebuggerStatement): atBabelTypesLib.atBabelTypesMod.DebuggerStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareClass): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration): atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareFunction): atBabelTypesLib.atBabelTypesMod.DeclareFunction = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareInterface): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareModule): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareModuleExports): atBabelTypesLib.atBabelTypesMod.DeclareModuleExports = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType): atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias): atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareVariable): atBabelTypesLib.atBabelTypesMod.DeclareVariable = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DeclaredPredicate): atBabelTypesLib.atBabelTypesMod.DeclaredPredicate = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.Decorator): atBabelTypesLib.atBabelTypesMod.Decorator = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.Directive): atBabelTypesLib.atBabelTypesMod.Directive = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DirectiveLiteral): atBabelTypesLib.atBabelTypesMod.DirectiveLiteral = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DoExpression): atBabelTypesLib.atBabelTypesMod.DoExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.DoWhileStatement): atBabelTypesLib.atBabelTypesMod.DoWhileStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.EmptyStatement): atBabelTypesLib.atBabelTypesMod.EmptyStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.EmptyTypeAnnotation): atBabelTypesLib.atBabelTypesMod.EmptyTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ExistsTypeAnnotation): atBabelTypesLib.atBabelTypesMod.ExistsTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ExportAllDeclaration): atBabelTypesLib.atBabelTypesMod.ExportAllDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration): atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier): atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier): atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ExportSpecifier): atBabelTypesLib.atBabelTypesMod.ExportSpecifier = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ExpressionStatement): atBabelTypesLib.atBabelTypesMod.ExpressionStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.File): atBabelTypesLib.atBabelTypesMod.File = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ForInStatement): atBabelTypesLib.atBabelTypesMod.ForInStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ForOfStatement): atBabelTypesLib.atBabelTypesMod.ForOfStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ForStatement): atBabelTypesLib.atBabelTypesMod.ForStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.FunctionDeclaration): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.FunctionExpression): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.FunctionTypeParam): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation): atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.IfStatement): atBabelTypesLib.atBabelTypesMod.IfStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.Import): atBabelTypesLib.atBabelTypesMod.Import = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ImportDeclaration): atBabelTypesLib.atBabelTypesMod.ImportDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier): atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier): atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ImportSpecifier): atBabelTypesLib.atBabelTypesMod.ImportSpecifier = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.InferredPredicate): atBabelTypesLib.atBabelTypesMod.InferredPredicate = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.InterfaceExtends): atBabelTypesLib.atBabelTypesMod.InterfaceExtends = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation): atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.InterpreterDirective): atBabelTypesLib.atBabelTypesMod.InterpreterDirective = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.IntersectionTypeAnnotation): atBabelTypesLib.atBabelTypesMod.IntersectionTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXAttribute): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXClosingElement): atBabelTypesLib.atBabelTypesMod.JSXClosingElement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXClosingFragment): atBabelTypesLib.atBabelTypesMod.JSXClosingFragment = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXElement): atBabelTypesLib.atBabelTypesMod.JSXElement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXEmptyExpression): atBabelTypesLib.atBabelTypesMod.JSXEmptyExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer): atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXFragment): atBabelTypesLib.atBabelTypesMod.JSXFragment = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXIdentifier): atBabelTypesLib.atBabelTypesMod.JSXIdentifier = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression): atBabelTypesLib.atBabelTypesMod.JSXMemberExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName): atBabelTypesLib.atBabelTypesMod.JSXNamespacedName = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXOpeningElement): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXOpeningFragment): atBabelTypesLib.atBabelTypesMod.JSXOpeningFragment = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute): atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXSpreadChild): atBabelTypesLib.atBabelTypesMod.JSXSpreadChild = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.JSXText): atBabelTypesLib.atBabelTypesMod.JSXText = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.LabeledStatement): atBabelTypesLib.atBabelTypesMod.LabeledStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.LogicalExpression): atBabelTypesLib.atBabelTypesMod.LogicalExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.MemberExpression): atBabelTypesLib.atBabelTypesMod.MemberExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.MetaProperty): atBabelTypesLib.atBabelTypesMod.MetaProperty = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.MixedTypeAnnotation): atBabelTypesLib.atBabelTypesMod.MixedTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.NewExpression): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.Noop): atBabelTypesLib.atBabelTypesMod.Noop = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.NullLiteral): atBabelTypesLib.atBabelTypesMod.NullLiteral = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.NullLiteralTypeAnnotation): atBabelTypesLib.atBabelTypesMod.NullLiteralTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.NullableTypeAnnotation): atBabelTypesLib.atBabelTypesMod.NullableTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.NumberLiteralTypeAnnotation): atBabelTypesLib.atBabelTypesMod.NumberLiteralTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.NumberTypeAnnotation): atBabelTypesLib.atBabelTypesMod.NumberTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.NumericLiteral): atBabelTypesLib.atBabelTypesMod.NumericLiteral = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectExpression): atBabelTypesLib.atBabelTypesMod.ObjectExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectMethod): atBabelTypesLib.atBabelTypesMod.ObjectMethod = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectPattern): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectProperty): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty): atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot): atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty): atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.OpaqueType): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.OptionalCallExpression): atBabelTypesLib.atBabelTypesMod.OptionalCallExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.OptionalMemberExpression): atBabelTypesLib.atBabelTypesMod.OptionalMemberExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ParenthesizedExpression): atBabelTypesLib.atBabelTypesMod.ParenthesizedExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.PipelineBareFunction): atBabelTypesLib.atBabelTypesMod.PipelineBareFunction = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.PipelinePrimaryTopicReference): atBabelTypesLib.atBabelTypesMod.PipelinePrimaryTopicReference = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.PipelineTopicExpression): atBabelTypesLib.atBabelTypesMod.PipelineTopicExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.Placeholder): atBabelTypesLib.atBabelTypesMod.Placeholder = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.PrivateName): atBabelTypesLib.atBabelTypesMod.PrivateName = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.Program): atBabelTypesLib.atBabelTypesMod.Program = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier): atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.RegExpLiteral): atBabelTypesLib.atBabelTypesMod.RegExpLiteral = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.RestElement): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ReturnStatement): atBabelTypesLib.atBabelTypesMod.ReturnStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.SequenceExpression): atBabelTypesLib.atBabelTypesMod.SequenceExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.SpreadElement): atBabelTypesLib.atBabelTypesMod.SpreadElement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.StringLiteral = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.StringLiteralTypeAnnotation): atBabelTypesLib.atBabelTypesMod.StringLiteralTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.StringTypeAnnotation): atBabelTypesLib.atBabelTypesMod.StringTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.Super): atBabelTypesLib.atBabelTypesMod.Super = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.SwitchCase): atBabelTypesLib.atBabelTypesMod.SwitchCase = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.SwitchStatement): atBabelTypesLib.atBabelTypesMod.SwitchStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSAnyKeyword): atBabelTypesLib.atBabelTypesMod.TSAnyKeyword = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSArrayType): atBabelTypesLib.atBabelTypesMod.TSArrayType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSAsExpression): atBabelTypesLib.atBabelTypesMod.TSAsExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSBooleanKeyword): atBabelTypesLib.atBabelTypesMod.TSBooleanKeyword = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSConditionalType): atBabelTypesLib.atBabelTypesMod.TSConditionalType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSConstructorType): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSDeclareFunction): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSDeclareMethod): atBabelTypesLib.atBabelTypesMod.TSDeclareMethod = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSEnumMember): atBabelTypesLib.atBabelTypesMod.TSEnumMember = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSExportAssignment): atBabelTypesLib.atBabelTypesMod.TSExportAssignment = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments): atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference): atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSFunctionType): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration): atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSImportType): atBabelTypesLib.atBabelTypesMod.TSImportType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSIndexSignature): atBabelTypesLib.atBabelTypesMod.TSIndexSignature = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSIndexedAccessType): atBabelTypesLib.atBabelTypesMod.TSIndexedAccessType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSInferType): atBabelTypesLib.atBabelTypesMod.TSInferType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody): atBabelTypesLib.atBabelTypesMod.TSInterfaceBody = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSIntersectionType): atBabelTypesLib.atBabelTypesMod.TSIntersectionType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSLiteralType): atBabelTypesLib.atBabelTypesMod.TSLiteralType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSMappedType): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSMethodSignature): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSModuleBlock): atBabelTypesLib.atBabelTypesMod.TSModuleBlock = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSNamespaceExportDeclaration): atBabelTypesLib.atBabelTypesMod.TSNamespaceExportDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSNeverKeyword): atBabelTypesLib.atBabelTypesMod.TSNeverKeyword = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSNonNullExpression): atBabelTypesLib.atBabelTypesMod.TSNonNullExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSNullKeyword): atBabelTypesLib.atBabelTypesMod.TSNullKeyword = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSNumberKeyword): atBabelTypesLib.atBabelTypesMod.TSNumberKeyword = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSObjectKeyword): atBabelTypesLib.atBabelTypesMod.TSObjectKeyword = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSOptionalType): atBabelTypesLib.atBabelTypesMod.TSOptionalType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSParameterProperty): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSParenthesizedType): atBabelTypesLib.atBabelTypesMod.TSParenthesizedType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSPropertySignature): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSQualifiedName): atBabelTypesLib.atBabelTypesMod.TSQualifiedName = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSRestType): atBabelTypesLib.atBabelTypesMod.TSRestType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSStringKeyword): atBabelTypesLib.atBabelTypesMod.TSStringKeyword = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSSymbolKeyword): atBabelTypesLib.atBabelTypesMod.TSSymbolKeyword = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSThisType): atBabelTypesLib.atBabelTypesMod.TSThisType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSTupleType): atBabelTypesLib.atBabelTypesMod.TSTupleType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation): atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeAssertion): atBabelTypesLib.atBabelTypesMod.TSTypeAssertion = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeLiteral): atBabelTypesLib.atBabelTypesMod.TSTypeLiteral = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeOperator): atBabelTypesLib.atBabelTypesMod.TSTypeOperator = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeParameter): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration): atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation): atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypePredicate): atBabelTypesLib.atBabelTypesMod.TSTypePredicate = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeQuery): atBabelTypesLib.atBabelTypesMod.TSTypeQuery = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeReference): atBabelTypesLib.atBabelTypesMod.TSTypeReference = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSUndefinedKeyword): atBabelTypesLib.atBabelTypesMod.TSUndefinedKeyword = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSUnionType): atBabelTypesLib.atBabelTypesMod.TSUnionType = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSUnknownKeyword): atBabelTypesLib.atBabelTypesMod.TSUnknownKeyword = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TSVoidKeyword): atBabelTypesLib.atBabelTypesMod.TSVoidKeyword = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression): atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TemplateElement): atBabelTypesLib.atBabelTypesMod.TemplateElement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TemplateLiteral): atBabelTypesLib.atBabelTypesMod.TemplateLiteral = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ThisExpression): atBabelTypesLib.atBabelTypesMod.ThisExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ThisTypeAnnotation): atBabelTypesLib.atBabelTypesMod.ThisTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.ThrowStatement): atBabelTypesLib.atBabelTypesMod.ThrowStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TryStatement): atBabelTypesLib.atBabelTypesMod.TryStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TupleTypeAnnotation): atBabelTypesLib.atBabelTypesMod.TupleTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TypeAlias): atBabelTypesLib.atBabelTypesMod.TypeAlias = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TypeAnnotation): atBabelTypesLib.atBabelTypesMod.TypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TypeCastExpression): atBabelTypesLib.atBabelTypesMod.TypeCastExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TypeParameter): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration): atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation): atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.TypeofTypeAnnotation): atBabelTypesLib.atBabelTypesMod.TypeofTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.UnaryExpression): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.UnionTypeAnnotation): atBabelTypesLib.atBabelTypesMod.UnionTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.UpdateExpression): atBabelTypesLib.atBabelTypesMod.UpdateExpression = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.VariableDeclaration): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.VariableDeclarator): atBabelTypesLib.atBabelTypesMod.VariableDeclarator = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.Variance): atBabelTypesLib.atBabelTypesMod.Variance = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.VoidTypeAnnotation): atBabelTypesLib.atBabelTypesMod.VoidTypeAnnotation = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.WhileStatement): atBabelTypesLib.atBabelTypesMod.WhileStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.WithStatement): atBabelTypesLib.atBabelTypesMod.WithStatement = js.native
  def cloneDeep(n: atBabelTypesLib.atBabelTypesMod.YieldExpression): atBabelTypesLib.atBabelTypesMod.YieldExpression = js.native
  def conditionalExpression(
    test: atBabelTypesLib.atBabelTypesMod.Expression,
    consequent: atBabelTypesLib.atBabelTypesMod.Expression,
    alternate: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.ConditionalExpression = js.native
  def continueStatement(): atBabelTypesLib.atBabelTypesMod.ContinueStatement = js.native
  def continueStatement(label: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.ContinueStatement = js.native
  def debuggerStatement(): atBabelTypesLib.atBabelTypesMod.DebuggerStatement = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareClass(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def declareExportAllDeclaration(source: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration = js.native
  @JSName("declareExportAllDeclaration")
  def declareExportAllDeclaration_type(
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.`type`
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration = js.native
  @JSName("declareExportAllDeclaration")
  def declareExportAllDeclaration_value(
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.value
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration = js.native
  def declareExportDeclaration(): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: atBabelTypesLib.atBabelTypesMod.Flow): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ]
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: scala.Null,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: scala.Null,
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: scala.Null,
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Flow,
    specifiers: scala.Null,
    source: scala.Null,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ]
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: scala.Null,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: scala.Null,
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: scala.Null,
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    _default: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: scala.Null, specifiers: scala.Null, source: scala.Null, _default: scala.Boolean): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def declareFunction(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.DeclareFunction = js.native
  def declareFunction(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    predicate: atBabelTypesLib.atBabelTypesMod.DeclaredPredicate
  ): atBabelTypesLib.atBabelTypesMod.DeclareFunction = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareInterface(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def declareModule(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  def declareModule(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  def declareModuleExports(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation): atBabelTypesLib.atBabelTypesMod.DeclareModuleExports = js.native
  @JSName("declareModule")
  def declareModule_CommonJS(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    kind: atBabelCoreLib.atBabelCoreLibStrings.CommonJS
  ): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_CommonJS(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    kind: atBabelCoreLib.atBabelCoreLibStrings.CommonJS
  ): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_ES(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    kind: atBabelCoreLib.atBabelCoreLibStrings.ES
  ): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_ES(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    kind: atBabelCoreLib.atBabelCoreLibStrings.ES
  ): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  def declareOpaqueType(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType = js.native
  def declareOpaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration
  ): atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType = js.native
  def declareOpaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    supertype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType = js.native
  def declareOpaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    supertype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType = js.native
  def declareTypeAlias(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    right: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias = js.native
  def declareTypeAlias(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    right: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias = js.native
  def declareTypeAlias(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    right: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias = js.native
  def declareVariable(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.DeclareVariable = js.native
  def declaredPredicate(value: atBabelTypesLib.atBabelTypesMod.Flow): atBabelTypesLib.atBabelTypesMod.DeclaredPredicate = js.native
  def decorator(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.Decorator = js.native
  def directive(value: atBabelTypesLib.atBabelTypesMod.DirectiveLiteral): atBabelTypesLib.atBabelTypesMod.Directive = js.native
  def directiveLiteral(value: java.lang.String): atBabelTypesLib.atBabelTypesMod.DirectiveLiteral = js.native
  def doExpression(body: atBabelTypesLib.atBabelTypesMod.BlockStatement): atBabelTypesLib.atBabelTypesMod.DoExpression = js.native
  def doWhileStatement(test: atBabelTypesLib.atBabelTypesMod.Expression, body: atBabelTypesLib.atBabelTypesMod.Statement): atBabelTypesLib.atBabelTypesMod.DoWhileStatement = js.native
  def emptyStatement(): atBabelTypesLib.atBabelTypesMod.EmptyStatement = js.native
  def emptyTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.EmptyTypeAnnotation = js.native
  def existsTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.ExistsTypeAnnotation = js.native
  def exportAllDeclaration(source: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.ExportAllDeclaration = js.native
  def exportDefaultDeclaration(declaration: atBabelTypesLib.atBabelTypesMod.ClassDeclaration): atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: atBabelTypesLib.atBabelTypesMod.FunctionDeclaration): atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: atBabelTypesLib.atBabelTypesMod.TSDeclareFunction): atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration = js.native
  def exportDefaultSpecifier(exported: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier = js.native
  def exportNamedDeclaration(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ]
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Declaration,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ]
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: atBabelTypesLib.atBabelTypesMod.Declaration,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ]
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_type(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.`type`
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_type(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: scala.Null,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.`type`
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_type(
    declaration: atBabelTypesLib.atBabelTypesMod.Declaration,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.`type`
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_type(
    declaration: atBabelTypesLib.atBabelTypesMod.Declaration,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: scala.Null,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.`type`
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_type(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.`type`
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_type(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: scala.Null,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.`type`
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_value(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.value
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_value(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: scala.Null,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.value
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_value(
    declaration: atBabelTypesLib.atBabelTypesMod.Declaration,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.value
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_value(
    declaration: atBabelTypesLib.atBabelTypesMod.Declaration,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: scala.Null,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.value
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_value(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.value
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_value(
    declaration: scala.Null,
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ExportSpecifier | atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier
    ],
    source: scala.Null,
    exportKind: atBabelCoreLib.atBabelCoreLibStrings.value
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def exportNamespaceSpecifier(exported: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier = js.native
  def exportSpecifier(
    local: atBabelTypesLib.atBabelTypesMod.Identifier,
    exported: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.ExportSpecifier = js.native
  def expressionStatement(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.ExpressionStatement = js.native
  def file(program: atBabelTypesLib.atBabelTypesMod.Program, comments: js.Any, tokens: js.Any): atBabelTypesLib.atBabelTypesMod.File = js.native
  def forInStatement(
    left: atBabelTypesLib.atBabelTypesMod.LVal,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.ForInStatement = js.native
  def forInStatement(
    left: atBabelTypesLib.atBabelTypesMod.VariableDeclaration,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.ForInStatement = js.native
  def forOfStatement(
    left: atBabelTypesLib.atBabelTypesMod.LVal,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.ForOfStatement = js.native
  def forOfStatement(
    left: atBabelTypesLib.atBabelTypesMod.LVal,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement,
    _await: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ForOfStatement = js.native
  def forOfStatement(
    left: atBabelTypesLib.atBabelTypesMod.VariableDeclaration,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.ForOfStatement = js.native
  def forOfStatement(
    left: atBabelTypesLib.atBabelTypesMod.VariableDeclaration,
    right: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement,
    _await: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ForOfStatement = js.native
  def forStatement(
    init: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.VariableDeclaration | atBabelTypesLib.atBabelTypesMod.Expression | scala.Null
    ],
    test: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    update: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Expression | scala.Null],
    body: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.ForStatement = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionDeclaration(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionExpression(
    id: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: atBabelTypesLib.atBabelTypesMod.FunctionTypeParam,
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: scala.Null,
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: atBabelTypesLib.atBabelTypesMod.FunctionTypeParam,
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: scala.Null,
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: atBabelTypesLib.atBabelTypesMod.FunctionTypeParam,
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[atBabelTypesLib.atBabelTypesMod.FunctionTypeParam],
    rest: scala.Null,
    returnType: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def functionTypeParam(name: js.UndefOr[scala.Nothing], typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def functionTypeParam(
    name: js.UndefOr[scala.Nothing],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def functionTypeParam(
    name: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def functionTypeParam(
    name: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def functionTypeParam(name: scala.Null, typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def functionTypeParam(
    name: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def genericTypeAnnotation(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation = js.native
  def genericTypeAnnotation(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier): atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation = js.native
  def genericTypeAnnotation(
    id: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation = js.native
  def identifier(name: java.lang.String): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(name: java.lang.String, decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(name: java.lang.String, decorators: scala.Null, optional: scala.Boolean): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Boolean,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def ifStatement(
    test: atBabelTypesLib.atBabelTypesMod.Expression,
    consequent: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.IfStatement = js.native
  def ifStatement(
    test: atBabelTypesLib.atBabelTypesMod.Expression,
    consequent: atBabelTypesLib.atBabelTypesMod.Statement,
    alternate: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.IfStatement = js.native
  def importDeclaration(
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ImportSpecifier | atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_type(
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ImportSpecifier | atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    importKind: atBabelCoreLib.atBabelCoreLibStrings.`type`
  ): atBabelTypesLib.atBabelTypesMod.ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_typeof(
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ImportSpecifier | atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    importKind: atBabelCoreLib.atBabelCoreLibStrings.typeof
  ): atBabelTypesLib.atBabelTypesMod.ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_value(
    specifiers: js.Array[
      atBabelTypesLib.atBabelTypesMod.ImportSpecifier | atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier | atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier
    ],
    source: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    importKind: atBabelCoreLib.atBabelCoreLibStrings.value
  ): atBabelTypesLib.atBabelTypesMod.ImportDeclaration = js.native
  def importDefaultSpecifier(local: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier = js.native
  def importNamespaceSpecifier(local: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier = js.native
  def importSpecifier(
    local: atBabelTypesLib.atBabelTypesMod.Identifier,
    imported: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.ImportSpecifier = js.native
  @JSName("importSpecifier")
  def importSpecifier_type(
    local: atBabelTypesLib.atBabelTypesMod.Identifier,
    imported: atBabelTypesLib.atBabelTypesMod.Identifier,
    importKind: atBabelCoreLib.atBabelCoreLibStrings.`type`
  ): atBabelTypesLib.atBabelTypesMod.ImportSpecifier = js.native
  @JSName("importSpecifier")
  def importSpecifier_typeof(
    local: atBabelTypesLib.atBabelTypesMod.Identifier,
    imported: atBabelTypesLib.atBabelTypesMod.Identifier,
    importKind: atBabelCoreLib.atBabelCoreLibStrings.typeof
  ): atBabelTypesLib.atBabelTypesMod.ImportSpecifier = js.native
  def inferredPredicate(): atBabelTypesLib.atBabelTypesMod.InferredPredicate = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    _implements: js.Array[atBabelTypesLib.atBabelTypesMod.ClassImplements],
    mixins: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends]
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def interfaceExtends(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.InterfaceExtends = js.native
  def interfaceExtends(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceExtends = js.native
  def interfaceExtends(id: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier): atBabelTypesLib.atBabelTypesMod.InterfaceExtends = js.native
  def interfaceExtends(
    id: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceExtends = js.native
  def interfaceTypeAnnotation(_extends: js.UndefOr[scala.Nothing], body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation): atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.InterfaceExtends],
    body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(_extends: scala.Null, body: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation): atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation = js.native
  def interpreterDirective(value: java.lang.String): atBabelTypesLib.atBabelTypesMod.InterpreterDirective = js.native
  def intersectionTypeAnnotation(types: js.Array[atBabelTypesLib.atBabelTypesMod.FlowType]): atBabelTypesLib.atBabelTypesMod.IntersectionTypeAnnotation = js.native
  def isAnyTypeAnnotation(): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isArgumentPlaceholder(): /* is @babel/types.@babel/types.ArgumentPlaceholder */ scala.Boolean = js.native
  def isArgumentPlaceholder(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ scala.Boolean = js.native
  def isArgumentPlaceholder(node: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ scala.Boolean = js.native
  def isArgumentPlaceholder(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ scala.Boolean = js.native
  def isArgumentPlaceholder(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ scala.Boolean = js.native
  def isArrayExpression(): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayPattern(): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayTypeAnnotation(): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrowFunctionExpression(): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isAssignmentExpression(): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentPattern(): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAwaitExpression(): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isBigIntLiteral(): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBigIntLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBigIntLiteral(node: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBigIntLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBigIntLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBinary(): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinary(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinary(node: js.Object): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinary(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinary(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinaryExpression(): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBindExpression(): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.Object): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBlock(): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlock(node: js.Object): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlock(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlockParent(): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: js.Object): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockStatement(): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: js.Object): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBooleanLiteral(): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBreakStatement(): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: js.Object): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isCallExpression(): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: js.Object): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCatchClause(): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: js.Object): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isClass(): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClass(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClass(node: js.Object): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClass(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClass(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClassBody(): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: js.Object): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassDeclaration(): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassExpression(): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: js.Object): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassImplements(): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: js.Object): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassMethod(): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: js.Object): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(node: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateProperty(): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassPrivateProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassPrivateProperty(node: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassPrivateProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassPrivateProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassProperty(): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.Object): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isCompletionStatement(): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isConditional(): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditional(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditional(node: js.Object): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditional(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditional(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditionalExpression(): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isContinueStatement(): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isDebuggerStatement(): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDeclaration(): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: js.Object): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclareClass(): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: js.Object): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareFunction(): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareInterface(): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareModule(): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: js.Object): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModuleExports(): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareModuleExports(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareModuleExports(node: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareModuleExports(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareModuleExports(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareOpaqueType(): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareOpaqueType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareOpaqueType(node: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareOpaqueType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareOpaqueType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareTypeAlias(): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareVariable(): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclaredPredicate(): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDeclaredPredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDeclaredPredicate(node: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDeclaredPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDeclaredPredicate(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDecorator(): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: js.Object): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDirective(): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirective(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirective(node: js.Object): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirective(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirective(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirectiveLiteral(): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDoExpression(): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: js.Object): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoWhileStatement(): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isEmptyStatement(): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExportAllDeclaration(): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultSpecifier(): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportNamedDeclaration(): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExpression(): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpression(node: js.Object): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpressionStatement(): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionWrapper(): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isFile(): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFile(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFile(node: js.Object): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFile(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFile(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFlow(): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlow(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlow(node: js.Object): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlow(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlow(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlowBaseAnnotation(): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowDeclaration(): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowPredicate(): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowPredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowPredicate(node: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowPredicate(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowType(): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFlowType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFlowType(node: js.Object): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFlowType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFlowType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFor(): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isFor(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isFor(node: js.Object): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isFor(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isFor(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isForInStatement(): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: js.Object): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForOfStatement(): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForStatement(): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: js.Object): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForXStatement(): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.Object): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isFunction(): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunction(node: js.Object): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunction(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunctionDeclaration(): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionExpression(): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionParent(): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: js.Object): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeParam(): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isGenericTypeAnnotation(): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isIdentifier(): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: js.Object): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIfStatement(): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: js.Object): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isImmutable(): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: js.Object): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImport(): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImport(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImport(node: js.Object): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImport(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImport(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImportDeclaration(): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDefaultSpecifier(): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isInferredPredicate(): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInferredPredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInferredPredicate(node: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInferredPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInferredPredicate(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInterfaceDeclaration(): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceExtends(): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterpreterDirective(): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isInterpreterDirective(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isInterpreterDirective(node: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isInterpreterDirective(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isInterpreterDirective(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isJSX(): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSX(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSX(node: js.Object): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSX(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSX(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSXAttribute(): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXClosingElement(): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingFragment(): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXClosingFragment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXClosingFragment(node: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXClosingFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXClosingFragment(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXElement(): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: js.Object): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXEmptyExpression(): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXExpressionContainer(): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXFragment(): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXFragment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXFragment(node: js.Object): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXFragment(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXIdentifier(): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXMemberExpression(): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXNamespacedName(): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXOpeningElement(): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningFragment(): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXOpeningFragment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXOpeningFragment(node: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXOpeningFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXOpeningFragment(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXSpreadAttribute(): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadChild(): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXSpreadChild(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXSpreadChild(node: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXSpreadChild(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXSpreadChild(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXText(): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: js.Object): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isLVal(): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLVal(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLVal(node: js.Object): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLVal(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLVal(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLabeledStatement(): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLiteral(): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLiteral(node: js.Object): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLogicalExpression(): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLoop(): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isLoop(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isLoop(node: js.Object): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isLoop(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isLoop(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isMemberExpression(): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: js.Object): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMetaProperty(): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: js.Object): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMethod(): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMethod(node: js.Object): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMethod(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMixedTypeAnnotation(): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isModuleDeclaration(): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleSpecifier(): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isNewExpression(): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: js.Object): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNoop(): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNoop(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNoop(node: js.Object): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNoop(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNoop(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNullLiteral(): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: js.Object): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteral(): scala.Boolean = js.native
  def isNumberLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isNumberLiteral(node: js.Object): scala.Boolean = js.native
  def isNumberLiteral(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isNumberLiteral(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumericLiteral(): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isObjectExpression(): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectMember(): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: js.Object): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMethod(): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectPattern(): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectProperty(): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectTypeAnnotation(): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeCallProperty(): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeIndexer(): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeProperty(): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isOpaqueType(): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOpaqueType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOpaqueType(node: js.Object): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOpaqueType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOpaqueType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOptionalCallExpression(): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalCallExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalCallExpression(node: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalCallExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(node: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isPattern(): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPattern(node: js.Object): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPattern(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPatternLike(): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPatternLike(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPatternLike(node: js.Object): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPatternLike(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPatternLike(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPipelineBareFunction(): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelineBareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelineBareFunction(node: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelineBareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelineBareFunction(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelineTopicExpression(): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPipelineTopicExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPipelineTopicExpression(node: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPipelineTopicExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPipelineTopicExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPlaceholder(): /* is @babel/types.@babel/types.Placeholder */ scala.Boolean = js.native
  def isPlaceholder(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Placeholder */ scala.Boolean = js.native
  def isPlaceholder(node: js.Object): /* is @babel/types.@babel/types.Placeholder */ scala.Boolean = js.native
  def isPlaceholder(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Placeholder */ scala.Boolean = js.native
  def isPlaceholder(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Placeholder */ scala.Boolean = js.native
  def isPrivate(): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivate(node: js.Object): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivate(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivateName(): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isPrivateName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isPrivateName(node: js.Object): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isPrivateName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isPrivateName(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isProgram(): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProgram(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProgram(node: js.Object): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProgram(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProgram(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProperty(): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isProperty(node: js.Object): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isPureish(): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isPureish(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isPureish(node: js.Object): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isPureish(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isPureish(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isRegExpLiteral(): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegexLiteral(): scala.Boolean = js.native
  def isRegexLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isRegexLiteral(node: js.Object): scala.Boolean = js.native
  def isRegexLiteral(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isRegexLiteral(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isRestElement(): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: js.Object): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestProperty(): scala.Boolean = js.native
  def isRestProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isRestProperty(node: js.Object): scala.Boolean = js.native
  def isRestProperty(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isRestProperty(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isReturnStatement(): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isScopable(): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isScopable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isScopable(node: js.Object): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isScopable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isScopable(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isSequenceExpression(): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSpreadElement(): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: js.Object): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadProperty(): scala.Boolean = js.native
  def isSpreadProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isSpreadProperty(node: js.Object): scala.Boolean = js.native
  def isSpreadProperty(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isSpreadProperty(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isStatement(): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStatement(node: js.Object): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStringLiteral(): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: js.Object): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isSuper(): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSuper(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSuper(node: js.Object): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSuper(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSuper(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSwitchCase(): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: js.Object): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchStatement(): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isTSAnyKeyword(): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSArrayType(): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: js.Object): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSAsExpression(): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSBooleanKeyword(): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSConditionalType(): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConditionalType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConditionalType(node: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConditionalType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConditionalType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructorType(): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSDeclareFunction(): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareMethod(): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSEntityName(): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEntityName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEntityName(node: js.Object): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEntityName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEntityName(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEnumDeclaration(): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumMember(): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSExportAssignment(): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExternalModuleReference(): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSFunctionType(): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportType(): /* is @babel/types.@babel/types.TSImportType */ scala.Boolean = js.native
  def isTSImportType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ scala.Boolean = js.native
  def isTSImportType(node: js.Object): /* is @babel/types.@babel/types.TSImportType */ scala.Boolean = js.native
  def isTSImportType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ scala.Boolean = js.native
  def isTSImportType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ scala.Boolean = js.native
  def isTSIndexSignature(): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexedAccessType(): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSInferType(): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInferType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInferType(node: js.Object): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInferType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInferType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInterfaceBody(): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSIntersectionType(): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSLiteralType(): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSMappedType(): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: js.Object): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMethodSignature(): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSModuleBlock(): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleDeclaration(): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNeverKeyword(): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNonNullExpression(): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNullKeyword(): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSOptionalType(): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSOptionalType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSOptionalType(node: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSOptionalType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSOptionalType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSParameterProperty(): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParenthesizedType(): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSPropertySignature(): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSQualifiedName(): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSRestType(): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSRestType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSRestType(node: js.Object): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSRestType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSRestType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSStringKeyword(): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSThisType(): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: js.Object): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSTupleType(): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: js.Object): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSType(): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSType(node: js.Object): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAnnotation(): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAssertion(): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeElement(): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeElement(node: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeLiteral(): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeOperator(): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeParameter(): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypePredicate(): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypeQuery(): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeReference(): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSUndefinedKeyword(): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUnionType(): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: js.Object): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnknownKeyword(): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSUnknownKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSUnknownKeyword(node: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSUnknownKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSUnknownKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTaggedTemplateExpression(): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTemplateElement(): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: js.Object): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateLiteral(): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTerminatorless(): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: js.Object): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isThisExpression(): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: js.Object): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisTypeAnnotation(): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThrowStatement(): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isTryStatement(): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.Object): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTupleTypeAnnotation(): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTypeAlias(): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: js.Object): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAnnotation(): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeCastExpression(): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeParameter(): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: js.Object): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameterDeclaration(): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterInstantiation(): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isUnaryExpression(): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryLike(): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: js.Object): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnionTypeAnnotation(): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUpdateExpression(): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUserWhitespacable(): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isVariableDeclaration(): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclarator(): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariance(): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVariance(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVariance(node: js.Object): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVariance(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVariance(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVoidTypeAnnotation(): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isWhile(): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhile(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhile(node: js.Object): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhile(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhile(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhileStatement(): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: js.Object): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWithStatement(): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.Object): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isYieldExpression(): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: js.Object): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def jsxAttribute(name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    value: atBabelTypesLib.atBabelTypesMod.JSXElement
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    value: atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    value: atBabelTypesLib.atBabelTypesMod.JSXFragment
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    value: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(name: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName,
    value: atBabelTypesLib.atBabelTypesMod.JSXElement
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName,
    value: atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName,
    value: atBabelTypesLib.atBabelTypesMod.JSXFragment
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxAttribute(
    name: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName,
    value: atBabelTypesLib.atBabelTypesMod.StringLiteral
  ): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def jsxClosingElement(name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier): atBabelTypesLib.atBabelTypesMod.JSXClosingElement = js.native
  def jsxClosingElement(name: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression): atBabelTypesLib.atBabelTypesMod.JSXClosingElement = js.native
  def jsxClosingFragment(): atBabelTypesLib.atBabelTypesMod.JSXClosingFragment = js.native
  def jsxElement(
    openingElement: atBabelTypesLib.atBabelTypesMod.JSXOpeningElement,
    closingElement: js.UndefOr[scala.Nothing],
    children: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXText | atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer | atBabelTypesLib.atBabelTypesMod.JSXSpreadChild | atBabelTypesLib.atBabelTypesMod.JSXElement | atBabelTypesLib.atBabelTypesMod.JSXFragment
    ],
    selfClosing: js.Any
  ): atBabelTypesLib.atBabelTypesMod.JSXElement = js.native
  def jsxElement(
    openingElement: atBabelTypesLib.atBabelTypesMod.JSXOpeningElement,
    closingElement: atBabelTypesLib.atBabelTypesMod.JSXClosingElement,
    children: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXText | atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer | atBabelTypesLib.atBabelTypesMod.JSXSpreadChild | atBabelTypesLib.atBabelTypesMod.JSXElement | atBabelTypesLib.atBabelTypesMod.JSXFragment
    ],
    selfClosing: js.Any
  ): atBabelTypesLib.atBabelTypesMod.JSXElement = js.native
  def jsxElement(
    openingElement: atBabelTypesLib.atBabelTypesMod.JSXOpeningElement,
    closingElement: scala.Null,
    children: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXText | atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer | atBabelTypesLib.atBabelTypesMod.JSXSpreadChild | atBabelTypesLib.atBabelTypesMod.JSXElement | atBabelTypesLib.atBabelTypesMod.JSXFragment
    ],
    selfClosing: js.Any
  ): atBabelTypesLib.atBabelTypesMod.JSXElement = js.native
  def jsxEmptyExpression(): atBabelTypesLib.atBabelTypesMod.JSXEmptyExpression = js.native
  def jsxExpressionContainer(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer = js.native
  def jsxExpressionContainer(expression: atBabelTypesLib.atBabelTypesMod.JSXEmptyExpression): atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer = js.native
  def jsxFragment(
    openingFragment: atBabelTypesLib.atBabelTypesMod.JSXOpeningFragment,
    closingFragment: atBabelTypesLib.atBabelTypesMod.JSXClosingFragment,
    children: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXText | atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer | atBabelTypesLib.atBabelTypesMod.JSXSpreadChild | atBabelTypesLib.atBabelTypesMod.JSXElement | atBabelTypesLib.atBabelTypesMod.JSXFragment
    ]
  ): atBabelTypesLib.atBabelTypesMod.JSXFragment = js.native
  def jsxIdentifier(name: java.lang.String): atBabelTypesLib.atBabelTypesMod.JSXIdentifier = js.native
  def jsxMemberExpression(
    `object`: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    property: atBabelTypesLib.atBabelTypesMod.JSXIdentifier
  ): atBabelTypesLib.atBabelTypesMod.JSXMemberExpression = js.native
  def jsxMemberExpression(
    `object`: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression,
    property: atBabelTypesLib.atBabelTypesMod.JSXIdentifier
  ): atBabelTypesLib.atBabelTypesMod.JSXMemberExpression = js.native
  def jsxNamespacedName(
    namespace: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier
  ): atBabelTypesLib.atBabelTypesMod.JSXNamespacedName = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ]
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXIdentifier,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ]
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression,
    attributes: js.Array[
      atBabelTypesLib.atBabelTypesMod.JSXAttribute | atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute
    ],
    selfClosing: scala.Boolean,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def jsxOpeningFragment(): atBabelTypesLib.atBabelTypesMod.JSXOpeningFragment = js.native
  def jsxSpreadAttribute(argument: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute = js.native
  def jsxSpreadChild(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.JSXSpreadChild = js.native
  def jsxText(value: java.lang.String): atBabelTypesLib.atBabelTypesMod.JSXText = js.native
  def labeledStatement(label: atBabelTypesLib.atBabelTypesMod.Identifier, body: atBabelTypesLib.atBabelTypesMod.Statement): atBabelTypesLib.atBabelTypesMod.LabeledStatement = js.native
  def logicalExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`&&`,
    left: atBabelTypesLib.atBabelTypesMod.Expression,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.LogicalExpression = js.native
  def logicalExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`??`,
    left: atBabelTypesLib.atBabelTypesMod.Expression,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.LogicalExpression = js.native
  def logicalExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`||`,
    left: atBabelTypesLib.atBabelTypesMod.Expression,
    right: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.LogicalExpression = js.native
  def memberExpression(`object`: atBabelTypesLib.atBabelTypesMod.Expression, property: js.Any): atBabelTypesLib.atBabelTypesMod.MemberExpression = js.native
  def memberExpression(`object`: atBabelTypesLib.atBabelTypesMod.Expression, property: js.Any, computed: scala.Boolean): atBabelTypesLib.atBabelTypesMod.MemberExpression = js.native
  @JSName("memberExpression")
  def memberExpression_false(
    `object`: atBabelTypesLib.atBabelTypesMod.Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`
  ): atBabelTypesLib.atBabelTypesMod.MemberExpression = js.native
  @JSName("memberExpression")
  def memberExpression_true(
    `object`: atBabelTypesLib.atBabelTypesMod.Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`
  ): atBabelTypesLib.atBabelTypesMod.MemberExpression = js.native
  def metaProperty(
    meta: atBabelTypesLib.atBabelTypesMod.Identifier,
    property: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.MetaProperty = js.native
  def mixedTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.MixedTypeAnnotation = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ]
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: scala.Null,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: scala.Null,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def newExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: scala.Null,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  @JSName("newExpression")
  def newExpression_false(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  @JSName("newExpression")
  def newExpression_false(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  @JSName("newExpression")
  def newExpression_false(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  @JSName("newExpression")
  def newExpression_false(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`false`,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  @JSName("newExpression")
  def newExpression_true(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  @JSName("newExpression")
  def newExpression_true(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  @JSName("newExpression")
  def newExpression_true(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  @JSName("newExpression")
  def newExpression_true(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName | atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder
    ],
    optional: atBabelCoreLib.atBabelCoreLibNumbers.`true`,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def noop(): atBabelTypesLib.atBabelTypesMod.Noop = js.native
  def nullLiteral(): atBabelTypesLib.atBabelTypesMod.NullLiteral = js.native
  def nullLiteralTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.NullLiteralTypeAnnotation = js.native
  def nullableTypeAnnotation(typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.NullableTypeAnnotation = js.native
  def numberLiteralTypeAnnotation(value: scala.Double): atBabelTypesLib.atBabelTypesMod.NumberLiteralTypeAnnotation = js.native
  def numberTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.NumberTypeAnnotation = js.native
  def numericLiteral(value: scala.Double): atBabelTypesLib.atBabelTypesMod.NumericLiteral = js.native
  def objectExpression(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectMethod | atBabelTypesLib.atBabelTypesMod.ObjectProperty | atBabelTypesLib.atBabelTypesMod.SpreadElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.ObjectExpression = js.native
  def objectMethod(
    kind: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.method | atBabelCoreLib.atBabelCoreLibStrings.get | atBabelCoreLib.atBabelCoreLibStrings.set
    ],
    key: js.Any,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    computed: js.UndefOr[scala.Boolean],
    async: js.UndefOr[scala.Boolean],
    decorators: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.Decorator] | scala.Null],
    generator: js.UndefOr[scala.Boolean],
    returnType: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeAnnotation | atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ]
  ): atBabelTypesLib.atBabelTypesMod.ObjectMethod = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.ObjectProperty
    ],
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def objectProperty(key: js.Any, value: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def objectProperty(key: js.Any, value: atBabelTypesLib.atBabelTypesMod.Expression, computed: scala.Boolean): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: atBabelTypesLib.atBabelTypesMod.Expression,
    computed: scala.Boolean,
    shorthand: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: atBabelTypesLib.atBabelTypesMod.Expression,
    computed: scala.Boolean,
    shorthand: scala.Boolean,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def objectProperty(key: js.Any, value: atBabelTypesLib.atBabelTypesMod.PatternLike): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def objectProperty(key: js.Any, value: atBabelTypesLib.atBabelTypesMod.PatternLike, computed: scala.Boolean): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: atBabelTypesLib.atBabelTypesMod.PatternLike,
    computed: scala.Boolean,
    shorthand: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: atBabelTypesLib.atBabelTypesMod.PatternLike,
    computed: scala.Boolean,
    shorthand: scala.Boolean,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot]
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: js.Array[atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[
      atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty | atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty
    ],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def objectTypeCallProperty(value: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty = js.native
  def objectTypeCallProperty(value: atBabelTypesLib.atBabelTypesMod.FlowType, _static: scala.Boolean): atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: scala.Null,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: scala.Null,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: scala.Null,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: scala.Null,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: scala.Null,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: scala.Null,
    key: atBabelTypesLib.atBabelTypesMod.FlowType,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: scala.Null,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def objectTypeInternalSlot(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    optional: scala.Boolean,
    _static: scala.Boolean,
    method: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot = js.native
  def objectTypeProperty(key: atBabelTypesLib.atBabelTypesMod.Identifier, value: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_get(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.get,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_init(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.init,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.atBabelTypesMod.Identifier,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  @JSName("objectTypeProperty")
  def objectTypeProperty_set(
    key: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    value: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    kind: atBabelCoreLib.atBabelCoreLibStrings.set,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def objectTypeSpreadProperty(argument: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: js.UndefOr[scala.Nothing],
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: atBabelTypesLib.atBabelTypesMod.FlowType,
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: scala.Null,
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    supertype: js.UndefOr[scala.Nothing],
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    supertype: atBabelTypesLib.atBabelTypesMod.FlowType,
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    supertype: scala.Null,
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    supertype: js.UndefOr[scala.Nothing],
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    supertype: atBabelTypesLib.atBabelTypesMod.FlowType,
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def opaqueType(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    supertype: scala.Null,
    impltype: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def optionalCallExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: scala.Boolean,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: scala.Boolean,
    typeArguments: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: atBabelTypesLib.atBabelTypesMod.Expression,
    _arguments: js.Array[
      atBabelTypesLib.atBabelTypesMod.Expression | atBabelTypesLib.atBabelTypesMod.SpreadElement | atBabelTypesLib.atBabelTypesMod.JSXNamespacedName
    ],
    optional: scala.Boolean,
    typeArguments: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.OptionalCallExpression = js.native
  def optionalMemberExpression(
    `object`: atBabelTypesLib.atBabelTypesMod.Expression,
    property: js.Any,
    computed: js.UndefOr[scala.Nothing],
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.OptionalMemberExpression = js.native
  def optionalMemberExpression(
    `object`: atBabelTypesLib.atBabelTypesMod.Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.OptionalMemberExpression = js.native
  def parenthesizedExpression(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.ParenthesizedExpression = js.native
  def pipelineBareFunction(callee: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.PipelineBareFunction = js.native
  def pipelinePrimaryTopicReference(): atBabelTypesLib.atBabelTypesMod.PipelinePrimaryTopicReference = js.native
  def pipelineTopicExpression(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.PipelineTopicExpression = js.native
  @JSName("placeholder")
  def placeholder_BlockStatement(
    expectedNode: atBabelCoreLib.atBabelCoreLibStrings.BlockStatement,
    name: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.Placeholder = js.native
  @JSName("placeholder")
  def placeholder_ClassBody(
    expectedNode: atBabelCoreLib.atBabelCoreLibStrings.ClassBody,
    name: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Declaration(
    expectedNode: atBabelCoreLib.atBabelCoreLibStrings.Declaration,
    name: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Expression(
    expectedNode: atBabelCoreLib.atBabelCoreLibStrings.Expression,
    name: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Identifier(
    expectedNode: atBabelCoreLib.atBabelCoreLibStrings.Identifier,
    name: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Pattern(
    expectedNode: atBabelCoreLib.atBabelCoreLibStrings.Pattern,
    name: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Statement(
    expectedNode: atBabelCoreLib.atBabelCoreLibStrings.Statement,
    name: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.Placeholder = js.native
  @JSName("placeholder")
  def placeholder_StringLiteral(
    expectedNode: atBabelCoreLib.atBabelCoreLibStrings.StringLiteral,
    name: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.Placeholder = js.native
  def privateName(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.PrivateName = js.native
  def program(body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement]): atBabelTypesLib.atBabelTypesMod.Program = js.native
  def program(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive]
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.module
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.module,
    interpreter: atBabelTypesLib.atBabelTypesMod.InterpreterDirective
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.module,
    interpreter: atBabelTypesLib.atBabelTypesMod.InterpreterDirective,
    sourceFile: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.module,
    interpreter: scala.Null,
    sourceFile: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.script
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.script,
    interpreter: atBabelTypesLib.atBabelTypesMod.InterpreterDirective
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.script,
    interpreter: atBabelTypesLib.atBabelTypesMod.InterpreterDirective,
    sourceFile: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement],
    directives: js.Array[atBabelTypesLib.atBabelTypesMod.Directive],
    sourceType: atBabelCoreLib.atBabelCoreLibStrings.script,
    interpreter: scala.Null,
    sourceFile: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.Program = js.native
  def qualifiedTypeIdentifier(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    qualification: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier = js.native
  def qualifiedTypeIdentifier(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    qualification: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier
  ): atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier = js.native
  def regExpLiteral(pattern: java.lang.String): atBabelTypesLib.atBabelTypesMod.RegExpLiteral = js.native
  def regExpLiteral(pattern: java.lang.String, flags: java.lang.String): atBabelTypesLib.atBabelTypesMod.RegExpLiteral = js.native
  def removeProperties(n: atBabelTypesLib.atBabelTypesMod.Node): scala.Unit = js.native
  def removeProperties(n: atBabelTypesLib.atBabelTypesMod.Node, opts: atBabelTypesLib.Anon_PreserveComments): scala.Unit = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.AnyTypeAnnotation): atBabelTypesLib.atBabelTypesMod.AnyTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.AnyTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.AnyTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder): atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ArgumentPlaceholder = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ArrayExpression): atBabelTypesLib.atBabelTypesMod.ArrayExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ArrayExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ArrayExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ArrayPattern): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ArrayPattern, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ArrayPattern = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ArrayTypeAnnotation): atBabelTypesLib.atBabelTypesMod.ArrayTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ArrayTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ArrayTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ArrowFunctionExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.AssignmentExpression): atBabelTypesLib.atBabelTypesMod.AssignmentExpression = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.AssignmentExpression,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.AssignmentExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.AssignmentPattern): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.AssignmentPattern, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.AssignmentPattern = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.AwaitExpression): atBabelTypesLib.atBabelTypesMod.AwaitExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.AwaitExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.AwaitExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BigIntLiteral): atBabelTypesLib.atBabelTypesMod.BigIntLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BigIntLiteral, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.BigIntLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BinaryExpression): atBabelTypesLib.atBabelTypesMod.BinaryExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BinaryExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.BinaryExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BindExpression): atBabelTypesLib.atBabelTypesMod.BindExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BindExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.BindExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BlockStatement): atBabelTypesLib.atBabelTypesMod.BlockStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BlockStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.BlockStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BooleanLiteral): atBabelTypesLib.atBabelTypesMod.BooleanLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BooleanLiteralTypeAnnotation): atBabelTypesLib.atBabelTypesMod.BooleanLiteralTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.BooleanLiteralTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.BooleanLiteralTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BooleanLiteral, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.BooleanLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BooleanTypeAnnotation): atBabelTypesLib.atBabelTypesMod.BooleanTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.BooleanTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.BooleanTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BreakStatement): atBabelTypesLib.atBabelTypesMod.BreakStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.BreakStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.BreakStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.CallExpression): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.CallExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.CallExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.CatchClause): atBabelTypesLib.atBabelTypesMod.CatchClause = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.CatchClause, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.CatchClause = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassBody): atBabelTypesLib.atBabelTypesMod.ClassBody = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassBody, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ClassBody = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassDeclaration): atBabelTypesLib.atBabelTypesMod.ClassDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ClassDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassExpression): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ClassExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassImplements): atBabelTypesLib.atBabelTypesMod.ClassImplements = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassImplements, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ClassImplements = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassMethod): atBabelTypesLib.atBabelTypesMod.ClassMethod = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassMethod, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ClassMethod = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassPrivateMethod): atBabelTypesLib.atBabelTypesMod.ClassPrivateMethod = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassPrivateMethod, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ClassPrivateMethod = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty): atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ClassPrivateProperty = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassProperty): atBabelTypesLib.atBabelTypesMod.ClassProperty = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ClassProperty, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ClassProperty = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ConditionalExpression): atBabelTypesLib.atBabelTypesMod.ConditionalExpression = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ConditionalExpression,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ConditionalExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ContinueStatement): atBabelTypesLib.atBabelTypesMod.ContinueStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ContinueStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ContinueStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DebuggerStatement): atBabelTypesLib.atBabelTypesMod.DebuggerStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DebuggerStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.DebuggerStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareClass): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareClass, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.DeclareClass = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration): atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportAllDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.DeclareExportDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareFunction): atBabelTypesLib.atBabelTypesMod.DeclareFunction = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareFunction, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.DeclareFunction = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareInterface): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareInterface, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.DeclareInterface = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareModule): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareModuleExports): atBabelTypesLib.atBabelTypesMod.DeclareModuleExports = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.DeclareModuleExports,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.DeclareModuleExports = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareModule, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.DeclareModule = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType): atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.DeclareOpaqueType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias): atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.DeclareTypeAlias = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareVariable): atBabelTypesLib.atBabelTypesMod.DeclareVariable = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclareVariable, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.DeclareVariable = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclaredPredicate): atBabelTypesLib.atBabelTypesMod.DeclaredPredicate = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DeclaredPredicate, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.DeclaredPredicate = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Decorator): atBabelTypesLib.atBabelTypesMod.Decorator = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Decorator, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.Decorator = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Directive): atBabelTypesLib.atBabelTypesMod.Directive = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DirectiveLiteral): atBabelTypesLib.atBabelTypesMod.DirectiveLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DirectiveLiteral, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.DirectiveLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Directive, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.Directive = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DoExpression): atBabelTypesLib.atBabelTypesMod.DoExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DoExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.DoExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DoWhileStatement): atBabelTypesLib.atBabelTypesMod.DoWhileStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.DoWhileStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.DoWhileStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.EmptyStatement): atBabelTypesLib.atBabelTypesMod.EmptyStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.EmptyStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.EmptyStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.EmptyTypeAnnotation): atBabelTypesLib.atBabelTypesMod.EmptyTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.EmptyTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.EmptyTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ExistsTypeAnnotation): atBabelTypesLib.atBabelTypesMod.ExistsTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ExistsTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ExistsTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ExportAllDeclaration): atBabelTypesLib.atBabelTypesMod.ExportAllDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ExportAllDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ExportAllDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration): atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ExportDefaultDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier): atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ExportDefaultSpecifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ExportNamedDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier): atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ExportNamespaceSpecifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ExportSpecifier): atBabelTypesLib.atBabelTypesMod.ExportSpecifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ExportSpecifier, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ExportSpecifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ExpressionStatement): atBabelTypesLib.atBabelTypesMod.ExpressionStatement = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ExpressionStatement,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ExpressionStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.File): atBabelTypesLib.atBabelTypesMod.File = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.File, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.File = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ForInStatement): atBabelTypesLib.atBabelTypesMod.ForInStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ForInStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ForInStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ForOfStatement): atBabelTypesLib.atBabelTypesMod.ForOfStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ForOfStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ForOfStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ForStatement): atBabelTypesLib.atBabelTypesMod.ForStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ForStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ForStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.FunctionDeclaration): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.FunctionDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.FunctionDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.FunctionExpression): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.FunctionExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.FunctionExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.FunctionTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.FunctionTypeParam): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.FunctionTypeParam, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.FunctionTypeParam = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation): atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.GenericTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Identifier, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.Identifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.IfStatement): atBabelTypesLib.atBabelTypesMod.IfStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.IfStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.IfStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Import): atBabelTypesLib.atBabelTypesMod.Import = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ImportDeclaration): atBabelTypesLib.atBabelTypesMod.ImportDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ImportDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ImportDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier): atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ImportDefaultSpecifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier): atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ImportNamespaceSpecifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ImportSpecifier): atBabelTypesLib.atBabelTypesMod.ImportSpecifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ImportSpecifier, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ImportSpecifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Import, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.Import = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.InferredPredicate): atBabelTypesLib.atBabelTypesMod.InferredPredicate = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.InferredPredicate, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.InferredPredicate = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.InterfaceDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.InterfaceExtends): atBabelTypesLib.atBabelTypesMod.InterfaceExtends = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.InterfaceExtends, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.InterfaceExtends = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation): atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.InterfaceTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.InterpreterDirective): atBabelTypesLib.atBabelTypesMod.InterpreterDirective = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.InterpreterDirective,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.InterpreterDirective = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.IntersectionTypeAnnotation): atBabelTypesLib.atBabelTypesMod.IntersectionTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.IntersectionTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.IntersectionTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXAttribute): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXAttribute, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXAttribute = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXClosingElement): atBabelTypesLib.atBabelTypesMod.JSXClosingElement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXClosingElement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXClosingElement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXClosingFragment): atBabelTypesLib.atBabelTypesMod.JSXClosingFragment = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXClosingFragment, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXClosingFragment = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXElement): atBabelTypesLib.atBabelTypesMod.JSXElement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXElement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXElement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXEmptyExpression): atBabelTypesLib.atBabelTypesMod.JSXEmptyExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXEmptyExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXEmptyExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer): atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.JSXExpressionContainer = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXFragment): atBabelTypesLib.atBabelTypesMod.JSXFragment = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXFragment, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXFragment = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXIdentifier): atBabelTypesLib.atBabelTypesMod.JSXIdentifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXIdentifier, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXIdentifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression): atBabelTypesLib.atBabelTypesMod.JSXMemberExpression = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.JSXMemberExpression,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.JSXMemberExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName): atBabelTypesLib.atBabelTypesMod.JSXNamespacedName = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXNamespacedName, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXNamespacedName = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXOpeningElement): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXOpeningElement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXOpeningElement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXOpeningFragment): atBabelTypesLib.atBabelTypesMod.JSXOpeningFragment = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXOpeningFragment, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXOpeningFragment = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute): atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXSpreadAttribute = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXSpreadChild): atBabelTypesLib.atBabelTypesMod.JSXSpreadChild = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXSpreadChild, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXSpreadChild = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXText): atBabelTypesLib.atBabelTypesMod.JSXText = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.JSXText, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.JSXText = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.LabeledStatement): atBabelTypesLib.atBabelTypesMod.LabeledStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.LabeledStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.LabeledStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.LogicalExpression): atBabelTypesLib.atBabelTypesMod.LogicalExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.LogicalExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.LogicalExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.MemberExpression): atBabelTypesLib.atBabelTypesMod.MemberExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.MemberExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.MemberExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.MetaProperty): atBabelTypesLib.atBabelTypesMod.MetaProperty = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.MetaProperty, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.MetaProperty = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.MixedTypeAnnotation): atBabelTypesLib.atBabelTypesMod.MixedTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.MixedTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.MixedTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.NewExpression): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.NewExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.NewExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Noop): atBabelTypesLib.atBabelTypesMod.Noop = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Noop, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.Noop = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.NullLiteral): atBabelTypesLib.atBabelTypesMod.NullLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.NullLiteralTypeAnnotation): atBabelTypesLib.atBabelTypesMod.NullLiteralTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.NullLiteralTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.NullLiteralTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.NullLiteral, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.NullLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.NullableTypeAnnotation): atBabelTypesLib.atBabelTypesMod.NullableTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.NullableTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.NullableTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.NumberLiteralTypeAnnotation): atBabelTypesLib.atBabelTypesMod.NumberLiteralTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.NumberLiteralTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.NumberLiteralTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.NumberTypeAnnotation): atBabelTypesLib.atBabelTypesMod.NumberTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.NumberTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.NumberTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.NumericLiteral): atBabelTypesLib.atBabelTypesMod.NumericLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.NumericLiteral, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.NumericLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectExpression): atBabelTypesLib.atBabelTypesMod.ObjectExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ObjectExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectMethod): atBabelTypesLib.atBabelTypesMod.ObjectMethod = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectMethod, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ObjectMethod = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectPattern): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectPattern, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ObjectPattern = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectProperty): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectProperty, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ObjectProperty = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty): atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeCallProperty = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ObjectTypeIndexer = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot): atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeInternalSlot = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ObjectTypeProperty = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty): atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ObjectTypeSpreadProperty = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.OpaqueType): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.OpaqueType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.OpaqueType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.OptionalCallExpression): atBabelTypesLib.atBabelTypesMod.OptionalCallExpression = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.OptionalCallExpression,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.OptionalCallExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.OptionalMemberExpression): atBabelTypesLib.atBabelTypesMod.OptionalMemberExpression = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.OptionalMemberExpression,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.OptionalMemberExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ParenthesizedExpression): atBabelTypesLib.atBabelTypesMod.ParenthesizedExpression = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.ParenthesizedExpression,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.ParenthesizedExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.PipelineBareFunction): atBabelTypesLib.atBabelTypesMod.PipelineBareFunction = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.PipelineBareFunction,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.PipelineBareFunction = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.PipelinePrimaryTopicReference): atBabelTypesLib.atBabelTypesMod.PipelinePrimaryTopicReference = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.PipelinePrimaryTopicReference,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.PipelinePrimaryTopicReference = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.PipelineTopicExpression): atBabelTypesLib.atBabelTypesMod.PipelineTopicExpression = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.PipelineTopicExpression,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.PipelineTopicExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Placeholder): atBabelTypesLib.atBabelTypesMod.Placeholder = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Placeholder, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.Placeholder = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.PrivateName): atBabelTypesLib.atBabelTypesMod.PrivateName = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.PrivateName, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.PrivateName = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Program): atBabelTypesLib.atBabelTypesMod.Program = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Program, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.Program = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier): atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.QualifiedTypeIdentifier = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.RegExpLiteral): atBabelTypesLib.atBabelTypesMod.RegExpLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.RegExpLiteral, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.RegExpLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.RestElement): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.RestElement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ReturnStatement): atBabelTypesLib.atBabelTypesMod.ReturnStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ReturnStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ReturnStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.SequenceExpression): atBabelTypesLib.atBabelTypesMod.SequenceExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.SequenceExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.SequenceExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.SpreadElement): atBabelTypesLib.atBabelTypesMod.SpreadElement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.SpreadElement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.SpreadElement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.StringLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.StringLiteralTypeAnnotation): atBabelTypesLib.atBabelTypesMod.StringLiteralTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.StringLiteralTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.StringLiteralTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.StringLiteral, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.StringLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.StringTypeAnnotation): atBabelTypesLib.atBabelTypesMod.StringTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.StringTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.StringTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Super): atBabelTypesLib.atBabelTypesMod.Super = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Super, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.Super = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.SwitchCase): atBabelTypesLib.atBabelTypesMod.SwitchCase = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.SwitchCase, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.SwitchCase = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.SwitchStatement): atBabelTypesLib.atBabelTypesMod.SwitchStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.SwitchStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.SwitchStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSAnyKeyword): atBabelTypesLib.atBabelTypesMod.TSAnyKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSAnyKeyword, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSAnyKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSArrayType): atBabelTypesLib.atBabelTypesMod.TSArrayType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSArrayType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSArrayType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSAsExpression): atBabelTypesLib.atBabelTypesMod.TSAsExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSAsExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSAsExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSBooleanKeyword): atBabelTypesLib.atBabelTypesMod.TSBooleanKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSBooleanKeyword, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSBooleanKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSConditionalType): atBabelTypesLib.atBabelTypesMod.TSConditionalType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSConditionalType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSConditionalType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSConstructorType): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSConstructorType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSDeclareFunction): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSDeclareFunction, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSDeclareMethod): atBabelTypesLib.atBabelTypesMod.TSDeclareMethod = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSDeclareMethod, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSDeclareMethod = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSEnumMember): atBabelTypesLib.atBabelTypesMod.TSEnumMember = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSEnumMember, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSEnumMember = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSExportAssignment): atBabelTypesLib.atBabelTypesMod.TSExportAssignment = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSExportAssignment, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSExportAssignment = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments): atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference): atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSFunctionType): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSFunctionType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration): atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSImportType): atBabelTypesLib.atBabelTypesMod.TSImportType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSImportType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSImportType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSIndexSignature): atBabelTypesLib.atBabelTypesMod.TSIndexSignature = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSIndexSignature, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSIndexSignature = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSIndexedAccessType): atBabelTypesLib.atBabelTypesMod.TSIndexedAccessType = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSIndexedAccessType,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSIndexedAccessType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSInferType): atBabelTypesLib.atBabelTypesMod.TSInferType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSInferType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSInferType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody): atBabelTypesLib.atBabelTypesMod.TSInterfaceBody = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSInterfaceBody = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSIntersectionType): atBabelTypesLib.atBabelTypesMod.TSIntersectionType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSIntersectionType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSIntersectionType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSLiteralType): atBabelTypesLib.atBabelTypesMod.TSLiteralType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSLiteralType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSLiteralType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSMappedType): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSMappedType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSMethodSignature): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSMethodSignature, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSModuleBlock): atBabelTypesLib.atBabelTypesMod.TSModuleBlock = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSModuleBlock, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSModuleBlock = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSNamespaceExportDeclaration): atBabelTypesLib.atBabelTypesMod.TSNamespaceExportDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSNamespaceExportDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSNamespaceExportDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSNeverKeyword): atBabelTypesLib.atBabelTypesMod.TSNeverKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSNeverKeyword, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSNeverKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSNonNullExpression): atBabelTypesLib.atBabelTypesMod.TSNonNullExpression = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSNonNullExpression,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSNonNullExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSNullKeyword): atBabelTypesLib.atBabelTypesMod.TSNullKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSNullKeyword, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSNullKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSNumberKeyword): atBabelTypesLib.atBabelTypesMod.TSNumberKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSNumberKeyword, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSNumberKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSObjectKeyword): atBabelTypesLib.atBabelTypesMod.TSObjectKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSObjectKeyword, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSObjectKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSOptionalType): atBabelTypesLib.atBabelTypesMod.TSOptionalType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSOptionalType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSOptionalType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSParameterProperty): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSParameterProperty,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSParenthesizedType): atBabelTypesLib.atBabelTypesMod.TSParenthesizedType = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSParenthesizedType,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSParenthesizedType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSPropertySignature): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSPropertySignature,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSQualifiedName): atBabelTypesLib.atBabelTypesMod.TSQualifiedName = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSQualifiedName, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSQualifiedName = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSRestType): atBabelTypesLib.atBabelTypesMod.TSRestType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSRestType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSRestType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSStringKeyword): atBabelTypesLib.atBabelTypesMod.TSStringKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSStringKeyword, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSStringKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSSymbolKeyword): atBabelTypesLib.atBabelTypesMod.TSSymbolKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSSymbolKeyword, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSSymbolKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSThisType): atBabelTypesLib.atBabelTypesMod.TSThisType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSThisType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSThisType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTupleType): atBabelTypesLib.atBabelTypesMod.TSTupleType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTupleType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSTupleType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation): atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeAssertion): atBabelTypesLib.atBabelTypesMod.TSTypeAssertion = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeAssertion, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSTypeAssertion = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeLiteral): atBabelTypesLib.atBabelTypesMod.TSTypeLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeLiteral, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSTypeLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeOperator): atBabelTypesLib.atBabelTypesMod.TSTypeOperator = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeOperator, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSTypeOperator = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeParameter): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration): atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation): atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeParameter, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypePredicate): atBabelTypesLib.atBabelTypesMod.TSTypePredicate = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypePredicate, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSTypePredicate = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeQuery): atBabelTypesLib.atBabelTypesMod.TSTypeQuery = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeQuery, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSTypeQuery = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeReference): atBabelTypesLib.atBabelTypesMod.TSTypeReference = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSTypeReference, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSTypeReference = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSUndefinedKeyword): atBabelTypesLib.atBabelTypesMod.TSUndefinedKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSUndefinedKeyword, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSUndefinedKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSUnionType): atBabelTypesLib.atBabelTypesMod.TSUnionType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSUnionType, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSUnionType = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSUnknownKeyword): atBabelTypesLib.atBabelTypesMod.TSUnknownKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSUnknownKeyword, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSUnknownKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSVoidKeyword): atBabelTypesLib.atBabelTypesMod.TSVoidKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TSVoidKeyword, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TSVoidKeyword = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression): atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TemplateElement): atBabelTypesLib.atBabelTypesMod.TemplateElement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TemplateElement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TemplateElement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TemplateLiteral): atBabelTypesLib.atBabelTypesMod.TemplateLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TemplateLiteral, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TemplateLiteral = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ThisExpression): atBabelTypesLib.atBabelTypesMod.ThisExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ThisExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ThisExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ThisTypeAnnotation): atBabelTypesLib.atBabelTypesMod.ThisTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ThisTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ThisTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ThrowStatement): atBabelTypesLib.atBabelTypesMod.ThrowStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.ThrowStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.ThrowStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TryStatement): atBabelTypesLib.atBabelTypesMod.TryStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TryStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TryStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TupleTypeAnnotation): atBabelTypesLib.atBabelTypesMod.TupleTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TupleTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TupleTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TypeAlias): atBabelTypesLib.atBabelTypesMod.TypeAlias = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TypeAlias, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TypeAlias = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TypeAnnotation): atBabelTypesLib.atBabelTypesMod.TypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TypeCastExpression): atBabelTypesLib.atBabelTypesMod.TypeCastExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TypeCastExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TypeCastExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TypeParameter): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration): atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation): atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TypeParameter, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.TypeofTypeAnnotation): atBabelTypesLib.atBabelTypesMod.TypeofTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.TypeofTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.TypeofTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.UnaryExpression): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.UnaryExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.UnionTypeAnnotation): atBabelTypesLib.atBabelTypesMod.UnionTypeAnnotation = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.UnionTypeAnnotation,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.UnionTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.UpdateExpression): atBabelTypesLib.atBabelTypesMod.UpdateExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.UpdateExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.UpdateExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.VariableDeclaration): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  def removePropertiesDeep(
    n: atBabelTypesLib.atBabelTypesMod.VariableDeclaration,
    opts: atBabelTypesLib.Anon_PreserveComments
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.VariableDeclarator): atBabelTypesLib.atBabelTypesMod.VariableDeclarator = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.VariableDeclarator, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.VariableDeclarator = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Variance): atBabelTypesLib.atBabelTypesMod.Variance = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.Variance, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.Variance = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.VoidTypeAnnotation): atBabelTypesLib.atBabelTypesMod.VoidTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.VoidTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.VoidTypeAnnotation = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.WhileStatement): atBabelTypesLib.atBabelTypesMod.WhileStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.WhileStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.WhileStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.WithStatement): atBabelTypesLib.atBabelTypesMod.WithStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.WithStatement, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.WithStatement = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.YieldExpression): atBabelTypesLib.atBabelTypesMod.YieldExpression = js.native
  def removePropertiesDeep(n: atBabelTypesLib.atBabelTypesMod.YieldExpression, opts: atBabelTypesLib.Anon_PreserveComments): atBabelTypesLib.atBabelTypesMod.YieldExpression = js.native
  def restElement(argument: atBabelTypesLib.atBabelTypesMod.LVal): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator]
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: js.Array[atBabelTypesLib.atBabelTypesMod.Decorator],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def restElement(
    argument: atBabelTypesLib.atBabelTypesMod.LVal,
    decorators: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.RestElement = js.native
  def returnStatement(): atBabelTypesLib.atBabelTypesMod.ReturnStatement = js.native
  def returnStatement(argument: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.ReturnStatement = js.native
  def sequenceExpression(expressions: js.Array[atBabelTypesLib.atBabelTypesMod.Expression]): atBabelTypesLib.atBabelTypesMod.SequenceExpression = js.native
  def spreadElement(argument: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.SpreadElement = js.native
  def stringLiteral(value: java.lang.String): atBabelTypesLib.atBabelTypesMod.StringLiteral = js.native
  def stringLiteralTypeAnnotation(value: java.lang.String): atBabelTypesLib.atBabelTypesMod.StringLiteralTypeAnnotation = js.native
  def stringTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.StringTypeAnnotation = js.native
  def switchCase(test: js.UndefOr[scala.Nothing], consequent: js.Array[atBabelTypesLib.atBabelTypesMod.Statement]): atBabelTypesLib.atBabelTypesMod.SwitchCase = js.native
  def switchCase(
    test: atBabelTypesLib.atBabelTypesMod.Expression,
    consequent: js.Array[atBabelTypesLib.atBabelTypesMod.Statement]
  ): atBabelTypesLib.atBabelTypesMod.SwitchCase = js.native
  def switchCase(test: scala.Null, consequent: js.Array[atBabelTypesLib.atBabelTypesMod.Statement]): atBabelTypesLib.atBabelTypesMod.SwitchCase = js.native
  def switchStatement(
    discriminant: atBabelTypesLib.atBabelTypesMod.Expression,
    cases: js.Array[atBabelTypesLib.atBabelTypesMod.SwitchCase]
  ): atBabelTypesLib.atBabelTypesMod.SwitchStatement = js.native
  def taggedTemplateExpression(
    tag: atBabelTypesLib.atBabelTypesMod.Expression,
    quasi: atBabelTypesLib.atBabelTypesMod.TemplateLiteral
  ): atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression = js.native
  def taggedTemplateExpression(
    tag: atBabelTypesLib.atBabelTypesMod.Expression,
    quasi: atBabelTypesLib.atBabelTypesMod.TemplateLiteral,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression = js.native
  def taggedTemplateExpression(
    tag: atBabelTypesLib.atBabelTypesMod.Expression,
    quasi: atBabelTypesLib.atBabelTypesMod.TemplateLiteral,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.TaggedTemplateExpression = js.native
  def templateElement(value: js.Any): atBabelTypesLib.atBabelTypesMod.TemplateElement = js.native
  def templateElement(value: js.Any, tail: scala.Boolean): atBabelTypesLib.atBabelTypesMod.TemplateElement = js.native
  def templateLiteral(
    quasis: js.Array[atBabelTypesLib.atBabelTypesMod.TemplateElement],
    expressions: js.Array[atBabelTypesLib.atBabelTypesMod.Expression]
  ): atBabelTypesLib.atBabelTypesMod.TemplateLiteral = js.native
  def thisExpression(): atBabelTypesLib.atBabelTypesMod.ThisExpression = js.native
  def thisTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.ThisTypeAnnotation = js.native
  def throwStatement(argument: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.ThrowStatement = js.native
  def traverse[T](n: atBabelTypesLib.atBabelTypesMod.Node, h: atBabelTypesLib.atBabelTypesMod.TraversalHandler[T]): scala.Unit = js.native
  def traverse[T](n: atBabelTypesLib.atBabelTypesMod.Node, h: atBabelTypesLib.atBabelTypesMod.TraversalHandlers[T]): scala.Unit = js.native
  def traverse[T](
    n: atBabelTypesLib.atBabelTypesMod.Node,
    h: atBabelTypesLib.atBabelTypesMod.TraversalHandlers[T],
    state: T
  ): scala.Unit = js.native
  def traverse[T](
    n: atBabelTypesLib.atBabelTypesMod.Node,
    h: atBabelTypesLib.atBabelTypesMod.TraversalHandler[T],
    state: T
  ): scala.Unit = js.native
  def tryStatement(block: atBabelTypesLib.atBabelTypesMod.BlockStatement): atBabelTypesLib.atBabelTypesMod.TryStatement = js.native
  def tryStatement(
    block: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    handler: atBabelTypesLib.atBabelTypesMod.CatchClause
  ): atBabelTypesLib.atBabelTypesMod.TryStatement = js.native
  def tryStatement(
    block: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    handler: atBabelTypesLib.atBabelTypesMod.CatchClause,
    finalizer: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.TryStatement = js.native
  def tryStatement(
    block: atBabelTypesLib.atBabelTypesMod.BlockStatement,
    handler: scala.Null,
    finalizer: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.TryStatement = js.native
  def tsAnyKeyword(): atBabelTypesLib.atBabelTypesMod.TSAnyKeyword = js.native
  def tsArrayType(elementType: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSArrayType = js.native
  def tsAsExpression(
    expression: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSAsExpression = js.native
  def tsBooleanKeyword(): atBabelTypesLib.atBabelTypesMod.TSBooleanKeyword = js.native
  def tsCallSignatureDeclaration(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSCallSignatureDeclaration = js.native
  def tsConditionalType(
    checkType: atBabelTypesLib.atBabelTypesMod.TSType,
    extendsType: atBabelTypesLib.atBabelTypesMod.TSType,
    trueType: atBabelTypesLib.atBabelTypesMod.TSType,
    falseType: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSConditionalType = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSConstructSignatureDeclaration = js.native
  def tsConstructorType(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSConstructorType = js.native
  def tsDeclareFunction(
    id: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop,
    async: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop,
    async: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[atBabelTypesLib.atBabelTypesMod.Identifier | scala.Null],
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    returnType: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop,
    async: scala.Boolean,
    declare: scala.Boolean,
    generator: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[scala.Nothing],
    typeParameters: atBabelTypesLib.atBabelTypesMod.Noop,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[scala.Nothing],
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[scala.Nothing],
    typeParameters: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.Noop,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: scala.Null,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.Noop,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: scala.Null,
    typeParameters: scala.Null,
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareFunction = js.native
  def tsDeclareMethod(
    decorators: js.UndefOr[js.Array[atBabelTypesLib.atBabelTypesMod.Decorator] | scala.Null],
    key: atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.StringLiteral | atBabelTypesLib.atBabelTypesMod.NumericLiteral | atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    params: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.Pattern | atBabelTypesLib.atBabelTypesMod.RestElement | atBabelTypesLib.atBabelTypesMod.TSParameterProperty
    ],
    returnType: js.UndefOr[
      atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation | atBabelTypesLib.atBabelTypesMod.Noop | scala.Null
    ],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    access: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    accessibility: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.public | atBabelCoreLib.atBabelCoreLibStrings.`private` | atBabelCoreLib.atBabelCoreLibStrings.`protected` | scala.Null
    ],
    async: js.UndefOr[scala.Boolean],
    computed: js.UndefOr[scala.Boolean],
    generator: js.UndefOr[scala.Boolean],
    kind: js.UndefOr[
      atBabelCoreLib.atBabelCoreLibStrings.get | atBabelCoreLib.atBabelCoreLibStrings.set | atBabelCoreLib.atBabelCoreLibStrings.method | atBabelCoreLib.atBabelCoreLibStrings.constructor
    ],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    _static: js.UndefOr[scala.Boolean | scala.Null]
  ): atBabelTypesLib.atBabelTypesMod.TSDeclareMethod = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember]
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Boolean,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Boolean,
    declare: scala.Boolean,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Boolean,
    declare: scala.Null,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Null,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Null,
    declare: scala.Boolean,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    members: js.Array[atBabelTypesLib.atBabelTypesMod.TSEnumMember],
    _const: scala.Null,
    declare: scala.Null,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSEnumDeclaration = js.native
  def tsEnumMember(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.TSEnumMember = js.native
  def tsEnumMember(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSEnumMember = js.native
  def tsEnumMember(id: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.TSEnumMember = js.native
  def tsEnumMember(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSEnumMember = js.native
  def tsExportAssignment(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.TSExportAssignment = js.native
  def tsExpressionWithTypeArguments(expression: atBabelTypesLib.atBabelTypesMod.TSEntityName): atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments = js.native
  def tsExpressionWithTypeArguments(
    expression: atBabelTypesLib.atBabelTypesMod.TSEntityName,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments = js.native
  def tsExternalModuleReference(expression: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference = js.native
  def tsFunctionType(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSFunctionType = js.native
  def tsImportEqualsDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    moduleReference: atBabelTypesLib.atBabelTypesMod.TSEntityName
  ): atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    moduleReference: atBabelTypesLib.atBabelTypesMod.TSEntityName,
    isExport: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    moduleReference: atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference
  ): atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    moduleReference: atBabelTypesLib.atBabelTypesMod.TSExternalModuleReference,
    isExport: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSImportEqualsDeclaration = js.native
  def tsImportType(argument: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.TSImportType = js.native
  def tsImportType(
    argument: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    qualifier: atBabelTypesLib.atBabelTypesMod.TSEntityName
  ): atBabelTypesLib.atBabelTypesMod.TSImportType = js.native
  def tsImportType(
    argument: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    qualifier: atBabelTypesLib.atBabelTypesMod.TSEntityName,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.TSImportType = js.native
  def tsImportType(
    argument: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    qualifier: scala.Null,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.TSImportType = js.native
  def tsIndexSignature(parameters: js.Array[atBabelTypesLib.atBabelTypesMod.Identifier]): atBabelTypesLib.atBabelTypesMod.TSIndexSignature = js.native
  def tsIndexSignature(
    parameters: js.Array[atBabelTypesLib.atBabelTypesMod.Identifier],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSIndexSignature = js.native
  def tsIndexSignature(
    parameters: js.Array[atBabelTypesLib.atBabelTypesMod.Identifier],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSIndexSignature = js.native
  def tsIndexSignature(
    parameters: js.Array[atBabelTypesLib.atBabelTypesMod.Identifier],
    typeAnnotation: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSIndexSignature = js.native
  def tsIndexedAccessType(
    objectType: atBabelTypesLib.atBabelTypesMod.TSType,
    indexType: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSIndexedAccessType = js.native
  def tsInferType(typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter): atBabelTypesLib.atBabelTypesMod.TSInferType = js.native
  def tsInterfaceBody(body: js.Array[atBabelTypesLib.atBabelTypesMod.TSTypeElement]): atBabelTypesLib.atBabelTypesMod.TSInterfaceBody = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[atBabelTypesLib.atBabelTypesMod.TSExpressionWithTypeArguments],
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: atBabelTypesLib.atBabelTypesMod.TSInterfaceBody,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSInterfaceDeclaration = js.native
  def tsIntersectionType(types: js.Array[atBabelTypesLib.atBabelTypesMod.TSType]): atBabelTypesLib.atBabelTypesMod.TSIntersectionType = js.native
  def tsLiteralType(literal: atBabelTypesLib.atBabelTypesMod.BooleanLiteral): atBabelTypesLib.atBabelTypesMod.TSLiteralType = js.native
  def tsLiteralType(literal: atBabelTypesLib.atBabelTypesMod.NumericLiteral): atBabelTypesLib.atBabelTypesMod.TSLiteralType = js.native
  def tsLiteralType(literal: atBabelTypesLib.atBabelTypesMod.StringLiteral): atBabelTypesLib.atBabelTypesMod.TSLiteralType = js.native
  def tsMappedType(typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    optional: scala.Boolean,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    optional: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: scala.Null,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: scala.Null,
    optional: scala.Boolean,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMappedType(
    typeParameter: atBabelTypesLib.atBabelTypesMod.TSTypeParameter,
    typeAnnotation: scala.Null,
    optional: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMappedType = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    computed: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    computed: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ]
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    computed: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsMethodSignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeParameters: scala.Null,
    parameters: js.Array[
      atBabelTypesLib.atBabelTypesMod.Identifier | atBabelTypesLib.atBabelTypesMod.RestElement
    ],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSMethodSignature = js.native
  def tsModuleBlock(body: js.Array[atBabelTypesLib.atBabelTypesMod.Statement]): atBabelTypesLib.atBabelTypesMod.TSModuleBlock = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock,
    declare: scala.Boolean,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock,
    declare: scala.Null,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    declare: scala.Boolean,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    declare: scala.Null,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock,
    declare: scala.Boolean,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleBlock,
    declare: scala.Null,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    declare: scala.Boolean,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsModuleDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.StringLiteral,
    body: atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration,
    declare: scala.Null,
    global: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSModuleDeclaration = js.native
  def tsNamespaceExportDeclaration(id: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.TSNamespaceExportDeclaration = js.native
  def tsNeverKeyword(): atBabelTypesLib.atBabelTypesMod.TSNeverKeyword = js.native
  def tsNonNullExpression(expression: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.TSNonNullExpression = js.native
  def tsNullKeyword(): atBabelTypesLib.atBabelTypesMod.TSNullKeyword = js.native
  def tsNumberKeyword(): atBabelTypesLib.atBabelTypesMod.TSNumberKeyword = js.native
  def tsObjectKeyword(): atBabelTypesLib.atBabelTypesMod.TSObjectKeyword = js.native
  def tsOptionalType(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSOptionalType = js.native
  def tsParameterProperty(parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  def tsParameterProperty(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  def tsParameterProperty(parameter: atBabelTypesLib.atBabelTypesMod.Identifier): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  def tsParameterProperty(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: scala.Null,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`private`
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`private`,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`private`
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`private`,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`protected`
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`protected`,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`protected`
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.`protected`,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.public
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: atBabelTypesLib.atBabelTypesMod.AssignmentPattern,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.public,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.public
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: atBabelTypesLib.atBabelTypesMod.Identifier,
    accessibility: atBabelCoreLib.atBabelCoreLibStrings.public,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSParameterProperty = js.native
  def tsParenthesizedType(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSParenthesizedType = js.native
  def tsPropertySignature(key: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression,
    computed: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def tsPropertySignature(
    key: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation,
    initializer: atBabelTypesLib.atBabelTypesMod.Expression,
    computed: scala.Boolean,
    optional: scala.Boolean,
    readonly: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSPropertySignature = js.native
  def tsQualifiedName(
    left: atBabelTypesLib.atBabelTypesMod.TSEntityName,
    right: atBabelTypesLib.atBabelTypesMod.Identifier
  ): atBabelTypesLib.atBabelTypesMod.TSQualifiedName = js.native
  def tsRestType(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSRestType = js.native
  def tsStringKeyword(): atBabelTypesLib.atBabelTypesMod.TSStringKeyword = js.native
  def tsSymbolKeyword(): atBabelTypesLib.atBabelTypesMod.TSSymbolKeyword = js.native
  def tsThisType(): atBabelTypesLib.atBabelTypesMod.TSThisType = js.native
  def tsTupleType(elementTypes: js.Array[atBabelTypesLib.atBabelTypesMod.TSType]): atBabelTypesLib.atBabelTypesMod.TSTupleType = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAliasDeclaration = js.native
  def tsTypeAnnotation(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation = js.native
  def tsTypeAssertion(
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType,
    expression: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.TSTypeAssertion = js.native
  def tsTypeLiteral(members: js.Array[atBabelTypesLib.atBabelTypesMod.TSTypeElement]): atBabelTypesLib.atBabelTypesMod.TSTypeLiteral = js.native
  def tsTypeOperator(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSTypeOperator = js.native
  def tsTypeOperator(typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSType, operator: java.lang.String): atBabelTypesLib.atBabelTypesMod.TSTypeOperator = js.native
  def tsTypeParameter(): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(
    constraint: atBabelTypesLib.atBabelTypesMod.TSType,
    _default: atBabelTypesLib.atBabelTypesMod.TSType
  ): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(
    constraint: atBabelTypesLib.atBabelTypesMod.TSType,
    _default: atBabelTypesLib.atBabelTypesMod.TSType,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: atBabelTypesLib.atBabelTypesMod.TSType, _default: scala.Null, name: java.lang.String): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: scala.Null, _default: atBabelTypesLib.atBabelTypesMod.TSType): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: scala.Null, _default: atBabelTypesLib.atBabelTypesMod.TSType, name: java.lang.String): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameter(constraint: scala.Null, _default: scala.Null, name: java.lang.String): atBabelTypesLib.atBabelTypesMod.TSTypeParameter = js.native
  def tsTypeParameterDeclaration(params: js.Array[atBabelTypesLib.atBabelTypesMod.TSTypeParameter]): atBabelTypesLib.atBabelTypesMod.TSTypeParameterDeclaration = js.native
  def tsTypeParameterInstantiation(params: js.Array[atBabelTypesLib.atBabelTypesMod.TSType]): atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation = js.native
  def tsTypePredicate(
    parameterName: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSTypePredicate = js.native
  def tsTypePredicate(
    parameterName: atBabelTypesLib.atBabelTypesMod.TSThisType,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TSTypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TSTypePredicate = js.native
  def tsTypeQuery(exprName: atBabelTypesLib.atBabelTypesMod.TSEntityName): atBabelTypesLib.atBabelTypesMod.TSTypeQuery = js.native
  def tsTypeQuery(exprName: atBabelTypesLib.atBabelTypesMod.TSImportType): atBabelTypesLib.atBabelTypesMod.TSTypeQuery = js.native
  def tsTypeReference(typeName: atBabelTypesLib.atBabelTypesMod.TSEntityName): atBabelTypesLib.atBabelTypesMod.TSTypeReference = js.native
  def tsTypeReference(
    typeName: atBabelTypesLib.atBabelTypesMod.TSEntityName,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TSTypeParameterInstantiation
  ): atBabelTypesLib.atBabelTypesMod.TSTypeReference = js.native
  def tsUndefinedKeyword(): atBabelTypesLib.atBabelTypesMod.TSUndefinedKeyword = js.native
  def tsUnionType(types: js.Array[atBabelTypesLib.atBabelTypesMod.TSType]): atBabelTypesLib.atBabelTypesMod.TSUnionType = js.native
  def tsUnknownKeyword(): atBabelTypesLib.atBabelTypesMod.TSUnknownKeyword = js.native
  def tsVoidKeyword(): atBabelTypesLib.atBabelTypesMod.TSVoidKeyword = js.native
  def tupleTypeAnnotation(types: js.Array[atBabelTypesLib.atBabelTypesMod.FlowType]): atBabelTypesLib.atBabelTypesMod.TupleTypeAnnotation = js.native
  def typeAlias(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    right: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.TypeAlias = js.native
  def typeAlias(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration,
    right: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.TypeAlias = js.native
  def typeAlias(
    id: atBabelTypesLib.atBabelTypesMod.Identifier,
    typeParameters: scala.Null,
    right: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.TypeAlias = js.native
  def typeAnnotation(typeAnnotation: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.TypeAnnotation = js.native
  def typeCastExpression(
    expression: atBabelTypesLib.atBabelTypesMod.Expression,
    typeAnnotation: atBabelTypesLib.atBabelTypesMod.TypeAnnotation
  ): atBabelTypesLib.atBabelTypesMod.TypeCastExpression = js.native
  def typeParameter(): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: scala.Null,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: scala.Null,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: scala.Null,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: atBabelTypesLib.atBabelTypesMod.TypeAnnotation,
    _default: scala.Null,
    variance: scala.Null,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: scala.Null,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: scala.Null,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: scala.Null,
    _default: atBabelTypesLib.atBabelTypesMod.FlowType,
    variance: scala.Null,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: scala.Null, variance: atBabelTypesLib.atBabelTypesMod.Variance): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(
    bound: scala.Null,
    _default: scala.Null,
    variance: atBabelTypesLib.atBabelTypesMod.Variance,
    name: java.lang.String
  ): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: scala.Null, variance: scala.Null, name: java.lang.String): atBabelTypesLib.atBabelTypesMod.TypeParameter = js.native
  def typeParameterDeclaration(params: js.Array[atBabelTypesLib.atBabelTypesMod.TypeParameter]): atBabelTypesLib.atBabelTypesMod.TypeParameterDeclaration = js.native
  def typeParameterInstantiation(params: js.Array[atBabelTypesLib.atBabelTypesMod.FlowType]): atBabelTypesLib.atBabelTypesMod.TypeParameterInstantiation = js.native
  def typeofTypeAnnotation(argument: atBabelTypesLib.atBabelTypesMod.FlowType): atBabelTypesLib.atBabelTypesMod.TypeofTypeAnnotation = js.native
  def unaryExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`!`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def unaryExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`!`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def unaryExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`+`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def unaryExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`+`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def unaryExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`-`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def unaryExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`-`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def unaryExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`~`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def unaryExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`~`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(
    operator: atBabelCoreLib.atBabelCoreLibStrings.delete,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(
    operator: atBabelCoreLib.atBabelCoreLibStrings.delete,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_throw(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`throw`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_throw(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`throw`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(
    operator: atBabelCoreLib.atBabelCoreLibStrings.typeof,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(
    operator: atBabelCoreLib.atBabelCoreLibStrings.typeof,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(
    operator: atBabelCoreLib.atBabelCoreLibStrings.void,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(
    operator: atBabelCoreLib.atBabelCoreLibStrings.void,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UnaryExpression = js.native
  def unionTypeAnnotation(types: js.Array[atBabelTypesLib.atBabelTypesMod.FlowType]): atBabelTypesLib.atBabelTypesMod.UnionTypeAnnotation = js.native
  def updateExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`++`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UpdateExpression = js.native
  def updateExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`++`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UpdateExpression = js.native
  def updateExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`--`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression
  ): atBabelTypesLib.atBabelTypesMod.UpdateExpression = js.native
  def updateExpression(
    operator: atBabelCoreLib.atBabelCoreLibStrings.`--`,
    argument: atBabelTypesLib.atBabelTypesMod.Expression,
    prefix: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.UpdateExpression = js.native
  def validate(n: atBabelTypesLib.atBabelTypesMod.Node, key: java.lang.String, value: js.Any): scala.Unit = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(
    kind: atBabelCoreLib.atBabelCoreLibStrings.const,
    declarations: js.Array[atBabelTypesLib.atBabelTypesMod.VariableDeclarator]
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(
    kind: atBabelCoreLib.atBabelCoreLibStrings.const,
    declarations: js.Array[atBabelTypesLib.atBabelTypesMod.VariableDeclarator],
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(
    kind: atBabelCoreLib.atBabelCoreLibStrings.let,
    declarations: js.Array[atBabelTypesLib.atBabelTypesMod.VariableDeclarator]
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(
    kind: atBabelCoreLib.atBabelCoreLibStrings.let,
    declarations: js.Array[atBabelTypesLib.atBabelTypesMod.VariableDeclarator],
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(
    kind: atBabelCoreLib.atBabelCoreLibStrings.`var`,
    declarations: js.Array[atBabelTypesLib.atBabelTypesMod.VariableDeclarator]
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(
    kind: atBabelCoreLib.atBabelCoreLibStrings.`var`,
    declarations: js.Array[atBabelTypesLib.atBabelTypesMod.VariableDeclarator],
    declare: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclaration = js.native
  def variableDeclarator(id: atBabelTypesLib.atBabelTypesMod.LVal): atBabelTypesLib.atBabelTypesMod.VariableDeclarator = js.native
  def variableDeclarator(id: atBabelTypesLib.atBabelTypesMod.LVal, init: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.VariableDeclarator = js.native
  def variableDeclarator(
    id: atBabelTypesLib.atBabelTypesMod.LVal,
    init: atBabelTypesLib.atBabelTypesMod.Expression,
    definite: scala.Boolean
  ): atBabelTypesLib.atBabelTypesMod.VariableDeclarator = js.native
  def variableDeclarator(id: atBabelTypesLib.atBabelTypesMod.LVal, init: scala.Null, definite: scala.Boolean): atBabelTypesLib.atBabelTypesMod.VariableDeclarator = js.native
  @JSName("variance")
  def variance_minus(kind: atBabelCoreLib.atBabelCoreLibStrings.minus): atBabelTypesLib.atBabelTypesMod.Variance = js.native
  @JSName("variance")
  def variance_plus(kind: atBabelCoreLib.atBabelCoreLibStrings.plus): atBabelTypesLib.atBabelTypesMod.Variance = js.native
  def voidTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.VoidTypeAnnotation = js.native
  def whileStatement(
    test: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.WhileStatement = js.native
  def whileStatement(test: atBabelTypesLib.atBabelTypesMod.Expression, body: atBabelTypesLib.atBabelTypesMod.Statement): atBabelTypesLib.atBabelTypesMod.WhileStatement = js.native
  def withStatement(
    `object`: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.BlockStatement
  ): atBabelTypesLib.atBabelTypesMod.WithStatement = js.native
  def withStatement(
    `object`: atBabelTypesLib.atBabelTypesMod.Expression,
    body: atBabelTypesLib.atBabelTypesMod.Statement
  ): atBabelTypesLib.atBabelTypesMod.WithStatement = js.native
  def yieldExpression(): atBabelTypesLib.atBabelTypesMod.YieldExpression = js.native
  def yieldExpression(argument: atBabelTypesLib.atBabelTypesMod.Expression): atBabelTypesLib.atBabelTypesMod.YieldExpression = js.native
  def yieldExpression(argument: atBabelTypesLib.atBabelTypesMod.Expression, delegate: scala.Boolean): atBabelTypesLib.atBabelTypesMod.YieldExpression = js.native
  def yieldExpression(argument: scala.Null, delegate: scala.Boolean): atBabelTypesLib.atBabelTypesMod.YieldExpression = js.native
}

