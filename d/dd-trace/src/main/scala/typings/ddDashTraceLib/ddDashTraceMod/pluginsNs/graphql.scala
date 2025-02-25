package typings
package ddDashTraceLib.ddDashTraceMod.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [graphql](https://github.com/graphql/graphql-js) module.
  *
  * The `graphql` integration uses the operation name as the span resource name.
  * If no operation name is set, the resource name will always be just `query`,
  * `mutation` or `subscription`.
  *
  * For example:
  *
  * ```graphql
  * # good, the resource name will be `query HelloWorld`
  * query HelloWorld {
  *   hello
  *   world
  * }
  *
  * # bad, the resource name will be `query`
  * {
  *   hello
  *   world
  * }
  * ```
  */
trait graphql extends Integration {
  /**
    * Whether to collapse list items into a single element. (i.e. single
    * `users.*.name` span instead of `users.0.name`, `users.1.name`, etc)
    *
    * @default true
    */
  var collapse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum depth of fields/resolvers to instrument. Set to `0` to only
    * instrument the operation or to `-1` to instrument all fields/resolvers.
    *
    * @default -1
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to enable signature calculation for the resource name. This can
    * be disabled if your GraphQL operations always have a name.
    *
    * @default true
    */
  var signature: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of variable names to record. Can also be a callback that returns
    * the key/value pairs to record. For example, using
    * `variables => variables` would record all variables.
    */
  var variables: js.UndefOr[
    js.Array[java.lang.String] | (js.Function1[
      /* variables */ org.scalablytyped.runtime.StringDictionary[js.Any], 
      org.scalablytyped.runtime.StringDictionary[_]
    ])
  ] = js.undefined
}

object graphql {
  @scala.inline
  def apply(
    analytics: scala.Boolean | ddDashTraceLib.Anon_Enabled = null,
    collapse: js.UndefOr[scala.Boolean] = js.undefined,
    depth: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    service: java.lang.String = null,
    signature: js.UndefOr[scala.Boolean] = js.undefined,
    variables: js.Array[java.lang.String] | (js.Function1[
      /* variables */ org.scalablytyped.runtime.StringDictionary[js.Any], 
      org.scalablytyped.runtime.StringDictionary[_]
    ]) = null
  ): graphql = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (service != null) __obj.updateDynamic("service")(service)
    if (!js.isUndefined(signature)) __obj.updateDynamic("signature")(signature)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[graphql]
  }
}

