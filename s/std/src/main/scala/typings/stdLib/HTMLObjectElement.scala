package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods (beyond those on the HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <object> element, representing external resources. */
@js.native
trait HTMLObjectElement extends HTMLElement {
  /** @deprecated */
  var align: java.lang.String = js.native
  /**
    * Sets or retrieves a character string that can be used to implement your own archive functionality for the object.
    */
  /** @deprecated */
  var archive: java.lang.String = js.native
  /** @deprecated */
  var border: java.lang.String = js.native
  /**
    * Sets or retrieves the URL of the file containing the compiled Java class.
    */
  /** @deprecated */
  var code: java.lang.String = js.native
  /**
    * Sets or retrieves the URL of the component.
    */
  /** @deprecated */
  var codeBase: java.lang.String = js.native
  /**
    * Sets or retrieves the Internet media type for the code associated with the object.
    */
  /** @deprecated */
  var codeType: java.lang.String = js.native
  /**
    * Retrieves the document object of the page or frame.
    */
  val contentDocument: Document | scala.Null = js.native
  val contentWindow: WindowProxy | scala.Null = js.native
  /**
    * Sets or retrieves the URL that references the data of the object.
    */
  var data: java.lang.String = js.native
  /** @deprecated */
  var declare: scala.Boolean = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | scala.Null = js.native
  /**
    * Sets or retrieves the height of the object.
    */
  var height: java.lang.String = js.native
  /** @deprecated */
  var hspace: scala.Double = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
  /**
    * Sets or retrieves a message to be displayed while an object is loading.
    */
  /** @deprecated */
  var standby: java.lang.String = js.native
  /**
    * Sets or retrieves the MIME type of the object.
    */
  var `type`: java.lang.String = js.native
  var typeMustMatch: scala.Boolean = js.native
  /**
    * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
    */
  var useMap: java.lang.String = js.native
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    */
  val validationMessage: java.lang.String = js.native
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    */
  val validity: ValidityState = js.native
  /** @deprecated */
  var vspace: scala.Double = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var width: java.lang.String = js.native
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    */
  val willValidate: scala.Boolean = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  def getSVGDocument(): Document | scala.Null = js.native
  def reportValidity(): scala.Boolean = js.native
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  def setCustomValidity(error: java.lang.String): scala.Unit = js.native
}

@JSGlobal("HTMLObjectElement")
@js.native
class HTMLObjectElementCls () extends HTMLObjectElement {
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

@JSGlobal("HTMLObjectElement")
@js.native
object HTMLObjectElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLObjectElement]

