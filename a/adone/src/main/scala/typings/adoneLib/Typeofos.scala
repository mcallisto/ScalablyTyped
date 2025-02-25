package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofos extends js.Object {
  val EOL: java.lang.String = js.native
  val constants: Anon_Errno = js.native
  def arch(): java.lang.String = js.native
  def cpus(): js.Array[nodeLib.osMod.CpuInfo] = js.native
  def endianness(): adoneLib.adoneLibStrings.BE | adoneLib.adoneLibStrings.LE = js.native
  def freemem(): scala.Double = js.native
  /**
    * Gets the priority of a process.
    * Defaults to current process.
    */
  def getPriority(): scala.Double = js.native
  def getPriority(pid: scala.Double): scala.Double = js.native
  def homedir(): java.lang.String = js.native
  def hostname(): java.lang.String = js.native
  def loadavg(): js.Array[scala.Double] = js.native
  def networkInterfaces(): org.scalablytyped.runtime.StringDictionary[js.Array[nodeLib.osMod.NetworkInterfaceInfo]] = js.native
  def platform(): nodeLib.NodeJSNs.Platform = js.native
  def release(): java.lang.String = js.native
  /**
    * Sets the priority of the process specified process.
    * @param priority Must be in range of -20 to 19
    */
  def setPriority(pid: scala.Double, priority: scala.Double): scala.Unit = js.native
  /**
    * Sets the priority of the current process.
    * @param priority Must be in range of -20 to 19
    */
  def setPriority(priority: scala.Double): scala.Unit = js.native
  def tmpdir(): java.lang.String = js.native
  def totalmem(): scala.Double = js.native
  def `type`(): java.lang.String = js.native
  def uptime(): scala.Double = js.native
  def userInfo(): nodeLib.osMod.UserInfo[java.lang.String] = js.native
  def userInfo(options: nodeLib.Anon_BufferEncoding): nodeLib.osMod.UserInfo[nodeLib.Buffer] = js.native
  def userInfo(options: nodeLib.Anon_EncodingString): nodeLib.osMod.UserInfo[java.lang.String] = js.native
}

