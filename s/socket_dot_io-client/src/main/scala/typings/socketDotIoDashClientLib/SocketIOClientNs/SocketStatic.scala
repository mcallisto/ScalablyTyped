package typings
package socketDotIoDashClientLib.SocketIOClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The Socket static interface
	 */
@js.native
trait SocketStatic
  extends /**
		 * Creates a new Socket, used for communicating with a specific namespace
		 * @param io The Manager that's controlling this socket
		 * @param nsp The namespace that this socket is for (@default '/')
		 * @return A new Socket
		 */
org.scalablytyped.runtime.Instantiable2[/* url */ java.lang.String, /* opts */ js.Any, Manager] {
  /**
  		 * Creates a new Socket, used for communicating with a specific namespace
  		 * @param io The Manager that's controlling this socket
  		 * @param nsp The namespace that this socket is for (@default '/')
  		 * @return A new Socket
  		 */
  def apply(io: Manager, nsp: java.lang.String): Socket = js.native
}

