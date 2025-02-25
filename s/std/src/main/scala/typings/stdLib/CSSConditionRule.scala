package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single condition CSS at-rule, which consists of a condition and a statement block. It is a child of CSSGroupingRule. */
trait CSSConditionRule extends CSSGroupingRule {
  var conditionText: java.lang.String
}

@JSGlobal("CSSConditionRule")
@js.native
class CSSConditionRuleCls () extends CSSConditionRule {
  /* CompleteClass */
  override val CHARSET_RULE: scala.Double = js.native
  /* CompleteClass */
  override val FONT_FACE_RULE: scala.Double = js.native
  /* CompleteClass */
  override val IMPORT_RULE: scala.Double = js.native
  /* CompleteClass */
  override val KEYFRAMES_RULE: scala.Double = js.native
  /* CompleteClass */
  override val KEYFRAME_RULE: scala.Double = js.native
  /* CompleteClass */
  override val MEDIA_RULE: scala.Double = js.native
  /* CompleteClass */
  override val NAMESPACE_RULE: scala.Double = js.native
  /* CompleteClass */
  override val PAGE_RULE: scala.Double = js.native
  /* CompleteClass */
  override val STYLE_RULE: scala.Double = js.native
  /* CompleteClass */
  override val SUPPORTS_RULE: scala.Double = js.native
  /* CompleteClass */
  override val UNKNOWN_RULE: scala.Double = js.native
  /* CompleteClass */
  override val VIEWPORT_RULE: scala.Double = js.native
  /* CompleteClass */
  override var conditionText: java.lang.String = js.native
  /* CompleteClass */
  override val cssRules: CSSRuleList = js.native
  /* CompleteClass */
  override var cssText: java.lang.String = js.native
  /* CompleteClass */
  override val parentRule: CSSRule | scala.Null = js.native
  /* CompleteClass */
  override val parentStyleSheet: CSSStyleSheet | scala.Null = js.native
  /* CompleteClass */
  override val `type`: scala.Double = js.native
  /* CompleteClass */
  override def deleteRule(index: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def insertRule(rule: java.lang.String, index: scala.Double): scala.Double = js.native
}

@JSGlobal("CSSConditionRule")
@js.native
object CSSConditionRule
  extends org.scalablytyped.runtime.Instantiable0[CSSConditionRule]

