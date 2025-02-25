package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor")
@js.native
object ^ extends js.Object {
  /** User **/
  /** Error **/
  var Error: ErrorStatic = js.native
  var TypedError: TypedErrorStatic = js.native
  /** Global props **/
  var isClient: scala.Boolean = js.native
  var isCordova: scala.Boolean = js.native
  /** Global props **/
  var isDevelopment: scala.Boolean = js.native
  var isProduction: scala.Boolean = js.native
  var isServer: scala.Boolean = js.native
  var isTest: scala.Boolean = js.native
  var release: java.lang.String = js.native
  var settings: Settings = js.native
  var users: meteorLib.MongoNs.Collection[User] = js.native
  def _debug(args: js.Any*): scala.Unit = js.native
  @JSName("apply")
  def apply[Result /* <: meteorLib.EJSONable | (js.Array[meteorLib.EJSONable | meteorLib.EJSONableProperty]) | meteorLib.EJSONableProperty */](name: java.lang.String, args: js.Array[meteorLib.EJSONable | meteorLib.EJSONableProperty]): js.Any = js.native
  @JSName("apply")
  def apply[Result /* <: meteorLib.EJSONable | (js.Array[meteorLib.EJSONable | meteorLib.EJSONableProperty]) | meteorLib.EJSONableProperty */](
    name: java.lang.String,
    args: js.Array[meteorLib.EJSONable | meteorLib.EJSONableProperty],
    options: meteorLib.Anon_Error[Result]
  ): js.Any = js.native
  @JSName("apply")
  def apply[Result /* <: meteorLib.EJSONable | (js.Array[meteorLib.EJSONable | meteorLib.EJSONableProperty]) | meteorLib.EJSONableProperty */](
    name: java.lang.String,
    args: js.Array[meteorLib.EJSONable | meteorLib.EJSONableProperty],
    options: meteorLib.Anon_Error[Result],
    asyncCallback: js.Function2[
      /* error */ js.UndefOr[meteorLib.global_Error | Error], 
      /* result */ js.UndefOr[Result], 
      scala.Unit
    ]
  ): js.Any = js.native
  def bindEnvironment(func: js.Function): js.Any = js.native
  def call(name: java.lang.String, args: js.Any*): js.Any = js.native
  def clearInterval(id: scala.Double): scala.Unit = js.native
  def clearTimeout(id: scala.Double): scala.Unit = js.native
  def defer(func: js.Function): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def loggingIn(): scala.Boolean = js.native
  def loginWith[ExternalService](): scala.Unit = js.native
  def loginWith[ExternalService](options: meteorLib.Anon_LoginStyle): scala.Unit = js.native
  def loginWith[ExternalService](
    options: meteorLib.Anon_LoginStyle,
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def loginWithFacebook(): scala.Unit = js.native
  def loginWithFacebook(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithFacebook(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def loginWithGithub(): scala.Unit = js.native
  def loginWithGithub(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithGithub(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def loginWithGoogle(): scala.Unit = js.native
  def loginWithGoogle(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithGoogle(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def loginWithMeetup(): scala.Unit = js.native
  def loginWithMeetup(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithMeetup(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def loginWithMeteorDeveloperAccount(): scala.Unit = js.native
  def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithMeteorDeveloperAccount(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def loginWithPassword(user: java.lang.String, password: java.lang.String): scala.Unit = js.native
  def loginWithPassword(
    user: java.lang.String,
    password: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def loginWithPassword(user: js.Object, password: java.lang.String): scala.Unit = js.native
  def loginWithPassword(
    user: js.Object,
    password: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def loginWithToken(token: java.lang.String): scala.Unit = js.native
  def loginWithToken(
    token: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def loginWithTwitter(): scala.Unit = js.native
  def loginWithTwitter(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithTwitter(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def loginWithWeibo(): scala.Unit = js.native
  def loginWithWeibo(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithWeibo(
    options: LoginWithExternalServiceOptions,
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def logout(): scala.Unit = js.native
  def logout(
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def logoutOtherClients(): scala.Unit = js.native
  def logoutOtherClients(
    callback: js.Function1[/* error */ js.UndefOr[meteorLib.global_Error | Error | TypedError], scala.Unit]
  ): scala.Unit = js.native
  def methods(
    methods: org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ MethodThisType, /* repeated */ js.Any, _]]
  ): scala.Unit = js.native
  def onConnection(callback: js.Function): scala.Unit = js.native
  /** Connection **/
  def publish(
    name: java.lang.String,
    func: js.ThisFunction1[/* this */ meteorLib.Subscription, /* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /** Event **/
  /** Connection **/
  def reconnect(): scala.Unit = js.native
  /** Url **/
  /** Timeout **/
  def setInterval(func: js.Function, delay: scala.Double): scala.Double = js.native
  def setTimeout(func: js.Function, delay: scala.Double): scala.Double = js.native
  /** Timeout **/
  /** utils **/
  def startup(func: js.Function): scala.Unit = js.native
  /** Connection **/
  /** Status **/
  def status(): meteorLib.DDPNs.DDPStatus = js.native
  /** Status **/
  /** Pub/Sub **/
  def subscribe(name: java.lang.String, args: js.Any*): SubscriptionHandle = js.native
  def user(): User | scala.Null = js.native
  def userId(): java.lang.String | scala.Null = js.native
  def wrapAsync(func: js.Function): js.Any = js.native
  def wrapAsync(func: js.Function, context: js.Object): js.Any = js.native
}

