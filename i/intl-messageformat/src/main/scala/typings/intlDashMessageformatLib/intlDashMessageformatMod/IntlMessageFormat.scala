package typings
package intlDashMessageformatLib.intlDashMessageformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat", "IntlMessageFormat")
@js.native
class IntlMessageFormat protected ()
  extends intlDashMessageformatLib.libCoreMod.IntlMessageFormat {
  def this(message: java.lang.String) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement]) = this()
  def this(message: java.lang.String, locales: java.lang.String) = this()
  def this(message: java.lang.String, locales: js.Array[java.lang.String]) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement], locales: java.lang.String) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement], locales: js.Array[java.lang.String]) = this()
  def this(message: java.lang.String, locales: java.lang.String, overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCoreMod.Formats]) = this()
  def this(message: java.lang.String, locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCoreMod.Formats]) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement], locales: java.lang.String, overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCoreMod.Formats]) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement], locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCoreMod.Formats]) = this()
  def this(message: java.lang.String, locales: java.lang.String, overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCoreMod.Formats], opts: intlDashMessageformatLib.libCoreMod.Options) = this()
  def this(message: java.lang.String, locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCoreMod.Formats], opts: intlDashMessageformatLib.libCoreMod.Options) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement], locales: java.lang.String, overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCoreMod.Formats], opts: intlDashMessageformatLib.libCoreMod.Options) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement], locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCoreMod.Formats], opts: intlDashMessageformatLib.libCoreMod.Options) = this()
}

/* static members */
@JSImport("intl-messageformat", "IntlMessageFormat")
@js.native
object IntlMessageFormat extends js.Object {
  var __parse: js.UndefOr[
    intlDashMessageformatLib.Fn_Input with intlDashMessageformatDashParserLib.libParserMod.ParseFunction
  ] = js.native
  var defaultLocale: java.lang.String = js.native
  var formats: intlDashMessageformatLib.Anon_Date = js.native
}

