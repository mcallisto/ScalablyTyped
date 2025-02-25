package typings
package atStorybookApiLib.distModulesStoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubState extends js.Object {
  var storiesConfigured: scala.Boolean
  var storiesHash: StoriesHash
  var storyId: StoryId
  var viewMode: ViewMode
}

object SubState {
  @scala.inline
  def apply(storiesConfigured: scala.Boolean, storiesHash: StoriesHash, storyId: StoryId, viewMode: ViewMode): SubState = {
    val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured, storiesHash = storiesHash, storyId = storyId, viewMode = viewMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubState]
  }
}

