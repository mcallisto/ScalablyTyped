package typings
package atFirebaseUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/crypt", JSImport.Namespace)
@js.native
object distSrcCryptMod extends js.Object {
  def base64Decode(str: java.lang.String): java.lang.String | scala.Null = js.native
  def base64Encode(str: java.lang.String): java.lang.String = js.native
  @js.native
  object base64 extends js.Object {
    /**
      * Our default alphabet. Value 64 (=) is special; it means "nothing."
      * @type {string}
      */
    val ENCODED_VALS: java.lang.String = js.native
    /**
      * Our default alphabet, shared between
      * ENCODED_VALS and ENCODED_VALS_WEBSAFE
      * @type {string}
      */
    var ENCODED_VALS_BASE: java.lang.String = js.native
    /**
      * Our websafe alphabet.
      * @type {string}
      */
    val ENCODED_VALS_WEBSAFE: java.lang.String = js.native
    /**
      * Whether this browser supports the atob and btoa functions. This extension
      * started at Mozilla but is now implemented by many browsers. We use the
      * ASSUME_* variables to avoid pulling in the full useragent detection library
      * but still allowing the standard per-browser compilations.
      *
      * @type {boolean}
      */
    var HAS_NATIVE_SUPPORT: scala.Boolean = js.native
    /**
      * Maps bytes to websafe characters.
      * @type {Object}
      * @private
      */
    var byteToCharMapWebSafe_ : scala.Null = js.native
    /**
      * Maps bytes to characters.
      * @type {Object}
      * @private
      */
    var byteToCharMap_ : scala.Null = js.native
    /**
      * Maps websafe characters to bytes.
      * @type {Object}
      * @private
      */
    var charToByteMapWebSafe_ : scala.Null = js.native
    /**
      * Maps characters to bytes.
      * @type {Object}
      * @private
      */
    var charToByteMap_ : scala.Null = js.native
    /**
      * Base64-decode a string.
      *
      * @param input to decode.
      * @param webSafe True if we should use the
      *     alternative alphabet.
      * @return string representing the decoded value.
      */
    def decodeString(input: java.lang.String, webSafe: scala.Boolean): java.lang.String = js.native
    /**
      * Base64-decode a string.
      *
      * In base-64 decoding, groups of four characters are converted into three
      * bytes.  If the encoder did not apply padding, the input length may not
      * be a multiple of 4.
      *
      * In this case, the last group will have fewer than 4 characters, and
      * padding will be inferred.  If the group has one or two characters, it decodes
      * to one byte.  If the group has three characters, it decodes to two bytes.
      *
      * @param input Input to decode.
      * @param webSafe True if we should use the web-safe alphabet.
      * @return bytes representing the decoded value.
      */
    def decodeStringToByteArray(input: java.lang.String, webSafe: scala.Boolean): js.Array[scala.Double] = js.native
    /**
      * Base64-encode an array of bytes.
      *
      * @param input An array of bytes (numbers with
      *     value in [0, 255]) to encode.
      * @param webSafe Boolean indicating we should use the
      *     alternative alphabet.
      * @return The base64 encoded string.
      */
    def encodeByteArray(input: js.Array[scala.Double]): java.lang.String = js.native
    def encodeByteArray(input: js.Array[scala.Double], webSafe: scala.Boolean): java.lang.String = js.native
    def encodeByteArray(input: stdLib.Uint8Array): java.lang.String = js.native
    def encodeByteArray(input: stdLib.Uint8Array, webSafe: scala.Boolean): java.lang.String = js.native
    /**
      * Base64-encode a string.
      *
      * @param input A string to encode.
      * @param webSafe If true, we should use the
      *     alternative alphabet.
      * @return The base64 encoded string.
      */
    def encodeString(input: java.lang.String): java.lang.String = js.native
    def encodeString(input: java.lang.String, webSafe: scala.Boolean): java.lang.String = js.native
    /**
      * Lazy static initialization function. Called before
      * accessing any of the static map variables.
      * @private
      */
    def init_(): scala.Unit = js.native
  }
  
}

