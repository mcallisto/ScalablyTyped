package typings
package graphqlDashComposeLib.libObjectTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeObjectTypeConfig[TSource, TContext] extends js.Object {
  var description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var extensions: js.UndefOr[graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions] = js.undefined
  var fields: js.UndefOr[
    graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[ComposeFieldConfigMap[TSource, TContext]]
  ] = js.undefined
  var interfaces: js.UndefOr[
    graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[
      js.Array[graphqlDashComposeLib.libInterfaceTypeComposerMod.ComposeInterfaceType] | scala.Null
    ]
  ] = js.undefined
  var isIntrospection: js.UndefOr[scala.Boolean] = js.undefined
  var isTypeOf: js.UndefOr[(graphqlLib.typeDefinitionMod.GraphQLIsTypeOfFn[TSource, TContext]) | scala.Null] = js.undefined
  var name: java.lang.String
}

object ComposeObjectTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    name: java.lang.String,
    description: java.lang.String = null,
    extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions = null,
    fields: graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[ComposeFieldConfigMap[TSource, TContext]] = null,
    interfaces: graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[
      js.Array[graphqlDashComposeLib.libInterfaceTypeComposerMod.ComposeInterfaceType] | scala.Null
    ] = null,
    isIntrospection: js.UndefOr[scala.Boolean] = js.undefined,
    isTypeOf: graphqlLib.typeDefinitionMod.GraphQLIsTypeOfFn[TSource, TContext] = null
  ): ComposeObjectTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (!js.isUndefined(isIntrospection)) __obj.updateDynamic("isIntrospection")(isIntrospection)
    if (isTypeOf != null) __obj.updateDynamic("isTypeOf")(isTypeOf)
    __obj.asInstanceOf[ComposeObjectTypeConfig[TSource, TContext]]
  }
}

