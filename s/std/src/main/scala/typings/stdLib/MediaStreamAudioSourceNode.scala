package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A type of AudioNode which operates as an audio source whose media is received from a MediaStream obtained using the WebRTC or Media Capture and Streams APIs. */
@js.native
trait MediaStreamAudioSourceNode extends AudioNode {
  val mediaStream: MediaStream = js.native
}

@JSGlobal("MediaStreamAudioSourceNode")
@js.native
class MediaStreamAudioSourceNodeCls protected () extends MediaStreamAudioSourceNode {
  def this(context: AudioContext, options: MediaStreamAudioSourceOptions) = this()
}

@JSGlobal("MediaStreamAudioSourceNode")
@js.native
object MediaStreamAudioSourceNode
  extends org.scalablytyped.runtime.Instantiable2[
      /* context */ AudioContext, 
      /* options */ MediaStreamAudioSourceOptions, 
      MediaStreamAudioSourceNode
    ]

