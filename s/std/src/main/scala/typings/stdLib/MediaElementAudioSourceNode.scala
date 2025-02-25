package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A MediaElementSourceNode has no inputs and exactly one output, and is created using the AudioContext.createMediaElementSource method. The amount of channels in the output equals the number of channels of the audio referenced by the HTMLMediaElement used in the creation of the node, or is 1 if the HTMLMediaElement has no audio. */
@js.native
trait MediaElementAudioSourceNode extends AudioNode {
  val mediaElement: HTMLMediaElement = js.native
}

@JSGlobal("MediaElementAudioSourceNode")
@js.native
class MediaElementAudioSourceNodeCls protected () extends MediaElementAudioSourceNode {
  def this(context: AudioContext, options: MediaElementAudioSourceOptions) = this()
}

@JSGlobal("MediaElementAudioSourceNode")
@js.native
object MediaElementAudioSourceNode
  extends org.scalablytyped.runtime.Instantiable2[
      /* context */ AudioContext, 
      /* options */ MediaElementAudioSourceOptions, 
      MediaElementAudioSourceNode
    ]

