package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacebookStatic extends js.Object {
  var AppEvents: js.Any = js.native
  var Canvas: js.Any = js.native
  var Event: FacebookStaticEvent = js.native
  var XFBML: js.Any = js.native
  def api[TResponse](path: java.lang.String, callback: js.Function1[/* response */ TResponse, scala.Unit]): scala.Unit = js.native
  def api[TParams /* <: js.Object */, TResponse](
    path: java.lang.String,
    params: TParams,
    callback: js.Function1[/* response */ TResponse, scala.Unit]
  ): scala.Unit = js.native
  @JSName("api")
  def api_delete[TParams /* <: js.Object */, TResponse](
    path: java.lang.String,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.delete,
    params: TParams,
    callback: js.Function1[/* response */ TResponse, scala.Unit]
  ): scala.Unit = js.native
  @JSName("api")
  def api_get[TParams /* <: js.Object */, TResponse](
    path: java.lang.String,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.get,
    params: TParams,
    callback: js.Function1[/* response */ TResponse, scala.Unit]
  ): scala.Unit = js.native
  @JSName("api")
  def api_post[TParams /* <: js.Object */, TResponse](
    path: java.lang.String,
    method: facebookDashJsDashSdkLib.facebookDashJsDashSdkLibStrings.post,
    params: TParams,
    callback: js.Function1[/* response */ TResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * The method FB.getAuthResponse() is a synchronous accessor for the current authResponse.
    * The synchronous nature of this method is what sets it apart from the other login methods.
    *
    * This method is similar in nature to FB.getLoginStatus(), but it returns just the authResponse object.
    */
  def getAuthResponse(): AuthResponse | scala.Null = js.native
  /**
    * FB.getLoginStatus() allows you to determine if a user is
    * logged in to Facebook and has authenticated your app.
    *
    * @param callback function to handle the response.
    * @param roundtrip force a roundtrip to Facebook - effectively refreshing the cache of the response object
    */
  def getLoginStatus(callback: js.Function1[/* response */ StatusResponse, scala.Unit]): scala.Unit = js.native
  def getLoginStatus(callback: js.Function1[/* response */ StatusResponse, scala.Unit], roundtrip: scala.Boolean): scala.Unit = js.native
  /**
    * The method FB.init() is used to initialize and setup the SDK.
    *
    * @param params params for the initialization.
    */
  def init(params: InitParams): scala.Unit = js.native
  /**
    * Use this function to log the user in
    *
    * Calling FB.login() results in the JS SDK attempting to open a popup window.
    * As such, this method should only be called after a user click event, otherwise
    * the popup window will be blocked by most browsers.
    *
    * @param options optional ILoginOption to add params such as scope.
    */
  def login(): scala.Unit = js.native
  /**
    * Use this function to log the user in
    *
    * Calling FB.login() results in the JS SDK attempting to open a popup window.
    * As such, this method should only be called after a user click event, otherwise
    * the popup window will be blocked by most browsers.
    *
    * @param callback function to handle the response.
    * @param options optional ILoginOption to add params such as scope.
    */
  def login(callback: js.Function1[/* response */ StatusResponse, scala.Unit]): scala.Unit = js.native
  def login(callback: js.Function1[/* response */ StatusResponse, scala.Unit], options: LoginOptions): scala.Unit = js.native
  def login(options: LoginOptions): scala.Unit = js.native
  /**
    * The method FB.logout() logs the user out of your site and, in some cases, Facebook.
    *
    * @param callback optional function to handle the response
    */
  def logout(): scala.Unit = js.native
  def logout(callback: js.Function1[/* response */ StatusResponse, scala.Unit]): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/pages/page-tab-dialog
    */
  def ui(params: AddPageTabDialogParams): scala.Unit = js.native
  def ui(params: AddPageTabDialogParams, callback: js.Function1[/* response */ DialogResponse, scala.Unit]): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/marketing-api/guides/collection#collection-ads-dialog
    */
  def ui(params: CollectionAdsDialogParams): scala.Unit = js.native
  def ui(
    params: CollectionAdsDialogParams,
    callback: js.Function1[/* response */ CollectionAdsDialogResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/marketing-api/guides/offer-ads/#create-offer-dialog
    */
  def ui(params: CreateOfferDialogParams): scala.Unit = js.native
  def ui(
    params: CreateOfferDialogParams,
    callback: js.Function1[/* response */ CreateOfferDialogResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/games/services/gamerequests
    */
  def ui(params: GameRequestDialogParams): scala.Unit = js.native
  def ui(
    params: GameRequestDialogParams,
    callback: js.Function1[/* response */ GameRequestDialogResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/marketing-api/guides/canvas-ads#canvas-ads-dialog
    */
  def ui(params: InstantExperiencesAdsDialogParams): scala.Unit = js.native
  def ui(
    params: InstantExperiencesAdsDialogParams,
    callback: js.Function1[/* response */ InstantExperiencesAdsDialogResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/marketing-api/guides/canvas-ads#canvas-preview-dialog
    */
  def ui(params: InstantExperiencesPreviewDialogParams): scala.Unit = js.native
  def ui(
    params: InstantExperiencesPreviewDialogParams,
    callback: js.Function1[/* response */ DialogResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/marketing-api/guides/lead-ads/create#create-leadgen-dialog
    */
  def ui(params: LeadgenDialogParams): scala.Unit = js.native
  def ui(
    params: LeadgenDialogParams,
    callback: js.Function1[/* response */ LeadgenDialogResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/videos/live-video/exploring-live#golivedialog
    */
  def ui(params: LiveDialogParams): scala.Unit = js.native
  def ui(params: LiveDialogParams, callback: js.Function1[/* response */ LiveDialogResponse, scala.Unit]): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/payments/reference/paydialog
    */
  def ui(params: PayDialogParams): scala.Unit = js.native
  def ui(params: PayDialogParams, callback: js.Function1[/* response */ PayDialogResponse, scala.Unit]): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/games_payments/payments_lite
    */
  def ui(params: PaymentsLiteDialogParams): scala.Unit = js.native
  def ui(
    params: PaymentsLiteDialogParams,
    callback: js.Function1[/* response */ PaymentsLiteDialogResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/sharing/reference/send-dialog
    */
  def ui(params: SendDialogParams): scala.Unit = js.native
  def ui(params: SendDialogParams, callback: js.Function1[/* response */ DialogResponse, scala.Unit]): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/sharing/reference/share-dialog
    */
  def ui(params: ShareDialogParams): scala.Unit = js.native
  def ui(params: ShareDialogParams, callback: js.Function1[/* response */ ShareDialogResponse, scala.Unit]): scala.Unit = js.native
  /**
    * @see https://developers.facebook.com/docs/sharing/reference/share-dialog
    */
  def ui(params: ShareOpenGraphDialogParams): scala.Unit = js.native
  def ui(
    params: ShareOpenGraphDialogParams,
    callback: js.Function1[/* response */ ShareOpenGraphDialogResponse, scala.Unit]
  ): scala.Unit = js.native
}

