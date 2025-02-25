package typings
package betterDashQueueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object betterDashQueueLibStrings {
  @js.native
  sealed trait accept
    extends betterDashQueueLib.betterDashQueueMod.TicketEvent
  
  @js.native
  sealed trait batch_failed
    extends betterDashQueueLib.betterDashQueueMod.QueueEvent
  
  @js.native
  sealed trait batch_finish
    extends betterDashQueueLib.betterDashQueueMod.QueueEvent
  
  @js.native
  sealed trait batch_progress
    extends betterDashQueueLib.betterDashQueueMod.QueueEvent
  
  @js.native
  sealed trait drain
    extends betterDashQueueLib.betterDashQueueMod.QueueEvent
  
  @js.native
  sealed trait empty
    extends betterDashQueueLib.betterDashQueueMod.QueueEvent
  
  @js.native
  sealed trait error
    extends betterDashQueueLib.betterDashQueueMod.QueueEvent
       with betterDashQueueLib.betterDashQueueMod.TicketEvent
  
  @js.native
  sealed trait failed
    extends betterDashQueueLib.betterDashQueueMod.TicketEvent
  
  @js.native
  sealed trait finish
    extends betterDashQueueLib.betterDashQueueMod.TicketEvent
  
  @js.native
  sealed trait progress
    extends betterDashQueueLib.betterDashQueueMod.TicketEvent
  
  @js.native
  sealed trait queued
    extends betterDashQueueLib.betterDashQueueMod.TicketEvent
  
  @js.native
  sealed trait started
    extends betterDashQueueLib.betterDashQueueMod.TicketEvent
  
  @js.native
  sealed trait task_accepted
    extends betterDashQueueLib.betterDashQueueMod.QueueEvent
  
  @js.native
  sealed trait task_failed
    extends betterDashQueueLib.betterDashQueueMod.QueueEvent
  
  @js.native
  sealed trait task_finish
    extends betterDashQueueLib.betterDashQueueMod.QueueEvent
  
  @js.native
  sealed trait task_progress
    extends betterDashQueueLib.betterDashQueueMod.QueueEvent
  
  @js.native
  sealed trait task_queued
    extends betterDashQueueLib.betterDashQueueMod.QueueEvent
  
  @js.native
  sealed trait task_started
    extends betterDashQueueLib.betterDashQueueMod.QueueEvent
  
  @scala.inline
  def accept: accept = "accept".asInstanceOf[accept]
  @scala.inline
  def batch_failed: batch_failed = "batch_failed".asInstanceOf[batch_failed]
  @scala.inline
  def batch_finish: batch_finish = "batch_finish".asInstanceOf[batch_finish]
  @scala.inline
  def batch_progress: batch_progress = "batch_progress".asInstanceOf[batch_progress]
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  @scala.inline
  def empty: empty = "empty".asInstanceOf[empty]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  @scala.inline
  def queued: queued = "queued".asInstanceOf[queued]
  @scala.inline
  def started: started = "started".asInstanceOf[started]
  @scala.inline
  def task_accepted: task_accepted = "task_accepted".asInstanceOf[task_accepted]
  @scala.inline
  def task_failed: task_failed = "task_failed".asInstanceOf[task_failed]
  @scala.inline
  def task_finish: task_finish = "task_finish".asInstanceOf[task_finish]
  @scala.inline
  def task_progress: task_progress = "task_progress".asInstanceOf[task_progress]
  @scala.inline
  def task_queued: task_queued = "task_queued".asInstanceOf[task_queued]
  @scala.inline
  def task_started: task_started = "task_started".asInstanceOf[task_started]
}

