package typings
package nockLib.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recorder extends js.Object {
  def clear(): scala.Unit = js.native
  def play(): js.Array[NockDefinition | java.lang.String] = js.native
  def rec(): scala.Unit = js.native
  def rec(options: RecorderOptions): scala.Unit = js.native
  def rec(options: scala.Boolean): scala.Unit = js.native
}

