package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterSecurityGroupMessage extends js.Object {
  /**
    * The name for the security group. Amazon Redshift stores the value as a lowercase string. Constraints:   Must contain no more than 255 alphanumeric characters or hyphens.   Must not be "Default".   Must be unique for all security groups that are created by your AWS account.   Example: examplesecuritygroup 
    */
  var ClusterSecurityGroupName: String
  /**
    * A description for the security group.
    */
  var Description: String
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateClusterSecurityGroupMessage {
  @scala.inline
  def apply(ClusterSecurityGroupName: String, Description: String, Tags: TagList = null): CreateClusterSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName, Description = Description)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateClusterSecurityGroupMessage]
  }
}

