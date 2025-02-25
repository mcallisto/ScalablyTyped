package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionTypeAnnotationBuilder extends js.Object {
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.FunctionTypeParamKind],
    returnType: astDashTypesLib.genKindsMod.FlowTypeKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeAnnotation = js.native
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.FunctionTypeParamKind],
    returnType: astDashTypesLib.genKindsMod.FlowTypeKind,
    rest: astDashTypesLib.genKindsMod.FunctionTypeParamKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeAnnotation = js.native
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.FunctionTypeParamKind],
    returnType: astDashTypesLib.genKindsMod.FlowTypeKind,
    rest: astDashTypesLib.genKindsMod.FunctionTypeParamKind,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeAnnotation = js.native
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.FunctionTypeParamKind],
    returnType: astDashTypesLib.genKindsMod.FlowTypeKind,
    rest: scala.Null,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeAnnotation = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocParamsRest): astDashTypesLib.genNamedTypesMod.namedTypesNs.FunctionTypeAnnotation = js.native
}

