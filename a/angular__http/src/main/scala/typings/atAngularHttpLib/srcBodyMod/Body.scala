package typings
package atAngularHttpLib.srcBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/body", "Body")
@js.native
abstract class Body () extends js.Object {
  /**
    * Return the body as an ArrayBuffer
    */
  def arrayBuffer(): stdLib.ArrayBuffer = js.native
  /**
    * Returns the request's body as a Blob, assuming that body exists.
    */
  def blob(): stdLib.Blob = js.native
  /**
    * Attempts to return body as parsed `JSON` object, or raises an exception.
    */
  def json(): js.Any = js.native
  /**
    * Returns the body as a string, presuming `toString()` can be called on the response body.
    *
    * When decoding an `ArrayBuffer`, the optional `encodingHint` parameter determines how the
    * bytes in the buffer will be interpreted. Valid values are:
    *
    * - `legacy` - incorrectly interpret the bytes as UTF-16 (technically, UCS-2). Only characters
    *   in the Basic Multilingual Plane are supported, surrogate pairs are not handled correctly.
    *   In addition, the endianness of the 16-bit octet pairs in the `ArrayBuffer` is not taken
    *   into consideration. This is the default behavior to avoid breaking apps, but should be
    *   considered deprecated.
    *
    * - `iso-8859` - interpret the bytes as ISO-8859 (which can be used for ASCII encoded text).
    */
  def text(): java.lang.String = js.native
  @JSName("text")
  def text_iso8859(encodingHint: atAngularHttpLib.atAngularHttpLibStrings.`iso-8859`): java.lang.String = js.native
  @JSName("text")
  def text_legacy(encodingHint: atAngularHttpLib.atAngularHttpLibStrings.legacy): java.lang.String = js.native
}

