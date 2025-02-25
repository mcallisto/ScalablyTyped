package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CryptoKey dictionary of the Web Crypto API represents a cryptographic key. */
trait CryptoKey extends js.Object {
  val algorithm: KeyAlgorithm
  val extractable: scala.Boolean
  val `type`: KeyType
  val usages: js.Array[KeyUsage]
}

@JSGlobal("CryptoKey")
@js.native
class CryptoKeyCls () extends CryptoKey {
  /* CompleteClass */
  override val algorithm: KeyAlgorithm = js.native
  /* CompleteClass */
  override val extractable: scala.Boolean = js.native
  /* CompleteClass */
  override val `type`: KeyType = js.native
  /* CompleteClass */
  override val usages: js.Array[KeyUsage] = js.native
}

@JSGlobal("CryptoKey")
@js.native
object CryptoKey
  extends org.scalablytyped.runtime.Instantiable0[CryptoKey]

