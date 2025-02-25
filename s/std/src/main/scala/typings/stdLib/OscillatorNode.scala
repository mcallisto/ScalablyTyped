package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The OscillatorNode interface represents a periodic waveform, such as a sine wave. It is an AudioScheduledSourceNode audio-processing module that causes a specified frequency of a given wave to be created—in effect, a constant tone. */
@js.native
trait OscillatorNode extends AudioScheduledSourceNode {
  val detune: AudioParam = js.native
  val frequency: AudioParam = js.native
  var `type`: OscillatorType = js.native
  def setPeriodicWave(periodicWave: PeriodicWave): scala.Unit = js.native
}

@JSGlobal("OscillatorNode")
@js.native
class OscillatorNodeCls protected () extends OscillatorNode {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: OscillatorOptions) = this()
}

@JSGlobal("OscillatorNode")
@js.native
object OscillatorNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, OscillatorNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ OscillatorOptions, OscillatorNode]

