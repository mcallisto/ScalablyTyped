package typings
package objectDashHashLib.objectDashHashMod.ObjectHashNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash extends js.Object {
  def apply(`object`: js.Any): java.lang.String = js.native
  def apply(`object`: js.Any, options: IOptions): java.lang.String = js.native
  def MD5(`object`: js.Any): java.lang.String = js.native
  def keys(`object`: js.Any): java.lang.String = js.native
  def keysMD5(`object`: js.Any): java.lang.String = js.native
  def sha1(`object`: js.Any): java.lang.String = js.native
  def writeToStream(value: js.Any, options: IOptions, stream: nodeLib.streamMod.PassThrough): scala.Unit = js.native
  def writeToStream(value: js.Any, stream: nodeLib.streamMod.PassThrough): scala.Unit = js.native
}

