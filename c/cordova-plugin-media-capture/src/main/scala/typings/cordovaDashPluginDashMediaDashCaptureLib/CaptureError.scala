package typings
package cordovaDashPluginDashMediaDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the error code resulting from a failed media capture operation. */
trait CaptureError extends js.Object {
  /**
    * One of the pre-defined error codes listed below.
    *     CaptureError.CAPTURE_INTERNAL_ERR
    *         The camera or microphone failed to capture image or sound.
    *     CaptureError.CAPTURE_APPLICATION_BUSY
    *         The camera or audio capture application is currently serving another capture request.
    *     CaptureError.CAPTURE_INVALID_ARGUMENT
    *         Invalid use of the API (e.g., the value of limit is less than one).
    *     CaptureError.CAPTURE_NO_MEDIA_FILES
    *         The user exits the camera or audio capture application before capturing anything.
    *     CaptureError.CAPTURE_NOT_SUPPORTED
    *         The requested capture operation is not supported.
    */
  var code: scala.Double
  var message: java.lang.String
}

@JSGlobal("CaptureError")
@js.native
class CaptureErrorCls protected () extends CaptureError {
  /** Constructor for CaptureError  */
  def this(code: scala.Double, message: java.lang.String) = this()
  /**
    * One of the pre-defined error codes listed below.
    *     CaptureError.CAPTURE_INTERNAL_ERR
    *         The camera or microphone failed to capture image or sound.
    *     CaptureError.CAPTURE_APPLICATION_BUSY
    *         The camera or audio capture application is currently serving another capture request.
    *     CaptureError.CAPTURE_INVALID_ARGUMENT
    *         Invalid use of the API (e.g., the value of limit is less than one).
    *     CaptureError.CAPTURE_NO_MEDIA_FILES
    *         The user exits the camera or audio capture application before capturing anything.
    *     CaptureError.CAPTURE_NOT_SUPPORTED
    *         The requested capture operation is not supported.
    */
  /* CompleteClass */
  override var code: scala.Double = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
}

@JSGlobal("CaptureError")
@js.native
object CaptureError
  extends /** Constructor for CaptureError  */
org.scalablytyped.runtime.Instantiable2[/* code */ scala.Double, /* message */ java.lang.String, CaptureError] {
  var CAPTURE_APPLICATION_BUSY: scala.Double = js.native
  var CAPTURE_INTERNAL_ERR: scala.Double = js.native
  var CAPTURE_INVALID_ARGUMENT: scala.Double = js.native
  var CAPTURE_NOT_SUPPORTED: scala.Double = js.native
  var CAPTURE_NO_MEDIA_FILES: scala.Double = js.native
  var CAPTURE_PERMISSION_DENIED: scala.Double = js.native
}

