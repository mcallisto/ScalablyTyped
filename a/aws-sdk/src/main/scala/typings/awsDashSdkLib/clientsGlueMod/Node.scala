package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  /**
    * Details of the crawler when the node represents a crawler.
    */
  var CrawlerDetails: js.UndefOr[CrawlerNodeDetails] = js.undefined
  /**
    * Details of the Job when the node represents a Job.
    */
  var JobDetails: js.UndefOr[JobNodeDetails] = js.undefined
  /**
    * The name of the AWS Glue component represented by the node.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  /**
    * Details of the Trigger when the node represents a Trigger.
    */
  var TriggerDetails: js.UndefOr[TriggerNodeDetails] = js.undefined
  /**
    * The type of AWS Glue component represented by the node.
    */
  var Type: js.UndefOr[NodeType] = js.undefined
  /**
    * The unique Id assigned to the node within the workflow.
    */
  var UniqueId: js.UndefOr[NameString] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    CrawlerDetails: CrawlerNodeDetails = null,
    JobDetails: JobNodeDetails = null,
    Name: NameString = null,
    TriggerDetails: TriggerNodeDetails = null,
    Type: NodeType = null,
    UniqueId: NameString = null
  ): Node = {
    val __obj = js.Dynamic.literal()
    if (CrawlerDetails != null) __obj.updateDynamic("CrawlerDetails")(CrawlerDetails)
    if (JobDetails != null) __obj.updateDynamic("JobDetails")(JobDetails)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (TriggerDetails != null) __obj.updateDynamic("TriggerDetails")(TriggerDetails)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (UniqueId != null) __obj.updateDynamic("UniqueId")(UniqueId)
    __obj.asInstanceOf[Node]
  }
}

