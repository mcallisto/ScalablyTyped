package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsupportedLayer extends Layer {
  @JSName("on")
  def on_layerviewcreate(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: UnsupportedLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create-error`,
    eventHandler: UnsupportedLayerLayerviewCreateErrorEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: UnsupportedLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
}

@JSGlobal("__esri.UnsupportedLayer")
@js.native
class UnsupportedLayerCls () extends UnsupportedLayer {
  def this(properties: UnsupportedLayerProperties) = this()
}

