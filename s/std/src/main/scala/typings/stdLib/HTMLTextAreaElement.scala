package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods for manipulating the layout and presentation of <textarea> elements. */
@js.native
trait HTMLTextAreaElement extends HTMLElement {
  var autocomplete: java.lang.String = js.native
  /**
    * Provides a way to direct a user to a specific field when a document loads. This can provide both direction and convenience for a user, reducing the need to click or tab to a field when a page opens. This attribute is true when present on an element, and false when missing.
    */
  var autofocus: scala.Boolean = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var cols: scala.Double = js.native
  /**
    * Sets or retrieves the initial contents of the object.
    */
  var defaultValue: java.lang.String = js.native
  var dirName: java.lang.String = js.native
  var disabled: scala.Boolean = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | scala.Null = js.native
  val labels: NodeListOf[HTMLLabelElement] = js.native
  /**
    * Sets or retrieves the maximum number of characters that the user can enter in a text control.
    */
  var maxLength: scala.Double = js.native
  var minLength: scala.Double = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
  /**
    * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
    */
  var placeholder: java.lang.String = js.native
  /**
    * Sets or retrieves the value indicated whether the content of the object is read-only.
    */
  var readOnly: scala.Boolean = js.native
  /**
    * When present, marks an element that can't be submitted without a value.
    */
  var required: scala.Boolean = js.native
  /**
    * Sets or retrieves the number of horizontal rows contained in the object.
    */
  var rows: scala.Double = js.native
  var selectionDirection: java.lang.String = js.native
  /**
    * Gets or sets the end position or offset of a text selection.
    */
  var selectionEnd: scala.Double = js.native
  /**
    * Gets or sets the starting position or offset of a text selection.
    */
  var selectionStart: scala.Double = js.native
  val textLength: scala.Double = js.native
  /**
    * Retrieves the type of control.
    */
  val `type`: java.lang.String = js.native
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    */
  val validationMessage: java.lang.String = js.native
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    */
  val validity: ValidityState = js.native
  /**
    * Retrieves or sets the text in the entry field of the textArea element.
    */
  var value: java.lang.String = js.native
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    */
  val willValidate: scala.Boolean = js.native
  /**
    * Sets or retrieves how to handle wordwrapping in the object.
    */
  var wrap: java.lang.String = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  def reportValidity(): scala.Boolean = js.native
  /**
    * Highlights the input area of a form element.
    */
  def select(): scala.Unit = js.native
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  def setCustomValidity(error: java.lang.String): scala.Unit = js.native
  def setRangeText(replacement: java.lang.String): scala.Unit = js.native
  def setRangeText(replacement: java.lang.String, start: scala.Double, end: scala.Double): scala.Unit = js.native
  def setRangeText(
    replacement: java.lang.String,
    start: scala.Double,
    end: scala.Double,
    selectionMode: SelectionMode
  ): scala.Unit = js.native
  /**
    * Sets the start and end positions of a selection in a text field.
    * @param start The offset into the text field for the start of the selection.
    * @param end The offset into the text field for the end of the selection.
    * @param direction The direction in which the selection is performed.
    */
  def setSelectionRange(start: scala.Double, end: scala.Double): scala.Unit = js.native
  @JSName("setSelectionRange")
  def setSelectionRange_backward(start: scala.Double, end: scala.Double, direction: stdLib.stdLibStrings.backward): scala.Unit = js.native
  @JSName("setSelectionRange")
  def setSelectionRange_forward(start: scala.Double, end: scala.Double, direction: stdLib.stdLibStrings.forward): scala.Unit = js.native
  @JSName("setSelectionRange")
  def setSelectionRange_none(start: scala.Double, end: scala.Double, direction: stdLib.stdLibStrings.none): scala.Unit = js.native
}

@JSGlobal("HTMLTextAreaElement")
@js.native
class HTMLTextAreaElementCls () extends HTMLTextAreaElement {
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

@JSGlobal("HTMLTextAreaElement")
@js.native
object HTMLTextAreaElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLTextAreaElement]

