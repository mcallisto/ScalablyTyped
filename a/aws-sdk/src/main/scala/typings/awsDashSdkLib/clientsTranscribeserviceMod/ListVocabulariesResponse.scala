package typings
package awsDashSdkLib.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVocabulariesResponse extends js.Object {
  /**
    * The ListVocabularies operation returns a page of vocabularies at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Transcribe returns the NextPage token. Include the token in the next request to the ListVocabularies operation to return in the next page of jobs.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The requested vocabulary state.
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.undefined
  /**
    * A list of objects that describe the vocabularies that match the search criteria in the request.
    */
  var Vocabularies: js.UndefOr[Vocabularies] = js.undefined
}

object ListVocabulariesResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    Status: TranscriptionJobStatus = null,
    Vocabularies: Vocabularies = null
  ): ListVocabulariesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Vocabularies != null) __obj.updateDynamic("Vocabularies")(Vocabularies)
    __obj.asInstanceOf[ListVocabulariesResponse]
  }
}

