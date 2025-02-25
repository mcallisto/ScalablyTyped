package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerCategoryDescriptions extends js.Object {
  /** The label associated with Category 1 */
  var category1: js.UndefOr[java.lang.String] = js.undefined
  /** The label associated with Category 2 */
  var category2: js.UndefOr[java.lang.String] = js.undefined
  /** The label associated with Category 3 */
  var category3: js.UndefOr[java.lang.String] = js.undefined
  /** The label associated with Category 4 */
  var category4: js.UndefOr[java.lang.String] = js.undefined
  /** The label associated with Category 5 */
  var category5: js.UndefOr[java.lang.String] = js.undefined
  /** The label associated with Category 6 */
  var category6: js.UndefOr[java.lang.String] = js.undefined
}

object PlannerCategoryDescriptions {
  @scala.inline
  def apply(
    category1: java.lang.String = null,
    category2: java.lang.String = null,
    category3: java.lang.String = null,
    category4: java.lang.String = null,
    category5: java.lang.String = null,
    category6: java.lang.String = null
  ): PlannerCategoryDescriptions = {
    val __obj = js.Dynamic.literal()
    if (category1 != null) __obj.updateDynamic("category1")(category1)
    if (category2 != null) __obj.updateDynamic("category2")(category2)
    if (category3 != null) __obj.updateDynamic("category3")(category3)
    if (category4 != null) __obj.updateDynamic("category4")(category4)
    if (category5 != null) __obj.updateDynamic("category5")(category5)
    if (category6 != null) __obj.updateDynamic("category6")(category6)
    __obj.asInstanceOf[PlannerCategoryDescriptions]
  }
}

