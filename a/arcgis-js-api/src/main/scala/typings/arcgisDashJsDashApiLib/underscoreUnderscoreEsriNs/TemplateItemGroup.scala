package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateItemGroup extends Accessor {
  /**
    * An array of [TemplateItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html) grouped to display in the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItemGroup.html#items)
    */
  val items: js.Array[TemplateItem] = js.native
  /**
    * The label displayed in the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) widget indicating the grouped [TemplateItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItemGroup.html#label)
    */
  val label: java.lang.String = js.native
}

@JSGlobal("__esri.TemplateItemGroup")
@js.native
class TemplateItemGroupCls () extends TemplateItemGroup {
  def this(properties: TemplateItemGroupProperties) = this()
}

