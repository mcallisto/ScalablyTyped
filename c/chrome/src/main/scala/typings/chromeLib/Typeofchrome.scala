package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofchrome extends js.Object {
  ////////////////////
  // Accessibility Features
  ////////////////////
  /**
    * Use the chrome.accessibilityFeatures API to manage Chrome's accessibility features. This API relies on the ChromeSetting prototype of the type API for getting and setting individual accessibility features. In order to get feature states the extension must request accessibilityFeatures.read permission. For modifying feature state, the extension needs accessibilityFeatures.modify permission. Note that accessibilityFeatures.modify does not imply accessibilityFeatures.read permission.
    * Availability: Since Chrome 37.
    * Permissions: "accessibilityFeatures.read"
    * Important: This API works only on Chrome OS.
    */
  val accessibilityFeaturesNs: TypeofaccessibilityFeatures
  ////////////////////
  // Alarms
  ////////////////////
  /**
    * Use the chrome.alarms API to schedule code to run periodically or at a specified time in the future.
    * Availability: Since Chrome 22.
    * Permissions:  "alarms"
    */
  val alarmsNs: Typeofalarms
  ////////////////////
  // Bookmarks
  ////////////////////
  /**
    * Use the chrome.bookmarks API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages, which you can use to create a custom Bookmark Manager page.
    * Availability: Since Chrome 5.
    * Permissions:  "bookmarks"
    */
  val bookmarksNs: Typeofbookmarks
  ////////////////////
  // Browser Action
  ////////////////////
  /**
    * Use browser actions to put icons in the main Google Chrome toolbar, to the right of the address bar. In addition to its icon, a browser action can also have a tooltip, a badge, and a popup.
    * Availability: Since Chrome 5.
    * Manifest:  "browser_action": {...}
    */
  val browserActionNs: TypeofbrowserAction
  ////////////////////
  // Browser
  ////////////////////
  /**
    * Use the chrome.browser API to interact with the Chrome browser associated with
    * the current application and Chrome profile.
    */
  val browserNs: Typeofbrowser
  ////////////////////
  // Browsing Data
  ////////////////////
  /**
    * Use the chrome.browsingData API to remove browsing data from a user's local profile.
    * Availability: Since Chrome 19.
    * Permissions:  "browsingData"
    */
  val browsingDataNs: TypeofbrowsingData
  val castNs: Typeofcast
  ////////////////////
  // Commands
  ////////////////////
  /**
    * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to open the browser action or send a command to the extension.
    * Availability: Since Chrome 25.
    * Manifest:  "commands": {...}
    */
  val commandsNs: Typeofcommands
  ////////////////////
  // Content Settings
  ////////////////////
  /**
    * Use the chrome.contentSettings API to change settings that control whether websites can use features such as cookies, JavaScript, and plugins. More generally speaking, content settings allow you to customize Chrome's behavior on a per-site basis instead of globally.
    * Availability: Since Chrome 16.
    * Permissions:  "contentSettings"
    */
  val contentSettingsNs: TypeofcontentSettings
  ////////////////////
  // Context Menus
  ////////////////////
  /**
    * Use the chrome.contextMenus API to add items to Google Chrome's context menu. You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages.
    * Availability: Since Chrome 6.
    * Permissions:  "contextMenus"
    */
  val contextMenusNs: TypeofcontextMenus
  ////////////////////
  // Cookies
  ////////////////////
  /**
    * Use the chrome.cookies API to query and modify cookies, and to be notified when they change.
    * Availability: Since Chrome 6.
    * Permissions:  "cookies", host permissions
    */
  val cookiesNs: Typeofcookies
  ////////////////////
  // Declarative Content
  ////////////////////
  /**
    * Use the chrome.declarativeContent API to take actions depending on the content of a page, without requiring permission to read the page's content.
    * Availability: Since Chrome 33.
    * Permissions:  "declarativeContent"
    */
  val declarativeContentNs: TypeofdeclarativeContent
  ////////////////////
  // Declarative Web Request
  ////////////////////
  val declarativeWebRequestNs: TypeofdeclarativeWebRequest
  ////////////////////
  // DesktopCapture
  ////////////////////
  /**
    * Desktop Capture API that can be used to capture content of screen, individual windows or tabs.
    * Availability: Since Chrome 34.
    * Permissions:  "desktopCapture"
    */
  val desktopCaptureNs: TypeofdesktopCapture
  val devtoolsNs: Typeofdevtools
  ////////////////////
  // Document Scan
  ////////////////////
  /**
    * Use the chrome.documentScan API to discover and retrieve images from attached paper document scanners.
    * Availability: Since Chrome 44.
    * Permissions:  "documentScan"
    * Important: This API works only on Chrome OS.
    */
  val documentScanNs: TypeofdocumentScan
  ////////////////////
  // Dev Tools - Downloads
  ////////////////////
  /**
    * Use the chrome.downloads API to programmatically initiate, monitor, manipulate, and search for downloads.
    * Availability: Since Chrome 31.
    * Permissions:  "downloads"
    */
  val downloadsNs: Typeofdownloads
  val enterpriseNs: Typeofenterprise
  ////////////////////
  // Events
  ////////////////////
  /**
    * The chrome.events namespace contains common types used by APIs dispatching events to notify you when something interesting happens.
    * Availability: Since Chrome 21.
    */
  val eventsNs: js.Any
  ////////////////////
  // Extension
  ////////////////////
  /**
    * The chrome.extension API has utilities that can be used by any extension page. It includes support for exchanging messages between an extension and its content scripts or between extensions, as described in detail in Message Passing.
    * Availability: Since Chrome 5.
    */
  val extensionNs: Typeofextension
  ////////////////////
  // File Browser Handler
  ////////////////////
  /**
    * Use the chrome.fileBrowserHandler API to extend the Chrome OS file browser. For example, you can use this API to enable users to upload files to your website.
    * Availability: Since Chrome 12.
    * Permissions:  "fileBrowserHandler"
    * Important: This API works only on Chrome OS.
    */
  val fileBrowserHandlerNs: TypeoffileBrowserHandler
  ////////////////////
  // File System Provider
  ////////////////////
  /**
    * Use the chrome.fileSystemProvider API to create file systems, that can be accessible from the file manager on Chrome OS.
    * Availability: Since Chrome 40.
    * Permissions:  "fileSystemProvider"
    * Important: This API works only on Chrome OS.
    */
  val fileSystemProviderNs: TypeoffileSystemProvider
  ////////////////////
  // Font Settings
  ////////////////////
  /**
    * Use the chrome.fontSettings API to manage Chrome's font settings.
    * Availability: Since Chrome 22.
    * Permissions:  "fontSettings"
    */
  val fontSettingsNs: TypeoffontSettings
  ////////////////////
  // Google Cloud Messaging
  ////////////////////
  /**
    * Use chrome.gcm to enable apps and extensions to send and receive messages through the Google Cloud Messaging Service.
    * Availability: Since Chrome 35.
    * Permissions:  "gcm"
    */
  val gcmNs: Typeofgcm
  ////////////////////
  // History
  ////////////////////
  /**
    * Use the chrome.history API to interact with the browser's record of visited pages. You can add, remove, and query for URLs in the browser's history. To override the history page with your own version, see Override Pages.
    * Availability: Since Chrome 5.
    * Permissions:  "history"
    */
  val historyNs: Typeofhistory
  ////////////////////
  // i18n
  ////////////////////
  /**
    * Use the chrome.i18n infrastructure to implement internationalization across your whole app or extension.
    * @since Chrome 5.
    */
  val i18nNs: Typeofi18n
  ////////////////////
  // Identity
  ////////////////////
  /**
    * Use the chrome.identity API to get OAuth2 access tokens.
    * Permissions:  "identity"
    * @since Chrome 29.
    */
  val identityNs: Typeofidentity
  ////////////////////
  // Idle
  ////////////////////
  /**
    * Use the chrome.idle API to detect when the machine's idle state changes.
    * Permissions:  "idle"
    * @since Chrome 6.
    */
  val idleNs: Typeofidle
  val inputNs: Typeofinput
  ////////////////////
  // Management
  ////////////////////
  /**
    * The chrome.management API provides ways to manage the list of extensions/apps that are installed and running. It is particularly useful for extensions that override the built-in New Tab page.
    * Permissions:  "management"
    * @since Chrome 8.
    */
  val managementNs: Typeofmanagement
  val networkingNs: Typeofnetworking
  ////////////////////
  // Notifications
  // https://developer.chrome.com/extensions/notifications
  ////////////////////
  /**
    * Use the chrome.notifications API to create rich notifications using templates and show these notifications to users in the system tray.
    * Permissions:  "notifications"
    * @since Chrome 28.
    */
  val notificationsNs: Typeofnotifications
  ////////////////////
  // Omnibox
  ////////////////////
  /**
    * The omnibox API allows you to register a keyword with Google Chrome's address bar, which is also known as the omnibox.
    * Manifest:  "omnibox": {...}
    * @since Chrome 9.
    */
  val omniboxNs: Typeofomnibox
  ////////////////////
  // Page Action
  ////////////////////
  /**
    * Use the chrome.pageAction API to put icons inside the address bar. Page actions represent actions that can be taken on the current page, but that aren't applicable to all pages.
    * Manifest:  "page_action": {...}
    * @since Chrome 5.
    */
  val pageActionNs: TypeofpageAction
  ////////////////////
  // Page Capture
  ////////////////////
  /**
    * Use the chrome.pageCapture API to save a tab as MHTML.
    * Permissions:  "pageCapture"
    * @since Chrome 18.
    */
  val pageCaptureNs: TypeofpageCapture
  ////////////////////
  // Permissions
  ////////////////////
  /**
    * Use the chrome.permissions API to request declared optional permissions at run time rather than install time, so users understand why the permissions are needed and grant only those that are necessary.
    * @since Chrome 16.
    */
  val permissionsNs: Typeofpermissions
  ////////////////////
  // Platform Keys
  ////////////////////
  /**
    * Use the chrome.platformKeys API to access client certificates managed by the platform. If the user or policy grants the permission, an extension can use such a certficate in its custom authentication protocol. E.g. this allows usage of platform managed certificates in third party VPNs (see chrome.vpnProvider).
    * Permissions:  "platformKeys"
    * Important: This API works only on Chrome OS.
    * @since Chrome 45.
    */
  val platformKeysNs: TypeofplatformKeysCallback
  ////////////////////
  // Power
  ////////////////////
  /**
    * Use the chrome.power API to override the system's power management features.
    * Permissions:  "power"
    * @since Chrome 27.
    */
  val powerNs: Typeofpower
  ////////////////////
  // Printer Provider
  ////////////////////
  /**
    * The chrome.printerProvider API exposes events used by print manager to query printers controlled by extensions, to query their capabilities and to submit print jobs to these printers.
    * Permissions:  "printerProvider"
    * @since Chrome 44.
    */
  val printerProviderNs: TypeofprinterProvider
  ////////////////////
  // Privacy
  ////////////////////
  /**
    * Use the chrome.privacy API to control usage of the features in Chrome that can affect a user's privacy. This API relies on the ChromeSetting prototype of the type API for getting and setting Chrome's configuration.
    * Permissions:  "privacy"
    * The Chrome Privacy Whitepaper gives background detail regarding the features which this API can control.
    * @since Chrome 18.
    */
  val privacyNs: Typeofprivacy
  ////////////////////
  // Proxy
  ////////////////////
  /**
    * Use the chrome.proxy API to manage Chrome's proxy settings. This API relies on the ChromeSetting prototype of the type API for getting and setting the proxy configuration.
    * Permissions:  "proxy"
    * @since Chrome 13.
    */
  val proxyNs: Typeofproxy
  ////////////////////
  // Runtime
  ////////////////////
  /**
    * Use the chrome.runtime API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
    * @since Chrome 22
    */
  val runtimeNs: Typeofruntime
  ////////////////////
  // Script Badge
  ////////////////////
  val scriptBadgeNs: TypeofscriptBadge
  ////////////////////
  // Serial
  ////////////////////
  /**
    * Use the <code>chrome.serial</code> API to read from and write to a device connected to a serial port.
    * Permissions:  "enterprise.serial"
    * Since: Chrome 29
    * Important: This API works only on Chrome OS.
    */
  val serialNs: Typeofserial
  ////////////////////
  // Sessions
  ////////////////////
  /**
    * Use the chrome.sessions API to query and restore tabs and windows from a browsing session.
    * Permissions:  "sessions"
    * @since Chrome 37.
    */
  val sessionsNs: Typeofsessions
  ////////////////////
  // Socket
  ////////////////////
  val socketNs: Typeofsocket
  ////////////////////
  // Storage
  ////////////////////
  /**
    * Use the chrome.storage API to store, retrieve, and track changes to user data.
    * Permissions:  "storage"
    * @since Chrome 20.
    */
  val storageNs: Typeofstorage
  val systemNs: Typeofsystem
  ////////////////////
  // TabCapture
  ////////////////////
  /**
    * Use the chrome.tabCapture API to interact with tab media streams.
    * Permissions:  "tabCapture"
    * @since Chrome 31.
    */
  val tabCaptureNs: TypeoftabCapture
  ////////////////////
  // Tabs
  ////////////////////
  /**
    * Use the chrome.tabs API to interact with the browser's tab system. You can use this API to create, modify, and rearrange tabs in the browser.
    * Permissions: The majority of the chrome.tabs API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab.
    * @since Chrome 5.
    */
  val tabsNs: Typeoftabs
  ////////////////////
  // Top Sites
  ////////////////////
  /**
    * Use the chrome.topSites API to access the top sites that are displayed on the new tab page.
    * Permissions:  "topSites"
    * @since Chrome 19.
    */
  val topSitesNs: TypeoftopSites
  ////////////////////
  // Text to Speech Engine
  ////////////////////
  /**
    * Use the chrome.ttsEngine API to implement a text-to-speech(TTS) engine using an extension. If your extension registers using this API, it will receive events containing an utterance to be spoken and other parameters when any extension or Chrome App uses the tts API to generate speech. Your extension can then use any available web technology to synthesize and output the speech, and send events back to the calling function to report the status.
    * Permissions:  "ttsEngine"
    * @since Chrome 14.
    */
  val ttsEngineNs: TypeofttsEngine
  ////////////////////
  // Text to Speech
  ////////////////////
  /**
    * Use the chrome.tts API to play synthesized text-to-speech (TTS). See also the related ttsEngine API, which allows an extension to implement a speech engine.
    * Permissions:  "tts"
    * @since Chrome 14.
    */
  val ttsNs: Typeoftts
  ////////////////////
  // Types
  ////////////////////
  /**
    * The chrome.types API contains type declarations for Chrome.
    * @since Chrome 13.
    */
  val typesNs: js.Any
  val underscoreDebuggerNs: Typeof_debugger
  ////////////////////
  // VPN Provider
  ////////////////////
  /**
    * Use the chrome.vpnProvider API to implement a VPN client.
    * Permissions:  "vpnProvider"
    * Important: This API works only on Chrome OS.
    * @since Chrome 43.
    */
  val vpnProviderNs: TypeofvpnProvider
  ////////////////////
  // Wallpaper
  ////////////////////
  /**
    * Use the chrome.wallpaper API to change the ChromeOS wallpaper.
    * Permissions:  "wallpaper"
    * Important: This API works only on Chrome OS.
    * @since Chrome 43.
    */
  val wallpaperNs: Typeofwallpaper
  ////////////////////
  // Web Navigation
  ////////////////////
  /**
    * Use the chrome.webNavigation API to receive notifications about the status of navigation requests in-flight.
    * Permissions:  "webNavigation"
    * @since Chrome 16.
    */
  val webNavigationNs: TypeofwebNavigation
  ////////////////////
  // Web Request
  ////////////////////
  /**
    * Use the chrome.webRequest API to observe and analyze traffic and to intercept, block, or modify requests in-flight.
    * Permissions:  "webRequest", host permissions
    * @since Chrome 17.
    */
  val webRequestNs: TypeofwebRequest
  ////////////////////
  // Web Store
  ////////////////////
  /**
    * Use the chrome.webstore API to initiate app and extension installations "inline" from your site.
    * @since Chrome 15.
    */
  val webstoreNs: Typeofwebstore
  ////////////////////
  // Windows
  ////////////////////
  /**
    * Use the chrome.windows API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
    * Permissions: The chrome.windows API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab objects.
    * @since Chrome 5.
    */
  val windowsNs: Typeofwindows
}

