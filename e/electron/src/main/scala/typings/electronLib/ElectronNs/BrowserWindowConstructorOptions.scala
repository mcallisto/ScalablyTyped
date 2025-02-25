package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserWindowConstructorOptions extends js.Object {
  /**
    * Whether the web view accepts a single mouse-down event that simultaneously
    * activates the window. Default is false.
    */
  var acceptFirstMouse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the window should always stay on top of other windows. Default is false.
    */
  var alwaysOnTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Auto hide the menu bar unless the Alt key is pressed. Default is false.
    */
  var autoHideMenuBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Window's background color as a hexadecimal value, like #66CD00 or #FFF or
    * #80FFFFFF (alpha in #AARRGGBB format is supported if transparent is set to
    * true). Default is #FFF (white).
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Show window in the center of the screen.
    */
  var center: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether window is closable. This is not implemented on Linux. Default is true.
    */
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Forces using dark theme for the window, only works on some GTK+3 desktop
    * environments. Default is false.
    */
  var darkTheme: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to hide cursor when typing. Default is false.
    */
  var disableAutoHideCursor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable the window to be resized larger than screen. Default is false.
    */
  var enableLargerThanScreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the window can be focused. Default is true. On Windows setting
    * focusable: false also implies setting skipTaskbar: true. On Linux setting
    * focusable: false makes the window stop interacting with wm, so the window will
    * always stay on top in all workspaces.
    */
  var focusable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify false to create a . Default is true.
    */
  var frame: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the window should show in fullscreen. When explicitly set to false the
    * fullscreen button will be hidden or disabled on macOS. Default is false.
    */
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shows the title in the title bar in full screen mode on macOS for all
    * titleBarStyle options. Default is false.
    */
  var fullscreenWindowTitle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the window can be put into fullscreen mode. On macOS, also whether the
    * maximize/zoom button should toggle full screen mode or maximize window. Default
    * is true.
    */
  var fullscreenable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether window should have a shadow. This is only implemented on macOS. Default
    * is true.
    */
  var hasShadow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Window's height in pixels. Default is 600.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The window icon. On Windows it is recommended to use ICO icons to get best
    * visual effects, you can also leave it undefined so the executable's icon will be
    * used.
    */
  var icon: js.UndefOr[NativeImage | java.lang.String] = js.undefined
  /**
    * The kiosk mode. Default is false.
    */
  var kiosk: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Window's maximum height. Default is no limit.
    */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Window's maximum width. Default is no limit.
    */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether window is maximizable. This is not implemented on Linux. Default is
    * true.
    */
  var maximizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Window's minimum height. Default is 0.
    */
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Window's minimum width. Default is 0.
    */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether window is minimizable. This is not implemented on Linux. Default is
    * true.
    */
  var minimizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether this is a modal window. This only works when the window is a child
    * window. Default is false.
    */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether window is movable. This is not implemented on Linux. Default is true.
    */
  var movable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the initial opacity of the window, between 0.0 (fully transparent) and 1.0
    * (fully opaque). This is only implemented on Windows and macOS.
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify parent window. Default is null.
    */
  var parent: js.UndefOr[BrowserWindow] = js.undefined
  /**
    * Whether window is resizable. Default is true.
    */
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether window should be shown when created. Default is true.
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use pre-Lion fullscreen on macOS. Default is false.
    */
  var simpleFullscreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show the window in taskbar. Default is false.
    */
  var skipTaskbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Tab group name, allows opening the window as a native tab on macOS 10.12+.
    * Windows with the same tabbing identifier will be grouped together. This also
    * adds a native new tab button to your window's tab bar and allows your app and
    * window to receive the new-window-for-tab event.
    */
  var tabbingIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use WS_THICKFRAME style for frameless windows on Windows, which adds standard
    * window frame. Setting it to false will remove window shadow and window
    * animations. Default is true.
    */
  var thickFrame: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default window title. Default is "Electron". If the HTML tag is defined in the
    * HTML file loaded by loadURL(), this property will be ignored.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The style of window title bar. Default is default. Possible values are:
    */
  var titleBarStyle: js.UndefOr[
    electronLib.electronLibStrings.default | electronLib.electronLibStrings.hidden | electronLib.electronLibStrings.hiddenInset | electronLib.electronLibStrings.customButtonsOnHover
  ] = js.undefined
  /**
    * Makes the window . Default is false.
    */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The type of window, default is normal window. See more about this below.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width and height would be used as web page's size, which means the actual
    * window's size will include window frame's size and be slightly larger. Default
    * is false.
    */
  var useContentSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Add a type of vibrancy effect to the window, only on macOS. Can be
    * appearance-based, light, dark, titlebar, selection, menu, popover, sidebar,
    * medium-light or ultra-dark. Please note that using frame: false in combination
    * with a vibrancy value requires that you use a non-default titleBarStyle as well.
    */
  var vibrancy: js.UndefOr[
    electronLib.electronLibStrings.`appearance-based` | electronLib.electronLibStrings.light | electronLib.electronLibStrings.dark | electronLib.electronLibStrings.titlebar | electronLib.electronLibStrings.selection | electronLib.electronLibStrings.menu | electronLib.electronLibStrings.popover | electronLib.electronLibStrings.sidebar | electronLib.electronLibStrings.`medium-light` | electronLib.electronLibStrings.`ultra-dark`
  ] = js.undefined
  /**
    * Settings of web page's features.
    */
  var webPreferences: js.UndefOr[WebPreferences] = js.undefined
  /**
    * Window's width in pixels. Default is 800.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * ( if y is used) Window's left offset from screen. Default is to center the
    * window.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * ( if x is used) Window's top offset from screen. Default is to center the
    * window.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
  /**
    * Controls the behavior on macOS when option-clicking the green stoplight button
    * on the toolbar or by clicking the Window > Zoom menu item. If true, the window
    * will grow to the preferred width of the web page when zoomed, false will cause
    * it to zoom to the width of the screen. This will also affect the behavior when
    * calling maximize() directly. Default is false.
    */
  var zoomToPageWidth: js.UndefOr[scala.Boolean] = js.undefined
}

