package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextGetOptions extends js.Object

/** Specifies options for retrieving the text in a document or text range. */
@JSGlobal("Windows.UI.Text.TextGetOptions")
@js.native
object TextGetOptions extends js.Object {
  /** If the starting character position is in the middle of a construct such as a CRLF (U+000D U+000A), surrogate pair, variation-selector sequence, or table-row delimiter, move to the beginning of the construct. */
  @js.native
  sealed trait adjustCrlf
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  /** Allow retrieving the final end-of-paragraph (EOP) if it’s included in the range. This EOP exists in all rich-text controls and cannot be deleted. It does not exist in plain-text controls. */
  @js.native
  sealed trait allowFinalEop
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  /** Retrieve Rich Text Format (RTF) instead of plain text. RTF is a BYTE (8-bit) format, but because ITextRange.GetText returns a string, the RTF is returned as WCHARs (16-bit or UTF-16), not bytes, when you call ITextRange.GetText with the FormatRtf value. When you call ITextRange.SetText with FormatRtf, the method accepts an string containing either bytes or WCHARs, but other RTF readers only understand bytes. */
  @js.native
  sealed trait formatRtf
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  /** Include list numbers. */
  @js.native
  sealed trait includeNumbering
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  /** Don't include hidden text. */
  @js.native
  sealed trait noHidden
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  /** None of the following options is used. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  /** Use CR/LF in place of a carriage return. */
  @js.native
  sealed trait useCrlf
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  /** Retrieve text including the alternate text for the images in the range. */
  @js.native
  sealed trait useObjectText
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TextGetOptions
  
  /* 1 */ val adjustCrlf: adjustCrlf with scala.Double = js.native
  /* 4 */ val allowFinalEop: allowFinalEop with scala.Double = js.native
  /* 7 */ val formatRtf: formatRtf with scala.Double = js.native
  /* 6 */ val includeNumbering: includeNumbering with scala.Double = js.native
  /* 5 */ val noHidden: noHidden with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val useCrlf: useCrlf with scala.Double = js.native
  /* 3 */ val useObjectText: useObjectText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.TextGetOptions with scala.Double] = js.native
}

