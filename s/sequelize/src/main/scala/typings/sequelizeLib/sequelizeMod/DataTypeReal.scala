package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeReal extends DataTypeAbstractNumber[DataTypeReal] {
  /**
    * Length of the number field and decimals of the real
    */
  def apply(): DataTypeReal = js.native
  def apply(length: scala.Double): DataTypeReal = js.native
  def apply(length: scala.Double, decimals: scala.Double): DataTypeReal = js.native
  def apply(options: sequelizeLib.Anon_Decimals): DataTypeReal = js.native
}

