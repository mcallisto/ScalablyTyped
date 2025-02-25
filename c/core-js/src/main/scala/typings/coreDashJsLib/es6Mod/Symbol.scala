package typings
package coreDashJsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/es6", "Symbol")
@js.native
object Symbol
  extends coreDashJsLib.SymbolConstructor {
  /**
    * Non-standard. Use simple mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  /* CompleteClass */
  override def useSimple(): scala.Unit = js.native
  /**
    * Non-standard. Use setter mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  /* CompleteClass */
  override def userSetter(): scala.Unit = js.native
}

