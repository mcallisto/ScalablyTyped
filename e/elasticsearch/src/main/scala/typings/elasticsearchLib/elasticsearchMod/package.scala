package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elasticsearchMod {
  type DeleteDocumentByQueryResponse = ReindexResponse
  type InfoParams = GenericParams
  type NameList = java.lang.String | js.Array[java.lang.String] | scala.Boolean
  type PingParams = GenericParams
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - elasticsearchLib.elasticsearchLibStrings.wait_for
    - elasticsearchLib.elasticsearchLibStrings.Empty
  */
  type Refresh = _Refresh | scala.Boolean
  type TimeSpan = java.lang.String
  type UpdateDocumentByQueryResponse = ReindexResponse
}
