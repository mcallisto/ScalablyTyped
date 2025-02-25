package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonClassifier extends js.Object {
  /**
    * The time that this classifier was registered.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * A JsonPath string defining the JSON data for the classifier to classify. AWS Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
    */
  var JsonPath: awsDashSdkLib.clientsGlueMod.JsonPath
  /**
    * The time that this classifier was last updated.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the classifier.
    */
  var Name: NameString
  /**
    * The version of this classifier.
    */
  var Version: js.UndefOr[VersionId] = js.undefined
}

object JsonClassifier {
  @scala.inline
  def apply(
    JsonPath: JsonPath,
    Name: NameString,
    CreationTime: Timestamp = null,
    LastUpdated: Timestamp = null,
    Version: js.UndefOr[VersionId] = js.undefined
  ): JsonClassifier = {
    val __obj = js.Dynamic.literal(JsonPath = JsonPath, Name = Name)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[JsonClassifier]
  }
}

