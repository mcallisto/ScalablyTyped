package typings
package saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sasl-scram-sha-1", JSImport.Namespace)
@js.native
class ^ () extends ScramSha1Mechanism {
  def this(options: Options) = this()
  /* CompleteClass */
  override var clientFirst: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1LibNumbers.`true` = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_ScramSha1Mechanism: saslDashScramDashShaDash1Lib.saslDashScramDashShaDash1LibStrings.`SCRAM-SHA-1` = js.native
  /* CompleteClass */
  override def challenge(chal: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def response(cred: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  /* CompleteClass */
  override def response(cred: Credentials): java.lang.String = js.native
}

@JSImport("sasl-scram-sha-1", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Mechanism: saslDashScramDashShaDash1Lib.TypeofClassScramSha1Mechanism = js.native
}

