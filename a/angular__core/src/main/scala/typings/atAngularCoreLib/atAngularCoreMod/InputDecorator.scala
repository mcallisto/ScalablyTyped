package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDecorator
  extends org.scalablytyped.runtime.Instantiable0[js.Any]
     with org.scalablytyped.runtime.Instantiable1[/* bindingPropertyName */ java.lang.String, js.Any] {
  /**
    * Decorator that marks a class field as an input property and supplies configuration metadata.
    * The input property is bound to a DOM property in the template. During change detection,
    * Angular automatically updates the data property with the DOM property's value.
    *
    * @usageNotes
    *
    * You can supply an optional name to use in templates when the
    * component is instantiated, that maps to the
    * name of the bound property. By default, the original
    * name of the bound property is used for input binding.
    *
    * The following example creates a component with two input properties,
    * one of which is given a special binding name.
    *
    * ```typescript
    * @Component({
    *   selector: 'bank-account',
    *   template: `
    *     Bank Name: {{bankName}}
    *     Account Id: {{id}}
    *   `
    * })
    * class BankAccount {
    *   // This property is bound using its original name.
    *   @Input() bankName: string;
    *   // this property value is bound to a different property name
    *   // when this component is instantiated in a template.
    *   @Input('account-id') id: string;
    *
    *   // this property is not bound, and is not automatically updated by Angular
    *   normalizedBankName: string;
    * }
    *
    * @Component({
    *   selector: 'app',
    *   template: `
    *     <bank-account bankName="RBC" account-id="4747"></bank-account>
    *   `
    * })
    * class App {}
    * ```
    */
  def apply(): js.Any = js.native
  def apply(bindingPropertyName: java.lang.String): js.Any = js.native
}

