package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-model", "MarkType")
@js.native
class MarkType[S /* <: Schema[_, _] */] () extends js.Object {
  /**
    * The name of the mark type.
    */
  var name: java.lang.String = js.native
  /**
    * The schema that this mark type instance is part of.
    */
  var schema: S = js.native
  /**
    * The spec on which the type is based.
    */
  var spec: MarkSpec = js.native
  /**
    * Create a mark of this type. `attrs` may be `null` or an object
    * containing only some of the mark's attributes. The others, if
    * they have defaults, will be added.
    */
  def create(): Mark[S] = js.native
  def create(attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): Mark[S] = js.native
  /**
    * Queries whether a given mark type is
    * [excluded](#model.MarkSpec.excludes) by this one.
    */
  def excludes(other: MarkType[S]): scala.Boolean = js.native
  /**
    * Tests whether there is a mark of this type in the given set.
    */
  def isInSet(set: js.Array[Mark[S]]): js.UndefOr[Mark[S] | scala.Null] = js.native
  /**
    * When there is a mark of this type in the given set, a new set
    * without it is returned. Otherwise, the input set is returned.
    */
  def removeFromSet(set: js.Array[Mark[S]]): js.Array[Mark[S]] = js.native
}

