package typings
package onoLib.esmTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ono[T /* <: ErrorLike */] extends js.Object {
  def apply(error: ErrorPOJO): T with ErrorPOJO with (OnoError[T with ErrorPOJO]) = js.native
  def apply(error: ErrorPOJO, message: java.lang.String, params: js.Any*): T with ErrorPOJO with (OnoError[T with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def apply(error: stdLib.Error): T with stdLib.Error with (OnoError[T with stdLib.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def apply(error: stdLib.Error, message: java.lang.String, params: js.Any*): T with stdLib.Error with (OnoError[T with stdLib.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def apply(message: java.lang.String, params: js.Any*): T with OnoError[T] = js.native
  def apply[P /* <: js.Object */](error: ErrorPOJO, props: P): T with ErrorPOJO with P with (OnoError[T with ErrorPOJO with P]) = js.native
  def apply[P /* <: js.Object */](error: ErrorPOJO, props: P, message: java.lang.String, params: js.Any*): T with ErrorPOJO with P with (OnoError[T with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def apply[P /* <: js.Object */](error: stdLib.Error, props: P): T with stdLib.Error with P with (OnoError[T with stdLib.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def apply[P /* <: js.Object */](error: stdLib.Error, props: P, message: java.lang.String, params: js.Any*): T with stdLib.Error with P with (OnoError[T with stdLib.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def apply[P /* <: js.Object */](props: P): T with P with (OnoError[T with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def apply[P /* <: js.Object */](props: P, message: java.lang.String, params: js.Any*): T with P with (OnoError[T with P]) = js.native
}

