package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printer extends js.Object {
  /**
    * Prints a bundle of source files as-is, without any emit transformations.
    */
  def printBundle(bundle: Bundle): java.lang.String
  /**
    * Prints a source file as-is, without any emit transformations.
    */
  def printFile(sourceFile: SourceFile): java.lang.String
  /**
    * Prints a list of nodes using the given format flags
    */
  def printList[T /* <: Node */](format: ListFormat, list: NodeArray[T], sourceFile: SourceFile): java.lang.String
  /**
    * Print a node and its subtree as-is, without any emit transformations.
    * @param hint A value indicating the purpose of a node. This is primarily used to
    * distinguish between an `Identifier` used in an expression position, versus an
    * `Identifier` used as an `IdentifierName` as part of a declaration. For most nodes you
    * should just pass `Unspecified`.
    * @param node The node to print. The node and its subtree are printed as-is, without any
    * emit transformations.
    * @param sourceFile A source file that provides context for the node. The source text of
    * the file is used to emit the original source content for literals and identifiers, while
    * the identifiers of the source file are used when generating unique names to avoid
    * collisions.
    */
  def printNode(hint: EmitHint, node: Node, sourceFile: SourceFile): java.lang.String
}

object Printer {
  @scala.inline
  def apply(
    printBundle: Bundle => java.lang.String,
    printFile: SourceFile => java.lang.String,
    printList: (ListFormat, NodeArray[js.Any], SourceFile) => java.lang.String,
    printNode: (EmitHint, Node, SourceFile) => java.lang.String
  ): Printer = {
    val __obj = js.Dynamic.literal(printBundle = js.Any.fromFunction1(printBundle), printFile = js.Any.fromFunction1(printFile), printList = js.Any.fromFunction3(printList), printNode = js.Any.fromFunction3(printNode))
  
    __obj.asInstanceOf[Printer]
  }
}

