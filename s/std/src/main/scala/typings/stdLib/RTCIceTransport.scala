package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to information about the ICE transport layer over which the data is being sent and received. */
@js.native
trait RTCIceTransport extends EventTarget {
  val component: RTCIceComponent = js.native
  val gatheringState: RTCIceGathererState = js.native
  var ongatheringstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onselectedcandidatepairchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val role: RTCIceRole = js.native
  val state: RTCIceTransportState = js.native
  @JSName("addEventListener")
  def addEventListener_gatheringstatechange(
    `type`: stdLib.stdLibStrings.gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gatheringstatechange(
    `type`: stdLib.stdLibStrings.gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gatheringstatechange(
    `type`: stdLib.stdLibStrings.gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedcandidatepairchange(
    `type`: stdLib.stdLibStrings.selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedcandidatepairchange(
    `type`: stdLib.stdLibStrings.selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedcandidatepairchange(
    `type`: stdLib.stdLibStrings.selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: stdLib.stdLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: stdLib.stdLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: stdLib.stdLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def getLocalCandidates(): js.Array[RTCIceCandidate] = js.native
  def getLocalParameters(): RTCIceParameters | scala.Null = js.native
  def getRemoteCandidates(): js.Array[RTCIceCandidate] = js.native
  def getRemoteParameters(): RTCIceParameters | scala.Null = js.native
  def getSelectedCandidatePair(): RTCIceCandidatePair | scala.Null = js.native
  @JSName("removeEventListener")
  def removeEventListener_gatheringstatechange(
    `type`: stdLib.stdLibStrings.gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gatheringstatechange(
    `type`: stdLib.stdLibStrings.gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gatheringstatechange(
    `type`: stdLib.stdLibStrings.gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedcandidatepairchange(
    `type`: stdLib.stdLibStrings.selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedcandidatepairchange(
    `type`: stdLib.stdLibStrings.selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedcandidatepairchange(
    `type`: stdLib.stdLibStrings.selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: stdLib.stdLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: stdLib.stdLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: stdLib.stdLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("RTCIceTransport")
@js.native
class RTCIceTransportCls () extends RTCIceTransport

@JSGlobal("RTCIceTransport")
@js.native
object RTCIceTransport
  extends org.scalablytyped.runtime.Instantiable0[RTCIceTransport]

