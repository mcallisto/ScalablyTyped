package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewing extends Accessor {
  /**
    * An object specifying the search parameters set within the web scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-Viewing.html#search)
    */
  var search: Search = js.native
}

@JSGlobal("__esri.Viewing")
@js.native
class ViewingCls () extends Viewing {
  def this(properties: ViewingProperties) = this()
}

