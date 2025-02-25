package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadDetails extends js.Object {
  /**
    * Snapshot of CPU registers.
    */
  var context: CpuContext
  /**
    * OS-specific ID.
    */
  var id: ThreadId
  /**
    * Snapshot of state.
    */
  var state: ThreadState
}

object ThreadDetails {
  @scala.inline
  def apply(context: CpuContext, id: ThreadId, state: ThreadState): ThreadDetails = {
    val __obj = js.Dynamic.literal(context = context, id = id, state = state)
  
    __obj.asInstanceOf[ThreadDetails]
  }
}

