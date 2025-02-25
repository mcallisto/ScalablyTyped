package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootDBInstanceMessage extends js.Object {
  /**
    * The DB instance identifier. This parameter is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String
  /**
    *  A value that indicates whether the reboot is conducted through a Multi-AZ failover.  Constraint: You can't enable force failover if the instance is not configured for Multi-AZ.
    */
  var ForceFailover: js.UndefOr[BooleanOptional] = js.undefined
}

object RebootDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String, ForceFailover: js.UndefOr[BooleanOptional] = js.undefined): RebootDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier)
    if (!js.isUndefined(ForceFailover)) __obj.updateDynamic("ForceFailover")(ForceFailover)
    __obj.asInstanceOf[RebootDBInstanceMessage]
  }
}

