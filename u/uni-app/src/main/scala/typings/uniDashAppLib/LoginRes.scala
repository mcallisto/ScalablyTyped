package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginRes extends js.Object {
  /**
    * 头条小程序当前设备标识
    */
  var anonymousCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 支付宝小程序授权码
    */
  var authCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 支付宝小程序登录失败的授权类型，key是授权失败的 scope，value 是对应的错误码
    */
  var authErrorScope: js.UndefOr[js.Any] = js.undefined
  /**
    * 登录服务商提供的登录信息，服务商不同返回的结果不完全相同
    */
  var authResult: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 支付宝小程序登录成功的授权 scope
    */
  var authSucessScope: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * 小程序用户临时登录凭证
    */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 描述信息
    */
  var errMsg: js.UndefOr[java.lang.String] = js.undefined
}

object LoginRes {
  @scala.inline
  def apply(
    anonymousCode: java.lang.String = null,
    authCode: java.lang.String = null,
    authErrorScope: js.Any = null,
    authResult: java.lang.String = null,
    authSucessScope: js.Array[java.lang.String] = null,
    code: java.lang.String = null,
    errMsg: java.lang.String = null
  ): LoginRes = {
    val __obj = js.Dynamic.literal()
    if (anonymousCode != null) __obj.updateDynamic("anonymousCode")(anonymousCode)
    if (authCode != null) __obj.updateDynamic("authCode")(authCode)
    if (authErrorScope != null) __obj.updateDynamic("authErrorScope")(authErrorScope)
    if (authResult != null) __obj.updateDynamic("authResult")(authResult)
    if (authSucessScope != null) __obj.updateDynamic("authSucessScope")(authSucessScope)
    if (code != null) __obj.updateDynamic("code")(code)
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    __obj.asInstanceOf[LoginRes]
  }
}

