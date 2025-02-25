package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserInfoRes extends js.Object {
  /**
    * 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法，仅微信小程序生效。
    */
  var encryptedData: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 描述信息
    */
  var errMsg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 加密算法的初始向量，详细见加密数据解密算法，仅微信小程序生效。
    */
  var iv: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 不包括敏感信息的原始数据字符串，用于计算签名。
    */
  var rawData: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息，仅微信小程序生效。
    */
  var signature: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 用户信息对象，不包含 openid 等敏感信息
    */
  var userInfo: js.UndefOr[UserInfo] = js.undefined
}

object GetUserInfoRes {
  @scala.inline
  def apply(
    encryptedData: java.lang.String = null,
    errMsg: java.lang.String = null,
    iv: java.lang.String = null,
    rawData: java.lang.String = null,
    signature: java.lang.String = null,
    userInfo: UserInfo = null
  ): GetUserInfoRes = {
    val __obj = js.Dynamic.literal()
    if (encryptedData != null) __obj.updateDynamic("encryptedData")(encryptedData)
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    if (iv != null) __obj.updateDynamic("iv")(iv)
    if (rawData != null) __obj.updateDynamic("rawData")(rawData)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo)
    __obj.asInstanceOf[GetUserInfoRes]
  }
}

