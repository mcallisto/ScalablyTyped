package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The InternetHeaders object represents custom internet headers that are preserved after the message item leaves Exchange and is converted to a MIME message. 
  * These headers are stored as x-headers in the MIME message.
  * 
  * InternetHeaders are stored as key/value pairs on a per-item basis.
  * 
  * **Note**: This object is intended for you to set and get your custom headers on a message item.
  *
  * [Api set: Mailbox Preview]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  * 
  * @beta
  */
@js.native
trait InternetHeaders extends js.Object {
  /**
    * Given an array of internet header names, this method returns a dictionary containing those internet headers and their values. 
    * If the add-in requests an x-header that is not available, that x-header will not be returned in the results.
    * 
    * **Note**: This method is intended to return the values of the custom headers you set using the `setAsync` method.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * @param names - The names of the internet headers to be returned.
    * @param options - Optional. An object literal that contains one or more of the following properties:
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    * 
    * @beta
    */
  def getAsync(names: js.Array[java.lang.String]): scala.Unit = js.native
  def getAsync(
    names: js.Array[java.lang.String],
    callback: js.Function1[/* asyncResult */ AsyncResult[this.type], scala.Unit]
  ): scala.Unit = js.native
  def getAsync(names: js.Array[java.lang.String], options: AsyncContextOptions): scala.Unit = js.native
  def getAsync(
    names: js.Array[java.lang.String],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[this.type], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Given an array of internet header names, this method removes the specified headers from the internet header collection.
    * 
    * **Note**: This method is intended to remove the custom headers you set using the `setAsync` method.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param names - The names of the internet headers to be removed.
    * @param options - Optional. An object literal that contains one or more of the following properties:
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    * 
    * @beta
    */
  def removeAsync(names: js.Array[java.lang.String]): scala.Unit = js.native
  def removeAsync(
    names: js.Array[java.lang.String],
    callback: js.Function1[/* asyncResult */ AsyncResult[this.type], scala.Unit]
  ): scala.Unit = js.native
  def removeAsync(names: js.Array[java.lang.String], options: AsyncContextOptions): scala.Unit = js.native
  def removeAsync(
    names: js.Array[java.lang.String],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[this.type], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the specified internet headers to the specified values.
    * 
    * The setAsync method creates a new header if the specified header doesn't already exist; otherwise, the existing value is replaced with 
    * the new value.
    *
    * **Note**: This method is intended to set the values of your custom headers.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param headers - The names and corresponding values of the headers to be set. Should be a dictionary object with keys being the names of the 
    *                internet headers and values being the values of the internet headers.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult.
    *                  Any errors encountered will be provided in the asyncResult.error property.
    * 
    * @beta
    */
  def setAsync(headers: js.Object): scala.Unit = js.native
  def setAsync(headers: js.Object, callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  def setAsync(headers: js.Object, options: AsyncContextOptions): scala.Unit = js.native
  def setAsync(
    headers: js.Object,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

