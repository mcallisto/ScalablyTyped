package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetectDominantLanguageResponse extends js.Object {
  /**
    * A list containing one object for each document that contained an error. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If there are no errors in the batch, the ErrorList is empty.
    */
  var ErrorList: BatchItemErrorList
  /**
    * A list of objects containing the results of the operation. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If all of the documents contain an error, the ResultList is empty.
    */
  var ResultList: ListOfDetectDominantLanguageResult
}

object BatchDetectDominantLanguageResponse {
  @scala.inline
  def apply(ErrorList: BatchItemErrorList, ResultList: ListOfDetectDominantLanguageResult): BatchDetectDominantLanguageResponse = {
    val __obj = js.Dynamic.literal(ErrorList = ErrorList, ResultList = ResultList)
  
    __obj.asInstanceOf[BatchDetectDominantLanguageResponse]
  }
}

