package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactLocation extends js.Object {
  /**
    * A short description of the artifact location.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * The index within the run artifacts array of the artifact object associated with the artifact location.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the artifact location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A string containing a valid relative or absolute URI.
    */
  var uri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string which indirectly specifies the absolute URI with respect to which a relative URI in the "uri" property
    * is interpreted.
    */
  var uriBaseId: js.UndefOr[java.lang.String] = js.undefined
}

object ArtifactLocation {
  @scala.inline
  def apply(
    description: Message = null,
    index: scala.Int | scala.Double = null,
    properties: PropertyBag = null,
    uri: java.lang.String = null,
    uriBaseId: java.lang.String = null
  ): ArtifactLocation = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (uriBaseId != null) __obj.updateDynamic("uriBaseId")(uriBaseId)
    __obj.asInstanceOf[ArtifactLocation]
  }
}

