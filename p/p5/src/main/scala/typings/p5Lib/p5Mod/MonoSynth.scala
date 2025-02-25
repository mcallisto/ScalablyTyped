package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonoSynth extends js.Object {
  /**
    *   Getters and Setters
    */
  var attack: scala.Double = js.native
  var decay: scala.Double = js.native
  var release: scala.Double = js.native
  var sustain: scala.Double = js.native
  /**
    *   MonoSynth amp
    *   @param vol desired volume
    *   @param [rampTime] Time to reach new volume
    *   @return new volume value
    */
  def amp(vol: scala.Double): scala.Double = js.native
  def amp(vol: scala.Double, rampTime: scala.Double): scala.Double = js.native
  /**
    *   Connect to a p5.sound / Web Audio object.
    *   @param unit A p5.sound or Web Audio object
    */
  def connect(unit: js.Object): scala.Unit = js.native
  /**
    *   Disconnect all outputs
    */
  def disconnect(): scala.Unit = js.native
  /**
    *   Get rid of the MonoSynth and free up its resources
    *   / memory.
    */
  def dispose(): scala.Unit = js.native
  /**
    *   Play tells the MonoSynth to start playing a note.
    *   This method schedules the calling of
    *   .triggerAttack and .triggerRelease.
    *   @param note the note you want to play, specified
    *   as a frequency in Hertz (Number) or as a midi
    *   value in Note/Octave format ("C4", "Eb3"...etc")
    *   See  Tone. Defaults to 440 hz.
    *   @param [velocity] velocity of the note to play
    *   (ranging from 0 to 1)
    *   @param [secondsFromNow] time from now (in seconds)
    *   at which to play
    *   @param [sustainTime] time to sustain before
    *   releasing the envelope
    */
  def play(note: java.lang.String): scala.Unit = js.native
  def play(note: java.lang.String, velocity: scala.Double): scala.Unit = js.native
  def play(note: java.lang.String, velocity: scala.Double, secondsFromNow: scala.Double): scala.Unit = js.native
  def play(
    note: java.lang.String,
    velocity: scala.Double,
    secondsFromNow: scala.Double,
    sustainTime: scala.Double
  ): scala.Unit = js.native
  def play(note: scala.Double): scala.Unit = js.native
  def play(note: scala.Double, velocity: scala.Double): scala.Unit = js.native
  def play(note: scala.Double, velocity: scala.Double, secondsFromNow: scala.Double): scala.Unit = js.native
  def play(
    note: scala.Double,
    velocity: scala.Double,
    secondsFromNow: scala.Double,
    sustainTime: scala.Double
  ): scala.Unit = js.native
  /**
    *   Set values like a traditional  ADSR envelope .
    *   @param attackTime Time (in seconds before envelope
    *   reaches Attack Level
    *   @param [decayTime] Time (in seconds) before
    *   envelope reaches Decay/Sustain Level
    *   @param [susRatio] Ratio between attackLevel and
    *   releaseLevel, on a scale from 0 to 1, where 1.0 =
    *   attackLevel, 0.0 = releaseLevel. The susRatio
    *   determines the decayLevel and the level at which
    *   the sustain portion of the envelope will sustain.
    *   For example, if attackLevel is 0.4, releaseLevel
    *   is 0, and susAmt is 0.5, the decayLevel would be
    *   0.2. If attackLevel is increased to 1.0 (using
    *   setRange), then decayLevel would increase
    *   proportionally, to become 0.5.
    *   @param [releaseTime] Time in seconds from now
    *   (defaults to 0)
    */
  def setADSR(attackTime: scala.Double): scala.Unit = js.native
  def setADSR(attackTime: scala.Double, decayTime: scala.Double): scala.Unit = js.native
  def setADSR(attackTime: scala.Double, decayTime: scala.Double, susRatio: scala.Double): scala.Unit = js.native
  def setADSR(
    attackTime: scala.Double,
    decayTime: scala.Double,
    susRatio: scala.Double,
    releaseTime: scala.Double
  ): scala.Unit = js.native
  /**
    *   Trigger the Attack, and Decay portion of the
    *   Envelope. Similar to holding down a key on a
    *   piano, but it will hold the sustain level until
    *   you let go.
    *   @param note the note you want to play, specified
    *   as a frequency in Hertz (Number) or as a midi
    *   value in Note/Octave format ("C4", "Eb3"...etc")
    *   See  Tone. Defaults to 440 hz
    *   @param [velocity] velocity of the note to play
    *   (ranging from 0 to 1)
    *   @param [secondsFromNow] time from now (in seconds)
    *   at which to play
    */
  def triggerAttack(note: java.lang.String): scala.Unit = js.native
  def triggerAttack(note: java.lang.String, velocity: scala.Double): scala.Unit = js.native
  def triggerAttack(note: java.lang.String, velocity: scala.Double, secondsFromNow: scala.Double): scala.Unit = js.native
  def triggerAttack(note: scala.Double): scala.Unit = js.native
  def triggerAttack(note: scala.Double, velocity: scala.Double): scala.Unit = js.native
  def triggerAttack(note: scala.Double, velocity: scala.Double, secondsFromNow: scala.Double): scala.Unit = js.native
  /**
    *   Trigger the release of the Envelope. This is
    *   similar to releasing the key on a piano and
    *   letting the sound fade according to the release
    *   level and release time.
    *   @param secondsFromNow time to trigger the release
    */
  def triggerRelease(secondsFromNow: scala.Double): scala.Unit = js.native
}

