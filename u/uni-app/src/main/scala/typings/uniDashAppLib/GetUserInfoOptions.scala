package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserInfoOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 指定返回用户信息的语言，zh_CN 简体中文，zh_TW 繁体中文，en 英文。默认为en，仅微信小程序生效。
    */
  var lang: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 授权登录服务提供商，通过uni.getProvider获取
    * - weixin: 微信登录
    * - qq: QQ登录
    * - sinaweibo: 新浪微博登录
    * - xiaomi: 小米登录
    */
  var provider: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.weixin | uniDashAppLib.uniDashAppLibStrings.qq | uniDashAppLib.uniDashAppLibStrings.sinaweibo | uniDashAppLib.uniDashAppLibStrings.xiaomi
  ] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ GetUserInfoRes, scala.Unit]] = js.undefined
  /**
    * 超时时间，单位 ms
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * 是否带上登录态信息，仅微信小程序生效。
    */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object GetUserInfoOptions {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    lang: java.lang.String = null,
    provider: uniDashAppLib.uniDashAppLibStrings.weixin | uniDashAppLib.uniDashAppLibStrings.qq | uniDashAppLib.uniDashAppLibStrings.sinaweibo | uniDashAppLib.uniDashAppLibStrings.xiaomi = null,
    success: /* result */ GetUserInfoRes => scala.Unit = null,
    timeout: scala.Int | scala.Double = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): GetUserInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[GetUserInfoOptions]
  }
}

