package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedPlacementListBuilder[ExcludedPlacementList] extends AdWordsBuilder[ExcludedPlacementList] {
  def withName(name: java.lang.String): ExcludedPlacementListBuilder[ExcludedPlacementList]
}

object ExcludedPlacementListBuilder {
  @scala.inline
  def apply[ExcludedPlacementList](
    build: () => AdWordsOperation[ExcludedPlacementList],
    withName: java.lang.String => ExcludedPlacementListBuilder[ExcludedPlacementList]
  ): ExcludedPlacementListBuilder[ExcludedPlacementList] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withName = js.Any.fromFunction1(withName))
  
    __obj.asInstanceOf[ExcludedPlacementListBuilder[ExcludedPlacementList]]
  }
}

