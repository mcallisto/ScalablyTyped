package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationResponse extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration.
    
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * 
    The time when the configuration was created.
    
    */
  var CreationTime: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * 
    The description of the configuration.
    
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * 
    The versions of Apache Kafka with which you can use this MSK configuration.
    
    */
  var KafkaVersions: js.UndefOr[__listOf__string] = js.undefined
  /**
    * 
    Latest revision of the configuration.
    
    */
  var LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined
  /**
    * 
    The name of the configuration.
    
    */
  var Name: js.UndefOr[__string] = js.undefined
}

object DescribeConfigurationResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreationTime: __timestampIso8601 = null,
    Description: __string = null,
    KafkaVersions: __listOf__string = null,
    LatestRevision: ConfigurationRevision = null,
    Name: __string = null
  ): DescribeConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (KafkaVersions != null) __obj.updateDynamic("KafkaVersions")(KafkaVersions)
    if (LatestRevision != null) __obj.updateDynamic("LatestRevision")(LatestRevision)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[DescribeConfigurationResponse]
  }
}

