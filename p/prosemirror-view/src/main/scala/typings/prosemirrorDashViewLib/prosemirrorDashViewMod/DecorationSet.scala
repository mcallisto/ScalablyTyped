package typings
package prosemirrorDashViewLib.prosemirrorDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-view", "DecorationSet")
@js.native
class DecorationSet[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] () extends js.Object {
  /**
    * Add the given array of decorations to the ones in the set,
    * producing a new set. Needs access to the current document to
    * create the appropriate tree structure.
    */
  def add(doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], decorations: js.Array[Decoration]): DecorationSet[S] = js.native
  /**
    * Find all decorations in this set which touch the given range
    * (including decorations that start or end directly at the
    * boundaries) and match the given predicate on their spec. When
    * `start` and `end` are omitted, all decorations in the set are
    * considered. When `predicate` isn't given, all decorations are
    * asssumed to match.
    */
  def find(): js.Array[Decoration] = js.native
  def find(start: scala.Double): js.Array[Decoration] = js.native
  def find(start: scala.Double, end: scala.Double): js.Array[Decoration] = js.native
  def find(
    start: scala.Double,
    end: scala.Double,
    predicate: js.Function1[/* spec */ org.scalablytyped.runtime.StringDictionary[js.Any], scala.Boolean]
  ): js.Array[Decoration] = js.native
  /**
    * Map the set of decorations in response to a change in the
    * document.
    */
  def map(
    mapping: prosemirrorDashTransformLib.prosemirrorDashTransformMod.Mapping,
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]
  ): DecorationSet[S] = js.native
  def map(
    mapping: prosemirrorDashTransformLib.prosemirrorDashTransformMod.Mapping,
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    options: prosemirrorDashViewLib.Anon_DecorationSpec
  ): DecorationSet[S] = js.native
  /**
    * Create a new set that contains the decorations in this set, minus
    * the ones in the given array.
    */
  def remove(decorations: js.Array[Decoration]): DecorationSet[S] = js.native
}

/* static members */
@JSImport("prosemirror-view", "DecorationSet")
@js.native
object DecorationSet extends js.Object {
  /**
    * The empty set of decorations.
    */
  var empty: prosemirrorDashViewLib.prosemirrorDashViewMod.DecorationSet[_] = js.native
  /**
    * Create a set of decorations, using the structure of the given
    * document.
    */
  def create[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    decorations: js.Array[prosemirrorDashViewLib.prosemirrorDashViewMod.Decoration]
  ): prosemirrorDashViewLib.prosemirrorDashViewMod.DecorationSet[S] = js.native
}

