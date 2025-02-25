package typings
package atPhosphorCoreutilsLib.atPhosphorCoreutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/coreutils", "Random")
@js.native
object RandomNs extends js.Object {
  /**
    * A function which generates random bytes.
    *
    * @param buffer - The `Uint8Array` to fill with random bytes.
    *
    * #### Notes
    * A cryptographically strong random number generator will be used if
    * available. Otherwise, `Math.random` will be used as a fallback for
    * randomness.
    *
    * The following RNGs are supported, listed in order of precedence:
    *   - `window.crypto.getRandomValues`
    *   - `window.msCrypto.getRandomValues`
    *   - `require('crypto').randomFillSync
    *   - `require('crypto').randomBytes
    *   - `Math.random`
    */
  def getRandomValues(buffer: stdLib.Uint8Array): scala.Unit = js.native
}

