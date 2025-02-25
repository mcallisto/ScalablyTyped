package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OutputStream")
@js.native
abstract class OutputStream () extends js.Object {
  /**
    * Closes the stream, releasing resources related to it. Once the stream is closed, all other operations will fail.
    * Closing a stream multiple times is allowed and will not result in an error.
    */
  def close(): js.Promise[scala.Unit] = js.native
  def write(data: js.Array[scala.Double]): js.Promise[scala.Double] = js.native
  /**
    * Tries to write `data` to the stream. Returns how how many bytes of `data` were written to the stream.
    */
  def write(data: stdLib.ArrayBuffer): js.Promise[scala.Double] = js.native
  def writeAll(data: js.Array[scala.Double]): js.Promise[scala.Unit] = js.native
  /**
    * Keeps writing to the stream until all of `data` has been written. Premature error or end of stream results in an
    * `Error` object with a `partialSize` property specifying how many bytes of `data` were written to the stream
    * before the error occurred.
    */
  def writeAll(data: stdLib.ArrayBuffer): js.Promise[scala.Unit] = js.native
}

