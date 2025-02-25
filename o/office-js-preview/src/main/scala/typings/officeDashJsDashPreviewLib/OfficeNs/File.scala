package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the document file associated with an Office Add-in.
  *
  * @remarks
  * Access the File object with the AsyncResult.value property in the callback function passed to the Document.getFileAsync method.
  * 
  */
@js.native
trait File extends js.Object {
  /**
    * Gets the document file size in bytes.
    */
  var size: scala.Double = js.native
  /**
    * Gets the number of slices into which the file is divided.
    */
  var sliceCount: scala.Double = js.native
  /**
    * Closes the document file.
    * 
    * @remarks
    * 
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#file | File}
    * 
    * No more than two documents are allowed to be in memory; otherwise the Document.getFileAsync operation will fail. Use the File.closeAsync 
    * method to close the file when you are finished working with it.
    * 
    * In the callback function passed to the closeAsync method, you can use the properties of the AsyncResult object to return the following 
    * information.
    * 
    * <table>
    *   <tr>
    *     <th>Property</th>
    *     <th>Use to...</th>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.value</td>
    *     <td>Always returns undefined because there is no object or data to retrieve.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.status</td>
    *     <td>Determine the success or failure of the operation.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.error</td>
    *     <td>Access an Error object that provides error information if the operation failed.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.asyncContext</td>
    *     <td>A user-defined item of any type that is returned in the AsyncResult object without being altered.</td>
    *   </tr>
    * </table>
    *
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def closeAsync(): scala.Unit = js.native
  def closeAsync(callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  /**
    * Returns the specified slice.
    * 
    * @remarks
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#file | File}
    * 
    * In the callback function passed to the getSliceAsync method, you can use the properties of the AsyncResult object to return the following 
    * information.
    * 
    * <table>
    *   <tr>
    *     <th>Property</th>
    *     <th>Use to...</th>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.value</td>
    *     <td>Access the Slice object.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.status</td>
    *     <td>Determine the success or failure of the operation.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.error</td>
    *     <td>Access an Error object that provides error information if the operation failed.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.asyncContext</td>
    *     <td>A user-defined item of any type that is returned in the AsyncResult object without being altered.</td>
    *   </tr>
    * </table>
    * 
    * @param sliceIndex Specifies the zero-based index of the slice to be retrieved. Required.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is the {@link Office.Slice} object.
    */
  def getSliceAsync(sliceIndex: scala.Double): scala.Unit = js.native
  def getSliceAsync(sliceIndex: scala.Double, callback: js.Function1[/* result */ AsyncResult[Slice], scala.Unit]): scala.Unit = js.native
}

