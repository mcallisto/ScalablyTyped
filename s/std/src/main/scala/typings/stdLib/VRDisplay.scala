package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the WebVR API represents any VR device supported by this API . It includes generic information such as device IDs and descriptions, as well as methods for starting to present a VR scene, retrieving eye parameters and display capabilities, and other important functionality. */
@js.native
trait VRDisplay extends EventTarget {
  val capabilities: VRDisplayCapabilities = js.native
  var depthFar: scala.Double = js.native
  var depthNear: scala.Double = js.native
  val displayId: scala.Double = js.native
  val displayName: java.lang.String = js.native
  val isConnected: scala.Boolean = js.native
  val isPresenting: scala.Boolean = js.native
  val stageParameters: VRStageParameters | scala.Null = js.native
  def cancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  def exitPresent(): js.Promise[scala.Unit] = js.native
  def getEyeParameters(whichEye: java.lang.String): VREyeParameters = js.native
  def getFrameData(frameData: VRFrameData): scala.Boolean = js.native
  def getLayers(): js.Array[VRLayer] = js.native
  /** @deprecated */
  def getPose(): VRPose = js.native
  def requestAnimationFrame(callback: FrameRequestCallback): scala.Double = js.native
  def requestPresent(layers: js.Array[VRLayer]): js.Promise[scala.Unit] = js.native
  def resetPose(): scala.Unit = js.native
  def submitFrame(): scala.Unit = js.native
  def submitFrame(pose: VRPose): scala.Unit = js.native
}

@JSGlobal("VRDisplay")
@js.native
class VRDisplayCls () extends VRDisplay

@JSGlobal("VRDisplay")
@js.native
object VRDisplay
  extends org.scalablytyped.runtime.Instantiable0[VRDisplay]

