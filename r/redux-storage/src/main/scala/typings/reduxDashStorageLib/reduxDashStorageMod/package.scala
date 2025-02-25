package typings
package reduxDashStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashStorageMod {
  type ActionTypeCheckCallback = js.Function1[/* type */ java.lang.String, scala.Boolean]
  /**
    * Loader interface
    */
  type Loader[TState] = js.Function1[
    /* store */ reduxLib.reduxMod.Store[TState, reduxLib.reduxMod.AnyAction], 
    js.Thenable[js.Any]
  ]
  type StateMerger = js.Function2[/* oldState */ js.Any, /* newState */ js.Any, js.Any]
}
