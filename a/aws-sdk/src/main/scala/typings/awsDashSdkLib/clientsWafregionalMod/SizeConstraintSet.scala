package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeConstraintSet extends js.Object {
  /**
    * The name, if any, of the SizeConstraintSet.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  /**
    * A unique identifier for a SizeConstraintSet. You use SizeConstraintSetId to get information about a SizeConstraintSet (see GetSizeConstraintSet), update a SizeConstraintSet (see UpdateSizeConstraintSet), insert a SizeConstraintSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SizeConstraintSet from AWS WAF (see DeleteSizeConstraintSet).  SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId
  /**
    * Specifies the parts of web requests that you want to inspect the size of.
    */
  var SizeConstraints: awsDashSdkLib.clientsWafregionalMod.SizeConstraints
}

object SizeConstraintSet {
  @scala.inline
  def apply(SizeConstraintSetId: ResourceId, SizeConstraints: SizeConstraints, Name: ResourceName = null): SizeConstraintSet = {
    val __obj = js.Dynamic.literal(SizeConstraintSetId = SizeConstraintSetId, SizeConstraints = SizeConstraints)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[SizeConstraintSet]
  }
}

