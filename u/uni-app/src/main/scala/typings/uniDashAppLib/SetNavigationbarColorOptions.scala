package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNavigationbarColorOptions extends js.Object {
  /**
    * 动画效果
    */
  var animation: js.UndefOr[NavigationBarAnimation] = js.undefined
  /**
    * 背景颜色值，有效值为十六进制颜色
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 前景颜色值，包括按钮、标题、状态栏的颜色
    */
  var frontColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object SetNavigationbarColorOptions {
  @scala.inline
  def apply(
    animation: NavigationBarAnimation = null,
    backgroundColor: java.lang.String = null,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    frontColor: java.lang.String = null,
    success: () => scala.Unit = null
  ): SetNavigationbarColorOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (frontColor != null) __obj.updateDynamic("frontColor")(frontColor)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[SetNavigationbarColorOptions]
  }
}

