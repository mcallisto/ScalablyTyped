package typings
package sinonLib.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonSandboxConfig extends js.Object {
  /**
    * The sandbox’s methods can be injected into another object for convenience.
    * The injectInto configuration option can name an object to add properties to.
    */
  var injectInto: js.Object | scala.Null
  /**
    * What properties to inject.
    * Note that simply naming “server” here is not sufficient to have a server property show up in the target object,
    * you also have to set useFakeServer to true.
    */
  var properties: js.Array[java.lang.String]
  /**
    * If true, server and requests properties are added to the sandbox. Can also be an object to use for fake server.
    * The default one is sinon.fakeServer, but if you’re using jQuery 1.3.x or some other library that does not set the XHR’s onreadystatechange handler,
    * you might want to do:
    */
  var useFakeServer: scala.Boolean | SinonFakeServer
  /**
    * If set to true, the sandbox will have a clock property.
    * You can optionally pass in a configuration object that follows the specification for fake timers, such as { toFake: ["setTimeout", "setInterval"] }.
    */
  var useFakeTimers: scala.Boolean | stdLib.Partial[SinonFakeTimersConfig]
}

object SinonSandboxConfig {
  @scala.inline
  def apply(
    properties: js.Array[java.lang.String],
    useFakeServer: scala.Boolean | SinonFakeServer,
    useFakeTimers: scala.Boolean | stdLib.Partial[SinonFakeTimersConfig],
    injectInto: js.Object = null
  ): SinonSandboxConfig = {
    val __obj = js.Dynamic.literal(properties = properties, useFakeServer = useFakeServer.asInstanceOf[js.Any], useFakeTimers = useFakeTimers.asInstanceOf[js.Any])
    if (injectInto != null) __obj.updateDynamic("injectInto")(injectInto)
    __obj.asInstanceOf[SinonSandboxConfig]
  }
}

