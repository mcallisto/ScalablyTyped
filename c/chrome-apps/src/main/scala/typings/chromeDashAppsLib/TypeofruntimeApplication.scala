package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofruntimeApplication extends js.Object {
  val OnInstalledReason: Anon_CHROMEUPDATE = js.native
  val OnRestartRequiredReason: Anon_APPUPDATE = js.native
  val PlatformArch: Anon_ARM = js.native
  val PlatformOs: Anon_ANDROID = js.native
  val RequestUpdateCheckStatus: Anon_NOUPDATE = js.native
  /** The ID of the app. */
  val id: java.lang.String = js.native
  /** This will be defined during an API method callback if there was an error */
  val lastError: js.UndefOr[chromeDashAppsLib.chromeNs.runtimeNs.LastError] = js.native
  /**
    * @deprecated since Chrome 33. Please use **chrome.runtime.onRestartRequired**.
    * Fired when a Chrome update is available, but isn't installed immediately because a browser restart is required.
    */
  val onBrowserUpdateAvailable: chromeDashAppsLib.chromeNs.runtimeNs.RuntimeEvent = js.native
  /**
    * Fired when a connection is made from either an extension process or a content script.
    * @since Chrome 26.
    */
  val onConnect: chromeDashAppsLib.chromeNs.runtimeNs.ExtensionConnectEvent = js.native
  /**
    * Fired when a connection is made from another extension.
    * @since Chrome 26.
    */
  val onConnectExternal: chromeDashAppsLib.chromeNs.runtimeNs.ExtensionConnectEvent = js.native
  /** Fired when the extension is first installed, when the extension is updated to a new version, and when Chrome is updated to a new version. */
  val onInstalled: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[/* details */ chromeDashAppsLib.chromeNs.runtimeNs.InstalledDetails, scala.Unit]
  ] = js.native
  /**
    * Fired when a message is sent from either an extension process or a content script.
    * @since Chrome 26.
    */
  val onMessage: chromeDashAppsLib.chromeNs.runtimeNs.ExtensionMessageEvent = js.native
  /**
    * Fired when a message is sent from another app. Cannot be used in a content script.
    * @since Chrome 26.
    */
  val onMessageExternal: chromeDashAppsLib.chromeNs.runtimeNs.ExtensionMessageEvent = js.native
  /**
    * @required(Chrome OS Kiosk app) Currently, this event is only fired for Chrome OS kiosk apps.
    * Fired when an app or the device that it runs on needs to be restarted.
    * The app should close all its windows at its earliest convenient time to let the restart to happen.
    * If the app does nothing, a restart will be enforced after a 24-hour grace period has passed.
    * @since Chrome 29.
    */
  val onRestartRequired: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* reason */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        /* import warning: ImportType.apply Failed type conversion: typeof OnRestartRequiredReason */ js.Any, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: typeof OnRestartRequiredReason[keyof typeof OnRestartRequiredReason] */ js.Any
        ]
      ], 
      scala.Unit
    ]
  ] = js.native
  /**
    * Fired when a profile that has this app installed first starts up. This event is not fired when an incognito profile is started, even if this app is operating in 'split' incognito mode.
    * @since Chrome 23.
    */
  val onStartup: chromeDashAppsLib.chromeNs.runtimeNs.RuntimeEvent = js.native
  /** Sent to the event page just before it is unloaded. This gives the extension opportunity to do some clean up. Note that since the page is unloading, any asynchronous operations started while handling this event are not guaranteed to complete. If more activity for the event page occurs before it gets unloaded the onSuspendCanceled event will be sent and the page won't be unloaded. */
  val onSuspend: chromeDashAppsLib.chromeNs.runtimeNs.RuntimeEvent = js.native
  /** Sent after onSuspend to indicate that the app won't be unloaded after all. */
  val onSuspendCanceled: chromeDashAppsLib.chromeNs.runtimeNs.RuntimeEvent = js.native
  /**
    * Fired when an update is available, but isn't installed immediately because the app is currently running.
    * If you do nothing, the update will be installed the next time the background page gets unloaded,
    * if you want it to be installed sooner you can explicitly call chrome.runtime.reload().
    * If your extension is using a persistent background page, the background page of course never gets unloaded,
    * so unless you call chrome.runtime.reload() manually in response to this event the update
    * will not get installed until the next time chrome itself restarts. If no handlers are listening for this event,
    * and your extension has a persistent background page, it behaves as if chrome.runtime.reload()
    * is called in response to this event.
    * @since Chrome 25.
    */
  val onUpdateAvailable: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* details */ chromeDashAppsLib.chromeNs.runtimeNs.UpdateAvailableDetails, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Attempts to connect to connect listeners within an app (such as the background page), or other apps.
    * This is useful for content scripts connecting to their extension processes, inter-app communication, and web messaging.
    * Note that this does not connect to any listeners in a content script.
    * @since Chrome 26.
    */
  def connect(): chromeDashAppsLib.chromeNs.runtimeNs.Port = js.native
  def connect(connectInfo: chromeDashAppsLib.chromeNs.runtimeNs.ConnectInfo): chromeDashAppsLib.chromeNs.runtimeNs.Port = js.native
  /**
    * Attempts to connect to connect listeners within an app (such as the background page), or other apps.
    * This is useful for content scripts connecting to their extension processes, inter-app communication, and web messaging.
    * Note that this does not connect to any listeners in a content script.
    * @since Chrome 26.
    * @param extensionId Optional; ID of the extension.
    * The ID of the extension or app to connect to.
    * If omitted, a connection will be attempted with your own app.
    * Required if sending messages from a web page for web messaging.
    */
  def connect(extensionId: java.lang.String): chromeDashAppsLib.chromeNs.runtimeNs.Port = js.native
  def connect(extensionId: java.lang.String, connectInfo: chromeDashAppsLib.chromeNs.runtimeNs.ConnectInfo): chromeDashAppsLib.chromeNs.runtimeNs.Port = js.native
  /**
    * Connects to a native application in the host machine.
    * @since Chrome 28.
    * @param application The name of the registered application to connect to.
    */
  def connectNative(application: java.lang.String): chromeDashAppsLib.chromeNs.runtimeNs.Port = js.native
  /**
    * Retrieves the JavaScript 'window' object for the background page running inside the current app.
    * If the background page is an event page, the system will ensure it is loaded before calling the callback.
    * If there is no background page, an error is set.
    */
  def getBackgroundPage(callback: js.Function1[/* backgroundPage */ js.UndefOr[this.type], scala.Unit]): scala.Unit = js.native
  /**
    * Returns details about the app from the manifest.
    * The object returned is a serialization of the full manifest file.
    * @returns The manifest details.
    */
  def getManifest(): chromeDashAppsLib.chromeNs.runtimeNs.Manifest = js.native
  /**
    * Returns a DirectoryEntry for the package directory.
    * @since Chrome 29.
    */
  def getPackageDirectoryEntry(callback: js.Function1[/* directoryEntry */ filesystemLib.DirectoryEntry, scala.Unit]): scala.Unit = js.native
  /**
    * Returns information about the current platform.
    * @since Chrome 29.
    * @param callback Called with results
    */
  def getPlatformInfo(
    callback: js.Function1[/* platformInfo */ chromeDashAppsLib.chromeNs.runtimeNs.PlatformInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Converts a relative path within an app install directory to a fully-qualified URL.
    * @param path A path to a resource within an app expressed relative to its install directory.
    */
  def getURL(path: java.lang.String): java.lang.String = js.native
  /**
    * Reloads the app .
    * @since Chrome 25.
    */
  def reload(): scala.Unit = js.native
  /**
    * Requests an update check for this app.
    * @since Chrome 25.
    * @param callback
    * Parameter status: Result of the update check. See enum RequestUpdateCheckStatus.
    * Optional parameter details: If an update is available, this contains more information about the available update.
    */
  def requestUpdateCheck(
    callback: js.Function2[
      /* status */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        /* import warning: ImportType.apply Failed type conversion: typeof RequestUpdateCheckStatus */ js.Any, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: typeof RequestUpdateCheckStatus[keyof typeof RequestUpdateCheckStatus] */ js.Any
        ]
      ], 
      /* details */ js.UndefOr[chromeDashAppsLib.chromeNs.runtimeNs.UpdateCheckDetails], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Restart the ChromeOS device when the app runs in kiosk mode. Otherwise, it's no-op.
    * @since Chrome 32.
    */
  def restart(): scala.Unit = js.native
  /**
    * Sends a single message to event listeners within your app or a different app. Similar to runtime.connect but only sends a single message, with an optional response. If sending to your extension, the runtime.onMessage event will be fired in each page, or runtime.onMessageExternal, if a different extension. Note that extensions cannot send messages to content scripts using this method.
    * @since Chrome 32.
    * @param extensionId The ID of the app to send the message to. If omitted, the message will be sent to your own app. Required if sending messages from a web page for web messaging.
    * @param [responseCallback]
    * Parameter response: The JSON response object sent by the handler of the message. If an error occurs while connecting to the extension, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  def sendMessage(extensionId: java.lang.String, message: js.Any): scala.Unit = js.native
  def sendMessage(
    extensionId: java.lang.String,
    message: js.Any,
    options: chromeDashAppsLib.chromeNs.runtimeNs.MessageOptions
  ): scala.Unit = js.native
  def sendMessage(
    extensionId: java.lang.String,
    message: js.Any,
    options: chromeDashAppsLib.chromeNs.runtimeNs.MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendMessage(
    extensionId: java.lang.String,
    message: js.Any,
    options: scala.Null,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sends a single message to event listeners within your app or a different app. Similar to runtime.connect but only sends a single message, with an optional response.
    * If sending to your extension, the runtime.onMessage event will be fired in each page, or runtime.onMessageExternal, if a different extension.
    * Note that extensions cannot send messages to content scripts using this method.
    * @since Chrome 26.
    * @param [responseCallback]
    * Parameter response: The JSON response object sent by the handler of the message. If an error occurs while connecting to the extension, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  def sendMessage(message: js.Any): scala.Unit = js.native
  def sendMessage(message: js.Any, options: chromeDashAppsLib.chromeNs.runtimeNs.MessageOptions): scala.Unit = js.native
  def sendMessage(
    message: js.Any,
    options: chromeDashAppsLib.chromeNs.runtimeNs.MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendMessage(
    message: js.Any,
    options: scala.Null,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendMessage(message: js.Any, responseCallback: js.Function1[/* response */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Send a single message to a native application.
    * @since Chrome 28.
    * @param application The of the native messaging host.
    * @param message The message that will be passed to the native messaging host.
    * @param responseCallback Optional.
    * Parameter response: The response message sent by the native messaging host. If an error occurs while connecting to the native messaging host, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  def sendNativeMessage(application: java.lang.String, message: js.Object): scala.Unit = js.native
  def sendNativeMessage(
    application: java.lang.String,
    message: js.Object,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the URL to be visited upon uninstallation. This may be used to clean up server-side data, do analytics, and implement surveys. Maximum 255 characters.
    * @since Chrome 41.
    * @param url Since Chrome 34.
    * URL to be opened after the extension is uninstalled. This URL must have an http: or https: scheme. Set an empty string to not open a new tab upon uninstallation.
    * @param callback Called when the uninstall URL is set. If the given URL is invalid, runtime.lastError will be set.
    */
  def setUninstallURL(url: java.lang.String): scala.Unit = js.native
  def setUninstallURL(url: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

