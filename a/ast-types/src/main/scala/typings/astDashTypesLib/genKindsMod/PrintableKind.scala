package typings
package astDashTypesLib.genKindsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.File
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.Program
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.Identifier
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.BlockStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.EmptyStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ExpressionStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.IfStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.LabeledStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.BreakStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ContinueStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.WithStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.SwitchStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.SwitchCase
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ReturnStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ThrowStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TryStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.CatchClause
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.WhileStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DoWhileStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ForStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.VariableDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ForInStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DebuggerStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.VariableDeclarator
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ThisExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ArrayExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.Property
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.Literal
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.SequenceExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.UnaryExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.BinaryExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.AssignmentExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.MemberExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.UpdateExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.LogicalExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ConditionalExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.NewExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.CallExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.RestElement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.SpreadElementPattern
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ArrowFunctionExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ForOfStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.YieldExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.GeneratorExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ComprehensionBlock
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ComprehensionExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectProperty
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.PropertyPattern
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectPattern
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ArrayPattern
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.MethodDefinition
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.SpreadElement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.AssignmentPattern
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassPropertyDefinition
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassProperty
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassBody
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ImportSpecifier
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ImportNamespaceSpecifier
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ImportDefaultSpecifier
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ImportDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TaggedTemplateExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TemplateLiteral
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TemplateElement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.SpreadProperty
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.SpreadPropertyPattern
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.AwaitExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXAttribute
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXIdentifier
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXNamespacedName
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXExpressionContainer
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXMemberExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXSpreadAttribute
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXElement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXOpeningElement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXClosingElement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXFragment
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXText
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXOpeningFragment
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXClosingFragment
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXEmptyExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.JSXSpreadChild
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeParameterDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeParameterDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeParameterInstantiation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeParameterInstantiation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassImplements
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSExpressionWithTypeArguments
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.AnyTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.EmptyTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.MixedTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.VoidTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.NumberTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.NumberLiteralTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.NumericLiteralTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.StringTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.StringLiteralTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.BooleanTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.BooleanLiteralTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.NullableTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.NullLiteralTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.NullTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ThisTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ExistsTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ExistentialTypeParam
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeParam
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ArrayTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeProperty
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeSpreadProperty
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeIndexer
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeCallProperty
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectTypeInternalSlot
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.Variance
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.QualifiedTypeIdentifier
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.GenericTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.MemberTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.UnionTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.IntersectionTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeofTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeParameter
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.InterfaceTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.InterfaceExtends
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.InterfaceDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareInterface
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeAlias
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.OpaqueType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareTypeAlias
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareOpaqueType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TypeCastExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TupleTypeAnnotation
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareVariable
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareFunction
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareClass
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareModule
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareModuleExports
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareExportDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportSpecifier
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportBatchSpecifier
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclareExportAllDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.InferredPredicate
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DeclaredPredicate
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.Block
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.Line
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.Noop
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DoExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.Super
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.BindExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.Decorator
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.MetaProperty
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ParenthesizedExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportDefaultDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportNamedDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportNamespaceSpecifier
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportDefaultSpecifier
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ExportAllDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.CommentBlock
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.CommentLine
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.Directive
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.DirectiveLiteral
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.InterpreterDirective
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.StringLiteral
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.NumericLiteral
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.BigIntLiteral
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.NullLiteral
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.BooleanLiteral
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.RegExpLiteral
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ObjectMethod
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassPrivateProperty
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassMethod
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ClassPrivateMethod
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.PrivateName
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.RestProperty
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.ForAwaitStatement
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.Import
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSQualifiedName
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeReference
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSAsExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNonNullExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSAnyKeyword
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSBigIntKeyword
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSBooleanKeyword
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNeverKeyword
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNullKeyword
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNumberKeyword
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSObjectKeyword
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSStringKeyword
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSSymbolKeyword
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSUndefinedKeyword
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSUnknownKeyword
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSVoidKeyword
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSThisType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSArrayType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSLiteralType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSUnionType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSIntersectionType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSConditionalType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSInferType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeParameter
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSParenthesizedType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSFunctionType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSConstructorType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSDeclareFunction
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSDeclareMethod
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSMappedType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTupleType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSRestType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSOptionalType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSIndexedAccessType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeOperator
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSIndexSignature
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSPropertySignature
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSMethodSignature
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypePredicate
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSCallSignatureDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSConstructSignatureDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSEnumMember
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeQuery
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSImportType
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeLiteral
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeAssertion
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSEnumDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeAliasDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSModuleBlock
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSModuleDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSImportEqualsDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSExternalModuleReference
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSExportAssignment
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSNamespaceExportDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSInterfaceBody
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSInterfaceDeclaration
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.TSParameterProperty
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.OptionalMemberExpression
  - astDashTypesLib.genNamedTypesMod.namedTypesNs.OptionalCallExpression
*/
trait PrintableKind extends js.Object

