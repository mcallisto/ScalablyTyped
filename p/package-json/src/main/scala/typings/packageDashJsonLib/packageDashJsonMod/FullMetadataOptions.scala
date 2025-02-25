package typings
package packageDashJsonLib.packageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullMetadataOptions extends Options {
  /**
  		By default, only an abbreviated metadata object is returned for performance reasons. [Read more.](https://github.com/npm/registry/blob/master/docs/responses/package-metadata.md)
  		@default false
  		*/
  @JSName("fullMetadata")
  val fullMetadata_FullMetadataOptions: packageDashJsonLib.packageDashJsonLibNumbers.`true`
}

object FullMetadataOptions {
  @scala.inline
  def apply(
    fullMetadata: packageDashJsonLib.packageDashJsonLibNumbers.`true`,
    agent: nodeLib.httpMod.Agent | nodeLib.httpsMod.Agent | Agents | packageDashJsonLib.packageDashJsonLibNumbers.`false` = null,
    allVersions: js.UndefOr[scala.Boolean] = js.undefined,
    registryUrl: java.lang.String = null,
    version: java.lang.String = null
  ): FullMetadataOptions = {
    val __obj = js.Dynamic.literal(fullMetadata = fullMetadata)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(allVersions)) __obj.updateDynamic("allVersions")(allVersions)
    if (registryUrl != null) __obj.updateDynamic("registryUrl")(registryUrl)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[FullMetadataOptions]
  }
}

