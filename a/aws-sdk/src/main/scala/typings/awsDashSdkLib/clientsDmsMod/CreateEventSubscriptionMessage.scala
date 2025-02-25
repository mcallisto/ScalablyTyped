package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEventSubscriptionMessage extends js.Object {
  /**
    *  A Boolean value; set to true to activate the subscription, or set to false to create the subscription but not activate it. 
    */
  var Enabled: js.UndefOr[BooleanOptional] = js.undefined
  /**
    *  A list of event categories for a source type that you want to subscribe to. You can see a list of the categories for a given source type by calling the DescribeEventCategories action or in the topic Working with Events and Notifications in the AWS Database Migration Service User Guide. 
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  /**
    *  The Amazon Resource Name (ARN) of the Amazon SNS topic created for event notification. The ARN is created by Amazon SNS when you create a topic and subscribe to it. 
    */
  var SnsTopicArn: String
  /**
    *  The list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it cannot end with a hyphen or contain two consecutive hyphens. 
    */
  var SourceIds: js.UndefOr[SourceIdsList] = js.undefined
  /**
    *  The type of AWS DMS resource that generates the events. For example, if you want to be notified of events generated by a replication instance, you set this parameter to replication-instance. If this value is not specified, all events are returned.  Valid values: replication-instance | migration-task
    */
  var SourceType: js.UndefOr[String] = js.undefined
  /**
    * The name of the AWS DMS event notification subscription.  Constraints: The name must be less than 255 characters. 
    */
  var SubscriptionName: String
  /**
    * A tag to be attached to the event subscription.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateEventSubscriptionMessage {
  @scala.inline
  def apply(
    SnsTopicArn: String,
    SubscriptionName: String,
    Enabled: js.UndefOr[BooleanOptional] = js.undefined,
    EventCategories: EventCategoriesList = null,
    SourceIds: SourceIdsList = null,
    SourceType: String = null,
    Tags: TagList = null
  ): CreateEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SnsTopicArn = SnsTopicArn, SubscriptionName = SubscriptionName)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories)
    if (SourceIds != null) __obj.updateDynamic("SourceIds")(SourceIds)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateEventSubscriptionMessage]
  }
}

