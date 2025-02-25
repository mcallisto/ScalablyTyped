package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The IIRFilterNode interface of the Web Audio API is a AudioNode processor which implements a general infinite impulse response (IIR)  filter; this type of filter can be used to implement tone control devices and graphic equalizers as well. It lets the parameters of the filter response be specified, so that it can be tuned as needed. */
@js.native
trait IIRFilterNode extends AudioNode {
  def getFrequencyResponse(frequencyHz: Float32Array, magResponse: Float32Array, phaseResponse: Float32Array): scala.Unit = js.native
}

@JSGlobal("IIRFilterNode")
@js.native
class IIRFilterNodeCls protected () extends IIRFilterNode {
  def this(context: BaseAudioContext, options: IIRFilterOptions) = this()
}

@JSGlobal("IIRFilterNode")
@js.native
object IIRFilterNode
  extends org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ IIRFilterOptions, IIRFilterNode]

