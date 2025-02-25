package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "signature")
@js.native
object signatureNs extends js.Object {
  /**
    * Class that represents an OpenPGP signature.
    */
  @js.native
  class Signature protected () extends js.Object {
    /**
      * @param packetlist The signature packets
      */
    def this(packetlist: openpgpLib.openpgpMod.packetNs.List) = this()
    /**
      * Returns ASCII armored text of signature
      * @returns ASCII armor
      */
    def armor(): openpgpLib.ReadableStream[java.lang.String] = js.native
  }
  
  def read(input: openpgpLib.ReadableStream[stdLib.Uint8Array]): Signature = js.native
  /**
    * reads an OpenPGP signature as byte array and returns a signature object
    * @param input binary signature
    * @returns new signature object
    */
  def read(input: stdLib.Uint8Array): Signature = js.native
  /**
    * reads an OpenPGP armored signature and returns a signature object
    * @param armoredText text to be parsed
    * @returns new signature object
    */
  def readArmored(armoredText: java.lang.String): Signature = js.native
  def readArmored(armoredText: openpgpLib.ReadableStream[java.lang.String]): Signature = js.native
}

