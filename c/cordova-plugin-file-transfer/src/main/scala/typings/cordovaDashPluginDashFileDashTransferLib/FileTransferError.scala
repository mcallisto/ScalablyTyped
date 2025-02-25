package typings
package cordovaDashPluginDashFileDashTransferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A FileTransferError object is passed to an error callback when an error occurs. */
trait FileTransferError extends js.Object {
  /* Response body. This attribute is only available when a response is received from the HTTP connection. */
  var body: java.lang.String
  /**
    * One of the predefined error codes listed below.
    *     FileTransferError.FILE_NOT_FOUND_ERR
    *     FileTransferError.INVALID_URL_ERR
    *     FileTransferError.CONNECTION_ERR
    *     FileTransferError.ABORT_ERR
    *     FileTransferError.NOT_MODIFIED_ERR
    */
  var code: scala.Double
  /* Exception that is thrown by native code */
  var exception: js.Any
  /** HTTP status code. This attribute is only available when a response code is received from the HTTP connection. */
  var http_status: scala.Double
  /** URL to the source. */
  var source: java.lang.String
  /** URL to the target. */
  var target: java.lang.String
}

@JSGlobal("FileTransferError")
@js.native
class FileTransferErrorCls protected () extends FileTransferError {
  /** Constructor for FileTransferError object */
  def this(code: js.UndefOr[scala.Double], source: js.UndefOr[java.lang.String], target: js.UndefOr[java.lang.String], status: js.UndefOr[scala.Double], body: js.UndefOr[js.Any], exception: js.UndefOr[js.Any]) = this()
  /* Response body. This attribute is only available when a response is received from the HTTP connection. */
  /* CompleteClass */
  override var body: java.lang.String = js.native
  /**
    * One of the predefined error codes listed below.
    *     FileTransferError.FILE_NOT_FOUND_ERR
    *     FileTransferError.INVALID_URL_ERR
    *     FileTransferError.CONNECTION_ERR
    *     FileTransferError.ABORT_ERR
    *     FileTransferError.NOT_MODIFIED_ERR
    */
  /* CompleteClass */
  override var code: scala.Double = js.native
  /* Exception that is thrown by native code */
  /* CompleteClass */
  override var exception: js.Any = js.native
  /** HTTP status code. This attribute is only available when a response code is received from the HTTP connection. */
  /* CompleteClass */
  override var http_status: scala.Double = js.native
  /** URL to the source. */
  /* CompleteClass */
  override var source: java.lang.String = js.native
  /** URL to the target. */
  /* CompleteClass */
  override var target: java.lang.String = js.native
}

@JSGlobal("FileTransferError")
@js.native
object FileTransferError
  extends /** Constructor for FileTransferError object */
org.scalablytyped.runtime.Instantiable6[
      js.UndefOr[/* code */ scala.Double], 
      js.UndefOr[/* source */ java.lang.String], 
      js.UndefOr[/* target */ java.lang.String], 
      js.UndefOr[/* status */ scala.Double], 
      js.UndefOr[/* body */ js.Any], 
      js.UndefOr[/* exception */ js.Any], 
      FileTransferError
    ] {
  var ABORT_ERR: scala.Double = js.native
  var CONNECTION_ERR: scala.Double = js.native
  var FILE_NOT_FOUND_ERR: scala.Double = js.native
  var INVALID_URL_ERR: scala.Double = js.native
  var NOT_MODIFIED_ERR: scala.Double = js.native
}

