package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "DocumentHighlight")
@js.native
class DocumentHighlight protected () extends js.Object {
  /**
  		 * Creates a new document highlight object.
  		 *
  		 * @param range The range the highlight applies to.
  		 * @param kind The highlight kind, default is [text](#DocumentHighlightKind.Text).
  		 */
  def this(range: Range) = this()
  def this(range: Range, kind: DocumentHighlightKind) = this()
  /**
  		 * The highlight kind, default is [text](#DocumentHighlightKind.Text).
  		 */
  var kind: js.UndefOr[DocumentHighlightKind] = js.native
  /**
  		 * The range this highlight applies to.
  		 */
  var range: Range = js.native
}

