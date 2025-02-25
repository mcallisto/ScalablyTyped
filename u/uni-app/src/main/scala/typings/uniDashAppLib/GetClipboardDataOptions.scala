package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClipboardDataOptions extends js.Object {
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ GetClipboardDataSuccessRes, scala.Unit]] = js.undefined
}

object GetClipboardDataOptions {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    success: /* result */ GetClipboardDataSuccessRes => scala.Unit = null
  ): GetClipboardDataOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetClipboardDataOptions]
  }
}

