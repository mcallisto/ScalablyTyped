package typings
package expressDashSocketDotIoDashSessionLib.expressDashSocketDotIoDashSessionMod.socketDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handshake extends js.Object {
  var session: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Express.Session */ js.Any
  ] = js.undefined
  var sessionID: js.UndefOr[java.lang.String] = js.undefined
}

object Handshake {
  @scala.inline
  def apply(
    session: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Express.Session */ js.Any = null,
    sessionID: java.lang.String = null
  ): Handshake = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session)
    if (sessionID != null) __obj.updateDynamic("sessionID")(sessionID)
    __obj.asInstanceOf[Handshake]
  }
}

