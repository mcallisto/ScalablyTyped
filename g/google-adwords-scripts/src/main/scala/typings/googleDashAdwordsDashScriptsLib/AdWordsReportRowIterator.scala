package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsReportRowIterator extends js.Object {
  def hasNext(): scala.Boolean
  def next(): AdWordsReportRow
}

object AdWordsReportRowIterator {
  @scala.inline
  def apply(hasNext: () => scala.Boolean, next: () => AdWordsReportRow): AdWordsReportRowIterator = {
    val __obj = js.Dynamic.literal(hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[AdWordsReportRowIterator]
  }
}

