package typings
package atUirouterCoreLib.libStateInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateDeclaration
  extends _StateDeclaration
     with _StateOrName {
  /**
    * Gets the internal State object API
    *
    * Gets the *internal API* for a registered state.
    *
    * Note: the internal [[StateObject]] API is subject to change without notice
    */
  @JSName("$$state")
  var $$state: js.UndefOr[js.Function0[atUirouterCoreLib.libStateStateObjectMod.StateObject]] = js.undefined
  /**
    * Abstract state indicator
    *
    * An abstract state can never be directly activated.
    * Use an abstract state to provide inherited properties (url, resolve, data, etc) to children states.
    */
  var `abstract`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An inherited property to store state data
    *
    * This is a spot for you to store inherited state metadata.
    * Child states' `data` object will prototypally inherit from their parent state.
    *
    * This is a good spot to put metadata such as `requiresAuth`.
    *
    * Note: because prototypal inheritance is used, changes to parent `data` objects reflect in the child `data` objects.
    * Care should be taken if you are using `hasOwnProperty` on the `data` object.
    * Properties from parent objects will return false for `hasOwnProperty`.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Marks all the state's parameters as `dynamic`.
    *
    * All parameters on the state will use this value for `dynamic` as a default.
    * Individual parameters may override this default using [[ParamDeclaration.dynamic]] in the [[params]] block.
    *
    * Note: this value overrides the `dynamic` value on a custom parameter type ([[ParamTypeDefinition.dynamic]]).
    */
  var dynamic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A function used to lazy load code
    *
    * The `lazyLoad` function is invoked before the state is activated.
    * The transition waits while the code is loading.
    *
    * The function should load the code that is required to activate the state.
    * For example, it may load a component class, or some service code.
    * The function must return a promise which resolves when loading is complete.
    *
    * For example, this code lazy loads a service before the `abc` state is activated:
    *
    * ```
    * .state('abc', {
    *   lazyLoad: (transition, state) => System.import('./abcService')
    * }
    * ```
    *
    * The `abcService` file is imported and loaded
    * (it is assumed that the `abcService` file knows how to register itself as a service).
    *
    * #### Lifecycle
    *
    * - The `lazyLoad` function is invoked if a transition is going to enter the state.
    * - The function is invoked before the transition starts (using an `onBefore` transition hook).
    * - The function is only invoked once; while the `lazyLoad` function is loading code, it will not be invoked again.
    *   For example, if the user double clicks a ui-sref, `lazyLoad` is only invoked once even though there were two transition attempts.
    *   Instead, the existing lazy load promise is re-used.
    * - When the promise resolves successfully, the `lazyLoad` property is deleted from the state declaration.
    * - If the promise resolves to a [[LazyLoadResult]] which has an array of `states`, those states are registered.
    * - The original transition is retried (this time without the `lazyLoad` property present).
    *
    * - If the `lazyLoad` function fails, then the transition also fails.
    *   The failed transition (and the `lazyLoad` function) could potentially be retried by the user.
    *
    * ### Lazy loading state definitions (Future States)
    *
    * State definitions can also be lazy loaded.
    * This might be desirable when building large, multi-module applications.
    *
    * To lazy load state definitions, a Future State should be registered as a placeholder.
    * When the state definitions are lazy loaded, the Future State is deregistered.
    *
    * A future state can act as a placeholder for a single state, or for an entire module of states and substates.
    * A future state should have:
    *
    * - A `name` which ends in `.**`.
    *   A future state's `name` property acts as a wildcard [[Glob]].
    *   It matches any state name that starts with the `name` (including child states that are not yet loaded).
    * - A `url` prefix.
    *   A future state's `url` property acts as a wildcard.
    *   UI-Router matches all paths that begin with the `url`.
    *   It effectively appends `.*` to the internal regular expression.
    *   When the prefix matches, the future state will begin loading.
    * - A `lazyLoad` function.
    *   This function should should return a Promise to lazy load the code for one or more [[StateDeclaration]] objects.
    *   It should return a [[LazyLoadResult]].
    *   Generally, one of the lazy loaded states should have the same name as the future state.
    *   The new state will then **replace the future state placeholder** in the registry.
    *
    * ### Additional resources
    *
    * For in depth information on lazy loading and Future States, see the [Lazy Loading Guide](https://ui-router.github.io/guides/lazyload).
    *
    * #### Example: states.js
    * ```js
    *
    * // This child state is a lazy loaded future state
    * // The `lazyLoad` function loads the final state definition
    * {
    *   name: 'parent.**',
    *   url: '/parent',
    *   lazyLoad: () => System.import('./lazy.states.js')
    * }
    * ```
    *
    * #### Example: lazy.states.js
    *
    * This file is lazy loaded.  It exports an array of states.
    *
    * ```js
    * import {ChildComponent} from "./child.component.js";
    * import {ParentComponent} from "./parent.component.js";
    *
    * // This fully defined state replaces the future state
    * let parentState = {
    *   // the name should match the future state
    *   name: 'parent',
    *   url: '/parent/:parentId',
    *   component: ParentComponent,
    *   resolve: {
    *     parentData: ($transition$, ParentService) =>
    *         ParentService.get($transition$.params().parentId)
    *   }
    * }
    *
    * let childState = {
    *   name: 'parent.child',
    *   url: '/child/:childId',
    *   params: {
    *     childId: "default"
    *   },
    *   resolve: {
    *     childData: ($transition$, ChildService) =>
    *         ChildService.get($transition$.params().childId)
    *   }
    * };
    *
    * // This array of states will be registered by the lazyLoad hook
    * let lazyLoadResults = {
    *   states: [ parentState, childState ]
    * };
    *
    * export default lazyLoadResults;
    * ```
    *
    * @param transition the [[Transition]] that is activating the future state
    * @param state the [[StateDeclaration]] that the `lazyLoad` function is declared on
    * @return a Promise to load the states.
    *         Optionally, if the promise resolves to a [[LazyLoadResult]],
    *         the states will be registered with the [[StateRegistry]].
    */
  var lazyLoad: js.UndefOr[
    js.Function2[
      /* transition */ atUirouterCoreLib.libTransitionTransitionMod.Transition, 
      /* state */ StateDeclaration, 
      js.Promise[LazyLoadResult]
    ]
  ] = js.undefined
  /**
    * The state name (required)
    *
    * A unique state name, e.g. `"home"`, `"about"`, `"contacts"`.
    * To create a parent/child state use a dot, e.g. `"about.sales"`, `"home.newest"`.
    *
    * Note: [State] objects require unique names.
    * The name is used like an id.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Transition Hook called with the state is being entered.  See: [[IHookRegistry.onEnter]]
    *
    * #### Example:
    * ```js
    * .state({
    *   name: 'mystate',
    *   onEnter: function(trans, state) {
    *     console.log("Entering " + state.name);
    *   }
    * });
    * ```
    *
    * Note: The above `onEnter` on the state declaration is effectively sugar for:
    *
    * ```js
    * transitionService.onEnter({ entering: 'mystate' }, function(trans, state) {
    *   console.log("Entering " + state.name);
    * });
    * ```
    */
  var onEnter: js.UndefOr[atUirouterCoreLib.libTransitionInterfaceMod.TransitionStateHookFn] = js.undefined
  /**
    * A Transition Hook called with the state is being exited. See: [[IHookRegistry.onExit]]
    *
    * #### Example:
    * ```js
    * .state({
    *   name: 'mystate',
    *   onExit: function(trans, state) {
    *     console.log("Leaving " + state.name);
    *   }
    * });
    * ```
    *
    * Note: The above `onRetain` on the state declaration is effectively sugar for:
    *
    * ```js
    * transitionService.onExit({ exiting: 'mystate' }, function(trans, state) {
    *   console.log("Leaving " + state.name);
    * });
    * ```
    */
  var onExit: js.UndefOr[atUirouterCoreLib.libTransitionInterfaceMod.TransitionStateHookFn] = js.undefined
  /**
    * A [[TransitionStateHookFn]] called with the state is being retained/kept. See: [[IHookRegistry.onRetain]]
    *
    * #### Example:
    * ```js
    * .state({
    *   name: 'mystate',
    *   onRetain: function(trans, state) {
    *     console.log(state.name + " is still active!");
    *   }
    * });
    * ```
    *
    * Note: The above `onRetain` on the state declaration is effectively sugar for:
    *
    * ```js
    * transitionService.onRetain({ retained: 'mystate' }, function(trans, state) {
    *   console.log(state.name + " is still active!");
    * });
    * ```
    */
  var onRetain: js.UndefOr[atUirouterCoreLib.libTransitionInterfaceMod.TransitionStateHookFn] = js.undefined
  /**
    * Params configuration
    *
    * An object which optionally configures parameters declared in the url, or defines additional non-url
    * parameters. For each parameter being configured, add a [[ParamDeclaration]] keyed to the name of the parameter.
    *
    * #### Example:
    * ```js
    * params: {
    *   param1: {
    *    type: "int",
    *    array: true,
    *    value: []
    *   },
    *   param2: {
    *     value: "index"
    *   }
    * }
    * ```
    */
  var params: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[atUirouterCoreLib.libParamsInterfaceMod.ParamDeclaration | js.Any]
  ] = js.undefined
  /**
    * The parent state
    *
    * Normally, a state's parent is implied from the state's [[name]], e.g., `"parentstate.childstate"`.
    *
    * Alternatively, you can explicitly set the parent state using this property.
    * This allows shorter state names, e.g., `<a ui-sref="childstate">Child</a>`
    * instead of `<a ui-sref="parentstate.childstate">Child</a>
    *
    * When using this property, the state's name should not have any dots in it.
    *
    * #### Example:
    * ```js
    * var parentstate = {
    *   name: 'parentstate'
    * }
    * var childstate = {
    *   name: 'childstate',
    *   parent: 'parentstate'
    *   // or use a JS var which is the parent StateDeclaration, i.e.:
    *   // parent: parentstate
    * }
    * ```
    */
  var parent: js.UndefOr[java.lang.String | StateDeclaration] = js.undefined
  /**
    * Synchronously or asynchronously redirects Transitions to a different state/params
    *
    * If this property is defined, a Transition directly to this state will be redirected based on the property's value.
    *
    * - If the value is a `string`, the Transition is redirected to the state named by the string.
    *
    * - If the property is an object with a `state` and/or `params` property,
    *   the Transition is redirected to the named `state` and/or `params`.
    *
    * - If the value is a [[TargetState]] the Transition is redirected to the `TargetState`
    *
    * - If the property is a function:
    *   - The function is called with the current [[Transition]]
    *   - The return value is processed using the previously mentioned rules.
    *   - If the return value is a promise, the promise is waited for, then the resolved async value is processed using the same rules.
    *
    * Note: `redirectTo` is processed as an `onStart` hook, before `LAZY` resolves.
    * If your redirect function relies on resolve data, get the [[Transition.injector]] and get a
    * promise for the resolve data using [[UIInjector.getAsync]].
    *
    * #### Example:
    * ```js
    * // a string
    * .state('A', {
    *   redirectTo: 'A.B'
    * })
    *
    * // a {state, params} object
    * .state('C', {
    *   redirectTo: { state: 'C.D', params: { foo: 'index' } }
    * })
    *
    * // a fn
    * .state('E', {
    *   redirectTo: () => "A"
    * })
    *
    * // a fn conditionally returning a {state, params}
    * .state('F', {
    *   redirectTo: (trans) => {
    *     if (trans.params().foo < 10)
    *       return { state: 'F', params: { foo: 10 } };
    *   }
    * })
    *
    * // a fn returning a promise for a redirect
    * .state('G', {
    *   redirectTo: (trans) => {
    *     let svc = trans.injector().get('SomeAsyncService')
    *     let promise = svc.getAsyncRedirectTo(trans.params.foo);
    *     return promise;
    *   }
    * })
    *
    * // a fn that fetches resolve data
    * .state('G', {
    *   redirectTo: (trans) => {
    *     // getAsync tells the resolve to load
    *     let resolvePromise = trans.injector().getAsync('SomeResolve')
    *     return resolvePromise.then(resolveData => resolveData === 'login' ? 'login' : null);
    *   }
    * })
    * ```
    */
  var redirectTo: js.UndefOr[
    RedirectToResult | (js.Function1[
      /* transition */ atUirouterCoreLib.libTransitionTransitionMod.Transition, 
      js.Promise[RedirectToResult] | RedirectToResult
    ])
  ] = js.undefined
  /**
    * Marks all query parameters as [[ParamDeclaration.dynamic]]
    *
    * @deprecated use either [[dynamic]] or [[ParamDeclaration.dynamic]]
    */
  var reloadOnSearch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Resolve - a mechanism to asynchronously fetch data, participating in the Transition lifecycle
    *
    * The `resolve:` property defines data (or other dependencies) to be fetched asynchronously when the state is being entered.
    * After the data is fetched, it may be used in views, transition hooks or other resolves that belong to this state.
    * The data may also be used in any views or resolves that belong to nested states.
    *
    * ### As an array
    *
    * Each array element should be a [[ResolvableLiteral]] object.
    *
    * #### Example:
    * The `user` resolve injects the current `Transition` and the `UserService` (using its token, which is a string).
    * The [[ResolvableLiteral.resolvePolicy]] sets how the resolve is processed.
    * The `user` data, fetched asynchronously, can then be used in a view.
    * ```js
    * var state = {
    *   name: 'user',
    *   url: '/user/:userId
    *   resolve: [
    *     {
    *       token: 'user',
    *       policy: { when: 'EAGER' },
    *       deps: ['UserService', Transition],
    *       resolveFn: (userSvc, trans) => userSvc.fetchUser(trans.params().userId) },
    *     }
    *   ]
    * }
    * ```
    *
    * Note: an Angular 2 style [`useFactory` provider literal](https://angular.io/docs/ts/latest/cookbook/dependency-injection.html#!#provide)
    * may also be used.  See [[ProviderLike]].
    * #### Example:
    * ```
    * resolve: [
    *   { provide: 'token', useFactory: (http) => http.get('/'), deps: [ Http ] },
    * ]
    * ```
    *
    * ### As an object
    *
    * The `resolve` property may be an object where:
    * - Each key (string) is the name of the dependency.
    * - Each value (function) is an injectable function which returns the dependency, or a promise for the dependency.
    *
    * This style is based on AngularJS injectable functions, but can be used with any UI-Router implementation.
    * If your code will be minified, the function should be ["annotated" in the AngularJS manner](https://docs.angularjs.org/guide/di#dependency-annotation).
    *
    * #### AngularJS Example:
    * ```js
    * resolve: {
    *   // If you inject `myStateDependency` into a controller, you'll get "abc"
    *   myStateDependency: function() {
    *     return "abc";
    *   },
    *   // Dependencies are annotated in "Inline Array Annotation"
    *   myAsyncData: ['$http', '$transition$' function($http, $transition$) {
    *     // Return a promise (async) for the data
    *     return $http.get("/foos/" + $transition$.params().foo);
    *   }]
    * }
    * ```
    *
    * Note: You cannot specify a policy for each Resolvable, nor can you use non-string
    * tokens when using the object style `resolve:` block.
    *
    * ### Lifecycle
    *
    * Since a resolve function can return a promise, the router will delay entering the state until the promises are ready.
    * If any of the promises are rejected, the Transition is aborted with an Error.
    *
    * By default, resolves for a state are fetched just before that state is entered.
    * Note that only states which are being *entered* during the `Transition` have their resolves fetched.
    * States that are "retained" do not have their resolves re-fetched.
    *
    * If you are currently in a parent state `parent` and are transitioning to a child state `parent.child`, the
    * previously resolved data for state `parent` can be injected into `parent.child` without delay.
    *
    * Any resolved data for `parent.child` is retained until `parent.child` is exited, e.g., by transitioning back to the `parent` state.
    *
    * Because of this scoping and lifecycle, resolves are a great place to fetch your application's primary data.
    *
    * ### Injecting resolves into other things
    *
    * During a transition, Resolve data can be injected into:
    *
    * - Views (the components which fill a `ui-view` tag)
    * - Transition Hooks
    * - Other resolves (a resolve may depend on asynchronous data from a different resolve)
    *
    * ### Injecting other things into resolves
    *
    * Resolve functions usually have dependencies on some other API(s).
    * The dependencies are usually declared and injected into the resolve function.
    * A common pattern is to inject a custom service such as `UserService`.
    * The resolve then delegates to a service method, such as `UserService.list()`;
    *
    * #### Special injectable tokens
    *
    * - `UIRouter`: The [[UIRouter]] instance which has references to all the UI-Router services.
    * - `Transition`: The current [[Transition]] object; information and API about the current transition, such as
    *    "to" and "from" State Parameters and transition options.
    * - `'$transition$'`: A string alias for the `Transition` injectable
    * - `'$state$'`: For `onEnter`/`onExit`/`onRetain`, the state being entered/exited/retained.
    * - Other resolve tokens: A resolve can depend on another resolve, either from the same state, or from any parent state.
    *
    * #### Example:
    * ```js
    * // Injecting a resolve into another resolve
    * resolve: [
    *   // Define a resolve 'allusers' which delegates to the UserService.list()
    *   // which returns a promise (async) for all the users
    *   { provide: 'allusers', useFactory: (UserService) => UserService.list(), deps: [UserService] },
    *
    *   // Define a resolve 'user' which depends on the allusers resolve.
    *   // This resolve function is not called until 'allusers' is ready.
    *   { provide: 'user', (allusers, trans) => _.find(allusers, trans.params().userId, deps: ['allusers', Transition] }
    * }
    * ```
    */
  var resolve: js.UndefOr[
    js.Array[ResolveTypes] | org.scalablytyped.runtime.StringDictionary[atUirouterCoreLib.libCommonCommonMod.IInjectable]
  ] = js.undefined
  /**
    * Sets the resolve policy defaults for all resolves on this state
    *
    * This should be an [[ResolvePolicy]] object.
    *
    * It can contain the following optional keys/values:
    *
    * - `when`: (optional) defines when the resolve is fetched. Accepted values: "LAZY" or "EAGER"
    * - `async`: (optional) if the transition waits for the resolve. Accepted values: "WAIT", "NOWAIT", "RXWAIT"
    *
    * See [[ResolvePolicy]] for more details.
    */
  var resolvePolicy: js.UndefOr[atUirouterCoreLib.libResolveInterfaceMod.ResolvePolicy] = js.undefined
  /**
    * The url fragment for the state
    *
    * A URL fragment (with optional parameters) which is used to match the browser location with this state.
    *
    * This fragment will be appended to the parent state's URL in order to build up the overall URL for this state.
    * See [[UrlMatcher]] for details on acceptable patterns.
    *
    * @examples
    * ```js
    *
    * url: "/home"
    * // Define a parameter named 'userid'
    * url: "/users/:userid"
    * // param 'bookid' has a custom regexp
    * url: "/books/{bookid:[a-zA-Z_-]}"
    * // param 'categoryid' is of type 'int'
    * url: "/books/{categoryid:int}"
    * // two parameters for this state
    * url: "/books/{publishername:string}/{categoryid:int}"
    * // Query parameters
    * url: "/messages?before&after"
    * // Query parameters of type 'date'
    * url: "/messages?{before:date}&{after:date}"
    * // Path and query parameters
    * url: "/messages/:mailboxid?{before:date}&{after:date}"
    * ```
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Named views
    *
    * An optional object which defines multiple views, or explicitly targets specific named ui-views.
    *
    * - What is a view config
    * - What is a ui-view
    * - Shorthand controller/template
    * - Incompatible with ^
    *
    *  Examples:
    *
    *  Targets three named ui-views in the parent state's template
    *
    * #### Example:
    * ```js
    * views: {
    *   header: {
    *     controller: "headerCtrl",
    *     templateUrl: "header.html"
    *   }, body: {
    *     controller: "bodyCtrl",
    *     templateUrl: "body.html"
    *   }, footer: {
    *     controller: "footCtrl",
    *     templateUrl: "footer.html"
    *   }
    * }
    * ```
    *
    * @example
    * ```js
    * // Targets named ui-view="header" from ancestor state 'top''s template, and
    * // named `ui-view="body" from parent state's template.
    * views: {
    *   'header@top': {
    *     controller: "msgHeaderCtrl",
    *     templateUrl: "msgHeader.html"
    *   }, 'body': {
    *     controller: "messagesCtrl",
    *     templateUrl: "messages.html"
    *   }
    * }
    * ```
    */
  var views: js.UndefOr[org.scalablytyped.runtime.StringDictionary[_ViewDeclaration]] = js.undefined
}

object StateDeclaration {
  @scala.inline
  def apply(
    $$state: () => atUirouterCoreLib.libStateStateObjectMod.StateObject = null,
    `abstract`: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    dynamic: js.UndefOr[scala.Boolean] = js.undefined,
    lazyLoad: (/* transition */ atUirouterCoreLib.libTransitionTransitionMod.Transition, /* state */ StateDeclaration) => js.Promise[LazyLoadResult] = null,
    name: java.lang.String = null,
    onEnter: atUirouterCoreLib.libTransitionInterfaceMod.TransitionStateHookFn = null,
    onExit: atUirouterCoreLib.libTransitionInterfaceMod.TransitionStateHookFn = null,
    onRetain: atUirouterCoreLib.libTransitionInterfaceMod.TransitionStateHookFn = null,
    params: org.scalablytyped.runtime.StringDictionary[atUirouterCoreLib.libParamsInterfaceMod.ParamDeclaration | js.Any] = null,
    parent: java.lang.String | StateDeclaration = null,
    redirectTo: RedirectToResult | (js.Function1[
      /* transition */ atUirouterCoreLib.libTransitionTransitionMod.Transition, 
      js.Promise[RedirectToResult] | RedirectToResult
    ]) = null,
    reloadOnSearch: js.UndefOr[scala.Boolean] = js.undefined,
    resolve: js.Array[ResolveTypes] | org.scalablytyped.runtime.StringDictionary[atUirouterCoreLib.libCommonCommonMod.IInjectable] = null,
    resolvePolicy: atUirouterCoreLib.libResolveInterfaceMod.ResolvePolicy = null,
    url: java.lang.String = null,
    views: org.scalablytyped.runtime.StringDictionary[_ViewDeclaration] = null
  ): StateDeclaration = {
    val __obj = js.Dynamic.literal()
    if ($$state != null) __obj.updateDynamic("$$state")(js.Any.fromFunction0($$state))
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic)
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(js.Any.fromFunction2(lazyLoad))
    if (name != null) __obj.updateDynamic("name")(name)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onRetain != null) __obj.updateDynamic("onRetain")(onRetain)
    if (params != null) __obj.updateDynamic("params")(params)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadOnSearch)) __obj.updateDynamic("reloadOnSearch")(reloadOnSearch)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (resolvePolicy != null) __obj.updateDynamic("resolvePolicy")(resolvePolicy)
    if (url != null) __obj.updateDynamic("url")(url)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[StateDeclaration]
  }
}

