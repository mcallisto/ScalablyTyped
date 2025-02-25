package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnetworking extends js.Object {
  // #endregion
  // #region chrome.networking.*
  ///////////////////////
  // NETWORKING CONFIG //
  ///////////////////////
  /**
    * @requires(CrOS) Chrome OS only.
    * @requires Permissions: 'networking.config'
    * @description
    * Use the *networking.config* API to authenticate to captive portals.
    */
  val configNs: Typeofconfig
  //////////////////////////////////////
  // Open Network Configuration (ONC) //
  //////////////////////////////////////
  /**
    * @requires(CrOS kiosk mode) This API is available in Chrome OS kiosk sessions.
    * @requires Permissions: 'networking.onc'
    * @since Chrome 59
    * @description
    * The chrome.networking.onc API is used for configuring network connections
    * (Cellular, Ethernet, VPN, WiFi or WiMAX).
    * Network connection configurations are specified following
    * @see[Open Network Configuration (ONC) specification.]{@link https://chromium.googlesource.com/chromium/src/+/master/components/onc/docs/onc_spec.md}
    * @description
    * **NOTE**
    * Most interface properties and type values use UpperCamelCase to match
    * the ONC specification instead of the JavaScript lowerCamelCase convention.
    */
  val oncNs: Typeofonc
}

object Typeofnetworking {
  @scala.inline
  def apply(configNs: Typeofconfig, oncNs: Typeofonc): Typeofnetworking = {
    val __obj = js.Dynamic.literal(configNs = configNs, oncNs = oncNs)
  
    __obj.asInstanceOf[Typeofnetworking]
  }
}

