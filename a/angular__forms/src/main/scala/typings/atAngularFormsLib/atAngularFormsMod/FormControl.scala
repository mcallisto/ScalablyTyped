package typings
package atAngularFormsLib.atAngularFormsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "FormControl")
@js.native
/**
  * Creates a new `FormControl` instance.
  *
  * @param formState Initializes the control with an initial value,
  * or an object that defines the initial value and disabled state.
  *
  * @param validatorOrOpts A synchronous validator function, or an array of
  * such functions, or an `AbstractControlOptions` object that contains validation functions
  * and a validation trigger.
  *
  * @param asyncValidator A single async validator or array of async validator functions
  *
  */
class FormControl () extends AbstractControl {
  def this(formState: js.Any) = this()
  def this(formState: js.Any, validatorOrOpts: AbstractControlOptions) = this()
  def this(formState: js.Any, validatorOrOpts: ValidatorFn) = this()
  def this(formState: js.Any, validatorOrOpts: js.Array[ValidatorFn]) = this()
  def this(formState: js.Any, validatorOrOpts: AbstractControlOptions, asyncValidator: AsyncValidatorFn) = this()
  def this(formState: js.Any, validatorOrOpts: AbstractControlOptions, asyncValidator: js.Array[AsyncValidatorFn]) = this()
  def this(formState: js.Any, validatorOrOpts: ValidatorFn, asyncValidator: AsyncValidatorFn) = this()
  def this(formState: js.Any, validatorOrOpts: ValidatorFn, asyncValidator: js.Array[AsyncValidatorFn]) = this()
  def this(formState: js.Any, validatorOrOpts: js.Array[ValidatorFn], asyncValidator: AsyncValidatorFn) = this()
  def this(formState: js.Any, validatorOrOpts: js.Array[ValidatorFn], asyncValidator: js.Array[AsyncValidatorFn]) = this()
  def this(formState: js.Any, validatorOrOpts: scala.Null, asyncValidator: AsyncValidatorFn) = this()
  def this(formState: js.Any, validatorOrOpts: scala.Null, asyncValidator: js.Array[AsyncValidatorFn]) = this()
  var _applyFormState: js.Any = js.native
  def patchValue(value: js.Any, options: atAngularFormsLib.Anon_EmitEventEmitModelToViewChange): scala.Unit = js.native
  /**
    * Register a listener for change events.
    *
    * @param fn The method that is called when the value changes
    */
  def registerOnChange(fn: js.Function): scala.Unit = js.native
  /**
    * Register a listener for disabled events.
    *
    * @param fn The method that is called when the disabled status changes.
    */
  def registerOnDisabledChange(fn: js.Function1[/* isDisabled */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def reset(formState: js.Any, options: atAngularFormsLib.Anon_EmitEvent): scala.Unit = js.native
  def setValue(value: js.Any, options: atAngularFormsLib.Anon_EmitEventEmitModelToViewChange): scala.Unit = js.native
}

