package typings
package nodeLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", "Server")
@js.native
class Server ()
  extends nodeLib.netMod.Server {
  def addContext(hostName: java.lang.String, credentials: SecureContextOptions): scala.Unit = js.native
  @JSName("addListener")
  def addListener_OCSPRequest(
    event: nodeLib.nodeLibStrings.OCSPRequest,
    listener: js.Function3[
      /* certificate */ nodeLib.Buffer, 
      /* issuer */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* resp */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_keylog(
    event: nodeLib.nodeLibStrings.keylog,
    listener: js.Function2[/* line */ nodeLib.Buffer, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_newSession(
    event: nodeLib.nodeLibStrings.newSession,
    listener: js.Function3[
      /* sessionId */ nodeLib.Buffer, 
      /* sessionData */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error, /* resp */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_resumeSession(
    event: nodeLib.nodeLibStrings.resumeSession,
    listener: js.Function2[
      /* sessionId */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error, /* sessionData */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_secureConnection(
    event: nodeLib.nodeLibStrings.secureConnection,
    listener: js.Function1[/* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_tlsClientError(
    event: nodeLib.nodeLibStrings.tlsClientError,
    listener: js.Function2[/* err */ nodeLib.Error, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("emit")
  def emit_OCSPRequest(
    event: nodeLib.nodeLibStrings.OCSPRequest,
    certificate: nodeLib.Buffer,
    issuer: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* resp */ nodeLib.Buffer, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_keylog(event: nodeLib.nodeLibStrings.keylog, line: nodeLib.Buffer, tlsSocket: TLSSocket): scala.Boolean = js.native
  @JSName("emit")
  def emit_newSession(
    event: nodeLib.nodeLibStrings.newSession,
    sessionId: nodeLib.Buffer,
    sessionData: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.Error, /* resp */ nodeLib.Buffer, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_resumeSession(
    event: nodeLib.nodeLibStrings.resumeSession,
    sessionId: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.Error, /* sessionData */ nodeLib.Buffer, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_secureConnection(event: nodeLib.nodeLibStrings.secureConnection, tlsSocket: TLSSocket): scala.Boolean = js.native
  @JSName("emit")
  def emit_tlsClientError(event: nodeLib.nodeLibStrings.tlsClientError, err: nodeLib.Error, tlsSocket: TLSSocket): scala.Boolean = js.native
  @JSName("on")
  def on_OCSPRequest(
    event: nodeLib.nodeLibStrings.OCSPRequest,
    listener: js.Function3[
      /* certificate */ nodeLib.Buffer, 
      /* issuer */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* resp */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_keylog(
    event: nodeLib.nodeLibStrings.keylog,
    listener: js.Function2[/* line */ nodeLib.Buffer, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_newSession(
    event: nodeLib.nodeLibStrings.newSession,
    listener: js.Function3[
      /* sessionId */ nodeLib.Buffer, 
      /* sessionData */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error, /* resp */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_resumeSession(
    event: nodeLib.nodeLibStrings.resumeSession,
    listener: js.Function2[
      /* sessionId */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error, /* sessionData */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_secureConnection(
    event: nodeLib.nodeLibStrings.secureConnection,
    listener: js.Function1[/* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_tlsClientError(
    event: nodeLib.nodeLibStrings.tlsClientError,
    listener: js.Function2[/* err */ nodeLib.Error, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_OCSPRequest(
    event: nodeLib.nodeLibStrings.OCSPRequest,
    listener: js.Function3[
      /* certificate */ nodeLib.Buffer, 
      /* issuer */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* resp */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_keylog(
    event: nodeLib.nodeLibStrings.keylog,
    listener: js.Function2[/* line */ nodeLib.Buffer, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_newSession(
    event: nodeLib.nodeLibStrings.newSession,
    listener: js.Function3[
      /* sessionId */ nodeLib.Buffer, 
      /* sessionData */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error, /* resp */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_resumeSession(
    event: nodeLib.nodeLibStrings.resumeSession,
    listener: js.Function2[
      /* sessionId */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error, /* sessionData */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_secureConnection(
    event: nodeLib.nodeLibStrings.secureConnection,
    listener: js.Function1[/* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_tlsClientError(
    event: nodeLib.nodeLibStrings.tlsClientError,
    listener: js.Function2[/* err */ nodeLib.Error, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_OCSPRequest(
    event: nodeLib.nodeLibStrings.OCSPRequest,
    listener: js.Function3[
      /* certificate */ nodeLib.Buffer, 
      /* issuer */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* resp */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_keylog(
    event: nodeLib.nodeLibStrings.keylog,
    listener: js.Function2[/* line */ nodeLib.Buffer, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_newSession(
    event: nodeLib.nodeLibStrings.newSession,
    listener: js.Function3[
      /* sessionId */ nodeLib.Buffer, 
      /* sessionData */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error, /* resp */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_resumeSession(
    event: nodeLib.nodeLibStrings.resumeSession,
    listener: js.Function2[
      /* sessionId */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error, /* sessionData */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_secureConnection(
    event: nodeLib.nodeLibStrings.secureConnection,
    listener: js.Function1[/* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_tlsClientError(
    event: nodeLib.nodeLibStrings.tlsClientError,
    listener: js.Function2[/* err */ nodeLib.Error, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_OCSPRequest(
    event: nodeLib.nodeLibStrings.OCSPRequest,
    listener: js.Function3[
      /* certificate */ nodeLib.Buffer, 
      /* issuer */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* resp */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_keylog(
    event: nodeLib.nodeLibStrings.keylog,
    listener: js.Function2[/* line */ nodeLib.Buffer, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_newSession(
    event: nodeLib.nodeLibStrings.newSession,
    listener: js.Function3[
      /* sessionId */ nodeLib.Buffer, 
      /* sessionData */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error, /* resp */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resumeSession(
    event: nodeLib.nodeLibStrings.resumeSession,
    listener: js.Function2[
      /* sessionId */ nodeLib.Buffer, 
      /* callback */ js.Function2[/* err */ nodeLib.Error, /* sessionData */ nodeLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_secureConnection(
    event: nodeLib.nodeLibStrings.secureConnection,
    listener: js.Function1[/* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_tlsClientError(
    event: nodeLib.nodeLibStrings.tlsClientError,
    listener: js.Function2[/* err */ nodeLib.Error, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
}

