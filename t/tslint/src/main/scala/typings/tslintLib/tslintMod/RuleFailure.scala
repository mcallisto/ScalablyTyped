package typings
package tslintLib.tslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "RuleFailure")
@js.native
class RuleFailure protected ()
  extends tslintLib.libLanguageRuleRuleMod.RuleFailure {
  def this(sourceFile: typescriptLib.typescriptMod.SourceFile, start: scala.Double, end: scala.Double, failure: java.lang.String, ruleName: java.lang.String) = this()
  def this(sourceFile: typescriptLib.typescriptMod.SourceFile, start: scala.Double, end: scala.Double, failure: java.lang.String, ruleName: java.lang.String, fix: js.Array[tslintLib.libLanguageRuleRuleMod.Replacement]) = this()
  def this(sourceFile: typescriptLib.typescriptMod.SourceFile, start: scala.Double, end: scala.Double, failure: java.lang.String, ruleName: java.lang.String, fix: tslintLib.libLanguageRuleRuleMod.Replacement) = this()
}

/* static members */
@JSImport("tslint", "RuleFailure")
@js.native
object RuleFailure extends js.Object {
  def compare(a: tslintLib.libLanguageRuleRuleMod.RuleFailure, b: tslintLib.libLanguageRuleRuleMod.RuleFailure): scala.Double = js.native
}

