package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureGroupSuccess extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(group: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup): js.Any
}

object Anon_ErrorFailureGroupSuccess {
  @scala.inline
  def apply(failure: stdLib.Error => js.Any, success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGroup => js.Any): Anon_ErrorFailureGroupSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureGroupSuccess]
  }
}

