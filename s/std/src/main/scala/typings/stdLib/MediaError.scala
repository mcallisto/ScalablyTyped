package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as <audio> or <video>. */
trait MediaError extends js.Object {
  val MEDIA_ERR_ABORTED: scala.Double
  val MEDIA_ERR_DECODE: scala.Double
  val MEDIA_ERR_NETWORK: scala.Double
  val MEDIA_ERR_SRC_NOT_SUPPORTED: scala.Double
  val MS_MEDIA_ERR_ENCRYPTED: scala.Double
  val code: scala.Double
  val message: java.lang.String
  val msExtendedCode: scala.Double
}

@JSGlobal("MediaError")
@js.native
class MediaErrorCls () extends MediaError {
  /* CompleteClass */
  override val MEDIA_ERR_ABORTED: scala.Double = js.native
  /* CompleteClass */
  override val MEDIA_ERR_DECODE: scala.Double = js.native
  /* CompleteClass */
  override val MEDIA_ERR_NETWORK: scala.Double = js.native
  /* CompleteClass */
  override val MEDIA_ERR_SRC_NOT_SUPPORTED: scala.Double = js.native
  /* CompleteClass */
  override val MS_MEDIA_ERR_ENCRYPTED: scala.Double = js.native
  /* CompleteClass */
  override val code: scala.Double = js.native
  /* CompleteClass */
  override val message: java.lang.String = js.native
  /* CompleteClass */
  override val msExtendedCode: scala.Double = js.native
}

@JSGlobal("MediaError")
@js.native
object MediaError
  extends org.scalablytyped.runtime.Instantiable0[MediaError] {
  val MEDIA_ERR_ABORTED: scala.Double = js.native
  val MEDIA_ERR_DECODE: scala.Double = js.native
  val MEDIA_ERR_NETWORK: scala.Double = js.native
  val MEDIA_ERR_SRC_NOT_SUPPORTED: scala.Double = js.native
  val MS_MEDIA_ERR_ENCRYPTED: scala.Double = js.native
}

