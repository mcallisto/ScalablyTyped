package typings
package nodeLib.bufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val INSPECT_MAX_BYTES: scala.Double = js.native
  def transcode(source: nodeLib.Buffer, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): nodeLib.Buffer = js.native
  def transcode(source: stdLib.Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): nodeLib.Buffer = js.native
}

