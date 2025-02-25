package typings
package nodeLib.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContextOptions extends js.Object {
  var codeGeneration: js.UndefOr[nodeLib.Anon_Strings] = js.undefined
  /**
    * Human-readable name of the newly created context.
    * @default 'VM Context i' Where i is an ascending numerical index of the created context.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Corresponds to the newly created context for display purposes.
    * The origin should be formatted like a `URL`, but with only the scheme, host, and port (if necessary),
    * like the value of the `url.origin` property of a URL object.
    * Most notably, this string should omit the trailing slash, as that denotes a path.
    * @default ''
    */
  var origin: js.UndefOr[java.lang.String] = js.undefined
}

object CreateContextOptions {
  @scala.inline
  def apply(
    codeGeneration: nodeLib.Anon_Strings = null,
    name: java.lang.String = null,
    origin: java.lang.String = null
  ): CreateContextOptions = {
    val __obj = js.Dynamic.literal()
    if (codeGeneration != null) __obj.updateDynamic("codeGeneration")(codeGeneration)
    if (name != null) __obj.updateDynamic("name")(name)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[CreateContextOptions]
  }
}

