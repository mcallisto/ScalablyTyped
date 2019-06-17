package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "FoldingRange")
@js.native
object FoldingRangeNs extends js.Object {
  /**
    * Creates a new FoldingRange literal.
    */
  def create(startLine: scala.Double, endLine: scala.Double): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRange = js.native
  def create(startLine: scala.Double, endLine: scala.Double, startCharacter: scala.Double): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRange = js.native
  def create(
    startLine: scala.Double,
    endLine: scala.Double,
    startCharacter: scala.Double,
    endCharacter: scala.Double
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRange = js.native
  def create(
    startLine: scala.Double,
    endLine: scala.Double,
    startCharacter: scala.Double,
    endCharacter: scala.Double,
    kind: java.lang.String
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.FoldingRange = js.native
  /**
    * Checks whether the given literal conforms to the [FoldingRange](#FoldingRange) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ scala.Boolean = js.native
}

