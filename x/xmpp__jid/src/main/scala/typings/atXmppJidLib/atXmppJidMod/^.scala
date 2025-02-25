package typings
package atXmppJidLib.atXmppJidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/jid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(address: java.lang.String): JID = js.native
  def apply(local: js.UndefOr[java.lang.String], domain: java.lang.String): JID = js.native
  def apply(local: js.UndefOr[java.lang.String], domain: java.lang.String, resource: java.lang.String): JID = js.native
  def createJID(local: js.UndefOr[scala.Nothing], domain: java.lang.String): JID = js.native
  def createJID(local: js.UndefOr[scala.Nothing], domain: java.lang.String, resource: java.lang.String): JID = js.native
  def createJID(local: java.lang.String, domain: java.lang.String): JID = js.native
  def createJID(local: java.lang.String, domain: java.lang.String, resource: java.lang.String): JID = js.native
  def detectEscape(): scala.Boolean = js.native
  def detectEscape(local: java.lang.String): scala.Boolean = js.native
  def equal(a: JID, b: JID): scala.Boolean = js.native
  def escapeLocal(local: java.lang.String): java.lang.String = js.native
  def jid(address: java.lang.String): JID = js.native
  def jid(local: js.UndefOr[scala.Nothing], domain: java.lang.String): JID = js.native
  def jid(local: js.UndefOr[scala.Nothing], domain: java.lang.String, resource: java.lang.String): JID = js.native
  def jid(local: java.lang.String, domain: java.lang.String): JID = js.native
  def jid(local: java.lang.String, domain: java.lang.String, resource: java.lang.String): JID = js.native
  def parse(s: java.lang.String): JID = js.native
  def unescapeLocal(local: java.lang.String): java.lang.String = js.native
}

