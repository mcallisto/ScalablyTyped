package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/rule", "Replacement")
@js.native
class Replacement protected () extends js.Object {
  def this(start: scala.Double, length: scala.Double, text: java.lang.String) = this()
  val end: scala.Double = js.native
  val length: scala.Double = js.native
  val start: scala.Double = js.native
  val text: java.lang.String = js.native
  @JSName("apply")
  def apply(content: java.lang.String): java.lang.String = js.native
  def toJson(): ReplacementJson = js.native
}

/* static members */
@JSImport("tslint/lib/language/rule/rule", "Replacement")
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

