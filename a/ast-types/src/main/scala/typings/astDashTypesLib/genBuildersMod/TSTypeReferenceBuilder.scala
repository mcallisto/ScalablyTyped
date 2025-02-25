package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeReferenceBuilder extends js.Object {
  def apply(typeName: astDashTypesLib.genKindsMod.IdentifierKind): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeReference = js.native
  def apply(
    typeName: astDashTypesLib.genKindsMod.IdentifierKind,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeReference = js.native
  def apply(typeName: astDashTypesLib.genKindsMod.TSQualifiedNameKind): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeReference = js.native
  def apply(
    typeName: astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeReference = js.native
  def from(params: astDashTypesLib.Anon_CommentsLocTypeName): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSTypeReference = js.native
}

