package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformSourceDescription extends SourceDescription {
  var dependencies: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TransformSourceDescription {
  @scala.inline
  def apply(
    code: java.lang.String,
    ast: estreeLib.estreeMod.Program = null,
    dependencies: js.Array[java.lang.String] = null,
    map: SourceMapInput = null,
    moduleSideEffects: js.UndefOr[scala.Boolean] = js.undefined
  ): TransformSourceDescription = {
    val __obj = js.Dynamic.literal(code = code)
    if (ast != null) __obj.updateDynamic("ast")(ast)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleSideEffects)) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects)
    __obj.asInstanceOf[TransformSourceDescription]
  }
}

