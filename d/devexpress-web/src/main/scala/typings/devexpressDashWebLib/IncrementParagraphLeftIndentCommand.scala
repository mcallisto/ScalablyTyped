package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to increment the left indentation of paragraphs in a selected range.
  */
trait IncrementParagraphLeftIndentCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the IncrementParagraphLeftIndentCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

object IncrementParagraphLeftIndentCommand {
  @scala.inline
  def apply(execute: () => scala.Boolean, getState: () => SimpleCommandState): IncrementParagraphLeftIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[IncrementParagraphLeftIndentCommand]
  }
}

