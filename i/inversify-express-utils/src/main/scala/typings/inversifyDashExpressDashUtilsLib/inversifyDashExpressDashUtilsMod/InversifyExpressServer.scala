package typings
package inversifyDashExpressDashUtilsLib.inversifyDashExpressDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils", "InversifyExpressServer")
@js.native
class InversifyExpressServer protected ()
  extends inversifyDashExpressDashUtilsLib.dtsServerMod.InversifyExpressServer {
  /**
    * Wrapper for the express server.
    *
    * @param container Container loaded with all controllers and their dependencies.
    * @param customRouter optional express.Router custom router
    * @param routingConfig optional interfaces.RoutingConfig routing config
    * @param customApp optional express.Application custom app
    * @param authProvider optional interfaces.AuthProvider auth provider
    * @param forceControllers optional boolean setting to force controllers (defaults do true)
    */
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: expressLib.expressMod.Application) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: scala.Null, customApp: expressLib.expressMod.Application) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: expressLib.expressMod.Application) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: scala.Null, customApp: expressLib.expressMod.Application) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: expressLib.expressMod.Application, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: scala.Null, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: scala.Null, customApp: expressLib.expressMod.Application, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: scala.Null, customApp: scala.Null, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: expressLib.expressMod.Application, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: scala.Null, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: scala.Null, customApp: expressLib.expressMod.Application, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: scala.Null, customApp: scala.Null, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: expressLib.expressMod.Application, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: expressLib.expressMod.Application, authProvider: scala.Null, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: scala.Null, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: scala.Null, authProvider: scala.Null, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: scala.Null, customApp: expressLib.expressMod.Application, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: scala.Null, customApp: expressLib.expressMod.Application, authProvider: scala.Null, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: scala.Null, customApp: scala.Null, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: expressLib.expressMod.Router, routingConfig: scala.Null, customApp: scala.Null, authProvider: scala.Null, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: expressLib.expressMod.Application, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: expressLib.expressMod.Application, authProvider: scala.Null, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: scala.Null, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.RoutingConfig, customApp: scala.Null, authProvider: scala.Null, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: scala.Null, customApp: expressLib.expressMod.Application, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: scala.Null, customApp: expressLib.expressMod.Application, authProvider: scala.Null, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: scala.Null, customApp: scala.Null, authProvider: inversifyDashExpressDashUtilsLib.Anon_AuthProvider, forceControllers: scala.Boolean) = this()
  def this(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, customRouter: scala.Null, routingConfig: scala.Null, customApp: scala.Null, authProvider: scala.Null, forceControllers: scala.Boolean) = this()
}

