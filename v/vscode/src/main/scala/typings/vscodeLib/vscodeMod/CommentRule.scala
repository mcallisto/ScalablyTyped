package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentRule extends js.Object {
  /**
  		 * The block comment character pair, like `/ * block comment *&#47;`
  		 */
  var blockComment: js.UndefOr[CharacterPair] = js.undefined
  /**
  		 * The line comment token, like `// this is a comment`
  		 */
  var lineComment: js.UndefOr[java.lang.String] = js.undefined
}

object CommentRule {
  @scala.inline
  def apply(blockComment: CharacterPair = null, lineComment: java.lang.String = null): CommentRule = {
    val __obj = js.Dynamic.literal()
    if (blockComment != null) __obj.updateDynamic("blockComment")(blockComment)
    if (lineComment != null) __obj.updateDynamic("lineComment")(lineComment)
    __obj.asInstanceOf[CommentRule]
  }
}

