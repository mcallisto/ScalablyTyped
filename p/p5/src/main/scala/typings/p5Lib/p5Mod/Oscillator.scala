package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oscillator extends js.Object {
  /**
    *   Add a value to the p5.Oscillator's output
    *   amplitude, and return the oscillator. Calling this
    *   method again will override the initial add() with
    *   a new value.
    *   @param number Constant number to add
    *   @return Oscillator Returns this oscillator with
    *   scaled output
    */
  def add(number: scala.Double): Oscillator = js.native
  def amp(vol: js.Object): stdLib.AudioParam = js.native
  def amp(vol: js.Object, rampTime: scala.Double): stdLib.AudioParam = js.native
  def amp(vol: js.Object, rampTime: scala.Double, timeFromNow: scala.Double): stdLib.AudioParam = js.native
  /**
    *   Set the amplitude between 0 and 1.0. Or, pass in
    *   an object such as an oscillator to modulate
    *   amplitude with an audio signal.
    *   @param vol between 0 and 1.0 or a modulating
    *   signal/oscillator
    *   @param [rampTime] create a fade that lasts
    *   rampTime
    *   @param [timeFromNow] schedule this event to happen
    *   seconds from now
    *   @return gain If no value is provided, returns the
    *   Web Audio API AudioParam that controls this
    *   oscillator's gain/amplitude/volume)
    */
  def amp(vol: scala.Double): stdLib.AudioParam = js.native
  def amp(vol: scala.Double, rampTime: scala.Double): stdLib.AudioParam = js.native
  def amp(vol: scala.Double, rampTime: scala.Double, timeFromNow: scala.Double): stdLib.AudioParam = js.native
  /**
    *   Connect to a p5.sound / Web Audio object.
    *   @param unit A p5.sound or Web Audio object
    */
  def connect(unit: js.Object): scala.Unit = js.native
  /**
    *   Disconnect all outputs
    */
  def disconnect(): scala.Unit = js.native
  def freq(Frequency: js.Object): stdLib.AudioParam = js.native
  def freq(Frequency: js.Object, rampTime: scala.Double): stdLib.AudioParam = js.native
  def freq(Frequency: js.Object, rampTime: scala.Double, timeFromNow: scala.Double): stdLib.AudioParam = js.native
  /**
    *   Set frequency of an oscillator to a value. Or,
    *   pass in an object such as an oscillator to
    *   modulate the frequency with an audio signal.
    *   @param Frequency Frequency in Hz or modulating
    *   signal/oscillator
    *   @param [rampTime] Ramp time (in seconds)
    *   @param [timeFromNow] Schedule this event to happen
    *   at x seconds from now
    *   @return Frequency If no value is provided, returns
    *   the Web Audio API AudioParam that controls this
    *   oscillator's frequency
    */
  def freq(Frequency: scala.Double): stdLib.AudioParam = js.native
  def freq(Frequency: scala.Double, rampTime: scala.Double): stdLib.AudioParam = js.native
  def freq(Frequency: scala.Double, rampTime: scala.Double, timeFromNow: scala.Double): stdLib.AudioParam = js.native
  /**
    *   Multiply the p5.Oscillator's output amplitude by a
    *   fixed value (i.e. turn it up!). Calling this
    *   method again will override the initial mult() with
    *   a new value.
    *   @param number Constant number to multiply
    *   @return Oscillator Returns this oscillator with
    *   multiplied output
    */
  def mult(number: scala.Double): Oscillator = js.native
  /**
    *   Pan between Left (-1) and Right (1)
    *   @param panning Number between -1 and 1
    *   @param timeFromNow schedule this event to happen
    *   seconds from now
    */
  def pan(panning: scala.Double, timeFromNow: scala.Double): scala.Unit = js.native
  /**
    *   Set the phase of an oscillator between 0.0 and
    *   1.0. In this implementation, phase is a delay time
    *   based on the oscillator's current frequency.
    *   @param phase float between 0.0 and 1.0
    */
  def phase(phase: scala.Double): scala.Unit = js.native
  /**
    *   Scale this oscillator's amplitude values to a
    *   given range, and return the oscillator. Calling
    *   this method again will override the initial
    *   scale() with new values.
    *   @param inMin input range minumum
    *   @param inMax input range maximum
    *   @param outMin input range minumum
    *   @param outMax input range maximum
    *   @return Oscillator Returns this oscillator with
    *   scaled output
    */
  def scale(inMin: scala.Double, inMax: scala.Double, outMin: scala.Double, outMax: scala.Double): Oscillator = js.native
  /**
    *   Set type to 'sine', 'triangle', 'sawtooth' or
    *   'square'.
    *   @param type 'sine', 'triangle', 'sawtooth' or
    *   'square'.
    */
  def setType(`type`: java.lang.String): scala.Unit = js.native
  /**
    *   Start an oscillator. Accepts an optional parameter
    *   to determine how long (in seconds from now) until
    *   the oscillator starts.
    *   @param [time] startTime in seconds from now.
    *   @param [frequency] frequency in Hz.
    */
  def start(): scala.Unit = js.native
  def start(time: scala.Double): scala.Unit = js.native
  def start(time: scala.Double, frequency: scala.Double): scala.Unit = js.native
  /**
    *   Stop an oscillator. Accepts an optional parameter
    *   to determine how long (in seconds from now) until
    *   the oscillator stops.
    *   @param secondsFromNow Time, in seconds from now.
    */
  def stop(secondsFromNow: scala.Double): scala.Unit = js.native
}

