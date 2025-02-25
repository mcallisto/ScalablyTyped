package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BinaryStringEncoding extends js.Object

/** Contains encoding formats that can be used in the ConvertStringToBinary and ConvertBinaryToString methods. */
@JSGlobal("Windows.Security.Cryptography.BinaryStringEncoding")
@js.native
object BinaryStringEncoding extends js.Object {
  /** Sixteen bit Unicode Transformation Format in big-endian byte order. */
  @js.native
  sealed trait utf16BE
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding
  
  /** Sixteen bit Unicode Transformation Format in little-endian byte order. The encoding process creates a variable length result of one or two 8-bit bytes per Unicode code point. */
  @js.native
  sealed trait utf16LE
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding
  
  /** Eight bit Unicode Transformation Format. The process encodes each Unicode code point into one to four 8-bit bytes. Code points represented by lower numerical values are encoded using fewer bytes. In particular, the first 128 characters correspond exactly to the ASCII character set and are encoded by using a single octet. */
  @js.native
  sealed trait utf8
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding
  
  /* 2 */ val utf16BE: utf16BE with scala.Double = js.native
  /* 1 */ val utf16LE: utf16LE with scala.Double = js.native
  /* 0 */ val utf8: utf8 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding with scala.Double
  ] = js.native
}

