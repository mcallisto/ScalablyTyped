package typings
package keyvLib.keyvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keyv", JSImport.Namespace)
@js.native
/**
  * @param opts The options object is also passed through to the storage adapter. Check your storage adapter docs for any extra options.
  */
class ^[TValue] () extends Keyv[TValue] {
  def this(opts: Options[TValue]) = this()
  def this(uri: java.lang.String) = this()
  def this(uri: java.lang.String, opts: Options[TValue]) = this()
}