object BrowserWindowConstructorOptions {
  @scala.inline
  def apply(
    acceptFirstMouse: js.UndefOr[scala.Boolean] = js.undefined,
    alwaysOnTop: js.UndefOr[scala.Boolean] = js.undefined,
    autoHideMenuBar: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String = null,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    darkTheme: js.UndefOr[scala.Boolean] = js.undefined,
    disableAutoHideCursor: js.UndefOr[scala.Boolean] = js.undefined,
    enableLargerThanScreen: js.UndefOr[scala.Boolean] = js.undefined,
    focusable: js.UndefOr[scala.Boolean] = js.undefined,
    frame: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreenWindowTitle: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreenable: js.UndefOr[scala.Boolean] = js.undefined,
    hasShadow: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    icon: NativeImage | java.lang.String = null,
    kiosk: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    maximizable: js.UndefOr[scala.Boolean] = js.undefined,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    minimizable: js.UndefOr[scala.Boolean] = js.undefined,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    movable: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    parent: BrowserWindow = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    simpleFullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    skipTaskbar: js.UndefOr[scala.Boolean] = js.undefined,
    tabbingIdentifier: java.lang.String = null,
    thickFrame: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    titleBarStyle: electronLib.electronLibStrings.default | electronLib.electronLibStrings.hidden | electronLib.electronLibStrings.hiddenInset | electronLib.electronLibStrings.customButtonsOnHover = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    useContentSize: js.UndefOr[scala.Boolean] = js.undefined,
    vibrancy: electronLib.electronLibStrings.`appearance-based` | electronLib.electronLibStrings.light | electronLib.electronLibStrings.dark | electronLib.electronLibStrings.titlebar | electronLib.electronLibStrings.selection | electronLib.electronLibStrings.menu | electronLib.electronLibStrings.popover | electronLib.electronLibStrings.sidebar | electronLib.electronLibStrings.`medium-light` | electronLib.electronLibStrings.`ultra-dark` = null,
    webPreferences: WebPreferences = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    zoomToPageWidth: js.UndefOr[scala.Boolean] = js.undefined
  ): BrowserWindowConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptFirstMouse)) __obj.updateDynamic("acceptFirstMouse")(acceptFirstMouse)
    if (!js.isUndefined(alwaysOnTop)) __obj.updateDynamic("alwaysOnTop")(alwaysOnTop)
    if (!js.isUndefined(autoHideMenuBar)) __obj.updateDynamic("autoHideMenuBar")(autoHideMenuBar)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(darkTheme)) __obj.updateDynamic("darkTheme")(darkTheme)
    if (!js.isUndefined(disableAutoHideCursor)) __obj.updateDynamic("disableAutoHideCursor")(disableAutoHideCursor)
    if (!js.isUndefined(enableLargerThanScreen)) __obj.updateDynamic("enableLargerThanScreen")(enableLargerThanScreen)
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable)
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (!js.isUndefined(fullscreenWindowTitle)) __obj.updateDynamic("fullscreenWindowTitle")(fullscreenWindowTitle)
    if (!js.isUndefined(fullscreenable)) __obj.updateDynamic("fullscreenable")(fullscreenable)
    if (!js.isUndefined(hasShadow)) __obj.updateDynamic("hasShadow")(hasShadow)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(kiosk)) __obj.updateDynamic("kiosk")(kiosk)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minimizable)) __obj.updateDynamic("minimizable")(minimizable)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(simpleFullscreen)) __obj.updateDynamic("simpleFullscreen")(simpleFullscreen)
    if (!js.isUndefined(skipTaskbar)) __obj.updateDynamic("skipTaskbar")(skipTaskbar)
    if (tabbingIdentifier != null) __obj.updateDynamic("tabbingIdentifier")(tabbingIdentifier)
    if (!js.isUndefined(thickFrame)) __obj.updateDynamic("thickFrame")(thickFrame)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleBarStyle != null) __obj.updateDynamic("titleBarStyle")(titleBarStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(useContentSize)) __obj.updateDynamic("useContentSize")(useContentSize)
    if (vibrancy != null) __obj.updateDynamic("vibrancy")(vibrancy.asInstanceOf[js.Any])
    if (webPreferences != null) __obj.updateDynamic("webPreferences")(webPreferences)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomToPageWidth)) __obj.updateDynamic("zoomToPageWidth")(zoomToPageWidth)
    __obj.asInstanceOf[BrowserWindowConstructorOptions]
  }
}

