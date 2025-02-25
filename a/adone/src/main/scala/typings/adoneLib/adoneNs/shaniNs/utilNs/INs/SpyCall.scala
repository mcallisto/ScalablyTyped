package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpyCall extends SpyCallApi {
  /**
    * Whether the call was called after the given call
    */
  def calledAfter(call: SpyCall): scala.Boolean = js.native
  /**
    * Whether the call was called before the given call
    */
  def calledBefore(call: SpyCall): scala.Boolean = js.native
  /**
    * Whether the call was called using the new operator
    */
  def calledWithNew(call: SpyCall): scala.Boolean = js.native
}

