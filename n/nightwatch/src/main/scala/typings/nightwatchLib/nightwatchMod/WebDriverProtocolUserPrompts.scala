package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebDriverProtocolUserPrompts extends js.Object {
  /**
    * Accepts the currently displayed alert dialog. Usually, this is equivalent to clicking on the 'OK' button in the dialog.
    */
  def acceptAlert(): this.type = js.native
  def acceptAlert(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Dismisses the currently displayed alert dialog. For confirm() and prompt() dialogs, this is equivalent to clicking the 'Cancel' button.
    *
    * For alert() dialogs, this is equivalent to clicking the 'OK' button.
    */
  def dismissAlert(): this.type = js.native
  def dismissAlert(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Gets the text of the currently displayed JavaScript alert(), confirm(), or prompt() dialog.
    */
  def getAlertText(): this.type = js.native
  def getAlertText(
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[java.lang.String], 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Sends keystrokes to a JavaScript prompt() dialog.
    */
  def setAlertText(value: java.lang.String): this.type = js.native
  def setAlertText(
    value: java.lang.String,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
}

