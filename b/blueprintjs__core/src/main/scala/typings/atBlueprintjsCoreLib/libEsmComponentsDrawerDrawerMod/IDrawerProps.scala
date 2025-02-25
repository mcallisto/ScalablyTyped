package typings
package atBlueprintjsCoreLib.libEsmComponentsDrawerDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrawerProps
  extends atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod.IOverlayableProps
     with atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod.IBackdropProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Name of a Blueprint UI icon (or an icon element) to render in the
    * drawer's header. Note that the header will only be rendered if `title` is
    * provided.
    */
  var icon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement
  ] = js.undefined
  /**
    * Whether to show the close button in the dialog's header.
    * Note that the header will only be rendered if `title` is provided.
    * @default true
    */
  var isCloseButtonShown: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Toggles the visibility of the overlay and its children.
    * This prop is required because the component is controlled.
    */
  var isOpen: scala.Boolean
  /**
    * Position of a drawer. All angled positions will be casted into pure positions
    * (TOP, BOTTOM, LEFT or RIGHT).
    * @default Position.RIGHT
    */
  var position: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonPositionMod.Position] = js.undefined
  /**
    * CSS size of the drawer. This sets `width` if `vertical={false}` (default)
    * and `height` otherwise.
    *
    * Constants are available for common sizes:
    * - `Drawer.SIZE_SMALL = 360px`
    * - `Drawer.SIZE_STANDARD = 50%`
    * - `Drawer.SIZE_LARGE = 90%`
    *
    * @default Drawer.SIZE_STANDARD = "50%"
    */
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * CSS styles to apply to the dialog.
    * @default {}
    */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  /**
    * Title of the dialog. If provided, an element with `Classes.DIALOG_HEADER`
    * will be rendered inside the dialog before any children elements.
    */
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * Name of the transition for internal `CSSTransition`. Providing your own
    * name here will require defining new CSS transition properties.
    */
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the drawer should appear with vertical styling.
    * It will be ignored if `position` prop is set
    * @default false
    * @deprecated use `position` instead
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object IDrawerProps {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backdropClassName: java.lang.String = null,
    backdropProps: reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement] = null,
    canEscapeKeyClose: js.UndefOr[scala.Boolean] = js.undefined,
    canOutsideClickClose: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    enforceFocus: js.UndefOr[scala.Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    icon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement = null,
    isCloseButtonShown: js.UndefOr[scala.Boolean] = js.undefined,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: /* event */ js.UndefOr[reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event]] => scala.Unit = null,
    onClosed: /* node */ stdLib.HTMLElement => scala.Unit = null,
    onClosing: /* node */ stdLib.HTMLElement => scala.Unit = null,
    onOpened: /* node */ stdLib.HTMLElement => scala.Unit = null,
    onOpening: /* node */ stdLib.HTMLElement => scala.Unit = null,
    portalClassName: java.lang.String = null,
    portalContainer: stdLib.HTMLElement = null,
    position: atBlueprintjsCoreLib.libEsmCommonPositionMod.Position = null,
    size: scala.Double | java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    title: reactLib.reactMod.ReactNode = null,
    transitionDuration: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null,
    usePortal: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): IDrawerProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (backdropClassName != null) __obj.updateDynamic("backdropClassName")(backdropClassName)
    if (backdropProps != null) __obj.updateDynamic("backdropProps")(backdropProps)
    if (!js.isUndefined(canEscapeKeyClose)) __obj.updateDynamic("canEscapeKeyClose")(canEscapeKeyClose)
    if (!js.isUndefined(canOutsideClickClose)) __obj.updateDynamic("canOutsideClickClose")(canOutsideClickClose)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus)
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isCloseButtonShown)) __obj.updateDynamic("isCloseButtonShown")(isCloseButtonShown)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1(onClosed))
    if (onClosing != null) __obj.updateDynamic("onClosing")(js.Any.fromFunction1(onClosing))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction1(onOpened))
    if (onOpening != null) __obj.updateDynamic("onOpening")(js.Any.fromFunction1(onOpening))
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName)
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer)
    if (position != null) __obj.updateDynamic("position")(position)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[IDrawerProps]
  }
}

