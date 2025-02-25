package typings
package betterDashQueueLib.betterDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BetterQueue[T, K]
  extends nodeLib.NodeJSNs.EventEmitter {
  def cancel(taskId: js.Any): scala.Unit = js.native
  def cancel(taskId: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def destroy(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def getStats(): QueueStats = js.native
  def on(event: QueueEvent, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_taskfailed(
    event: betterDashQueueLib.betterDashQueueLibStrings.task_failed,
    listener: js.Function2[/* taskId */ js.Any, /* errorMessage */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_taskfinish(
    event: betterDashQueueLib.betterDashQueueLibStrings.task_finish,
    listener: js.Function2[/* taskId */ js.Any, /* result */ K, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_taskprogress(
    event: betterDashQueueLib.betterDashQueueLibStrings.task_progress,
    listener: js.Function3[
      /* taskId */ js.Any, 
      /* completed */ scala.Double, 
      /* total */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def pause(): scala.Unit = js.native
  def push(task: T): Ticket = js.native
  def push(task: T, cb: js.Function2[/* err */ js.Any, /* result */ K, scala.Unit]): Ticket = js.native
  def resetStats(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def use(store: Store[T]): scala.Unit = js.native
}

