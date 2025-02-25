package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to turn various levels of logging on and off for server scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL server scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
  */
trait IScriptLoggerConfigParameters extends js.Object {
  /**
    * Set to true to log any scripting errors that occur on the server
    * @default false
    */
  var log_errors: scala.Boolean
  /**
    * Set to true to log any general scripting information that occurs on the server. This includes any logging done with server.log()
    * @default false
    */
  var log_information: scala.Boolean
  /**
    * Set to true to log any scripting warnings that occur on the server
    * @default false
    */
  var log_warnings: scala.Boolean
}

object IScriptLoggerConfigParameters {
  @scala.inline
  def apply(log_errors: scala.Boolean, log_information: scala.Boolean, log_warnings: scala.Boolean): IScriptLoggerConfigParameters = {
    val __obj = js.Dynamic.literal(log_errors = log_errors, log_information = log_information, log_warnings = log_warnings)
  
    __obj.asInstanceOf[IScriptLoggerConfigParameters]
  }
}

