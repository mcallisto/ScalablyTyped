package typings
package tslintLib.tslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "Replacement")
@js.native
class Replacement protected ()
  extends tslintLib.libLanguageRuleRuleMod.Replacement {
  def this(start: scala.Double, length: scala.Double, text: java.lang.String) = this()
}

/* static members */
@JSImport("tslint", "Replacement")
@js.native
object Replacement extends js.Object {
  def appendText(start: scala.Double, text: java.lang.String): tslintLib.libLanguageRuleRuleMod.Replacement = js.native
  def applyAll(content: java.lang.String, replacements: js.Array[tslintLib.libLanguageRuleRuleMod.Replacement]): java.lang.String = js.native
  def applyFixes(content: java.lang.String, fixes: js.Array[tslintLib.libLanguageRuleRuleMod.Fix]): java.lang.String = js.native
  def deleteFromTo(start: scala.Double, end: scala.Double): tslintLib.libLanguageRuleRuleMod.Replacement = js.native
  def deleteText(start: scala.Double, length: scala.Double): tslintLib.libLanguageRuleRuleMod.Replacement = js.native
  def replaceFromTo(start: scala.Double, end: scala.Double, text: java.lang.String): tslintLib.libLanguageRuleRuleMod.Replacement = js.native
  def replaceNode(node: typescriptLib.typescriptMod.Node, text: java.lang.String): tslintLib.libLanguageRuleRuleMod.Replacement = js.native
  def replaceNode(
    node: typescriptLib.typescriptMod.Node,
    text: java.lang.String,
    sourceFile: typescriptLib.typescriptMod.SourceFile
  ): tslintLib.libLanguageRuleRuleMod.Replacement = js.native
}

