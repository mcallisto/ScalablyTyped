package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution", JSImport.Namespace)
@js.native
object executionMod extends js.Object {
  val defaultFieldResolver: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  def execute[TData](args: graphqlLib.executionExecuteMod.ExecutionArgs): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def execute[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, document: graphqlLib.languageAstMod.DocumentNode): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def getDirectiveValues(directiveDef: graphqlLib.typeDirectivesMod.GraphQLDirective, node: graphqlLib.Anon_Directives): js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  def getDirectiveValues(
    directiveDef: graphqlLib.typeDirectivesMod.GraphQLDirective,
    node: graphqlLib.Anon_Directives,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  def responsePathAsArray(path: graphqlLib.typeDefinitionMod.ResponsePath): js.Array[java.lang.String | scala.Double] = js.native
}

