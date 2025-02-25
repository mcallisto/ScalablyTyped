package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object braintreeDashWebMod {
  type HostedFieldsFieldDataFields = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in braintree-web.braintree-web.HostedFieldsHostedFieldsFieldName ]: braintree-web.braintree-web.HostedFieldsHostedFieldsFieldData}
    */ braintreeDashWebLib.braintreeDashWebLibStrings.HostedFieldsFieldDataFields with js.Any
  /**
    * @global
    * @callback callback
    * @param {?BraintreeError} [err] `null` or `undefined` if there was no error.
    * @param {?any} [data] The successful result of the asynchronous function call (if data exists).
    * @description The Node.js-style callback pattern used throughout the SDK.
    * @returns {void}
    */
  type callback = js.Function2[/* err */ js.UndefOr[BraintreeError], /* data */ js.UndefOr[js.Any], scala.Unit]
}
