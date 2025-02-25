package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaultRootCauseEntity extends js.Object {
  /**
    * The types and messages of the exceptions.
    */
  var Exceptions: js.UndefOr[RootCauseExceptions] = js.undefined
  /**
    * The name of the entity.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * A flag that denotes a remote subsegment.
    */
  var Remote: js.UndefOr[NullableBoolean] = js.undefined
}

object FaultRootCauseEntity {
  @scala.inline
  def apply(
    Exceptions: RootCauseExceptions = null,
    Name: String = null,
    Remote: js.UndefOr[NullableBoolean] = js.undefined
  ): FaultRootCauseEntity = {
    val __obj = js.Dynamic.literal()
    if (Exceptions != null) __obj.updateDynamic("Exceptions")(Exceptions)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Remote)) __obj.updateDynamic("Remote")(Remote)
    __obj.asInstanceOf[FaultRootCauseEntity]
  }
}

