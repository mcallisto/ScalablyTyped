package typings
package graphqlDashComposeLib.esmResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/Resolver", "Resolver")
@js.native
class Resolver[TSource, TContext, TArgs, TReturn] protected () extends js.Object {
  def this(opts: ResolverOpts[TSource, TContext, TArgs, _], schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
  var args: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigArgumentMap[_] = js.native
  var description: java.lang.String | scala.Unit = js.native
  var displayName: java.lang.String | scala.Unit = js.native
  var extensions: js.UndefOr[graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions] = js.native
  var kind: ResolverKinds | scala.Unit = js.native
  var name: java.lang.String = js.native
  var parent: (Resolver[TSource, TContext, _, _]) | scala.Unit = js.native
  var schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext] = js.native
  var `type`: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeOutputType[TReturn, TContext] = js.native
  def addArgs(newArgs: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigArgumentMap[TArgs]): this.type = js.native
  def addFilterArg(opts: ResolverFilterArgConfig[TSource, TContext, TArgs]): Resolver[TSource, TContext, TArgs, _] = js.native
  def addSortArg(opts: ResolverSortArgConfig[TSource, TContext, TArgs]): Resolver[TSource, TContext, TArgs, _] = js.native
  def clone[TNewSource, TNewArgs](opts: ResolverOpts[TNewSource, TContext, TNewArgs, _]): Resolver[TNewSource, TContext, TNewArgs, _] = js.native
  def cloneArg(argName: java.lang.String, newTypeName: java.lang.String): this.type = js.native
  def debug(): Resolver[TSource, TContext, TArgs, _] = js.native
  def debug(filterDotPaths: graphqlDashComposeLib.Anon_Params): Resolver[TSource, TContext, TArgs, _] = js.native
  def debug(filterDotPaths: graphqlDashComposeLib.Anon_Params, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugExecTime(): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugParams(): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugParams(filterPaths: java.lang.String): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugParams(filterPaths: java.lang.String, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugParams(filterPaths: js.Array[java.lang.String]): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugParams(filterPaths: js.Array[java.lang.String], opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugParams(filterPaths: scala.Null, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugPayload(): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugPayload(filterPaths: java.lang.String): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugPayload(filterPaths: java.lang.String, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugPayload(filterPaths: js.Array[java.lang.String]): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugPayload(filterPaths: js.Array[java.lang.String], opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def debugPayload(filterPaths: scala.Null, opts: ResolveDebugOpts): Resolver[TSource, TContext, TArgs, _] = js.native
  def extendArg(
    argName: java.lang.String,
    partialArgConfig: stdLib.Partial[graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeArgumentConfigAsObject]
  ): this.type = js.native
  def get(path: java.lang.String): js.Any = js.native
  def get(path: js.Array[java.lang.String]): js.Any = js.native
  def getArg(argName: java.lang.String): graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeArgumentConfigAsObject = js.native
  def getArgConfig(argName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLArgumentConfig = js.native
  def getArgNames(): js.Array[java.lang.String] = js.native
  def getArgTC(argName: java.lang.String): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def getArgType(argName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLInputType = js.native
  def getArgs(): graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigArgumentMap[TArgs] = js.native
  def getDescription(): java.lang.String | scala.Null = js.native
  /**
    *  -----------------------------------------------
    * Misc methods
    * -----------------------------------------------
    */
  def getFieldConfig(): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, TArgs] = js.native
  def getFieldConfig(opts: graphqlDashComposeLib.Anon_ProjectionProjectionType): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, TArgs] = js.native
  def getKind(): ResolverKinds | scala.Unit = js.native
  /**
    * -----------------------------------------------
    * Debug methods
    * -----------------------------------------------
    */
  def getNestedName(): java.lang.String = js.native
  /**
    *  -----------------------------------------------
    * Resolve methods
    * -----------------------------------------------
    */
  def getResolve(): ResolverRpCb[TSource, TContext, TArgs] = js.native
  /**
    * -----------------------------------------------
    * Output type methods
    * -----------------------------------------------
    */
  def getType(): graphqlLib.typeDefinitionMod.GraphQLOutputType = js.native
  def getTypeComposer(): graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] = js.native
  /**
    *  -----------------------------------------------
    * Args methods
    * -----------------------------------------------
    */
  def hasArg(argName: java.lang.String): scala.Boolean = js.native
  def isRequired(argName: java.lang.String): scala.Boolean = js.native
  def makeOptional(argNameOrArray: java.lang.String): this.type = js.native
  def makeOptional(argNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def makeRequired(argNameOrArray: java.lang.String): this.type = js.native
  def makeRequired(argNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeArg(argNameOrArray: java.lang.String): this.type = js.native
  def removeArg(argNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeOtherArgs(argNameOrArray: java.lang.String): this.type = js.native
  def removeOtherArgs(argNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def reorderArgs(names: js.Array[java.lang.String]): this.type = js.native
  def resolve(resolveParams: stdLib.Partial[ResolveParams[TSource, TContext, TArgs]]): js.Promise[_] | js.Any = js.native
  def setArg(
    argName: java.lang.String,
    argConfig: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeArgumentConfig
  ): this.type = js.native
  def setArgs[TNewArgs](args: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigArgumentMap[TNewArgs]): Resolver[TSource, TContext, TNewArgs, _] = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setDescription(description: scala.Unit): this.type = js.native
  def setDisplayName(name: java.lang.String): this.type = js.native
  def setKind(kind: java.lang.String): this.type = js.native
  def setResolve(resolve: ResolverRpCb[TSource, TContext, TArgs]): Resolver[TSource, TContext, TArgs, _] = js.native
  def setType[TNewReturn](gqType: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeOutputType[TNewReturn, TContext]): Resolver[TSource, TContext, TArgs, TNewReturn] = js.native
  def toDebugStructure(): js.Object = js.native
  def toDebugStructure(colors: scala.Boolean): js.Object = js.native
  def toString(colors: scala.Boolean): java.lang.String = js.native
  /**
    * -----------------------------------------------
    * Wrap methods
    * -----------------------------------------------
    */
  /**
    * You may construct a new resolver with wrapped logic:
    *
    * @example
    *     const log = [];
    *
    *     const mw1 = async (resolve, source, args, context, info) => {
    *       log.push('m1.before');
    *       const res = await resolve(source, args, context, info);
    *       log.push('m1.after');
    *       return res;
    *     };
    *
    *     const mw2 = async (resolve, source, args, context, info) => {
    *       log.push('m2.before');
    *       const res = await resolve(source, args, context, info);
    *       log.push('m2.after');
    *       return res;
    *     };
    *
    *     const newResolver = Resolver.withMiddlewares([mw1, mw2]);
    *     await newResolver.resolve({});
    *
    *     expect(log).toEqual([
    *       'm1.before',
    *       'm2.before',
    *       'call resolve',
    *       'm2.after',
    *       'm1.after'
    *     ]);
    */
  def withMiddlewares(middlewares: js.Array[ResolverMiddleware[TSource, TContext, TArgs]]): Resolver[TSource, TContext, TArgs, _] = js.native
  def wrap[TNewSource, TNewArgs](): Resolver[TNewSource, TContext, TNewArgs, _] = js.native
  def wrap[TNewSource, TNewArgs](cb: ResolverWrapCb[TNewSource, TSource, TContext, TNewArgs, TArgs]): Resolver[TNewSource, TContext, TNewArgs, _] = js.native
  def wrap[TNewSource, TNewArgs](
    cb: ResolverWrapCb[TNewSource, TSource, TContext, TNewArgs, TArgs],
    newResolverOpts: ResolverOpts[TNewSource, TContext, TArgs, _]
  ): Resolver[TNewSource, TContext, TNewArgs, _] = js.native
  def wrapArgs[TCArgs](cb: ResolverWrapArgsCb[TCArgs]): Resolver[TSource, TContext, TCArgs, _] = js.native
  def wrapArgs[TCArgs](cb: ResolverWrapArgsCb[TCArgs], wrapperName: java.lang.String): Resolver[TSource, TContext, TCArgs, _] = js.native
  def wrapCloneArg[TCArgs](argName: java.lang.String, newTypeName: java.lang.String): Resolver[TSource, TContext, TCArgs, _] = js.native
  def wrapResolve[TCSource, TCArgs](cb: ResolverNextRpCb[TCSource, TContext, TCArgs]): Resolver[TCSource, TContext, TCArgs, _] = js.native
  def wrapResolve[TCSource, TCArgs](cb: ResolverNextRpCb[TCSource, TContext, TCArgs], wrapperName: java.lang.String): Resolver[TCSource, TContext, TCArgs, _] = js.native
  def wrapType(cb: ResolverWrapTypeCb[TContext, _]): Resolver[TSource, TContext, TArgs, _] = js.native
  def wrapType(cb: ResolverWrapTypeCb[TContext, _], wrapperName: java.lang.String): Resolver[TSource, TContext, TArgs, _] = js.native
}

