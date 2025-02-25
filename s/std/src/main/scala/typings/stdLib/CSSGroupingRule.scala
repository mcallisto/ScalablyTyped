package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any CSS at-rule that contains other rules nested within it. */
trait CSSGroupingRule extends CSSRule {
  val cssRules: CSSRuleList
  def deleteRule(index: scala.Double): scala.Unit
  def insertRule(rule: java.lang.String, index: scala.Double): scala.Double
}

@JSGlobal("CSSGroupingRule")
@js.native
class CSSGroupingRuleCls () extends CSSGroupingRule {
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

@JSGlobal("CSSGroupingRule")
@js.native
object CSSGroupingRule
  extends org.scalablytyped.runtime.Instantiable0[CSSGroupingRule]

