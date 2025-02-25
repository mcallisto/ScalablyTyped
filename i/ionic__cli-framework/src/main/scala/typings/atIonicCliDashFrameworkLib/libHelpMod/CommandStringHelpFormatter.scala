package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "CommandStringHelpFormatter")
@js.native
class CommandStringHelpFormatter[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] () extends CommandHelpFormatter[C, N, M, I, O] {
  def formatAfterOptionSummary(opt: O): js.Promise[java.lang.String] = js.native
  /**
    * Insert text after the command's summary.
    *
    * @param meta The metadata of the command.
    */
  def formatAfterSummary(meta: M): js.Promise[java.lang.String] = js.native
  /**
    * Insert text that appears before an option's summary.
    *
    * @param opt The metadata of the option.
    */
  def formatBeforeOptionSummary(opt: O): js.Promise[java.lang.String] = js.native
  /**
    * Insert text before the command's summary.
    *
    * @param meta The metadata of the command.
    */
  def formatBeforeSummary(meta: M): js.Promise[java.lang.String] = js.native
  def formatDescription(): js.Promise[java.lang.String] = js.native
  def formatExamples(): js.Promise[java.lang.String] = js.native
  def formatHeader(): js.Promise[java.lang.String] = js.native
  def formatInlineInput(input: I): js.Promise[java.lang.String] = js.native
  def formatInputs(): js.Promise[java.lang.String] = js.native
  def formatOptionDefault(opt: O): js.Promise[java.lang.String] = js.native
  def formatOptionLine(opt: O): js.Promise[java.lang.String] = js.native
  def formatOptions(): js.Promise[java.lang.String] = js.native
  def formatOptionsGroup(titleText: java.lang.String, options: js.Array[O]): js.Promise[java.lang.String] = js.native
  def formatSummary(): js.Promise[java.lang.String] = js.native
  def formatUsage(): js.Promise[java.lang.String] = js.native
}

