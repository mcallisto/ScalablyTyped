package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FragmentShaderSourceMaterial extends js.Object {
  var fragmentShaderSource: js.UndefOr[java.lang.String] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.Material] = js.undefined
  var renderState: js.UndefOr[cesiumLib.cesiumMod.RenderState] = js.undefined
  var translucent: js.UndefOr[scala.Boolean] = js.undefined
  var vertexShaderSource: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FragmentShaderSourceMaterial {
  @scala.inline
  def apply(
    fragmentShaderSource: java.lang.String = null,
    material: cesiumLib.cesiumMod.Material = null,
    renderState: cesiumLib.cesiumMod.RenderState = null,
    translucent: js.UndefOr[scala.Boolean] = js.undefined,
    vertexShaderSource: java.lang.String = null
  ): Anon_FragmentShaderSourceMaterial = {
    val __obj = js.Dynamic.literal()
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource)
    if (material != null) __obj.updateDynamic("material")(material)
    if (renderState != null) __obj.updateDynamic("renderState")(renderState)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource)
    __obj.asInstanceOf[Anon_FragmentShaderSourceMaterial]
  }
}

