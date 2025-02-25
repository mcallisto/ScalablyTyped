package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gives access to properties specific to <label> elements. It inherits methods and properties from the base HTMLElement interface. */
@js.native
trait HTMLLabelElement extends HTMLElement {
  val control: HTMLElement | scala.Null = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | scala.Null = js.native
  /**
    * Sets or retrieves the object to which the given label object is assigned.
    */
  var htmlFor: java.lang.String = js.native
}

@JSGlobal("HTMLLabelElement")
@js.native
class HTMLLabelElementCls () extends HTMLLabelElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
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

@JSGlobal("HTMLLabelElement")
@js.native
object HTMLLabelElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLLabelElement]

