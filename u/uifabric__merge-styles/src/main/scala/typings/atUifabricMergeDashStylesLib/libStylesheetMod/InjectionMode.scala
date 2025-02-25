package typings
package atUifabricMergeDashStylesLib.libStylesheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibNumbers.`0`
  - atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibNumbers.`1`
  - atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibNumbers.`2`
*/
trait InjectionMode extends js.Object

@JSImport("@uifabric/merge-styles/lib/Stylesheet", "InjectionMode")
@js.native
object InjectionMode extends js.Object {
  /**
    * Appends rules using appendChild.
    */
  var appendChild: atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibNumbers.`2` = js.native
  /**
    * Inserts rules using the insertRule api.
    */
  var insertNode: atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibNumbers.`1` = js.native
  /**
    * Avoids style injection, use getRules() to read the styles.
    */
  var none: atUifabricMergeDashStylesLib.atUifabricMergeDashStylesLibNumbers.`0` = js.native
}

