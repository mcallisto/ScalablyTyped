package typings
package loginDashWithDashAmazonDashSdkDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("amazon")
@js.native
object amazonNs extends js.Object {
  @JSName("Login")
  @js.native
  object LoginNs extends js.Object {
    def authorize(options: loginDashWithDashAmazonDashSdkDashBrowserLib.AccessTokenAuthorizeOptions): loginDashWithDashAmazonDashSdkDashBrowserLib.AccessTokenRequest = js.native
    def authorize(
      options: loginDashWithDashAmazonDashSdkDashBrowserLib.AccessTokenAuthorizeOptions,
      next: java.lang.String
    ): loginDashWithDashAmazonDashSdkDashBrowserLib.AccessTokenRequest = js.native
    def authorize(
      options: loginDashWithDashAmazonDashSdkDashBrowserLib.AccessTokenAuthorizeOptions,
      next: loginDashWithDashAmazonDashSdkDashBrowserLib.NextCallback[loginDashWithDashAmazonDashSdkDashBrowserLib.AccessTokenRequest]
    ): loginDashWithDashAmazonDashSdkDashBrowserLib.AccessTokenRequest = js.native
    def authorize(options: loginDashWithDashAmazonDashSdkDashBrowserLib.CodeAuthorizeOptions): loginDashWithDashAmazonDashSdkDashBrowserLib.CodeRequest = js.native
    def authorize(options: loginDashWithDashAmazonDashSdkDashBrowserLib.CodeAuthorizeOptions, next: java.lang.String): loginDashWithDashAmazonDashSdkDashBrowserLib.CodeRequest = js.native
    def authorize(
      options: loginDashWithDashAmazonDashSdkDashBrowserLib.CodeAuthorizeOptions,
      next: loginDashWithDashAmazonDashSdkDashBrowserLib.NextCallback[loginDashWithDashAmazonDashSdkDashBrowserLib.CodeRequest]
    ): loginDashWithDashAmazonDashSdkDashBrowserLib.CodeRequest = js.native
    /**
      * Gets the client identifier that will be used to request authorization.
      * You must call `setClientId` before calling this function.
      */
    def getClientId(): java.lang.String = js.native
    /**
      * Logs out the current user after a call to `authorize`.
      */
    def logout(): scala.Unit = js.native
    /**
      * Retrieves the customer profile and passes it to a callback function.
      * Uses an access token provided by `authorize`.
      * @param accessToken An access token. If this parameter is omitted, retrieveProfile will call authorize, requesting the profile scope.
      * @param callback Called with the profile data or an error string
      */
    def retrieveProfile(accessToken: java.lang.String): scala.Unit = js.native
    def retrieveProfile(
      accessToken: java.lang.String,
      callback: loginDashWithDashAmazonDashSdkDashBrowserLib.RetrieveProfileCallback
    ): scala.Unit = js.native
    /**
      * Retrieves the customer profile and passes it to a callback function.
      * If no `access_token` is provided, this function will call `authorize`
      * with a `profile` scope.
      * @param callback Called with the profile data or an error string
      */
    def retrieveProfile(callback: loginDashWithDashAmazonDashSdkDashBrowserLib.RetrieveProfileCallback): scala.Unit = js.native
    /**
      * Sets the client identifier that will be used to request authorization.
      * You must call this function before calling `authorize`.
      */
    def setClientId(clientId: java.lang.String): scala.Unit = js.native
    /**
      * Determines whether or not Login with Amazon should use the
      * Amazon Pay sandbox for requests. To use the Amazon Pay sandbox,
      * call `setSandboxMode(true)` before calling `authorize`.
      */
    def setSandboxMode(sandboxMode: scala.Boolean): scala.Unit = js.native
    /**
      * Sets the domain to use for saving cookies.
      * The domain must match the origin of the current page.
      * Defaults to the full domain for the current page. For example, if
      * you have two pages using the Login with Amazon SDK for JavaScript,
      * `site1.example.com` and `site2.example.com`, you would set the site
      * domain to `example.com` in the header of each site.
      * This will ensure that the cookies on both sites have access
      * to the same cached tokens.
      */
    def setSiteDomain(siteDomain: java.lang.String): scala.Unit = js.native
    /**
      * Determines whether or not Login with Amazon should use access tokens
      * written to the `amazon_Login_accessToken` cookie. You can use this
      * value to share an access token with another page. Access tokens
      * will still only grant access to the registered account for whom they
      * were created. When `true`, the Login with Amazon SDK for JavaScript
      * will check this cookie for cached tokens, and store newly granted
      * tokens in that cookie.
      */
    def setUseCookie(useCookie: scala.Boolean): scala.Unit = js.native
  }
  
}

