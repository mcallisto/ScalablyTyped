package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A minimal document object that has no parent. It is used as a lightweight version of Document that stores a segment of a document structure comprised of nodes just like a standard document. The key difference is that because the document fragment isn't part of the active document tree structure, changes made to the fragment don't affect the document, cause reflow, or incur any performance impact that can occur when changes are made. */
@js.native
trait DocumentFragment
  extends Node
     with NonElementParentNode
     with ParentNode

@JSGlobal("DocumentFragment")
@js.native
class DocumentFragmentCls () extends DocumentFragment {
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    */
  /* CompleteClass */
  override def getElementById(elementId: java.lang.String): Element | scala.Null = js.native
}

@JSGlobal("DocumentFragment")
@js.native
object DocumentFragment
  extends org.scalablytyped.runtime.Instantiable0[DocumentFragment]

