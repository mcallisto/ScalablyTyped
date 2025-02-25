package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The NotificationMessages object is returned as the notificationMessages property of an item.
  *
  * [Api set: Mailbox 1.3]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait NotificationMessages extends js.Object {
  /**
    * Adds a notification to an item.
    *
    * There are a maximum of 5 notifications per message. Setting more will return a NumberOfNotificationMessagesExceeded error.
    *
    * @param key - A developer-specified key used to reference this notification message. 
    *             Developers can use it to modify this message later. It can't be longer than 32 characters.
    * @param JSONmessage - A JSON object that contains the notification message to be added to the item. 
    *                    It contains a NotificationMessageDetails object.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  def addAsync(key: java.lang.String, JSONmessage: NotificationMessageDetails): scala.Unit = js.native
  def addAsync(
    key: java.lang.String,
    JSONmessage: NotificationMessageDetails,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def addAsync(key: java.lang.String, JSONmessage: NotificationMessageDetails, options: AsyncContextOptions): scala.Unit = js.native
  def addAsync(
    key: java.lang.String,
    JSONmessage: NotificationMessageDetails,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns all keys and messages for an item.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult.
    *                 The `value` property of the result is an array of NotificationMessageDetails objects.
    */
  def getAllAsync(): scala.Unit = js.native
  def getAllAsync(
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[NotificationMessageDetails]], scala.Unit]
  ): scala.Unit = js.native
  def getAllAsync(options: AsyncContextOptions): scala.Unit = js.native
  def getAllAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[NotificationMessageDetails]], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Removes a notification message for an item.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @param key - The key for the notification message to remove.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  def removeAsync(key: java.lang.String): scala.Unit = js.native
  def removeAsync(
    key: java.lang.String,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def removeAsync(key: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def removeAsync(
    key: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Replaces a notification message that has a given key with another message.
    *
    * If a notification message with the specified key doesn't exist, replaceAsync will add the notification.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @param key - The key for the notification message to replace. It can't be longer than 32 characters.
    * @param JSONmessage - A JSON object that contains the new notification message to replace the existing message. 
    *                    It contains a NotificationMessageDetails object.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  def replaceAsync(key: java.lang.String, JSONmessage: NotificationMessageDetails): scala.Unit = js.native
  def replaceAsync(
    key: java.lang.String,
    JSONmessage: NotificationMessageDetails,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def replaceAsync(key: java.lang.String, JSONmessage: NotificationMessageDetails, options: AsyncContextOptions): scala.Unit = js.native
  def replaceAsync(
    key: java.lang.String,
    JSONmessage: NotificationMessageDetails,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

