package typings
package atHapiHapiLib.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptionsAccess extends js.Object {
  /**
    * Default value: none.
    * An object or array of objects specifying the route access rules. Each rule is evaluated against an incoming request and access is granted if at least one of the rules matches. Each rule object
    * must include at least one of scope or entity.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccess)
    */
  var access: js.UndefOr[RouteOptionsAccessObject | js.Array[RouteOptionsAccessObject]] = js.undefined
  /**
    * Default value: 'any'.
    * The required authenticated entity type. If set, must match the entity value of the request authenticated credentials. Available values:
    * * 'any' - the authentication can be on behalf of a user or application.
    * * 'user' - the authentication must be on behalf of a user which is identified by the presence of a 'user' attribute in the credentials object returned by the authentication strategy.
    * * 'app' - the authentication must be on behalf of an application which is identified by the lack of presence of a user attribute in the credentials object returned by the authentication
    * strategy.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccessentity)
    */
  var entity: js.UndefOr[AccessEntity] = js.undefined
  /**
    * Default value: 'required'.
    * The authentication mode. Available values:
    * * 'required' - authentication is required.
    * * 'optional' - authentication is optional - the request must include valid credentials or no credentials at all.
    * * 'try' - similar to 'optional', any request credentials are attempted authentication, but if the credentials are invalid, the request proceeds regardless of the authentication error.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthmode)
    */
  var mode: js.UndefOr[AuthMode] = js.undefined
  /**
    * Default value: false, unless the scheme requires payload authentication.
    * If set, the incoming request payload is authenticated after it is processed. Requires a strategy with payload authentication support (e.g. Hawk). Cannot be set to a value other than 'required'
    * when the scheme sets the authentication options.payload to true. Available values:
    * * false - no payload authentication.
    * * 'required' - payload authentication required.
    * * 'optional' - payload authentication performed only when the client includes payload authentication information (e.g. hash attribute in Hawk).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthpayload)
    */
  var payload: js.UndefOr[
    atHapiHapiLib.atHapiHapiLibNumbers.`false` | atHapiHapiLib.atHapiHapiLibStrings.required | atHapiHapiLib.atHapiHapiLibStrings.optional
  ] = js.undefined
  /**
    * Default value: false (no scope requirements).
    * The application scope required to access the route. Value can be a scope string or an array of scope strings. When authenticated, the credentials object scope property must contain at least
    * one of the scopes defined to access the route. If a scope string begins with a + character, that scope is required. If a scope string begins with a ! character, that scope is forbidden. For
    * example, the scope ['!a', '+b', 'c', 'd'] means the incoming request credentials' scope must not include 'a', must include 'b', and must include one of 'c' or 'd'. You may also access
    * properties on the request object (query, params, payload, and credentials) to populate a dynamic scope by using the '{' and '}' characters around the property name, such as 'user-{params.id}'.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccessscope)
    */
  var scope: js.UndefOr[RouteOptionsAccessScope] = js.undefined
  /**
    * Default value: the default strategy set via server.auth.default().
    * An array of string strategy names in the order they should be attempted. Cannot be used together with strategy.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthstrategies)
    */
  var strategies: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Default value: the default strategy set via server.auth.default().
    * A string strategy names. Cannot be used together with strategies.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthstrategy)
    */
  var strategy: js.UndefOr[java.lang.String] = js.undefined
}

object RouteOptionsAccess {
  @scala.inline
  def apply(
    access: RouteOptionsAccessObject | js.Array[RouteOptionsAccessObject] = null,
    entity: AccessEntity = null,
    mode: AuthMode = null,
    payload: atHapiHapiLib.atHapiHapiLibNumbers.`false` | atHapiHapiLib.atHapiHapiLibStrings.required | atHapiHapiLib.atHapiHapiLibStrings.optional = null,
    scope: RouteOptionsAccessScope = null,
    strategies: js.Array[java.lang.String] = null,
    strategy: java.lang.String = null
  ): RouteOptionsAccess = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (strategies != null) __obj.updateDynamic("strategies")(strategies)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy)
    __obj.asInstanceOf[RouteOptionsAccess]
  }
}

