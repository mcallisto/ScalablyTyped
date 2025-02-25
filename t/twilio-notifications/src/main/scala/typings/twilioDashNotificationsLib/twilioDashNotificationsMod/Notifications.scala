package typings
package twilioDashNotificationsLib.twilioDashNotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @alias Notifications
  * @classdesc The helper library for the notification service.
  * Provides high level api for creating and managing notification subscriptions and receiving messages
  * Creates the instance of Notification helper library
  *
  * @constructor
  * @param {string} token - Twilio access token
  * @param {Notifications#ClientOptions} options - Options to customize client behavior
  */
@JSImport("twilio-notifications", "Notifications")
@js.native
class Notifications protected ()
  extends twilioDashNotificationsLib.libClientMod.Client {
  def this(token: java.lang.String) = this()
  def this(token: java.lang.String, options: js.Any) = this()
}

