package typings
package graphqlDashToolsLib.distTransformsFilterToSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/FilterToSchema", JSImport.Default)
@js.native
class default protected () extends FilterToSchema {
  def this(targetSchema: graphqlLib.graphqlMod.GraphQLSchema) = this()
  /* CompleteClass */
  override var targetSchema: js.Any = js.native
  /* CompleteClass */
  @JSName("transformRequest")
  override def transformRequest_MFilterToSchema(originalRequest: graphqlDashToolsLib.distInterfacesMod.Request): graphqlDashToolsLib.distInterfacesMod.Request = js.native
}

