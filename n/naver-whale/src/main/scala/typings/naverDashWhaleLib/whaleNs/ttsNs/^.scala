package typings
package naverDashWhaleLib.whaleNs.ttsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tts")
@js.native
object ^ extends js.Object {
  def getVoices(): scala.Unit = js.native
  def getVoices(callback: js.Function1[/* voices */ js.Array[chromeLib.chromeNs.ttsNs.TtsVoice], scala.Unit]): scala.Unit = js.native
  def isSpeaking(): scala.Unit = js.native
  def isSpeaking(callback: js.Function1[/* speaking */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def speak(utterance: java.lang.String): scala.Unit = js.native
  def speak(utterance: java.lang.String, callback: js.Function): scala.Unit = js.native
  def speak(utterance: java.lang.String, options: chromeLib.chromeNs.ttsNs.SpeakOptions): scala.Unit = js.native
  def speak(utterance: java.lang.String, options: chromeLib.chromeNs.ttsNs.SpeakOptions, callback: js.Function): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

