package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A user account.
  */
@js.native
trait User extends UserInfo {
  var emailVerified: scala.Boolean = js.native
  var isAnonymous: scala.Boolean = js.native
  var metadata: firebaseLib.firebaseMod.authNs.UserMetadata = js.native
  var providerData: js.Array[UserInfo | scala.Null] = js.native
  var refreshToken: java.lang.String = js.native
  /**
    * Deletes and signs out the user.
    *
    * <b>Important:</b> this is a security-sensitive operation that requires the
    * user to have recently signed in. If this requirement isn't met, ask the user
    * to authenticate again and then call
    * {@link firebase.User.reauthenticateWithCredential}.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/requires-recent-login</dt>
    * <dd>Thrown if the user's last sign-in time does not meet the security
    *     threshold. Use {@link firebase.User.reauthenticateWithCredential} to
    *     resolve. This does not apply if the user is anonymous.</dd>
    * </dl>
    */
  def delete(): js.Promise[scala.Unit] = js.native
  /**
    * Returns a JSON Web Token (JWT) used to identify the user to a Firebase
    * service.
    *
    * Returns the current token if it has not expired. Otherwise, this will
    * refresh the token and return a new one.
    *
    * @param forceRefresh Force refresh regardless of token
    *     expiration.
    */
  def getIdToken(): js.Promise[java.lang.String] = js.native
  def getIdToken(forceRefresh: scala.Boolean): js.Promise[java.lang.String] = js.native
  def getIdTokenResult(): js.Promise[firebaseLib.firebaseMod.authNs.IdTokenResult] = js.native
  def getIdTokenResult(forceRefresh: scala.Boolean): js.Promise[firebaseLib.firebaseMod.authNs.IdTokenResult] = js.native
  /**
    * Links the user account with the given credentials and returns any available
    * additional user information, such as user name.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/provider-already-linked</dt>
    * <dd>Thrown if the provider has already been linked to the user. This error is
    *     thrown even if this is not the same provider's account that is currently
    *     linked to the user.</dd>
    * <dt>auth/invalid-credential</dt>
    * <dd>Thrown if the provider's credential is not valid. This can happen if it
    *     has already expired when calling link, or if it used invalid token(s).
    *     See the Firebase documentation for your provider, and make sure you pass
    *     in the correct parameters to the credential method.</dd>
    * <dt>auth/credential-already-in-use</dt>
    * <dd>Thrown if the account corresponding to the credential already exists
    *     among your users, or is already linked to a Firebase User.
    *     For example, this error could be thrown if you are upgrading an anonymous
    *     user to a Google user by linking a Google credential to it and the Google
    *     credential used is already associated with an existing Firebase Google
    *     user.
    *     The fields <code>error.email</code>, <code>error.phoneNumber</code>, and
    *     <code>error.credential</code> ({@link firebase.auth.AuthCredential})
    *     may be provided, depending on the type of credential. You can recover
    *     from this error by signing in with <code>error.credential</code> directly
    *     via {@link firebase.auth.Auth.signInWithCredential}.</dd>
    * <dt>auth/email-already-in-use</dt>
    * <dd>Thrown if the email corresponding to the credential already exists
    *     among your users. When thrown while linking a credential to an existing
    *     user, an <code>error.email</code> and <code>error.credential</code>
    *     ({@link firebase.auth.AuthCredential}) fields are also provided.
    *     You have to link the credential to the existing user with that email if
    *     you wish to continue signing in with that credential. To do so, call
    *     {@link firebase.auth.Auth.fetchSignInMethodsForEmail}, sign in to
    *     <code>error.email</code> via one of the providers returned and then
    *     {@link firebase.User.linkWithCredential} the original credential to that
    *     newly signed in user.</dd>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if you have not enabled the provider in the Firebase Console. Go
    *     to the Firebase Console for your project, in the Auth section and the
    *     <strong>Sign in Method</strong> tab and configure the provider.</dd>
    * <dt>auth/invalid-email</dt>
    * <dd>Thrown if the email used in a
    *     {@link firebase.auth.EmailAuthProvider.credential} is invalid.</dd>
    * <dt>auth/wrong-password</dt>
    * <dd>Thrown if the password used in a
    *     {@link firebase.auth.EmailAuthProvider.credential} is not correct or
    *     when the user associated with the email does not have a password.</dd>
    * <dt>auth/invalid-verification-code</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential} and the verification
    *     code of the credential is not valid.</dd>
    * <dt>auth/invalid-verification-id</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential}  and the verification
    *     ID of the credential is not valid.</dd>
    * </dl>
    *
    * @deprecated  This method is deprecated. Use
    * {@link firebase.User.linkWithCredential} instead.
    *
    * @param credential The auth credential.
    */
  def linkAndRetrieveDataWithCredential(credential: firebaseLib.firebaseMod.authNs.AuthCredential): js.Promise[firebaseLib.firebaseMod.authNs.UserCredential] = js.native
  /**
    * Links the user account with the given credentials.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/provider-already-linked</dt>
    * <dd>Thrown if the provider has already been linked to the user. This error is
    *     thrown even if this is not the same provider's account that is currently
    *     linked to the user.</dd>
    * <dt>auth/invalid-credential</dt>
    * <dd>Thrown if the provider's credential is not valid. This can happen if it
    *     has already expired when calling link, or if it used invalid token(s).
    *     See the Firebase documentation for your provider, and make sure you pass
    *     in the correct parameters to the credential method.</dd>
    * <dt>auth/credential-already-in-use</dt>
    * <dd>Thrown if the account corresponding to the credential already exists
    *     among your users, or is already linked to a Firebase User.
    *     For example, this error could be thrown if you are upgrading an anonymous
    *     user to a Google user by linking a Google credential to it and the Google
    *     credential used is already associated with an existing Firebase Google
    *     user.
    *     The fields <code>error.email</code>, <code>error.phoneNumber</code>, and
    *     <code>error.credential</code> ({@link firebase.auth.AuthCredential})
    *     may be provided, depending on the type of credential. You can recover
    *     from this error by signing in with <code>error.credential</code> directly
    *     via {@link firebase.auth.Auth.signInWithCredential}.</dd>
    * <dt>auth/email-already-in-use</dt>
    * <dd>Thrown if the email corresponding to the credential already exists
    *     among your users. When thrown while linking a credential to an existing
    *     user, an <code>error.email</code> and <code>error.credential</code>
    *     ({@link firebase.auth.AuthCredential}) fields are also provided.
    *     You have to link the credential to the existing user with that email if
    *     you wish to continue signing in with that credential. To do so, call
    *     {@link firebase.auth.Auth.fetchSignInMethodsForEmail}, sign in to
    *     <code>error.email</code> via one of the providers returned and then
    *     {@link firebase.User.linkWithCredential} the original credential to that
    *     newly signed in user.</dd>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if you have not enabled the provider in the Firebase Console. Go
    *     to the Firebase Console for your project, in the Auth section and the
    *     <strong>Sign in Method</strong> tab and configure the provider.</dd>
    * <dt>auth/invalid-email</dt>
    * <dd>Thrown if the email used in a
    *     {@link firebase.auth.EmailAuthProvider.credential} is invalid.</dd>
    * <dt>auth/wrong-password</dt>
    * <dd>Thrown if the password used in a
    *     {@link firebase.auth.EmailAuthProvider.credential} is not correct or
    *     when the user associated with the email does not have a password.</dd>
    * <dt>auth/invalid-verification-code</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential} and the verification
    *     code of the credential is not valid.</dd>
    * <dt>auth/invalid-verification-id</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential}  and the verification
    *     ID of the credential is not valid.</dd>
    * </dl>
    *
    * @param credential The auth credential.
    */
  def linkWithCredential(credential: firebaseLib.firebaseMod.authNs.AuthCredential): js.Promise[firebaseLib.firebaseMod.authNs.UserCredential] = js.native
  /**
    * Links the user account with the given phone number.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/provider-already-linked</dt>
    * <dd>Thrown if the provider has already been linked to the user. This error is
    *     thrown even if this is not the same provider's account that is currently
    *     linked to the user.</dd>
    * <dt>auth/captcha-check-failed</dt>
    * <dd>Thrown if the reCAPTCHA response token was invalid, expired, or if
    *     this method was called from a non-whitelisted domain.</dd>
    * <dt>auth/invalid-phone-number</dt>
    * <dd>Thrown if the phone number has an invalid format.</dd>
    * <dt>auth/missing-phone-number</dt>
    * <dd>Thrown if the phone number is missing.</dd>
    * <dt>auth/quota-exceeded</dt>
    * <dd>Thrown if the SMS quota for the Firebase project has been exceeded.</dd>
    * <dt>auth/user-disabled</dt>
    * <dd>Thrown if the user corresponding to the given phone number has been
    *     disabled.</dd>
    * <dt>auth/credential-already-in-use</dt>
    * <dd>Thrown if the account corresponding to the phone number already exists
    *     among your users, or is already linked to a Firebase User.
    *     The fields <code>error.phoneNumber</code> and
    *     <code>error.credential</code> ({@link firebase.auth.AuthCredential})
    *     are provided in this case. You can recover from this error by signing in
    *     with that credential directly via
    *     {@link firebase.auth.Auth.signInWithCredential}.</dd>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if you have not enabled the phone authentication provider in the
    *     Firebase Console. Go to the Firebase Console for your project, in the
    *     Auth section and the <strong>Sign in Method</strong> tab and configure
    *     the provider.</dd>
    * </dl>
    *
    * @param phoneNumber The user's phone number in E.164 format (e.g.
    *     +16505550101).
    * @param applicationVerifier
    */
  def linkWithPhoneNumber(
    phoneNumber: java.lang.String,
    applicationVerifier: firebaseLib.firebaseMod.authNs.ApplicationVerifier
  ): js.Promise[firebaseLib.firebaseMod.authNs.ConfirmationResult] = js.native
  /**
    * Links the authenticated provider to the user account using a pop-up based
    * OAuth flow.
    *
    * If the linking is successful, the returned result will contain the user
    * and the provider's credential.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/auth-domain-config-required</dt>
    * <dd>Thrown if authDomain configuration is not provided when calling
    *     firebase.initializeApp(). Check Firebase Console for instructions on
    *     determining and passing that field.</dd>
    * <dt>auth/cancelled-popup-request</dt>
    * <dd>Thrown if successive popup operations are triggered. Only one popup
    *     request is allowed at one time on a user or an auth instance. All the
    *     popups would fail with this error except for the last one.</dd>
    * <dt>auth/credential-already-in-use</dt>
    * <dd>Thrown if the account corresponding to the credential already exists
    *     among your users, or is already linked to a Firebase User.
    *     For example, this error could be thrown if you are upgrading an anonymous
    *     user to a Google user by linking a Google credential to it and the Google
    *     credential used is already associated with an existing Firebase Google
    *     user.
    *     An <code>error.email</code> and <code>error.credential</code>
    *     ({@link firebase.auth.AuthCredential}) fields are also provided. You can
    *     recover from this error by signing in with that credential directly via
    *     {@link firebase.auth.Auth.signInWithCredential}.</dd>
    * <dt>auth/email-already-in-use</dt>
    * <dd>Thrown if the email corresponding to the credential already exists
    *     among your users. When thrown while linking a credential to an existing
    *     user, an <code>error.email</code> and <code>error.credential</code>
    *     ({@link firebase.auth.AuthCredential}) fields are also provided.
    *     You have to link the credential to the existing user with that email if
    *     you wish to continue signing in with that credential. To do so, call
    *     {@link firebase.auth.Auth.fetchSignInMethodsForEmail}, sign in to
    *     <code>error.email</code> via one of the providers returned and then
    *     {@link firebase.User.linkWithCredential} the original credential to that
    *     newly signed in user.</dd>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if you have not enabled the provider in the Firebase Console. Go
    *     to the Firebase Console for your project, in the Auth section and the
    *     <strong>Sign in Method</strong> tab and configure the provider.</dd>
    * <dt>auth/popup-blocked</dt>
    * <dt>auth/operation-not-supported-in-this-environment</dt>
    * <dd>Thrown if this operation is not supported in the environment your
    *     application is running on. "location.protocol" must be http or https.
    *     </dd>
    * <dd>Thrown if the popup was blocked by the browser, typically when this
    *     operation is triggered outside of a click handler.</dd>
    * <dt>auth/popup-closed-by-user</dt>
    * <dd>Thrown if the popup window is closed by the user without completing the
    *     sign in to the provider.</dd>
    * <dt>auth/provider-already-linked</dt>
    * <dd>Thrown if the provider has already been linked to the user. This error is
    *     thrown even if this is not the same provider's account that is currently
    *     linked to the user.</dd>
    * <dt>auth/unauthorized-domain</dt>
    * <dd>Thrown if the app domain is not authorized for OAuth operations for your
    *     Firebase project. Edit the list of authorized domains from the Firebase
    *     console.</dd>
    * </dl>
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Creates the provider object.
    * var provider = new firebase.auth.FacebookAuthProvider();
    * // You can add additional scopes to the provider:
    * provider.addScope('email');
    * provider.addScope('user_friends');
    * // Link with popup:
    * user.linkWithPopup(provider).then(function(result) {
    *   // The firebase.User instance:
    *   var user = result.user;
    *   // The Facebook firebase.auth.AuthCredential containing the Facebook
    *   // access token:
    *   var credential = result.credential;
    * }, function(error) {
    *   // An error happened.
    * });
    * ```
    *
    * @param provider The provider to authenticate.
    *     The provider has to be an OAuth provider. Non-OAuth providers like {@link
    *     firebase.auth.EmailAuthProvider} will throw an error.
    */
  def linkWithPopup(provider: firebaseLib.firebaseMod.authNs.AuthProvider): js.Promise[firebaseLib.firebaseMod.authNs.UserCredential] = js.native
  /**
    * Links the authenticated provider to the user account using a full-page
    * redirect flow.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/auth-domain-config-required</dt>
    * <dd>Thrown if authDomain configuration is not provided when calling
    *     firebase.initializeApp(). Check Firebase Console for instructions on
    *     determining and passing that field.</dd>
    * <dt>auth/operation-not-supported-in-this-environment</dt>
    * <dd>Thrown if this operation is not supported in the environment your
    *     application is running on. "location.protocol" must be http or https.
    *     </dd>
    * <dt>auth/provider-already-linked</dt>
    * <dd>Thrown if the provider has already been linked to the user. This error is
    *     thrown even if this is not the same provider's account that is currently
    *     linked to the user.</dd>
    * <dt>auth/unauthorized-domain</dt>
    * <dd>Thrown if the app domain is not authorized for OAuth operations for your
    *     Firebase project. Edit the list of authorized domains from the Firebase
    *     console.</dd>
    * </dl>
    *
    * @param provider The provider to authenticate.
    *     The provider has to be an OAuth provider. Non-OAuth providers like {@link
    *     firebase.auth.EmailAuthProvider} will throw an error.
    */
  def linkWithRedirect(provider: firebaseLib.firebaseMod.authNs.AuthProvider): js.Promise[scala.Unit] = js.native
  /**
    * Re-authenticates a user using a fresh credential, and returns any available
    * additional user information, such as user name. Use before operations
    * such as {@link firebase.User.updatePassword} that require tokens from recent
    * sign-in attempts.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/user-mismatch</dt>
    * <dd>Thrown if the credential given does not correspond to the user.</dd>
    * <dt>auth/user-not-found</dt>
    * <dd>Thrown if the credential given does not correspond to any existing user.
    *     </dd>
    * <dt>auth/invalid-credential</dt>
    * <dd>Thrown if the provider's credential is not valid. This can happen if it
    *     has already expired when calling link, or if it used invalid token(s).
    *     See the Firebase documentation for your provider, and make sure you pass
    *     in the correct parameters to the credential method.</dd>
    * <dt>auth/invalid-email</dt>
    * <dd>Thrown if the email used in a
    *     {@link firebase.auth.EmailAuthProvider.credential} is invalid.</dd>
    * <dt>auth/wrong-password</dt>
    * <dd>Thrown if the password used in a
    *     {@link firebase.auth.EmailAuthProvider.credential} is not correct or when
    *     the user associated with the email does not have a password.</dd>
    * <dt>auth/invalid-verification-code</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential} and the verification
    *     code of the credential is not valid.</dd>
    * <dt>auth/invalid-verification-id</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential}  and the verification
    *     ID of the credential is not valid.</dd>
    * </dl>
    *
    * @deprecated
    * This method is deprecated. Use
    * {@link firebase.User.reauthenticateWithCredential} instead.
    *
    * @param credential
    */
  def reauthenticateAndRetrieveDataWithCredential(credential: firebaseLib.firebaseMod.authNs.AuthCredential): js.Promise[firebaseLib.firebaseMod.authNs.UserCredential] = js.native
  /**
    * Re-authenticates a user using a fresh credential. Use before operations
    * such as {@link firebase.User.updatePassword} that require tokens from recent
    * sign-in attempts.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/user-mismatch</dt>
    * <dd>Thrown if the credential given does not correspond to the user.</dd>
    * <dt>auth/user-not-found</dt>
    * <dd>Thrown if the credential given does not correspond to any existing user.
    *     </dd>
    * <dt>auth/invalid-credential</dt>
    * <dd>Thrown if the provider's credential is not valid. This can happen if it
    *     has already expired when calling link, or if it used invalid token(s).
    *     See the Firebase documentation for your provider, and make sure you pass
    *     in the correct parameters to the credential method.</dd>
    * <dt>auth/invalid-email</dt>
    * <dd>Thrown if the email used in a
    *     {@link firebase.auth.EmailAuthProvider.credential} is invalid.</dd>
    * <dt>auth/wrong-password</dt>
    * <dd>Thrown if the password used in a
    *     {@link firebase.auth.EmailAuthProvider.credential} is not correct or when
    *     the user associated with the email does not have a password.</dd>
    * <dt>auth/invalid-verification-code</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential} and the verification
    *     code of the credential is not valid.</dd>
    * <dt>auth/invalid-verification-id</dt>
    * <dd>Thrown if the credential is a
    *     {@link firebase.auth.PhoneAuthProvider.credential}  and the verification
    *     ID of the credential is not valid.</dd>
    * </dl>
    *
    * @param credential
    */
  def reauthenticateWithCredential(credential: firebaseLib.firebaseMod.authNs.AuthCredential): js.Promise[firebaseLib.firebaseMod.authNs.UserCredential] = js.native
  /**
    * Re-authenticates a user using a fresh credential. Use before operations
    * such as {@link firebase.User.updatePassword} that require tokens from recent
    * sign-in attempts.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/user-mismatch</dt>
    * <dd>Thrown if the credential given does not correspond to the user.</dd>
    * <dt>auth/user-not-found</dt>
    * <dd>Thrown if the credential given does not correspond to any existing user.
    *     </dd>
    * <dt>auth/captcha-check-failed</dt>
    * <dd>Thrown if the reCAPTCHA response token was invalid, expired, or if
    *     this method was called from a non-whitelisted domain.</dd>
    * <dt>auth/invalid-phone-number</dt>
    * <dd>Thrown if the phone number has an invalid format.</dd>
    * <dt>auth/missing-phone-number</dt>
    * <dd>Thrown if the phone number is missing.</dd>
    * <dt>auth/quota-exceeded</dt>
    * <dd>Thrown if the SMS quota for the Firebase project has been exceeded.</dd>
    * </dl>
    *
    * @param phoneNumber The user's phone number in E.164 format (e.g.
    *     +16505550101).
    * @param applicationVerifier
    */
  def reauthenticateWithPhoneNumber(
    phoneNumber: java.lang.String,
    applicationVerifier: firebaseLib.firebaseMod.authNs.ApplicationVerifier
  ): js.Promise[firebaseLib.firebaseMod.authNs.ConfirmationResult] = js.native
  /**
    * Reauthenticates the current user with the specified provider using a pop-up
    * based OAuth flow.
    *
    * If the reauthentication is successful, the returned result will contain the
    * user and the provider's credential.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/auth-domain-config-required</dt>
    * <dd>Thrown if authDomain configuration is not provided when calling
    *     firebase.initializeApp(). Check Firebase Console for instructions on
    *     determining and passing that field.</dd>
    * <dt>auth/cancelled-popup-request</dt>
    * <dd>Thrown if successive popup operations are triggered. Only one popup
    *     request is allowed at one time on a user or an auth instance. All the
    *     popups would fail with this error except for the last one.</dd>
    * <dt>auth/user-mismatch</dt>
    * <dd>Thrown if the credential given does not correspond to the user.</dd>
    * <dt>auth/operation-not-allowed</dt>
    * <dd>Thrown if you have not enabled the provider in the Firebase Console. Go
    *     to the Firebase Console for your project, in the Auth section and the
    *     <strong>Sign in Method</strong> tab and configure the provider.</dd>
    * <dt>auth/popup-blocked</dt>
    * <dd>Thrown if the popup was blocked by the browser, typically when this
    *     operation is triggered outside of a click handler.</dd>
    * <dt>auth/operation-not-supported-in-this-environment</dt>
    * <dd>Thrown if this operation is not supported in the environment your
    *     application is running on. "location.protocol" must be http or https.
    *     </dd>
    * <dt>auth/popup-closed-by-user</dt>
    * <dd>Thrown if the popup window is closed by the user without completing the
    *     sign in to the provider.</dd>
    * <dt>auth/unauthorized-domain</dt>
    * <dd>Thrown if the app domain is not authorized for OAuth operations for your
    *     Firebase project. Edit the list of authorized domains from the Firebase
    *     console.</dd>
    * </dl>
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Creates the provider object.
    * var provider = new firebase.auth.FacebookAuthProvider();
    * // You can add additional scopes to the provider:
    * provider.addScope('email');
    * provider.addScope('user_friends');
    * // Reauthenticate with popup:
    * user.reauthenticateWithPopup(provider).then(function(result) {
    *   // The firebase.User instance:
    *   var user = result.user;
    *   // The Facebook firebase.auth.AuthCredential containing the Facebook
    *   // access token:
    *   var credential = result.credential;
    * }, function(error) {
    *   // An error happened.
    * });
    * ```
    *
    * @param provider The provider to authenticate.
    *     The provider has to be an OAuth provider. Non-OAuth providers like {@link
    *     firebase.auth.EmailAuthProvider} will throw an error.
    */
  def reauthenticateWithPopup(provider: firebaseLib.firebaseMod.authNs.AuthProvider): js.Promise[firebaseLib.firebaseMod.authNs.UserCredential] = js.native
  /**
    * Reauthenticates the current user with the specified OAuth provider using a
    * full-page redirect flow.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/auth-domain-config-required</dt>
    * <dd>Thrown if authDomain configuration is not provided when calling
    *     firebase.initializeApp(). Check Firebase Console for instructions on
    *     determining and passing that field.</dd>
    * <dt>auth/operation-not-supported-in-this-environment</dt>
    * <dd>Thrown if this operation is not supported in the environment your
    *     application is running on. "location.protocol" must be http or https.
    *     </dd>
    * <dt>auth/user-mismatch</dt>
    * <dd>Thrown if the credential given does not correspond to the user.</dd>
    * <dt>auth/unauthorized-domain</dt>
    * <dd>Thrown if the app domain is not authorized for OAuth operations for your
    *     Firebase project. Edit the list of authorized domains from the Firebase
    *     console.</dd>
    * </dl>
    *
    * @webonly
    *
    * @param provider The provider to authenticate.
    *     The provider has to be an OAuth provider. Non-OAuth providers like {@link
    *     firebase.auth.EmailAuthProvider} will throw an error.
    */
  def reauthenticateWithRedirect(provider: firebaseLib.firebaseMod.authNs.AuthProvider): js.Promise[scala.Unit] = js.native
  /**
    * Refreshes the current user, if signed in.
    *
    */
  def reload(): js.Promise[scala.Unit] = js.native
  /**
    * Sends a verification email to a user.
    *
    * The verification process is completed by calling
    * {@link firebase.auth.Auth.applyActionCode}
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/missing-android-pkg-name</dt>
    * <dd>An Android package name must be provided if the Android app is required
    *     to be installed.</dd>
    * <dt>auth/missing-continue-uri</dt>
    * <dd>A continue URL must be provided in the request.</dd>
    * <dt>auth/missing-ios-bundle-id</dt>
    * <dd>An iOS bundle ID must be provided if an App Store ID is provided.</dd>
    * <dt>auth/invalid-continue-uri</dt>
    * <dd>The continue URL provided in the request is invalid.</dd>
    * <dt>auth/unauthorized-continue-uri</dt>
    * <dd>The domain of the continue URL is not whitelisted. Whitelist
    *     the domain in the Firebase console.</dd>
    * </dl>
    *
    * @example
    * ```javascript
    * var actionCodeSettings = {
    *   url: 'https://www.example.com/cart?email=user@example.com&cartId=123',
    *   iOS: {
    *     bundleId: 'com.example.ios'
    *   },
    *   android: {
    *     packageName: 'com.example.android',
    *     installApp: true,
    *     minimumVersion: '12'
    *   },
    *   handleCodeInApp: true
    * };
    * firebase.auth().currentUser.sendEmailVerification(actionCodeSettings)
    *     .then(function() {
    *       // Verification email sent.
    *     })
    *     .catch(function(error) {
    *       // Error occurred. Inspect error.code.
    *     });
    * ```
    *
    * @param actionCodeSettings The action
    *     code settings. If specified, the state/continue URL will be set as the
    *     "continueUrl" parameter in the email verification link. The default email
    *     verification landing page will use this to display a link to go back to
    *     the app if it is installed.
    *     If the actionCodeSettings is not specified, no URL is appended to the
    *     action URL.
    *     The state URL provided must belong to a domain that is whitelisted by the
    *     developer in the console. Otherwise an error will be thrown.
    *     Mobile app redirects will only be applicable if the developer configures
    *     and accepts the Firebase Dynamic Links terms of condition.
    *     The Android package name and iOS bundle ID will be respected only if they
    *     are configured in the same Firebase Auth project used.
    */
  def sendEmailVerification(): js.Promise[scala.Unit] = js.native
  def sendEmailVerification(actionCodeSettings: firebaseLib.firebaseMod.authNs.ActionCodeSettings): js.Promise[scala.Unit] = js.native
  /**
    * Returns a JSON-serializable representation of this object.
    *
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
  /**
    * Unlinks a provider from a user account.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/no-such-provider</dt>
    * <dd>Thrown if the user does not have this provider linked or when the
    *     provider ID given does not exist.</dd>
    * </dt>
    *
    * @param providerId
    */
  def unlink(providerId: java.lang.String): js.Promise[User] = js.native
  /**
    * Updates the user's email address.
    *
    * An email will be sent to the original email address (if it was set) that
    * allows to revoke the email address change, in order to protect them from
    * account hijacking.
    *
    * <b>Important:</b> this is a security sensitive operation that requires the
    * user to have recently signed in. If this requirement isn't met, ask the user
    * to authenticate again and then call
    * {@link firebase.User.reauthenticateWithCredential}.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/invalid-email</dt>
    * <dd>Thrown if the email used is invalid.</dd>
    * <dt>auth/email-already-in-use</dt>
    * <dd>Thrown if the email is already used by another user.</dd>
    * <dt>auth/requires-recent-login</dt>
    * <dd>Thrown if the user's last sign-in time does not meet the security
    *     threshold. Use {@link firebase.User.reauthenticateWithCredential} to
    *     resolve. This does not apply if the user is anonymous.</dd>
    * </dl>
    *
    * @param newEmail The new email address.
    */
  def updateEmail(newEmail: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Updates the user's password.
    *
    * <b>Important:</b> this is a security sensitive operation that requires the
    * user to have recently signed in. If this requirement isn't met, ask the user
    * to authenticate again and then call
    * {@link firebase.User.reauthenticateWithCredential}.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/weak-password</dt>
    * <dd>Thrown if the password is not strong enough.</dd>
    * <dt>auth/requires-recent-login</dt>
    * <dd>Thrown if the user's last sign-in time does not meet the security
    *     threshold. Use {@link firebase.User.reauthenticateWithCredential} to
    *     resolve. This does not apply if the user is anonymous.</dd>
    * </dl>
    *
    * @param newPassword
    */
  def updatePassword(newPassword: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Updates the user's phone number.
    *
    * <h4>Error Codes</h4>
    * <dl>
    * <dt>auth/invalid-verification-code</dt>
    * <dd>Thrown if the verification code of the credential is not valid.</dd>
    * <dt>auth/invalid-verification-id</dt>
    * <dd>Thrown if the verification ID of the credential is not valid.</dd>
    * </dl>
    *
    * @param phoneCredential
    */
  def updatePhoneNumber(phoneCredential: firebaseLib.firebaseMod.authNs.AuthCredential): js.Promise[scala.Unit] = js.native
  /**
    * Updates a user's profile data.
    *
    * @example
    * ```javascript
    * // Updates the user attributes:
    * user.updateProfile({
    *   displayName: "Jane Q. User",
    *   photoURL: "https://example.com/jane-q-user/profile.jpg"
    * }).then(function() {
    *   // Profile updated successfully!
    *   // "Jane Q. User"
    *   var displayName = user.displayName;
    *   // "https://example.com/jane-q-user/profile.jpg"
    *   var photoURL = user.photoURL;
    * }, function(error) {
    *   // An error happened.
    * });
    *
    * // Passing a null value will delete the current attribute's value, but not
    * // passing a property won't change the current attribute's value:
    * // Let's say we're using the same user than before, after the update.
    * user.updateProfile({photoURL: null}).then(function() {
    *   // Profile updated successfully!
    *   // "Jane Q. User", hasn't changed.
    *   var displayName = user.displayName;
    *   // Now, this is null.
    *   var photoURL = user.photoURL;
    * }, function(error) {
    *   // An error happened.
    * });
    * ```
    *
    * @param profile The profile's
    *     displayName and photoURL to update.
    */
  def updateProfile(profile: firebaseLib.Anon_DisplayName): js.Promise[scala.Unit] = js.native
}

