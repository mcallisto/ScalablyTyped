package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the EncryptedMediaExtensions API provides access to a Key System for decryption and/or a content protection provider. You can request an instance of this object using the Navigator.requestMediaKeySystemAccess method. */
trait MediaKeySystemAccess extends js.Object {
  val keySystem: java.lang.String
  def createMediaKeys(): js.Promise[MediaKeys]
  def getConfiguration(): MediaKeySystemConfiguration
}

@JSGlobal("MediaKeySystemAccess")
@js.native
class MediaKeySystemAccessCls () extends MediaKeySystemAccess {
  /* CompleteClass */
  override val keySystem: java.lang.String = js.native
  /* CompleteClass */
  override def createMediaKeys(): js.Promise[MediaKeys] = js.native
  /* CompleteClass */
  override def getConfiguration(): MediaKeySystemConfiguration = js.native
}

@JSGlobal("MediaKeySystemAccess")
@js.native
object MediaKeySystemAccess
  extends org.scalablytyped.runtime.Instantiable0[MediaKeySystemAccess]

