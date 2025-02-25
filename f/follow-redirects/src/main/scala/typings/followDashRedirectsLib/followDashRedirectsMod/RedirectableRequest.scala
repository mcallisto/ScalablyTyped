package typings
package followDashRedirectsLib.followDashRedirectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectableRequest[Request /* <: WrappableRequest */, Response]
  extends nodeLib.streamMod.Writable {
  var abort: /* import warning: ImportType.apply Failed type conversion: Request['abort'] */ js.Any = js.native
  var flushHeaders: /* import warning: ImportType.apply Failed type conversion: Request['flushHeaders'] */ js.Any = js.native
  var getHeader: /* import warning: ImportType.apply Failed type conversion: Request['getHeader'] */ js.Any = js.native
  var removeHeader: /* import warning: ImportType.apply Failed type conversion: Request['removeHeader'] */ js.Any = js.native
  var setHeader: /* import warning: ImportType.apply Failed type conversion: Request['setHeader'] */ js.Any = js.native
  var setNoDelay: /* import warning: ImportType.apply Failed type conversion: Request['setNoDelay'] */ js.Any = js.native
  var setSocketKeepAlive: /* import warning: ImportType.apply Failed type conversion: Request['setSocketKeepAlive'] */ js.Any = js.native
  var setTimeout: /* import warning: ImportType.apply Failed type conversion: Request['setTimeout'] */ js.Any = js.native
  @JSName("addListener")
  def addListener_error(
    event: followDashRedirectsLib.followDashRedirectsLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_response(
    event: followDashRedirectsLib.followDashRedirectsLibStrings.response,
    listener: js.Function1[/* response */ Response, scala.Unit]
  ): this.type = js.native
  @JSName("emit")
  def emit_error(event: followDashRedirectsLib.followDashRedirectsLibStrings.error, err: stdLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_response(event: followDashRedirectsLib.followDashRedirectsLibStrings.response, response: Response): scala.Boolean = js.native
  @JSName("on")
  def on_error(
    event: followDashRedirectsLib.followDashRedirectsLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_response(
    event: followDashRedirectsLib.followDashRedirectsLibStrings.response,
    listener: js.Function1[/* response */ Response, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: followDashRedirectsLib.followDashRedirectsLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_response(
    event: followDashRedirectsLib.followDashRedirectsLibStrings.response,
    listener: js.Function1[/* response */ Response, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: followDashRedirectsLib.followDashRedirectsLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_response(
    event: followDashRedirectsLib.followDashRedirectsLibStrings.response,
    listener: js.Function1[/* response */ Response, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: followDashRedirectsLib.followDashRedirectsLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_response(
    event: followDashRedirectsLib.followDashRedirectsLibStrings.response,
    listener: js.Function1[/* response */ Response, scala.Unit]
  ): this.type = js.native
}

