package typings
package heremapsLib.HNs.dataNs.AbstractReaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

/**
  * The state types of an Reader. Possible states are:
  */
@JSGlobal("H.data.AbstractReader.State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait ERROR
    extends heremapsLib.HNs.dataNs.AbstractReaderNs.State
  
  @js.native
  sealed trait LOADING
    extends heremapsLib.HNs.dataNs.AbstractReaderNs.State
  
  @js.native
  sealed trait READY
    extends heremapsLib.HNs.dataNs.AbstractReaderNs.State
  
  @js.native
  sealed trait VISIT
    extends heremapsLib.HNs.dataNs.AbstractReaderNs.State
  
  /* 0 */ val ERROR: ERROR with scala.Double = js.native
  /* 1 */ val LOADING: LOADING with scala.Double = js.native
  /* 3 */ val READY: READY with scala.Double = js.native
  /* 2 */ val VISIT: VISIT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.dataNs.AbstractReaderNs.State with scala.Double] = js.native
}

