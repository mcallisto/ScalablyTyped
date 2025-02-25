package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the Streams API provides a standard abstraction for writing streaming data to a destination, known as a sink. This object comes with built-in backpressure and queuing. */
@js.native
trait WritableStream[W] extends js.Object {
  val locked: scala.Boolean = js.native
  def abort(): js.Promise[scala.Unit] = js.native
  def abort(reason: js.Any): js.Promise[scala.Unit] = js.native
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
}

@JSGlobal("WritableStream")
@js.native
class WritableStreamCls[W] () extends WritableStream[W] {
  def this(underlyingSink: UnderlyingSink[W]) = this()
  def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
}

@JSGlobal("WritableStream")
@js.native
object WritableStream
  extends org.scalablytyped.runtime.Instantiable0[WritableStream[js.Object]]
     with org.scalablytyped.runtime.Instantiable1[/* underlyingSink */ UnderlyingSink[js.Object], WritableStream[js.Object]]
     with org.scalablytyped.runtime.Instantiable2[
      /* underlyingSink */ UnderlyingSink[js.Object], 
      /* strategy */ QueuingStrategy[js.Object], 
      WritableStream[js.Object]
    ]

