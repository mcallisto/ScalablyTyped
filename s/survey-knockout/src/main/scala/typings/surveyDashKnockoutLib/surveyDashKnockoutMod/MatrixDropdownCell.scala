package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "MatrixDropdownCell")
@js.native
class MatrixDropdownCell protected () extends js.Object {
  def this(column: MatrixDropdownColumn, row: MatrixDropdownRowModelBase, data: IMatrixDropdownData) = this()
  var column: MatrixDropdownColumn = js.native
  var data: IMatrixDropdownData = js.native
  val question: Question = js.native
  var row: MatrixDropdownRowModelBase = js.native
  var value: js.Any = js.native
  /* protected */ def createQuestion(column: MatrixDropdownColumn, row: MatrixDropdownRowModelBase, data: IMatrixDropdownData): Question = js.native
  def runCondition(values: HashTable[_], properties: HashTable[_]): scala.Unit = js.native
}

