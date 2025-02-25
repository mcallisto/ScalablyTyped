package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemPreferences extends EventEmitter {
  def addListener(
    event: electronLib.electronLibStrings.`appearance-changed`,
    listener: js.Function1[
      /* newAppearance */ electronLib.electronLibStrings.dark | electronLib.electronLibStrings.light, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_accentcolorchanged(
    event: electronLib.electronLibStrings.`accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_colorchanged(
    event: electronLib.electronLibStrings.`color-changed`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_highcontrastcolorschemechanged(
    event: electronLib.electronLibStrings.`high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_invertedcolorschemechanged(
    event: electronLib.electronLibStrings.`inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("askForMediaAccess")
  def askForMediaAccess_camera(mediaType: electronLib.electronLibStrings.camera): js.Promise[scala.Boolean] = js.native
  /**
    * Important: In order to properly leverage this API, you must set the
    * NSMicrophoneUsageDescription and NSCameraUsageDescription strings in your app's
    * Info.plist file. The values for these keys will be used to populate the
    * permission dialogs so that the user will be properly informed as to the purpose
    * of the permission request. See Electron Application Distribution for more
    * information about how to set these in the context of Electron. This user consent
    * was not required until macOS 10.14 Mojave, so this method will always return
    * true if your system is running 10.13 High Sierra or lower.
    */
  @JSName("askForMediaAccess")
  def askForMediaAccess_microphone(mediaType: electronLib.electronLibStrings.microphone): js.Promise[scala.Boolean] = js.native
  /**
    * This API is only available on macOS 10.14 Mojave or newer.
    */
  def getAccentColor(): java.lang.String = js.native
  /**
    * Gets the macOS appearance setting that you have declared you want for your
    * application, maps to NSApplication.appearance. You can use the
    * setAppLevelAppearance API to set this value.
    */
  def getAppLevelAppearance(): electronLib.electronLibStrings.dark | electronLib.electronLibStrings.light | electronLib.electronLibStrings.unknown = js.native
  def getColor(color: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 62 */ js.Any): java.lang.String = js.native
  /**
    * Gets the macOS appearance setting that is currently applied to your application,
    * maps to NSApplication.effectiveAppearance Please note that until Electron is
    * built targeting the 10.14 SDK, your application's effectiveAppearance will
    * default to 'light' and won't inherit the OS preference. In the interim in order
    * for your application to inherit the OS preference you must set the
    * NSRequiresAquaSystemAppearance key in your apps Info.plist to false.  If you are
    * using electron-packager or electron-forge just set the enableDarwinDarkMode
    * packager option to true.  See the Electron Packager API for more details.
    */
  def getEffectiveAppearance(): electronLib.electronLibStrings.dark | electronLib.electronLibStrings.light | electronLib.electronLibStrings.unknown = js.native
  /**
    * This user consent was not required until macOS 10.14 Mojave, so this method will
    * always return granted if your system is running 10.13 High Sierra or lower.
    */
  def getMediaAccessStatus(mediaType: java.lang.String): electronLib.electronLibStrings.`not-determined` | electronLib.electronLibStrings.granted | electronLib.electronLibStrings.denied | electronLib.electronLibStrings.restricted | electronLib.electronLibStrings.unknown = js.native
  /**
    * Returns one of several standard system colors that automatically adapt to
    * vibrancy and changes in accessibility settings like 'Increase contrast' and
    * 'Reduce transparency'. See Apple Documentation for  more details.
    */
  @JSName("getSystemColor")
  def getSystemColor_blue(color: electronLib.electronLibStrings.blue): scala.Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_brown(color: electronLib.electronLibStrings.brown): scala.Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_gray(color: electronLib.electronLibStrings.gray): scala.Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_green(color: electronLib.electronLibStrings.green): scala.Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_orange(color: electronLib.electronLibStrings.orange): scala.Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_pink(color: electronLib.electronLibStrings.pink): scala.Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_purple(color: electronLib.electronLibStrings.purple): scala.Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_red(color: electronLib.electronLibStrings.red): scala.Unit = js.native
  @JSName("getSystemColor")
  def getSystemColor_yellow(color: electronLib.electronLibStrings.yellow): scala.Unit = js.native
  @JSName("getUserDefault")
  def getUserDefault_array(key: java.lang.String, `type`: electronLib.electronLibStrings.array): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_boolean(key: java.lang.String, `type`: electronLib.electronLibStrings.boolean): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_dictionary(key: java.lang.String, `type`: electronLib.electronLibStrings.dictionary): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_double(key: java.lang.String, `type`: electronLib.electronLibStrings.double): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_float(key: java.lang.String, `type`: electronLib.electronLibStrings.float): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_integer(key: java.lang.String, `type`: electronLib.electronLibStrings.integer): js.Any = js.native
  /**
    * Some popular key and types are:
    */
  @JSName("getUserDefault")
  def getUserDefault_string(key: java.lang.String, `type`: electronLib.electronLibStrings.string): js.Any = js.native
  @JSName("getUserDefault")
  def getUserDefault_url(key: java.lang.String, `type`: electronLib.electronLibStrings.url): js.Any = js.native
  /**
    * An example of using it to determine if you should create a transparent window or
    * not (transparent windows won't work correctly when DWM composition is disabled):
    */
  def isAeroGlassEnabled(): scala.Boolean = js.native
  def isDarkMode(): scala.Boolean = js.native
  def isHighContrastColorScheme(): scala.Boolean = js.native
  def isInvertedColorScheme(): scala.Boolean = js.native
  def isSwipeTrackingFromScrollEventsEnabled(): scala.Boolean = js.native
  def isTrustedAccessibilityClient(prompt: scala.Boolean): scala.Boolean = js.native
  /**
    * NOTE: This event is only emitted after you have called
    * startAppLevelAppearanceTrackingOS
    */
  def on(
    event: electronLib.electronLibStrings.`appearance-changed`,
    listener: js.Function1[
      /* newAppearance */ electronLib.electronLibStrings.dark | electronLib.electronLibStrings.light, 
      scala.Unit
    ]
  ): this.type = js.native
  // Docs: http://electronjs.org/docs/api/system-preferences
  @JSName("on")
  def on_accentcolorchanged(
    event: electronLib.electronLibStrings.`accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_colorchanged(
    event: electronLib.electronLibStrings.`color-changed`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_highcontrastcolorschemechanged(
    event: electronLib.electronLibStrings.`high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_invertedcolorschemechanged(
    event: electronLib.electronLibStrings.`inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  def once(
    event: electronLib.electronLibStrings.`appearance-changed`,
    listener: js.Function1[
      /* newAppearance */ electronLib.electronLibStrings.dark | electronLib.electronLibStrings.light, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_accentcolorchanged(
    event: electronLib.electronLibStrings.`accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_colorchanged(
    event: electronLib.electronLibStrings.`color-changed`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_highcontrastcolorschemechanged(
    event: electronLib.electronLibStrings.`high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_invertedcolorschemechanged(
    event: electronLib.electronLibStrings.`inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  /**
    * Posts event as native notifications of macOS. The userInfo is an Object that
    * contains the user information dictionary sent along with the notification.
    */
  def postLocalNotification(event: java.lang.String, userInfo: js.Any): scala.Unit = js.native
  /**
    * Posts event as native notifications of macOS. The userInfo is an Object that
    * contains the user information dictionary sent along with the notification.
    */
  def postNotification(event: java.lang.String, userInfo: js.Any): scala.Unit = js.native
  def postNotification(event: java.lang.String, userInfo: js.Any, deliverImmediately: scala.Boolean): scala.Unit = js.native
  /**
    * Posts event as native notifications of macOS. The userInfo is an Object that
    * contains the user information dictionary sent along with the notification.
    */
  def postWorkspaceNotification(event: java.lang.String, userInfo: js.Any): scala.Unit = js.native
  /**
    * Add the specified defaults to your application's NSUserDefaults.
    */
  def registerDefaults(defaults: js.Any): scala.Unit = js.native
  def removeListener(
    event: electronLib.electronLibStrings.`appearance-changed`,
    listener: js.Function1[
      /* newAppearance */ electronLib.electronLibStrings.dark | electronLib.electronLibStrings.light, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_accentcolorchanged(
    event: electronLib.electronLibStrings.`accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_colorchanged(
    event: electronLib.electronLibStrings.`color-changed`,
    listener: js.Function1[/* event */ Event, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_highcontrastcolorschemechanged(
    event: electronLib.electronLibStrings.`high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_invertedcolorschemechanged(
    event: electronLib.electronLibStrings.`inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  /**
    * Removes the key in NSUserDefaults. This can be used to restore the default or
    * global value of a key previously set with setUserDefault.
    */
  def removeUserDefault(key: java.lang.String): scala.Unit = js.native
  /**
    * Sets the appearance setting for your application, this should override the
    * system default and override the value of getEffectiveAppearance.
    */
  @JSName("setAppLevelAppearance")
  def setAppLevelAppearance_dark(appearance: electronLib.electronLibStrings.dark): scala.Unit = js.native
  @JSName("setAppLevelAppearance")
  def setAppLevelAppearance_light(appearance: electronLib.electronLibStrings.light): scala.Unit = js.native
  /**
    * Set the value of key in NSUserDefaults. Note that type should match actual type
    * of value. An exception is thrown if they don't. Some popular key and types are:
    */
  def setUserDefault(key: java.lang.String, `type`: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Same as subscribeNotification, but uses NSNotificationCenter for local defaults.
    * This is necessary for events such as NSUserDefaultsDidChangeNotification.
    */
  def subscribeLocalNotification(
    event: java.lang.String,
    callback: js.Function2[/* event */ java.lang.String, /* userInfo */ js.Any, scala.Unit]
  ): scala.Double = js.native
  /**
    * Subscribes to native notifications of macOS, callback will be called with
    * callback(event, userInfo) when the corresponding event happens. The userInfo is
    * an Object that contains the user information dictionary sent along with the
    * notification. The id of the subscriber is returned, which can be used to
    * unsubscribe the event. Under the hood this API subscribes to
    * NSDistributedNotificationCenter, example values of event are:
    */
  def subscribeNotification(
    event: java.lang.String,
    callback: js.Function2[/* event */ java.lang.String, /* userInfo */ js.Any, scala.Unit]
  ): scala.Double = js.native
  /**
    * Same as subscribeNotification, but uses
    * NSWorkspace.sharedWorkspace.notificationCenter. This is necessary for events
    * such as NSWorkspaceDidActivateApplicationNotification.
    */
  def subscribeWorkspaceNotification(
    event: java.lang.String,
    callback: js.Function2[/* event */ java.lang.String, /* userInfo */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Same as unsubscribeNotification, but removes the subscriber from
    * NSNotificationCenter.
    */
  def unsubscribeLocalNotification(id: scala.Double): scala.Unit = js.native
  /**
    * Removes the subscriber with id.
    */
  def unsubscribeNotification(id: scala.Double): scala.Unit = js.native
  /**
    * Same as unsubscribeNotification, but removes the subscriber from
    * NSWorkspace.sharedWorkspace.notificationCenter.
    */
  def unsubscribeWorkspaceNotification(id: scala.Double): scala.Unit = js.native
}

