package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpListener
  extends BaseListener
     with SocketListener {
  /**
    * IP port being listened on.
    */
  var port: scala.Double
}

object TcpListener {
  @scala.inline
  def apply(
    accept: () => js.Promise[SocketConnection],
    close: () => js.Promise[scala.Unit],
    port: scala.Double
  ): TcpListener = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), close = js.Any.fromFunction0(close), port = port)
  
    __obj.asInstanceOf[TcpListener]
  }
}

