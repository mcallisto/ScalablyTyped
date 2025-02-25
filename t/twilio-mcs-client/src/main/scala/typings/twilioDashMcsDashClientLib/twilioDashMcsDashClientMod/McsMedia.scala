package typings
package twilioDashMcsDashClientLib.twilioDashMcsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc A Media represents a metadata information for the media upload
  * @property {String} sid - The server-assigned unique identifier for Media
  * @property {String} serviceSid - Service instance id which Media belongs/uploaded to
  * @property {Date} dateCreated - When the Media was created
  * @property {Date} dateUpdated - When the Media was updated
  * @property {Number} size - Size of media, bytes
  * @property {String} contentType - content type of media
  * @property {String} fileName - file name, if present, null otherwise
  */
@JSImport("twilio-mcs-client", "McsMedia")
@js.native
class McsMedia protected ()
  extends twilioDashMcsDashClientLib.libMediaMod.Media {
  def this(config: twilioDashMcsDashClientLib.libConfigurationMod.Configuration, network: twilioDashMcsDashClientLib.libServicesNetworkMod.Network, data: js.Any) = this()
}

