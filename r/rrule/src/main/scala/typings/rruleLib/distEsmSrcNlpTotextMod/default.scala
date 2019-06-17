package typings
package rruleLib.distEsmSrcNlpTotextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/nlp/totext", JSImport.Default)
@js.native
class default protected () extends ToText {
  def this(rrule: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RRule */ js.Any) = this()
  def this(rrule: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RRule */ js.Any, gettext: GetText) = this()
  def this(rrule: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RRule */ js.Any, gettext: GetText, language: rruleLib.distEsmSrcNlpI18nMod.Language) = this()
  def this(rrule: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RRule */ js.Any, gettext: GetText, language: rruleLib.distEsmSrcNlpI18nMod.Language, dateFormatter: DateFormatter) = this()
}

/* static members */
@JSImport("rrule/dist/esm/src/nlp/totext", JSImport.Default)
@js.native
object default extends js.Object {
  var IMPLEMENTED: js.Array[js.Array[java.lang.String]] = js.native
  /**
    * Test whether the rrule can be fully converted to text.
    * @param {RRule} rrule
    * @return {Boolean}
    */
  def isFullyConvertible(rrule: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RRule */ js.Any): scala.Boolean = js.native
}

