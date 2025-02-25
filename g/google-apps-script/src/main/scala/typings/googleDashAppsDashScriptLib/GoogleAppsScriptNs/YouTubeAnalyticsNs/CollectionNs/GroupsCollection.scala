package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsCollection extends js.Object {
  // Creates a group.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Group): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Group = js.native
  // Creates a group.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Group,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Group = js.native
  // Returns a collection of groups that match the API request parameters. For
  // example, you can retrieve all groups that the authenticated user owns,
  // or you can retrieve one or more groups by their unique IDs.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.ListGroupsResponse = js.native
  // Returns a collection of groups that match the API request parameters. For
  // example, you can retrieve all groups that the authenticated user owns,
  // or you can retrieve one or more groups by their unique IDs.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.ListGroupsResponse = js.native
  // Deletes a group.
  def remove(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.EmptyResponse = js.native
  // Deletes a group.
  def remove(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.EmptyResponse = js.native
  // Modifies a group. For example, you could change a group's title.
  def update(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Group): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Group = js.native
  // Modifies a group. For example, you could change a group's title.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Group,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs.Group = js.native
}

