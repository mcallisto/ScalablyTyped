package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "SurveyError")
@js.native
class SurveyError () extends js.Object {
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, errorOwner: ISurveyErrorOwner) = this()
  var errorOwner: ISurveyErrorOwner = js.native
  val locText: LocalizableString = js.native
  var text: java.lang.String = js.native
  /* protected */ def getDefaultText(): java.lang.String = js.native
  def getErrorType(): java.lang.String = js.native
  def getText(): java.lang.String = js.native
}

