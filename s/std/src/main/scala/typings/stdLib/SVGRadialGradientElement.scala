package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <RadialGradient> element. */
@js.native
trait SVGRadialGradientElement extends SVGGradientElement {
  val cx: SVGAnimatedLength = js.native
  val cy: SVGAnimatedLength = js.native
  val fx: SVGAnimatedLength = js.native
  val fy: SVGAnimatedLength = js.native
  val r: SVGAnimatedLength = js.native
}

@JSGlobal("SVGRadialGradientElement")
@js.native
class SVGRadialGradientElementCls () extends SVGRadialGradientElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override val href: SVGAnimatedString = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("SVGRadialGradientElement")
@js.native
object SVGRadialGradientElement
  extends org.scalablytyped.runtime.Instantiable0[SVGRadialGradientElement]

