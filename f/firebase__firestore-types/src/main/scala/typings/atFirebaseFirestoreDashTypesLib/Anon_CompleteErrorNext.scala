package typings
package atFirebaseFirestoreDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteErrorNext extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var next: js.UndefOr[
    js.Function1[
      /* snapshot */ atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.QuerySnapshot, 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_CompleteErrorNext {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    error: /* error */ stdLib.Error => scala.Unit = null,
    next: /* snapshot */ atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.QuerySnapshot => scala.Unit = null
  ): Anon_CompleteErrorNext = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    __obj.asInstanceOf[Anon_CompleteErrorNext]
  }
}

