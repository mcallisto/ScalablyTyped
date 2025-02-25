package typings
package phaserLib.PhaserNs.TypesNs.TilemapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectLayerConfig extends js.Object {
  /**
    * The name of the Object Layer.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of all objects on this Object Layer.
    */
  var objects: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The opacity of the layer, between 0 and 1.
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The custom properties defined on the Object Layer, keyed by their name.
    */
  var properties: js.UndefOr[js.Any] = js.undefined
  /**
    * The type of each custom property defined on the Object Layer, keyed by its name.
    */
  var propertytypes: js.UndefOr[js.Any] = js.undefined
  /**
    * The type of the layer, which should be `objectgroup`.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the layer is shown (`true`) or hidden (`false`).
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ObjectLayerConfig {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    objects: js.Array[_] = null,
    opacity: scala.Int | scala.Double = null,
    properties: js.Any = null,
    propertytypes: js.Any = null,
    `type`: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ObjectLayerConfig = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (objects != null) __obj.updateDynamic("objects")(objects)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (propertytypes != null) __obj.updateDynamic("propertytypes")(propertytypes)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ObjectLayerConfig]
  }
}

