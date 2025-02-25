package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a single performance metric that is part of the performance timeline. A performance entry can be directly created by making a performance mark or measure (for example by calling the mark() method) at an explicit point in an application. Performance entries are also created in indirect ways such as loading a resource (such as an image). */
trait PerformanceEntry extends js.Object {
  val duration: scala.Double
  val entryType: java.lang.String
  val name: java.lang.String
  val startTime: scala.Double
  def toJSON(): js.Any
}

@JSGlobal("PerformanceEntry")
@js.native
class PerformanceEntryCls () extends PerformanceEntry {
  /* CompleteClass */
  override val duration: scala.Double = js.native
  /* CompleteClass */
  override val entryType: java.lang.String = js.native
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /* CompleteClass */
  override val startTime: scala.Double = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("PerformanceEntry")
@js.native
object PerformanceEntry
  extends org.scalablytyped.runtime.Instantiable0[PerformanceEntry]

