package typings
package webpackDashServeLib.webpackDashServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /** An instance of a Koa application, extended with a server property, and stop method, which is used to programatically stop the server */
  var app: InitializedKoa = js.native
  /** Access to a frozen copy of the internal options object used by the module. */
  var options: InitializedOptions = js.native
  @JSName("on")
  def on_buildfinished(
    `type`: webpackDashServeLib.webpackDashServeLibStrings.`build-finished`,
    callback: js.Function1[/* args */ webpackDashServeLib.Anon_CompilerStats, scala.Unit]
  ): scala.Unit = js.native
  /** A function which binds a serve event-name to a function */
  @JSName("on")
  def on_buildstarted(
    `type`: webpackDashServeLib.webpackDashServeLibStrings.`build-started`,
    callback: js.Function1[/* args */ webpackDashServeLib.Anon_Compiler, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_compilererror(
    `type`: webpackDashServeLib.webpackDashServeLibStrings.`compiler-error`,
    callback: js.Function1[/* args */ webpackDashServeLib.Anon_CompilerStatsAny, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_compilerwarning(
    `type`: webpackDashServeLib.webpackDashServeLibStrings.`compiler-warning`,
    callback: js.Function1[/* args */ webpackDashServeLib.Anon_CompilerStatsAny, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_listening(
    `type`: webpackDashServeLib.webpackDashServeLibStrings.listening,
    callback: js.Function1[/* args */ webpackDashServeLib.Anon_Options, scala.Unit]
  ): scala.Unit = js.native
}

