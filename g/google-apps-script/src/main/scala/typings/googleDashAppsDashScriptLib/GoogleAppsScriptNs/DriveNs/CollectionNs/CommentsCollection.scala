package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsCollection extends js.Object {
  // Gets a comment by ID.
  def get(fileId: java.lang.String, commentId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Comment = js.native
  // Gets a comment by ID.
  def get(fileId: java.lang.String, commentId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Comment = js.native
  // Creates a new comment on the given file.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Comment,
    fileId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Comment = js.native
  // Lists a file's comments.
  def list(fileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentList = js.native
  // Lists a file's comments.
  def list(fileId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentList = js.native
  // Updates an existing comment. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Comment,
    fileId: java.lang.String,
    commentId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Comment = js.native
  // Deletes a comment.
  def remove(fileId: java.lang.String, commentId: java.lang.String): scala.Unit = js.native
  // Updates an existing comment.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Comment,
    fileId: java.lang.String,
    commentId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Comment = js.native
}

