package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods for manipulating the options, layout, and presentation of <input> elements. */
@js.native
trait HTMLInputElement extends HTMLElement {
  /**
    * Sets or retrieves a comma-separated list of content types.
    */
  var accept: java.lang.String = js.native
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    */
  /** @deprecated */
  var align: java.lang.String = js.native
  /**
    * Sets or retrieves a text alternative to the graphic.
    */
  var alt: java.lang.String = js.native
  /**
    * Specifies whether autocomplete is applied to an editable text field.
    */
  var autocomplete: java.lang.String = js.native
  /**
    * Provides a way to direct a user to a specific field when a document loads. This can provide both direction and convenience for a user, reducing the need to click or tab to a field when a page opens. This attribute is true when present on an element, and false when missing.
    */
  var autofocus: scala.Boolean = js.native
  /**
    * Sets or retrieves the state of the check box or radio button.
    */
  var checked: scala.Boolean = js.native
  /**
    * Sets or retrieves the state of the check box or radio button.
    */
  var defaultChecked: scala.Boolean = js.native
  /**
    * Sets or retrieves the initial contents of the object.
    */
  var defaultValue: java.lang.String = js.native
  var dirName: java.lang.String = js.native
  var disabled: scala.Boolean = js.native
  /**
    * Returns a FileList object on a file type input object.
    */
  var files: FileList | scala.Null = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | scala.Null = js.native
  /**
    * Overrides the action attribute (where the data on a form is sent) on the parent form element.
    */
  var formAction: java.lang.String = js.native
  /**
    * Used to override the encoding (formEnctype attribute) specified on the form element.
    */
  var formEnctype: java.lang.String = js.native
  /**
    * Overrides the submit method attribute previously specified on a form element.
    */
  var formMethod: java.lang.String = js.native
  /**
    * Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option.
    */
  var formNoValidate: scala.Boolean = js.native
  /**
    * Overrides the target attribute on a form element.
    */
  var formTarget: java.lang.String = js.native
  /**
    * Sets or retrieves the height of the object.
    */
  var height: scala.Double = js.native
  var indeterminate: scala.Boolean = js.native
  val labels: NodeListOf[HTMLLabelElement] | scala.Null = js.native
  /**
    * Specifies the ID of a pre-defined datalist of options for an input element.
    */
  val list: HTMLElement | scala.Null = js.native
  /**
    * Defines the maximum acceptable value for an input element with type="number".When used with the min and step attributes, lets you control the range and increment (such as only even numbers) that the user can enter into an input field.
    */
  var max: java.lang.String = js.native
  /**
    * Sets or retrieves the maximum number of characters that the user can enter in a text control.
    */
  var maxLength: scala.Double = js.native
  /**
    * Defines the minimum acceptable value for an input element with type="number". When used with the max and step attributes, lets you control the range and increment (such as even numbers only) that the user can enter into an input field.
    */
  var min: java.lang.String = js.native
  var minLength: scala.Double = js.native
  /**
    * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
    */
  var multiple: scala.Boolean = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
  /**
    * Gets or sets a string containing a regular expression that the user's input must match.
    */
  var pattern: java.lang.String = js.native
  /**
    * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
    */
  var placeholder: java.lang.String = js.native
  var readOnly: scala.Boolean = js.native
  /**
    * When present, marks an element that can't be submitted without a value.
    */
  var required: scala.Boolean = js.native
  var selectionDirection: java.lang.String | scala.Null = js.native
  /**
    * Gets or sets the end position or offset of a text selection.
    */
  var selectionEnd: scala.Double | scala.Null = js.native
  /**
    * Gets or sets the starting position or offset of a text selection.
    */
  var selectionStart: scala.Double | scala.Null = js.native
  var size: scala.Double = js.native
  /**
    * The address or URL of the a media resource that is to be considered.
    */
  var src: java.lang.String = js.native
  /**
    * Defines an increment or jump between values that you want to allow the user to enter. When used with the max and min attributes, lets you control the range and increment (for example, allow only even numbers) that the user can enter into an input field.
    */
  var step: java.lang.String = js.native
  /**
    * Returns the content type of the object.
    */
  var `type`: java.lang.String = js.native
  /**
    * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
    */
  /** @deprecated */
  var useMap: java.lang.String = js.native
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    */
  val validationMessage: java.lang.String = js.native
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    */
  val validity: ValidityState = js.native
  /**
    * Returns the value of the data at the cursor's current position.
    */
  var value: java.lang.String = js.native
  /**
    * Returns a Date object representing the form control's value, if applicable; otherwise, returns null. Can be set, to change the value. Throws an "InvalidStateError" DOMException if the control isn't date- or time-based.
    */
  var valueAsDate: Date | scala.Null = js.native
  /**
    * Returns the input field value as a number.
    */
  var valueAsNumber: scala.Double = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var width: scala.Double = js.native
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    */
  val willValidate: scala.Boolean = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  def reportValidity(): scala.Boolean = js.native
  /**
    * Makes the selection equal to the current object.
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
  /**
    * Decrements a range input control's value by the value given by the Step attribute. If the optional parameter is used, it will decrement the input control's step value multiplied by the parameter's value.
    * @param n Value to decrement the value by.
    */
  def stepDown(): scala.Unit = js.native
  def stepDown(n: scala.Double): scala.Unit = js.native
  /**
    * Increments a range input control's value by the value given by the Step attribute. If the optional parameter is used, will increment the input control's value by that value.
    * @param n Value to increment the value by.
    */
  def stepUp(): scala.Unit = js.native
  def stepUp(n: scala.Double): scala.Unit = js.native
}

@JSGlobal("HTMLInputElement")
@js.native
class HTMLInputElementCls () extends HTMLInputElement {
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

@JSGlobal("HTMLInputElement")
@js.native
object HTMLInputElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLInputElement]

