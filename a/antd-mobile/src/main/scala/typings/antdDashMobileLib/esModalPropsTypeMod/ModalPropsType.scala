package typings
package antdDashMobileLib.esModalPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalPropsType[T] extends js.Object {
  var animateAppear: js.UndefOr[scala.Boolean] = js.undefined
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var animationType: js.UndefOr[js.Any] = js.undefined
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var footer: js.UndefOr[js.Array[Action[T]]] = js.undefined
  var maskClosable: js.UndefOr[scala.Boolean] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var operation: js.UndefOr[scala.Boolean] = js.undefined
  var popup: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  var visible: scala.Boolean
}

object ModalPropsType {
  @scala.inline
  def apply[T](
    visible: scala.Boolean,
    animateAppear: js.UndefOr[scala.Boolean] = js.undefined,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animationType: js.Any = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    footer: js.Array[Action[T]] = null,
    maskClosable: js.UndefOr[scala.Boolean] = js.undefined,
    onAnimationEnd: /* visible */ scala.Boolean => scala.Unit = null,
    onClose: () => scala.Unit = null,
    operation: js.UndefOr[scala.Boolean] = js.undefined,
    popup: js.UndefOr[scala.Boolean] = js.undefined,
    title: reactLib.reactMod.ReactNode = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined
  ): ModalPropsType[T] = {
    val __obj = js.Dynamic.literal(visible = visible)
    if (!js.isUndefined(animateAppear)) __obj.updateDynamic("animateAppear")(animateAppear)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animationType != null) __obj.updateDynamic("animationType")(animationType)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(operation)) __obj.updateDynamic("operation")(operation)
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    __obj.asInstanceOf[ModalPropsType[T]]
  }
}

