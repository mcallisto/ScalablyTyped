package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriHandler extends js.Object {
  /**
  		 * Handle the provided system-wide [uri](#Uri).
  		 *
  		 * @see [window.registerUriHandler](#window.registerUriHandler).
  		 */
  def handleUri(uri: Uri): ProviderResult[scala.Unit]
}

object UriHandler {
  @scala.inline
  def apply(handleUri: Uri => ProviderResult[scala.Unit]): UriHandler = {
    val __obj = js.Dynamic.literal(handleUri = js.Any.fromFunction1(handleUri))
  
    __obj.asInstanceOf[UriHandler]
  }
}

