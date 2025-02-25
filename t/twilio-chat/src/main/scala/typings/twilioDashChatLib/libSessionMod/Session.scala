package typings
package twilioDashChatLib.libSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Constructs the instance of Session
  *
  *  @classdesc Provides the interface to send the command to the server
  *  It is reliable, which means that it tracks the command object state
  *  and waits the answer from the server.
  */
@JSImport("twilio-chat/lib/session", "Session")
@js.native
class Session protected () extends js.Object {
  def this(services: SessionServices, config: twilioDashChatLib.libConfigurationMod.Configuration) = this()
  var config: js.Any = js.native
  var currentContext: js.Any = js.native
  var endpointPlatform: js.Any = js.native
  var getSessionContext: js.Any = js.native
  var handleContextUpdate: js.Any = js.native
  val identity: java.lang.String = js.native
  var pendingCommands: js.Any = js.native
  /**
    * @private
    */
  var processCommand: js.Any = js.native
  /**
    * @private
    */
  var processCommandResponse: js.Any = js.native
  val reachabilityEnabled: scala.Boolean = js.native
  val services: SessionServices = js.native
  val sessionInfo: js.Any = js.native
  var sessionStreamPromise: js.Any = js.native
  /**
    * Sends the command to the server
    * @returns Promise the promise, which is being fulfilled only when service will reply
    */
  def addCommand(action: java.lang.String, params: js.Object): js.Promise[_] = js.native
  def getChannelsId(): js.Promise[java.lang.String] = js.native
  def getConsumptionReportInterval(): js.Promise[scala.Double] = js.native
  def getHttpCacheInterval(): js.Promise[scala.Double] = js.native
  def getMaxUserInfosToSubscribe(): js.Promise[scala.Double] = js.native
  def getMyChannelsId(): js.Promise[java.lang.String] = js.native
  def getSessionLinks(): js.Promise[SessionLinks] = js.native
  def getUsersData(): js.Promise[twilioDashChatLib.Anon_Identity] = js.native
  def initialize(): js.Promise[Session] = js.native
}

