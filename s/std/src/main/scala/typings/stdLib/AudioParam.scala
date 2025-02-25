package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Web Audio API's AudioParam interface represents an audio-related parameter, usually a parameter of an AudioNode (such as GainNode.gain). */
@js.native
trait AudioParam extends js.Object {
  var automationRate: AutomationRate = js.native
  val defaultValue: scala.Double = js.native
  val maxValue: scala.Double = js.native
  val minValue: scala.Double = js.native
  var value: scala.Double = js.native
  def cancelAndHoldAtTime(cancelTime: scala.Double): AudioParam = js.native
  def cancelScheduledValues(cancelTime: scala.Double): AudioParam = js.native
  def exponentialRampToValueAtTime(value: scala.Double, endTime: scala.Double): AudioParam = js.native
  def linearRampToValueAtTime(value: scala.Double, endTime: scala.Double): AudioParam = js.native
  def setTargetAtTime(target: scala.Double, startTime: scala.Double, timeConstant: scala.Double): AudioParam = js.native
  def setValueAtTime(value: scala.Double, startTime: scala.Double): AudioParam = js.native
  def setValueCurveAtTime(values: js.Array[scala.Double], startTime: scala.Double, duration: scala.Double): AudioParam = js.native
  def setValueCurveAtTime(values: Float32Array, startTime: scala.Double, duration: scala.Double): AudioParam = js.native
}

@JSGlobal("AudioParam")
@js.native
class AudioParamCls () extends AudioParam

@JSGlobal("AudioParam")
@js.native
object AudioParam
  extends org.scalablytyped.runtime.Instantiable0[AudioParam]

