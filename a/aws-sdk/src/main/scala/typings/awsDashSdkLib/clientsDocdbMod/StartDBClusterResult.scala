package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDBClusterResult extends js.Object {
  var DBCluster: js.UndefOr[DBCluster] = js.undefined
}

object StartDBClusterResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): StartDBClusterResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster)
    __obj.asInstanceOf[StartDBClusterResult]
  }
}

