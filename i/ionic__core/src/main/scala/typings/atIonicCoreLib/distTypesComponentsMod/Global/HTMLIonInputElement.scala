package typings
package atIonicCoreLib.distTypesComponentsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonInput because var conflicts: autocapitalize, spellcheck. Inlined accept, autocomplete, autocorrect, autofocus, clearInput, clearOnEdit, color, debounce, disabled, getInputElement, inputmode, max, maxlength, min, minlength, mode, multiple, name, pattern, placeholder, readonly, required, setFocus, size, step, `type`, value */ @js.native
trait HTMLIonInputElement
  extends atIonicCoreLib.distTypesStencilDotCoreMod.HTMLStencilElement {
  /**
    * If the value of the type attribute is `"file"`, then this attribute will indicate the types of files that the server accepts, otherwise it will be ignored. The value must be a comma-separated list of unique content type specifiers.
    */
  var accept: js.UndefOr[java.lang.String] = js.native
  /**
    * Indicates whether the value of the control can be automatically completed by the browser.
    */
  var autocomplete: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off = js.native
  /**
    * Whether auto correction should be enabled when the user is entering/editing the text value.
    */
  var autocorrect: atIonicCoreLib.atIonicCoreLibStrings.on | atIonicCoreLib.atIonicCoreLibStrings.off = js.native
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  var autofocus: scala.Boolean = js.native
  /**
    * If `true`, a clear icon will appear in the input when there is a value. Clicking it clears the input.
    */
  var clearInput: scala.Boolean = js.native
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: js.UndefOr[scala.Boolean] = js.native
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.native
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke.
    */
  var debounce: scala.Double = js.native
  /**
    * If `true`, the user cannot interact with the input.
    */
  var disabled: scala.Boolean = js.native
  /**
    * A hint to the browser for which keyboard to display. This attribute applies when the value of the type attribute is `"text"`, `"password"`, `"email"`, or `"url"`. Possible values are: `"verbatim"`, `"latin"`, `"latin-name"`, `"latin-prose"`, `"full-width-latin"`, `"kana"`, `"katakana"`, `"numeric"`, `"tel"`, `"email"`, `"url"`.
    */
  var inputmode: js.UndefOr[java.lang.String] = js.native
  /**
    * The maximum value, which must not be less than its minimum (min attribute) value.
    */
  var max: js.UndefOr[java.lang.String] = js.native
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
    */
  var maxlength: js.UndefOr[scala.Double] = js.native
  /**
    * The minimum value, which must not be greater than its maximum (max attribute) value.
    */
  var min: js.UndefOr[java.lang.String] = js.native
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
    */
  var minlength: js.UndefOr[scala.Double] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md
  ] = js.native
  /**
    * If `true`, the user can enter more than one value. This attribute applies when the type attribute is set to `"email"` or `"file"`, otherwise it is ignored.
    */
  var multiple: js.UndefOr[scala.Boolean] = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: java.lang.String = js.native
  /**
    * A regular expression that the value is checked against. The pattern must match the entire value, not just some subset. Use the title attribute to describe the pattern to help the user. This attribute applies when the value of the type attribute is `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, or `"password"`, otherwise it is ignored.
    */
  var pattern: js.UndefOr[java.lang.String] = js.native
  /**
    * Instructional text that shows before the input has a value.
    */
  var placeholder: js.UndefOr[java.lang.String | scala.Null] = js.native
  /**
    * If `true`, the user cannot modify the value.
    */
  var readonly: scala.Boolean = js.native
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  var required: scala.Boolean = js.native
  /**
    * The initial size of the control. This value is in pixels unless the value of the type attribute is `"text"` or `"password"`, in which case it is an integer number of characters. This attribute applies only when the `type` attribute is set to `"text"`, `"search"`, `"tel"`, `"url"`, `"email"`, or `"password"`, otherwise it is ignored.
    */
  var size: js.UndefOr[scala.Double] = js.native
  /**
    * Works with the min and max attributes to limit the increments at which a value can be set. Possible values are: `"any"` or a positive floating point number.
    */
  var step: js.UndefOr[java.lang.String] = js.native
  /**
    * The type of control to display. The default type is text.
    */
  var `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextFieldTypes */ js.Any = js.native
  /**
    * The value of the input.
    */
  var value: js.UndefOr[java.lang.String | scala.Null] = js.native
  /**
    * Returns the native `<input>` element used under the hood.
    */
  def getInputElement(): js.Promise[stdLib.HTMLInputElement] = js.native
  /**
    * Sets focus on the specified `ion-input`. Use this method instead of the global `input.focus()`.
    */
  def setFocus(): js.Promise[scala.Unit] = js.native
}

@JSGlobal("HTMLIonInputElement")
@js.native
class HTMLIonInputElementCls () extends HTMLIonInputElement {
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
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
  override val nextElementSibling: stdLib.Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: stdLib.Element | scala.Null = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLIonInputElement")
@js.native
object HTMLIonInputElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLIonInputElement]

