package typings
package phaserLib.PhaserNs.SoundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class containing all the shared state and behavior of a sound object, independent of the implementation.
  */
@JSGlobal("Phaser.Sound.BaseSound")
@js.native
class BaseSound protected ()
  extends phaserLib.PhaserNs.EventsNs.EventEmitter {
  /**
    * 
    * @param manager Reference to the current sound manager instance.
    * @param key Asset key for the sound.
    * @param config An optional config object containing default sound settings.
    */
  def this(manager: BaseSoundManager, key: java.lang.String) = this()
  def this(manager: BaseSoundManager, key: java.lang.String, config: phaserLib.PhaserNs.TypesNs.SoundNs.SoundConfig) = this()
  /**
    * Currently playing marker.
    * 'null' if whole sound is playing.
    */
  val currentMarker: phaserLib.PhaserNs.TypesNs.SoundNs.SoundMarker = js.native
  /**
    * A value representing the duration, in seconds.
    * It could be total sound duration or a marker duration.
    */
  val duration: scala.Double = js.native
  /**
    * Flag indicating if sound is currently paused.
    */
  val isPaused: scala.Boolean = js.native
  /**
    * Flag indicating if sound is currently playing.
    */
  val isPlaying: scala.Boolean = js.native
  /**
    * Asset key for the sound.
    */
  val key: java.lang.String = js.native
  /**
    * Object containing markers definitions.
    */
  val markers: org.scalablytyped.runtime.StringDictionary[phaserLib.PhaserNs.TypesNs.SoundNs.SoundMarker] = js.native
  /**
    * The total duration of the sound in seconds.
    */
  val totalDuration: scala.Double = js.native
  /**
    * A property that holds the value of sound's actual playback rate,
    * after its rate and detune values has been combined with global
    * rate and detune values.
    */
  val totalRate: scala.Double = js.native
  /**
    * Adds a marker into the current sound. A marker is represented by name, start time, duration, and optionally config object.
    * This allows you to bundle multiple sounds together into a single audio file and use markers to jump between them for playback.
    * @param marker Marker object.
    */
  def addMarker(marker: phaserLib.PhaserNs.TypesNs.SoundNs.SoundMarker): scala.Boolean = js.native
  /**
    * Method used internally for applying config values to some of the sound properties.
    */
  /* protected */ def applyConfig(): scala.Unit = js.native
  /**
    * Method used internally to calculate total playback rate of the sound.
    */
  /* protected */ def calculateRate(): scala.Unit = js.native
  /**
    * Pauses the sound.
    */
  def pause(): scala.Boolean = js.native
  /**
    * Play this sound, or a marked section of it.
    * It always plays the sound from the start. If you want to start playback from a specific time
    * you can set 'seek' setting of the config object, provided to this call, to that value.
    * @param markerName If you want to play a marker then provide the marker name here, otherwise omit it to play the full sound. Default ''.
    * @param config Optional sound config object to be applied to this marker or entire sound if no marker name is provided. It gets memorized for future plays of current section of the sound.
    */
  def play(): scala.Boolean = js.native
  def play(markerName: java.lang.String): scala.Boolean = js.native
  def play(markerName: java.lang.String, config: phaserLib.PhaserNs.TypesNs.SoundNs.SoundConfig): scala.Boolean = js.native
  /**
    * Removes a marker from the sound.
    * @param markerName The name of the marker to remove.
    */
  def removeMarker(markerName: java.lang.String): phaserLib.PhaserNs.TypesNs.SoundNs.SoundMarker = js.native
  /**
    * Method used internally for resetting values of some of the config properties.
    */
  /* protected */ def resetConfig(): scala.Unit = js.native
  /**
    * Resumes the sound.
    */
  def resume(): scala.Boolean = js.native
  /**
    * Stop playing this sound.
    */
  def stop(): scala.Boolean = js.native
  /**
    * Update method called automatically by sound manager on every game step.
    * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
    * @param delta The delta time elapsed since the last frame.
    */
  /* protected */ def update(time: scala.Double, delta: scala.Double): scala.Unit = js.native
  /**
    * Updates previously added marker.
    * @param marker Marker object with updated values.
    */
  def updateMarker(marker: phaserLib.PhaserNs.TypesNs.SoundNs.SoundMarker): scala.Boolean = js.native
}

