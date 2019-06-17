package typings
package atGoogleDashCloudPubsubLib.buildSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src", "Snapshot")
@js.native
class Snapshot protected ()
  extends atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.Snapshot {
  def this(parent: PubSub, name: java.lang.String) = this()
  def this(parent: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription, name: java.lang.String) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub/build/src", "Snapshot")
@js.native
object Snapshot extends js.Object {
  def formatName_(projectId: java.lang.String, name: java.lang.String): java.lang.String = js.native
}

