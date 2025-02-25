package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ClientContext")
@js.native
class ClientContext protected ()
  extends sipDotJsLib.libClientContextMod.ClientContext {
  def this(ua: sipDotJsLib.libUAMod.UA, method: java.lang.String, target: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, method: java.lang.String, target: sipDotJsLib.libCoreMod.URI) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, method: java.lang.String, target: java.lang.String, options: sipDotJsLib.libClientContextMod.ClientContextNs.Options) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, method: java.lang.String, target: sipDotJsLib.libCoreMod.URI, options: sipDotJsLib.libClientContextMod.ClientContextNs.Options) = this()
}

/* static members */
@JSImport("sip.js", "ClientContext")
@js.native
object ClientContext extends js.Object {
  def initializer(
    objToConstruct: sipDotJsLib.libClientContextMod.ClientContext,
    ua: sipDotJsLib.libUAMod.UA,
    method: java.lang.String,
    originalTarget: java.lang.String
  ): scala.Unit = js.native
  def initializer(
    objToConstruct: sipDotJsLib.libClientContextMod.ClientContext,
    ua: sipDotJsLib.libUAMod.UA,
    method: java.lang.String,
    originalTarget: java.lang.String,
    options: sipDotJsLib.libClientContextMod.ClientContextNs.Options
  ): scala.Unit = js.native
  def initializer(
    objToConstruct: sipDotJsLib.libClientContextMod.ClientContext,
    ua: sipDotJsLib.libUAMod.UA,
    method: java.lang.String,
    originalTarget: sipDotJsLib.libCoreMod.URI
  ): scala.Unit = js.native
  def initializer(
    objToConstruct: sipDotJsLib.libClientContextMod.ClientContext,
    ua: sipDotJsLib.libUAMod.UA,
    method: java.lang.String,
    originalTarget: sipDotJsLib.libCoreMod.URI,
    options: sipDotJsLib.libClientContextMod.ClientContextNs.Options
  ): scala.Unit = js.native
}