object Typeofchrome {
  @scala.inline
  def apply(
    accessibilityFeaturesNs: TypeofaccessibilityFeatures,
    alarmsNs: Typeofalarms,
    bookmarksNs: Typeofbookmarks,
    browserActionNs: TypeofbrowserAction,
    browserNs: Typeofbrowser,
    browsingDataNs: TypeofbrowsingData,
    castNs: Typeofcast,
    commandsNs: Typeofcommands,
    contentSettingsNs: TypeofcontentSettings,
    contextMenusNs: TypeofcontextMenus,
    cookiesNs: Typeofcookies,
    declarativeContentNs: TypeofdeclarativeContent,
    declarativeWebRequestNs: TypeofdeclarativeWebRequest,
    desktopCaptureNs: TypeofdesktopCapture,
    devtoolsNs: Typeofdevtools,
    documentScanNs: TypeofdocumentScan,
    downloadsNs: Typeofdownloads,
    enterpriseNs: Typeofenterprise,
    eventsNs: js.Any,
    extensionNs: Typeofextension,
    fileBrowserHandlerNs: TypeoffileBrowserHandler,
    fileSystemProviderNs: TypeoffileSystemProvider,
    fontSettingsNs: TypeoffontSettings,
    gcmNs: Typeofgcm,
    historyNs: Typeofhistory,
    i18nNs: Typeofi18n,
    identityNs: Typeofidentity,
    idleNs: Typeofidle,
    inputNs: Typeofinput,
    managementNs: Typeofmanagement,
    networkingNs: Typeofnetworking,
    notificationsNs: Typeofnotifications,
    omniboxNs: Typeofomnibox,
    pageActionNs: TypeofpageAction,
    pageCaptureNs: TypeofpageCapture,
    permissionsNs: Typeofpermissions,
    platformKeysNs: TypeofplatformKeysCallback,
    powerNs: Typeofpower,
    printerProviderNs: TypeofprinterProvider,
    privacyNs: Typeofprivacy,
    proxyNs: Typeofproxy,
    runtimeNs: Typeofruntime,
    scriptBadgeNs: TypeofscriptBadge,
    serialNs: Typeofserial,
    sessionsNs: Typeofsessions,
    socketNs: Typeofsocket,
    storageNs: Typeofstorage,
    systemNs: Typeofsystem,
    tabCaptureNs: TypeoftabCapture,
    tabsNs: Typeoftabs,
    topSitesNs: TypeoftopSites,
    ttsEngineNs: TypeofttsEngine,
    ttsNs: Typeoftts,
    typesNs: js.Any,
    underscoreDebuggerNs: Typeof_debugger,
    vpnProviderNs: TypeofvpnProvider,
    wallpaperNs: Typeofwallpaper,
    webNavigationNs: TypeofwebNavigation,
    webRequestNs: TypeofwebRequest,
    webstoreNs: Typeofwebstore,
    windowsNs: Typeofwindows
  ): Typeofchrome = {
    val __obj = js.Dynamic.literal(accessibilityFeaturesNs = accessibilityFeaturesNs, alarmsNs = alarmsNs, bookmarksNs = bookmarksNs, browserActionNs = browserActionNs, browserNs = browserNs, browsingDataNs = browsingDataNs, castNs = castNs, commandsNs = commandsNs, contentSettingsNs = contentSettingsNs, contextMenusNs = contextMenusNs, cookiesNs = cookiesNs, declarativeContentNs = declarativeContentNs, declarativeWebRequestNs = declarativeWebRequestNs, desktopCaptureNs = desktopCaptureNs, devtoolsNs = devtoolsNs, documentScanNs = documentScanNs, downloadsNs = downloadsNs, enterpriseNs = enterpriseNs, eventsNs = eventsNs, extensionNs = extensionNs, fileBrowserHandlerNs = fileBrowserHandlerNs, fileSystemProviderNs = fileSystemProviderNs, fontSettingsNs = fontSettingsNs, gcmNs = gcmNs, historyNs = historyNs, i18nNs = i18nNs, identityNs = identityNs, idleNs = idleNs, inputNs = inputNs, managementNs = managementNs, networkingNs = networkingNs, notificationsNs = notificationsNs, omniboxNs = omniboxNs, pageActionNs = pageActionNs, pageCaptureNs = pageCaptureNs, permissionsNs = permissionsNs, platformKeysNs = platformKeysNs, powerNs = powerNs, printerProviderNs = printerProviderNs, privacyNs = privacyNs, proxyNs = proxyNs, runtimeNs = runtimeNs, scriptBadgeNs = scriptBadgeNs, serialNs = serialNs, sessionsNs = sessionsNs, socketNs = socketNs, storageNs = storageNs, systemNs = systemNs, tabCaptureNs = tabCaptureNs, tabsNs = tabsNs, topSitesNs = topSitesNs, ttsEngineNs = ttsEngineNs, ttsNs = ttsNs, typesNs = typesNs, underscoreDebuggerNs = underscoreDebuggerNs, vpnProviderNs = vpnProviderNs, wallpaperNs = wallpaperNs, webNavigationNs = webNavigationNs, webRequestNs = webRequestNs, webstoreNs = webstoreNs, windowsNs = windowsNs)
  
    __obj.asInstanceOf[Typeofchrome]
  }
}

