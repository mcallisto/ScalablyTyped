package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-model", "NodeType")
@js.native
class NodeType[S /* <: Schema[_, _] */] () extends js.Object {
  /**
    * The starting match of the node type's content expression.
    */
  var contentMatch: ContentMatch[S] = js.native
  /**
    * True if this node type has inline content.
    */
  var inlineContent: scala.Boolean = js.native
  /**
    * True when this node is an atom, i.e. when it does not have
    * directly editable content.
    */
  var isAtom: scala.Boolean = js.native
  /**
    * True if this is a block type
    */
  var isBlock: scala.Boolean = js.native
  /**
    * True if this is an inline type.
    */
  var isInline: scala.Boolean = js.native
  /**
    * True for node types that allow no content.
    */
  var isLeaf: scala.Boolean = js.native
  /**
    * True if this is the text node type.
    */
  var isText: scala.Boolean = js.native
  /**
    * True if this is a textblock type, a block that contains inline
    * content.
    */
  var isTextblock: scala.Boolean = js.native
  /**
    * The name the node type has in this schema.
    */
  var name: java.lang.String = js.native
  /**
    * A link back to the `Schema` the node type belongs to.
    */
  var schema: S = js.native
  /**
    * The spec that this type is based on
    */
  var spec: NodeSpec = js.native
  /**
    * Removes the marks that are not allowed in this node from the given set.
    */
  def allowedMarks(marks: js.Array[Mark[S]]): js.Array[Mark[S]] = js.native
  /**
    * Check whether the given mark type is allowed in this node.
    */
  def allowsMarkType(markType: MarkType[S]): scala.Boolean = js.native
  /**
    * Test whether the given set of marks are allowed in this node.
    */
  def allowsMarks(marks: js.Array[Mark[S]]): scala.Boolean = js.native
  /**
    * Create a `Node` of this type. The given attributes are
    * checked and defaulted (you can pass `null` to use the type's
    * defaults entirely, if no required attributes exist). `content`
    * may be a `Fragment`, a node, an array of nodes, or
    * `null`. Similarly `marks` may be `null` to default to the empty
    * set of marks.
    */
  def create(): ProsemirrorNode[S] = js.native
  def create(attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): ProsemirrorNode[S] = js.native
  def create(attrs: org.scalablytyped.runtime.StringDictionary[js.Any], content: js.Array[ProsemirrorNode[S]]): ProsemirrorNode[S] = js.native
  def create(
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: js.Array[ProsemirrorNode[S]],
    marks: js.Array[Mark[S]]
  ): ProsemirrorNode[S] = js.native
  def create(attrs: org.scalablytyped.runtime.StringDictionary[js.Any], content: Fragment[S]): ProsemirrorNode[S] = js.native
  def create(
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: Fragment[S],
    marks: js.Array[Mark[S]]
  ): ProsemirrorNode[S] = js.native
  def create(attrs: org.scalablytyped.runtime.StringDictionary[js.Any], content: ProsemirrorNode[S]): ProsemirrorNode[S] = js.native
  def create(
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: ProsemirrorNode[S],
    marks: js.Array[Mark[S]]
  ): ProsemirrorNode[S] = js.native
  def create(attrs: scala.Null, content: js.Array[ProsemirrorNode[S]]): ProsemirrorNode[S] = js.native
  def create(attrs: scala.Null, content: js.Array[ProsemirrorNode[S]], marks: js.Array[Mark[S]]): ProsemirrorNode[S] = js.native
  def create(attrs: scala.Null, content: Fragment[S]): ProsemirrorNode[S] = js.native
  def create(attrs: scala.Null, content: Fragment[S], marks: js.Array[Mark[S]]): ProsemirrorNode[S] = js.native
  def create(attrs: scala.Null, content: ProsemirrorNode[S]): ProsemirrorNode[S] = js.native
  def create(attrs: scala.Null, content: ProsemirrorNode[S], marks: js.Array[Mark[S]]): ProsemirrorNode[S] = js.native
  /**
    * Like [`create`](#model.NodeType.create), but see if it is necessary to
    * add nodes to the start or end of the given fragment to make it
    * fit the node. If no fitting wrapping can be found, return null.
    * Note that, due to the fact that required nodes can always be
    * created, this will always succeed if you pass null or
    * `Fragment.empty` as content.
    */
  def createAndFill(): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(attrs: org.scalablytyped.runtime.StringDictionary[js.Any], content: js.Array[ProsemirrorNode[S]]): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: js.Array[ProsemirrorNode[S]],
    marks: js.Array[Mark[S]]
  ): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(attrs: org.scalablytyped.runtime.StringDictionary[js.Any], content: Fragment[S]): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: Fragment[S],
    marks: js.Array[Mark[S]]
  ): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(attrs: org.scalablytyped.runtime.StringDictionary[js.Any], content: ProsemirrorNode[S]): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: ProsemirrorNode[S],
    marks: js.Array[Mark[S]]
  ): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(attrs: scala.Null, content: js.Array[ProsemirrorNode[S]]): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(attrs: scala.Null, content: js.Array[ProsemirrorNode[S]], marks: js.Array[Mark[S]]): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(attrs: scala.Null, content: Fragment[S]): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(attrs: scala.Null, content: Fragment[S], marks: js.Array[Mark[S]]): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(attrs: scala.Null, content: ProsemirrorNode[S]): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  def createAndFill(attrs: scala.Null, content: ProsemirrorNode[S], marks: js.Array[Mark[S]]): js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  /**
    * Like [`create`](#model.NodeType.create), but check the given content
    * against the node type's content restrictions, and throw an error
    * if it doesn't match.
    */
  def createChecked(): ProsemirrorNode[S] = js.native
  def createChecked(attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): ProsemirrorNode[S] = js.native
  def createChecked(attrs: org.scalablytyped.runtime.StringDictionary[js.Any], content: js.Array[ProsemirrorNode[S]]): ProsemirrorNode[S] = js.native
  def createChecked(
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: js.Array[ProsemirrorNode[S]],
    marks: js.Array[Mark[S]]
  ): ProsemirrorNode[S] = js.native
  def createChecked(attrs: org.scalablytyped.runtime.StringDictionary[js.Any], content: Fragment[S]): ProsemirrorNode[S] = js.native
  def createChecked(
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: Fragment[S],
    marks: js.Array[Mark[S]]
  ): ProsemirrorNode[S] = js.native
  def createChecked(attrs: org.scalablytyped.runtime.StringDictionary[js.Any], content: ProsemirrorNode[S]): ProsemirrorNode[S] = js.native
  def createChecked(
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    content: ProsemirrorNode[S],
    marks: js.Array[Mark[S]]
  ): ProsemirrorNode[S] = js.native
  def createChecked(attrs: scala.Null, content: js.Array[ProsemirrorNode[S]]): ProsemirrorNode[S] = js.native
  def createChecked(attrs: scala.Null, content: js.Array[ProsemirrorNode[S]], marks: js.Array[Mark[S]]): ProsemirrorNode[S] = js.native
  def createChecked(attrs: scala.Null, content: Fragment[S]): ProsemirrorNode[S] = js.native
  def createChecked(attrs: scala.Null, content: Fragment[S], marks: js.Array[Mark[S]]): ProsemirrorNode[S] = js.native
  def createChecked(attrs: scala.Null, content: ProsemirrorNode[S]): ProsemirrorNode[S] = js.native
  def createChecked(attrs: scala.Null, content: ProsemirrorNode[S], marks: js.Array[Mark[S]]): ProsemirrorNode[S] = js.native
  /**
    * Returns true if the given fragment is valid content for this node
    * type with the given attributes.
    */
  def validContent(content: Fragment[S]): scala.Boolean = js.native
}

