package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("child_process", "exec")
@js.native
object execNs extends js.Object {
  def __promisify__(command: java.lang.String): nodeLib.childUnderscoreProcessMod.PromiseWithChild[nodeLib.Anon_Stderr] = js.native
  def __promisify__(
    command: java.lang.String,
    options: nodeLib.Anon_Encoding with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.PromiseWithChild[nodeLib.Anon_Stderr] = js.native
  def __promisify__(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.PromiseWithChild[nodeLib.Anon_StderrStdoutBuffer] = js.native
  def __promisify__(
    command: java.lang.String,
    options: nodeLib.Anon_Buffer with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.PromiseWithChild[nodeLib.Anon_StderrStdout] = js.native
  def __promisify__(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): nodeLib.childUnderscoreProcessMod.PromiseWithChild[nodeLib.Anon_Stderr] = js.native
}

