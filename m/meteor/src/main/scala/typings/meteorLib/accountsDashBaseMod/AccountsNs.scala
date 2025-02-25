package typings
package meteorLib.accountsDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/accounts-base", "Accounts")
@js.native
object AccountsNs extends js.Object {
  trait IValidateLoginAttemptCbOpts extends js.Object {
    var allowed: scala.Boolean
    var connection: meteorLib.MeteorNs.Connection
    var error: meteorLib.MeteorNs.Error
    var methodArguments: js.Array[_]
    var methodName: java.lang.String
    var `type`: java.lang.String
    var user: meteorLib.MeteorNs.User
  }
  
  var emailTemplates: meteorLib.accountsDashBaseMod.EmailTemplates = js.native
  var urls: meteorLib.accountsDashBaseMod.URLS = js.native
  def _hashPassword(password: java.lang.String): meteorLib.Anon_Algorithm = js.native
  def addEmail(userId: java.lang.String, newEmail: java.lang.String): scala.Unit = js.native
  def addEmail(userId: java.lang.String, newEmail: java.lang.String, verified: scala.Boolean): scala.Unit = js.native
  def changePassword(oldPassword: java.lang.String, newPassword: java.lang.String): scala.Unit = js.native
  def changePassword(
    oldPassword: java.lang.String,
    newPassword: java.lang.String,
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def config(options: meteorLib.Anon_AmbiguousErrorMessages): scala.Unit = js.native
  def createUser(options: meteorLib.Anon_Email): java.lang.String = js.native
  def createUser(
    options: meteorLib.Anon_Email,
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): java.lang.String = js.native
  def findUserByEmail(email: java.lang.String): js.UndefOr[meteorLib.MeteorNs.User | scala.Null] = js.native
  def findUserByUsername(username: java.lang.String): js.UndefOr[meteorLib.MeteorNs.User | scala.Null] = js.native
  def forgotPassword(options: meteorLib.Anon_EmailString): scala.Unit = js.native
  def forgotPassword(
    options: meteorLib.Anon_EmailString,
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def loggingIn(): scala.Boolean = js.native
  def loginServicesConfigured(): scala.Boolean = js.native
  def logout(): scala.Unit = js.native
  def logout(
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def logoutOtherClients(): scala.Unit = js.native
  def logoutOtherClients(
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def onCreateUser(
    func: js.Function2[/* options */ meteorLib.Anon_Profile, /* user */ meteorLib.MeteorNs.User, scala.Unit]
  ): scala.Unit = js.native
  def onEmailVerificationLink(callback: js.Function): scala.Unit = js.native
  def onEnrollmentLink(callback: js.Function): scala.Unit = js.native
  def onLogin(func: js.Function): meteorLib.Anon_Stop = js.native
  def onLoginFailure(func: js.Function): meteorLib.Anon_Stop = js.native
  def onLogout(func: js.Function): scala.Unit = js.native
  def onLogout(
    func: js.Function2[
      /* user */ meteorLib.MeteorNs.User, 
      /* connection */ meteorLib.MeteorNs.Connection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def onPageLoadLogin(func: js.Function): scala.Unit = js.native
  def onResetPasswordLink(callback: js.Function): scala.Unit = js.native
  def removeEmail(userId: java.lang.String, email: java.lang.String): scala.Unit = js.native
  def resetPassword(token: java.lang.String, newPassword: java.lang.String): scala.Unit = js.native
  def resetPassword(
    token: java.lang.String,
    newPassword: java.lang.String,
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def sendEnrollmentEmail(userId: java.lang.String): scala.Unit = js.native
  def sendEnrollmentEmail(userId: java.lang.String, email: java.lang.String): scala.Unit = js.native
  def sendResetPasswordEmail(userId: java.lang.String): scala.Unit = js.native
  def sendResetPasswordEmail(userId: java.lang.String, email: java.lang.String): scala.Unit = js.native
  def sendVerificationEmail(userId: java.lang.String): scala.Unit = js.native
  def sendVerificationEmail(userId: java.lang.String, email: java.lang.String): scala.Unit = js.native
  def setPassword(userId: java.lang.String, newPassword: java.lang.String): scala.Unit = js.native
  def setPassword(userId: java.lang.String, newPassword: java.lang.String, options: meteorLib.Anon_Logout): scala.Unit = js.native
  def setUsername(userId: java.lang.String, newUsername: java.lang.String): scala.Unit = js.native
  def user(): meteorLib.MeteorNs.User | scala.Null = js.native
  def userId(): java.lang.String | scala.Null = js.native
  def validateLoginAttempt(func: js.Function): meteorLib.Anon_Stop = js.native
  def validateNewUser(func: js.Function): scala.Boolean = js.native
  def verifyEmail(token: java.lang.String): scala.Unit = js.native
  def verifyEmail(
    token: java.lang.String,
    callback: js.Function1[
      /* error */ js.UndefOr[stdLib.Error | meteorLib.MeteorNs.Error | meteorLib.MeteorNs.TypedError], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @js.native
  object ui extends js.Object {
    def config(options: meteorLib.Anon_ForceApprovalPrompt): scala.Unit = js.native
  }
  
}

