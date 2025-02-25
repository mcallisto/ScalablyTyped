package typings
package js2xmlparserLib.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js2xmlparser/lib/options", "Options")
@js.native
class Options () extends IOptions {
  def this(options: IOptions) = this()
  @JSName("aliasString")
  var aliasString_Options: java.lang.String = js.native
  @JSName("attributeString")
  var attributeString_Options: java.lang.String = js.native
  @JSName("cdataInvalidChars")
  var cdataInvalidChars_Options: scala.Boolean = js.native
  @JSName("cdataKeys")
  var cdataKeys_Options: js.Array[java.lang.String] = js.native
  @JSName("declaration")
  var declaration_Options: DeclarationOptions = js.native
  @JSName("dtd")
  var dtd_Options: DtdOptions = js.native
  @JSName("format")
  var format_Options: FormatOptions = js.native
  @JSName("replaceInvalidChars")
  var replaceInvalidChars_Options: scala.Boolean = js.native
  @JSName("typeHandlers")
  var typeHandlers_Options: TypeHandlers = js.native
  @JSName("useSelfClosingTagIfEmpty")
  var useSelfClosingTagIfEmpty_Options: scala.Boolean = js.native
  @JSName("validation")
  var validation_Options: scala.Boolean = js.native
  @JSName("valueString")
  var valueString_Options: java.lang.String = js.native
  @JSName("wrapHandlers")
  var wrapHandlers_Options: WrapHandlers = js.native
}

