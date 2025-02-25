package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The body object provides methods for adding and updating the content of the message or appointment. 
  * It is returned in the body property of the selected item.
  *
  * [Api set: Mailbox 1.1]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait Body extends js.Object {
  def getAsync(coercionType: java.lang.String): scala.Unit = js.native
  def getAsync(
    coercionType: java.lang.String,
    callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getAsync(coercionType: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def getAsync(
    coercionType: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns the current body in a specified format.
    *
    * This method returns the entire current body in the format specified by coercionType.
    *
    * When working with HTML-formatted bodies, it is important to note that the Body.getAsync and Body.setAsync methods are not idempotent. 
    * The value returned from the getAsync method will not necessarily be exactly the same as the value that was passed in the setAsync method previously. 
    * The client may modify the value passed to setAsync in order to make it render efficiently with its rendering engine.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @param coercionType - The format for the returned body.
    * @param options - Optional. An object literal that contains one or more of the following properties:
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult. 
    *                  The body is provided in the requested format in the asyncResult.value property.
    */
  def getAsync(coercionType: CoercionType): scala.Unit = js.native
  def getAsync(
    coercionType: CoercionType,
    callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getAsync(coercionType: CoercionType, options: AsyncContextOptions): scala.Unit = js.native
  def getAsync(
    coercionType: CoercionType,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets a value that indicates whether the content is in HTML or text format.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult.
    *                  The content type is returned as one of the CoercionType values in the asyncResult.value property.
    */
  def getTypeAsync(): scala.Unit = js.native
  def getTypeAsync(callback: js.Function1[/* asyncResult */ AsyncResult[CoercionType], scala.Unit]): scala.Unit = js.native
  def getTypeAsync(options: AsyncContextOptions): scala.Unit = js.native
  def getTypeAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[CoercionType], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Adds the specified content to the beginning of the item body.
    *
    * The prependAsync method inserts the specified string at the beginning of the item body. 
    * After insertion, the cursor is returned to its original place, relative to the inserted content.
    *
    * When including links in HTML markup, you can disable online link preview by setting the id attribute on the anchor (\<a\>) to "LPNoLP" 
    * (please see the Examples section for a sample).
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**: 
    * 
    * - DataExceedsMaximumSize: The data parameter is longer than 1,000,000 characters.
    * 
    * @param data - The string to be inserted at the beginning of the body. The string is limited to 1,000,000 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    *        coercionType: The desired format for the body. The string in the data parameter will be converted to this format.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult.
    *                  Any errors encountered will be provided in the asyncResult.error property.
    */
  def prependAsync(data: java.lang.String): scala.Unit = js.native
  def prependAsync(
    data: java.lang.String,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def prependAsync(data: java.lang.String, options: AsyncContextOptions with CoercionTypeOptions): scala.Unit = js.native
  def prependAsync(
    data: java.lang.String,
    options: AsyncContextOptions with CoercionTypeOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Replaces the entire body with the specified text.
    *
    * When working with HTML-formatted bodies, it is important to note that the Body.getAsync and Body.setAsync methods are not idempotent. 
    * The value returned from the getAsync method will not necessarily be exactly the same as the value that was passed in the setAsync method 
    * previously. The client may modify the value passed to setAsync in order to make it render efficiently with its rendering engine.
    *
    * When including links in HTML markup, you can disable online link preview by setting the id attribute on the anchor (\<a\>) to "LPNoLP" 
    * (please see the Examples section for a sample).
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**: 
    * 
    * - DataExceedsMaximumSize: The data parameter is longer than 1,000,000 characters.
    * 
    * - InvalidFormatError: The options.coercionType parameter is set to Office.CoercionType.Html and the message body is in plain text.
    * 
    * @param data - The string that will replace the existing body. The string is limited to 1,000,000 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    *        coercionType: The desired format for the body. The string in the data parameter will be converted to this format.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult.
    *                  Any errors encountered will be provided in the asyncResult.error property.
    */
  def setAsync(data: java.lang.String): scala.Unit = js.native
  def setAsync(
    data: java.lang.String,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def setAsync(data: java.lang.String, options: AsyncContextOptions with CoercionTypeOptions): scala.Unit = js.native
  def setAsync(
    data: java.lang.String,
    options: AsyncContextOptions with CoercionTypeOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Replaces the selection in the body with the specified text.
    *
    * The setSelectedDataAsync method inserts the specified string at the cursor location in the body of the item, or, if text is selected in 
    * the editor, it replaces the selected text. If the cursor was never in the body of the item, or if the body of the item lost focus in the 
    * UI, the string will be inserted at the top of the body content. After insertion, the cursor is placed at the end of the inserted content.
    *
    * When including links in HTML markup, you can disable online link preview by setting the id attribute on the anchor (\<a\>) to "LPNoLP" 
    * (please see the Examples section for a sample).
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**: 
    * 
    * - DataExceedsMaximumSize: The data parameter is longer than 1,000,000 characters.
    * 
    * - InvalidFormatError: The options.coercionType parameter is set to Office.CoercionType.Html and the message body is in plain text.
    * 
    * @param data - The string that will replace the existing body. The string is limited to 1,000,000 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    *        coercionType: The desired format for the body. The string in the data parameter will be converted to this format.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult.
    *                  Any errors encountered will be provided in the asyncResult.error property.
    */
  def setSelectedDataAsync(data: java.lang.String): scala.Unit = js.native
  def setSelectedDataAsync(
    data: java.lang.String,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def setSelectedDataAsync(data: java.lang.String, options: AsyncContextOptions with CoercionTypeOptions): scala.Unit = js.native
  def setSelectedDataAsync(
    data: java.lang.String,
    options: AsyncContextOptions with CoercionTypeOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

