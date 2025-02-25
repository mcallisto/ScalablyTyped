package typings
package firebaseDashAdminLib.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing an FCM legacy API notification message payload.
  * Notification messages let developers send up to 4KB of predefined
  * key-value pairs. Accepted keys are outlined below.
  *
  * See [Build send requests](/docs/cloud-messaging/send-message)
  * for code samples and detailed documentation.
  */
trait NotificationMessagePayload
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] {
  /**
    * The value of the badge on the home screen app icon.
    *
    * If not specified, the badge is not changed.
    *
    * If set to `0`, the badge is removed.
    *
    * **Platforms:** iOS
    */
  var badge: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The notification's body text.
    *
    * **Platforms:** iOS, Android, Web
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Variable string values to be used in place of the format specifiers in
    * `body_loc_key` to use to localize the body text to the user's current
    * localization.
    *
    * The value should be a stringified JSON array.
    *
    * **iOS:** Corresponds to `loc-args` in the APNs payload. See
    * [Payload Key Reference](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
    * and
    * [Localizing the Content of Your Remote Notifications](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9)
    * for more information.
    *
    * **Android:** See
    * [Formatting and Styling](http://developer.android.com/guide/topics/resources/string-resource.html#FormattingAndStyling)
    * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var bodyLocArgs: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The key to the body string in the app's string resources to use to localize
    * the body text to the user's current localization.
    *
    * **iOS:** Corresponds to `loc-key` in the APNs payload. See
    * [Payload Key Reference](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
    * and
    * [Localizing the Content of Your Remote Notifications](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9)
    * for more information.
    *
    * **Android:** See
    * [String Resources](http://developer.android.com/guide/topics/resources/string-resource.html)      * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var bodyLocKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Action associated with a user click on the notification. If specified, an
    * activity with a matching Intent Filter is launched when a user clicks on the
    * notification.
    *
    *   * **Platforms:** Android
    */
  var clickAction: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The notification icon's color, expressed in `#rrggbb` format.
    *
    * **Platforms:** Android
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The notification's icon.
    *
    * **Android:** Sets the notification icon to `myicon` for drawable resource
    * `myicon`. If you don't send this key in the request, FCM displays the
    * launcher icon specified in your app manifest.
    *
    * **Web:** The URL to use for the notification's icon.
    *
    * **Platforms:** Android, Web
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier used to replace existing notifications in the notification drawer.
    *
    * If not specified, each request creates a new notification.
    *
    * If specified and a notification with the same tag is already being shown,
    * the new notification replaces the existing one in the notification drawer.
    *
    * **Platforms:** Android
    */
  var sound: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The notification's title.
    *
    * **Platforms:** iOS, Android, Web
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Variable string values to be used in place of the format specifiers in
    * `title_loc_key` to use to localize the title text to the user's current
    * localization.
    *
    * The value should be a stringified JSON array.
    *
    * **iOS:** Corresponds to `title-loc-args` in the APNs payload. See
    * [Payload Key Reference](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
    * and
    * [Localizing the Content of Your Remote Notifications](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9)
    * for more information.
    *
    * **Android:** See
    * [Formatting and Styling](http://developer.android.com/guide/topics/resources/string-resource.html#FormattingAndStyling)
    * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var titleLocArgs: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The key to the title string in the app's string resources to use to localize
    * the title text to the user's current localization.
    *
    * **iOS:** Corresponds to `title-loc-key` in the APNs payload. See
    * [Payload Key Reference](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
    * and
    * [Localizing the Content of Your Remote Notifications](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9)
    * for more information.
    *
    * **Android:** See
    * [String Resources](http://developer.android.com/guide/topics/resources/string-resource.html)
    * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var titleLocKey: js.UndefOr[java.lang.String] = js.undefined
}

object NotificationMessagePayload {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    badge: java.lang.String = null,
    body: java.lang.String = null,
    bodyLocArgs: java.lang.String = null,
    bodyLocKey: java.lang.String = null,
    clickAction: java.lang.String = null,
    color: java.lang.String = null,
    icon: java.lang.String = null,
    sound: java.lang.String = null,
    tag: java.lang.String = null,
    title: java.lang.String = null,
    titleLocArgs: java.lang.String = null,
    titleLocKey: java.lang.String = null
  ): NotificationMessagePayload = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (body != null) __obj.updateDynamic("body")(body)
    if (bodyLocArgs != null) __obj.updateDynamic("bodyLocArgs")(bodyLocArgs)
    if (bodyLocKey != null) __obj.updateDynamic("bodyLocKey")(bodyLocKey)
    if (clickAction != null) __obj.updateDynamic("clickAction")(clickAction)
    if (color != null) __obj.updateDynamic("color")(color)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleLocArgs != null) __obj.updateDynamic("titleLocArgs")(titleLocArgs)
    if (titleLocKey != null) __obj.updateDynamic("titleLocKey")(titleLocKey)
    __obj.asInstanceOf[NotificationMessagePayload]
  }
}

