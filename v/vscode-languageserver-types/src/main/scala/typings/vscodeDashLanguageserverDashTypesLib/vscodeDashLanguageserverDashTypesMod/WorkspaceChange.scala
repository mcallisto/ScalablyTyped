package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-types", "WorkspaceChange")
@js.native
class WorkspaceChange () extends js.Object {
  def this(workspaceEdit: WorkspaceEdit) = this()
  var _textEditChanges: js.Any = js.native
  var _workspaceEdit: js.Any = js.native
  var checkDocumentChanges: js.Any = js.native
  /**
    * Returns the underlying [WorkspaceEdit](#WorkspaceEdit) literal
    * use to be returned from a workspace edit operation like rename.
    */
  val edit: WorkspaceEdit = js.native
  def createFile(uri: java.lang.String): scala.Unit = js.native
  def createFile(uri: java.lang.String, options: CreateFileOptions): scala.Unit = js.native
  def deleteFile(uri: java.lang.String): scala.Unit = js.native
  def deleteFile(uri: java.lang.String, options: DeleteFileOptions): scala.Unit = js.native
  /**
    * Returns the [TextEditChange](#TextEditChange) to manage text edits
    * for resources.
    */
  def getTextEditChange(textDocument: VersionedTextDocumentIdentifier): TextEditChange = js.native
  def getTextEditChange(uri: java.lang.String): TextEditChange = js.native
  def renameFile(oldUri: java.lang.String, newUri: java.lang.String): scala.Unit = js.native
  def renameFile(oldUri: java.lang.String, newUri: java.lang.String, options: RenameFileOptions): scala.Unit = js.native
}

