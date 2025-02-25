package typings
package atPhosphorCollectionsLib.atPhosphorCollectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/collections", "LinkedList")
@js.native
object LinkedListNs extends js.Object {
  /**
    * A forward iterator for nodes in a linked list.
    */
  @js.native
  class ForwardNodeIterator[T] ()
    extends atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.ForwardNodeIterator[T] {
    /**
      * Construct a forward node iterator.
      *
      * @param node - The first node in the list.
      */
    def this(node: atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T]) = this()
  }
  
  /**
    * A forward iterator for values in a linked list.
    */
  @js.native
  class ForwardValueIterator[T] ()
    extends atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.ForwardValueIterator[T] {
    /**
      * Construct a forward value iterator.
      *
      * @param node - The first node in the list.
      */
    def this(node: atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T]) = this()
  }
  
  /**
    * A reverse iterator for nodes in a linked list.
    */
  @js.native
  class RetroNodeIterator[T] ()
    extends atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.RetroNodeIterator[T] {
    /**
      * Construct a retro node iterator.
      *
      * @param node - The last node in the list.
      */
    def this(node: atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T]) = this()
  }
  
  /**
    * A reverse iterator for values in a linked list.
    */
  @js.native
  class RetroValueIterator[T] ()
    extends atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.RetroValueIterator[T] {
    /**
      * Construct a retro value iterator.
      *
      * @param node - The last node in the list.
      */
    def this(node: atPhosphorCollectionsLib.libLinkedlistMod.LinkedListNs.INode[T]) = this()
  }
  
  /**
    * Create a linked list from an iterable of values.
    *
    * @param values - The iterable or array-like object of interest.
    *
    * @returns A new linked list initialized with the given values.
    */
  def from[T](values: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[T]): atPhosphorCollectionsLib.libLinkedlistMod.LinkedList[T] = js.native
}

