package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessTheDeletedUser extends js.Object {
  def failure(theUser: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, anErrorString: java.lang.String): js.Any
  def success(theDeletedUser: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser): js.Any
}

object Anon_AnErrorStringFailureSuccessTheDeletedUser {
  @scala.inline
  def apply(
    failure: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, java.lang.String) => js.Any,
    success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser => js.Any
  ): Anon_AnErrorStringFailureSuccessTheDeletedUser = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessTheDeletedUser]
  }
}

