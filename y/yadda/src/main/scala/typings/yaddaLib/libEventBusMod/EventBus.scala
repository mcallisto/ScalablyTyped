package typings
package yaddaLib.libEventBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib/EventBus", "EventBus")
@js.native
class EventBus () extends js.Object {
  def on(
    event_pattern: stdLib.RegExp,
    callback: js.Function1[/* event */ ScenarioEvent | StepEvent | ExecuteEvent | DefineEvent, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ONDEFINE(
    event_pattern: yaddaLib.yaddaLibStrings.__ON_DEFINE__,
    callback: js.Function1[/* event */ DefineEvent, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ONEXECUTE(
    event_pattern: yaddaLib.yaddaLibStrings.__ON_EXECUTE__,
    callback: js.Function1[/* event */ ExecuteEvent, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ONSCENARIO(
    event_pattern: yaddaLib.yaddaLibStrings.__ON_SCENARIO__,
    callback: js.Function1[/* event */ ScenarioEvent, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ONSTEP(
    event_pattern: yaddaLib.yaddaLibStrings.__ON_STEP__,
    callback: js.Function1[/* event */ StepEvent, scala.Unit]
  ): this.type = js.native
  @JSName("send")
  def send_ONDEFINE(event_name: yaddaLib.yaddaLibStrings.__ON_DEFINE__, event_data: DefineEvent): scala.Unit = js.native
  @JSName("send")
  def send_ONDEFINE(
    event_name: yaddaLib.yaddaLibStrings.__ON_DEFINE__,
    event_data: DefineEvent,
    next: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  @JSName("send")
  def send_ONEXECUTE(event_name: yaddaLib.yaddaLibStrings.__ON_EXECUTE__, event_data: ExecuteEvent): scala.Unit = js.native
  @JSName("send")
  def send_ONEXECUTE(
    event_name: yaddaLib.yaddaLibStrings.__ON_EXECUTE__,
    event_data: ExecuteEvent,
    next: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  @JSName("send")
  def send_ONSCENARIO(event_name: yaddaLib.yaddaLibStrings.__ON_SCENARIO__, event_data: ScenarioEventData): scala.Unit = js.native
  @JSName("send")
  def send_ONSCENARIO(
    event_name: yaddaLib.yaddaLibStrings.__ON_SCENARIO__,
    event_data: ScenarioEventData,
    next: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  @JSName("send")
  def send_ONSTEP(event_name: yaddaLib.yaddaLibStrings.__ON_STEP__, event_data: StepEvent): scala.Unit = js.native
  @JSName("send")
  def send_ONSTEP(
    event_name: yaddaLib.yaddaLibStrings.__ON_STEP__,
    event_data: StepEvent,
    next: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
}

