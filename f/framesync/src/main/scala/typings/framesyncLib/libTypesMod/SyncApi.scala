package typings
package framesyncLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncApi extends js.Object {
  var cancelSync: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void}
    */ framesyncLib.framesyncLibStrings.SyncApi with js.Any
  var steps: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step}
    */ framesyncLib.framesyncLibStrings.SyncApi with js.Any
  var sync: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive? : boolean, immediate? : boolean): framesync.framesync/lib/types.Process}
    */ framesyncLib.framesyncLibStrings.SyncApi with js.Any
}

object SyncApi {
  @scala.inline
  def apply(
    cancelSync: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void}
    */ framesyncLib.framesyncLibStrings.SyncApi with js.Any,
    steps: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step}
    */ framesyncLib.framesyncLibStrings.SyncApi with js.Any,
    sync: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive? : boolean, immediate? : boolean): framesync.framesync/lib/types.Process}
    */ framesyncLib.framesyncLibStrings.SyncApi with js.Any
  ): SyncApi = {
    val __obj = js.Dynamic.literal(cancelSync = cancelSync, steps = steps, sync = sync)
  
    __obj.asInstanceOf[SyncApi]
  }
}

