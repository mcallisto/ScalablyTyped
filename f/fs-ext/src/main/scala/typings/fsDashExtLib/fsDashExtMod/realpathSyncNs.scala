package typings
package fsDashExtLib.fsDashExtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-ext", "realpathSync")
@js.native
object realpathSyncNs extends js.Object {
  def native(path: nodeLib.fsMod.PathLike): java.lang.String | nodeLib.Buffer = js.native
  def native(path: nodeLib.fsMod.PathLike, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  def native(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_BufferEncoding): nodeLib.Buffer = js.native
  def native(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBufferEncoding): java.lang.String = js.native
  def native(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingNull): java.lang.String | nodeLib.Buffer = js.native
  def native(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): java.lang.String = js.native
  @JSName("native")
  def native_String(path: nodeLib.fsMod.PathLike): java.lang.String = js.native
  @JSName("native")
  def native_buffer(path: nodeLib.fsMod.PathLike, options: fsDashExtLib.fsDashExtLibStrings.buffer): nodeLib.Buffer = js.native
}

