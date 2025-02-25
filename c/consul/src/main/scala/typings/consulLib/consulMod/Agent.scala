package typings
package consulLib.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agent extends js.Object {
  var check: consulLib.consulMod.AgentNs.Check = js.native
  /**
    * Returns the checks the local agent is managing
    */
  @JSName("checks")
  var checks_Original: consulLib.Fn_CallbackOptsChecksOptions = js.native
  var consul: Consul = js.native
  /**
    * Force remove node
    */
  @JSName("forceLeave")
  var forceLeave_Original: consulLib.Fn_CallbackNode = js.native
  /**
    * Trigger local agent to join a node
    */
  @JSName("join")
  var join_Original: consulLib.Fn_Address = js.native
  /**
    * Manages node maintenance mode
    */
  @JSName("maintenance")
  var maintenance_Original: consulLib.Fn_CallbackEnable = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  @JSName("members")
  var members_Original: consulLib.Fn_CallbackOptsMembersOptions = js.native
  /**
    * Returns the local node configuration
    */
  @JSName("self")
  var self_Original: consulLib.Fn_CallbackOptsSelfOptions = js.native
  var service: consulLib.consulMod.AgentNs.Service = js.native
  /**
    * Returns the services local agent is managing
    */
  @JSName("services")
  var services_Original: consulLib.Fn_CallbackOptsServicesOptions = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](): Thenable[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](callback: Callback[TData]): scala.Unit = js.native
  def checks[TData](opts: consulLib.consulMod.AgentNs.ChecksOptions): Thenable[TData] = js.native
  /**
    * Returns the checks the local agent is managing
    */
  def checks[TData](opts: consulLib.consulMod.AgentNs.ChecksOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](node: java.lang.String): Thenable[TData] = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](node: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](opts: consulLib.consulMod.AgentNs.ForceLeaveOptions): Thenable[TData] = js.native
  /**
    * Force remove node
    */
  def forceLeave[TData](opts: consulLib.consulMod.AgentNs.ForceLeaveOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](address: java.lang.String): Thenable[TData] = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](address: java.lang.String, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](opts: consulLib.consulMod.AgentNs.JoinOptions): Thenable[TData] = js.native
  /**
    * Trigger local agent to join a node
    */
  def join[TData](opts: consulLib.consulMod.AgentNs.JoinOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](enable: scala.Boolean): Thenable[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](enable: scala.Boolean, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: consulLib.consulMod.AgentNs.MaintenanceOptions): Thenable[TData] = js.native
  /**
    * Manages node maintenance mode
    */
  def maintenance[TData](opts: consulLib.consulMod.AgentNs.MaintenanceOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](): Thenable[TData] = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](callback: Callback[TData]): scala.Unit = js.native
  def members[TData](opts: consulLib.consulMod.AgentNs.MembersOptions): Thenable[TData] = js.native
  /**
    * Returns the members as seen by the local consul agent
    */
  def members[TData](opts: consulLib.consulMod.AgentNs.MembersOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Returns the local node configuration
    */
  def self[TData](): Thenable[TData] = js.native
  /**
    * Returns the local node configuration
    */
  def self[TData](callback: Callback[TData]): scala.Unit = js.native
  def self[TData](opts: consulLib.consulMod.AgentNs.SelfOptions): Thenable[TData] = js.native
  /**
    * Returns the local node configuration
    */
  def self[TData](opts: consulLib.consulMod.AgentNs.SelfOptions, callback: Callback[TData]): scala.Unit = js.native
  /**
    * Returns the services local agent is managing
    */
  def services[TData](): Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def services[TData](callback: Callback[TData]): scala.Unit = js.native
  def services[TData](opts: consulLib.consulMod.AgentNs.ServicesOptions): Thenable[TData] = js.native
  /**
    * Returns the services local agent is managing
    */
  def services[TData](opts: consulLib.consulMod.AgentNs.ServicesOptions, callback: Callback[TData]): scala.Unit = js.native
}

