package typings
package googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library", "OAuth2Client")
@js.native
/**
  * Handles OAuth2 flow for Google APIs.
  *
  * @param clientId The authentication client ID.
  * @param clientSecret The authentication client secret.
  * @param redirectUri The URI to redirect to after completing the auth
  * request.
  * @param opts optional options for overriding the given parameters.
  * @constructor
  */
class OAuth2Client ()
  extends googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2Client {
  def this(clientId: java.lang.String) = this()
  def this(options: googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.OAuth2ClientOptions) = this()
  def this(clientId: java.lang.String, clientSecret: java.lang.String) = this()
  def this(clientId: java.lang.String, clientSecret: java.lang.String, redirectUri: java.lang.String) = this()
}

/* static members */
@JSImport("google-auth-library", "OAuth2Client")
@js.native
object OAuth2Client extends js.Object {
  /**
    * Clock skew - five minutes in seconds
    */
  val CLOCK_SKEW_SECS_ : js.Any = js.native
  /**
    * The base URL for auth endpoints.
    */
  val GOOGLE_OAUTH2_AUTH_BASE_URL_ : js.Any = js.native
  /**
    * Google Sign on certificates in JWK format.
    */
  val GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_ : js.Any = js.native
  /**
    * Google Sign on certificates in PEM format.
    */
  val GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_ : js.Any = js.native
  /**
    * The base endpoint to revoke tokens.
    */
  val GOOGLE_OAUTH2_REVOKE_URL_ : js.Any = js.native
  /**
    * The base endpoint for token retrieval.
    */
  val GOOGLE_OAUTH2_TOKEN_URL_ : js.Any = js.native
  val GOOGLE_TOKEN_INFO_URL: googleDashAuthDashLibraryLib.googleDashAuthDashLibraryLibStrings.`https://oauth2DOTgoogleapisDOTcom/tokeninfo` = js.native
  /**
    * The allowed oauth token issuers.
    */
  val ISSUERS_ : js.Any = js.native
  /**
    * Max Token Lifetime is one day in seconds
    */
  val MAX_TOKEN_LIFETIME_SECS_ : js.Any = js.native
  /**
    * Generates an URL to revoke the given token.
    * @param token The existing token to be revoked.
    */
  def getRevokeTokenUrl(token: java.lang.String): java.lang.String = js.native
}

