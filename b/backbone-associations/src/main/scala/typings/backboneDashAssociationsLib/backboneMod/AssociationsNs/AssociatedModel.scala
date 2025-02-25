package typings
package backboneDashAssociationsLib.backboneMod.AssociationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone/Associations", "AssociatedModel")
@js.native
class AssociatedModel ()
  extends backboneLib.backboneMod.Model {
  var _proxyCalls: js.Any = js.native
  /** Reverse association lookup for objects that contain this object */
  var parents: js.Array[_] = js.native
  /** Relations with their associated model */
  var relations: js.Array[IRelation] = js.native
  /** Cleans up any parent relations on other AssociatedModels */
  def cleanup(): scala.Unit = js.native
}

