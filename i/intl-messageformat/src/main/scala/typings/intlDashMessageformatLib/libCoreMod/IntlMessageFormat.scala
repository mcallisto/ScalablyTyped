package typings
package intlDashMessageformatLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat/lib/core", "IntlMessageFormat")
@js.native
class IntlMessageFormat protected () extends js.Object {
  def this(message: java.lang.String) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement]) = this()
  def this(message: java.lang.String, locales: java.lang.String) = this()
  def this(message: java.lang.String, locales: js.Array[java.lang.String]) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement], locales: java.lang.String) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement], locales: js.Array[java.lang.String]) = this()
  def this(message: java.lang.String, locales: java.lang.String, overrideFormats: stdLib.Partial[Formats]) = this()
  def this(message: java.lang.String, locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[Formats]) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement], locales: java.lang.String, overrideFormats: stdLib.Partial[Formats]) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement], locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[Formats]) = this()
  def this(message: java.lang.String, locales: java.lang.String, overrideFormats: stdLib.Partial[Formats], opts: Options) = this()
  def this(message: java.lang.String, locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[Formats], opts: Options) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement], locales: java.lang.String, overrideFormats: stdLib.Partial[Formats], opts: Options) = this()
  def this(message: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement], locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[Formats], opts: Options) = this()
  val ast: js.Any = js.native
  val formats: js.Any = js.native
  val formatterCache: js.Any = js.native
  val formatters: js.Any = js.native
  val locale: js.Any = js.native
  val message: js.Any = js.native
  def format(): java.lang.String = js.native
  def format(
    values: stdLib.Record[
      java.lang.String, 
      js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
    ]
  ): java.lang.String = js.native
  def getAst(): js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement] = js.native
  def resolvedOptions(): intlDashMessageformatLib.Anon_Locale = js.native
}

/* static members */
@JSImport("intl-messageformat/lib/core", "IntlMessageFormat")
@js.native
object IntlMessageFormat extends js.Object {
  var __parse: js.UndefOr[
    intlDashMessageformatLib.Fn_Input with intlDashMessageformatDashParserLib.libParserMod.ParseFunction
  ] = js.native
  var defaultLocale: java.lang.String = js.native
  var formats: intlDashMessageformatLib.Anon_Date = js.native
}

