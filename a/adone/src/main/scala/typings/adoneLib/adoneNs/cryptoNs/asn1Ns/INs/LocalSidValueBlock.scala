package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- adoneLib.adoneNs.cryptoNs.asn1Ns.INs.LocalHexBlock because Inheritance from two classes. Inlined isHexOnly, valueHex, fromBER, toBER, toBER, toJSON */ @JSGlobal("adone.crypto.asn1.I.LocalSidValueBlock")
@js.native
class LocalSidValueBlock () extends LocalBaseBlock {
  def this(params: LocalSidValueBlockParams) = this()
  var isFirstSid: scala.Boolean = js.native
  var isHexOnly: scala.Boolean = js.native
  var valueDec: scala.Double = js.native
  var valueHex: stdLib.ArrayBuffer = js.native
  /**
    * Base function for converting block from BER encoded array of bytes
    *
    * @param inputBuffer ASN.1 BER encoded array
    * @param inputOffset Offset in ASN.1 BER encoded array where decoding should be started
    * @param inputLength Maximum length of array of bytes which can be using in this function
    */
  def fromBER(inputBuffer: stdLib.ArrayBuffer, inputOffset: scala.Double, inputLength: scala.Double): scala.Double = js.native
  /**
    * Encoding of current ASN.1 block into ASN.1 encoded array (BER rules)
    *
    * @param sizeOnly Flag that we need only a size of encoding, not a real array of bytes
    */
  def toBER(): stdLib.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): stdLib.ArrayBuffer = js.native
}

