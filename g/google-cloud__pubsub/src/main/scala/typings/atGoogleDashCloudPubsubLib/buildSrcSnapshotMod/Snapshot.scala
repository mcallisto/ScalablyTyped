package typings
package atGoogleDashCloudPubsubLib.buildSrcSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/snapshot", "Snapshot")
@js.native
class Snapshot protected () extends js.Object {
  def this(parent: atGoogleDashCloudPubsubLib.buildSrcMod.PubSub, name: java.lang.String) = this()
  def this(parent: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription, name: java.lang.String) = this()
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.native
  var metadata: js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISnapshot] = js.native
  var name: java.lang.String = js.native
  var parent: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription | atGoogleDashCloudPubsubLib.buildSrcMod.PubSub = js.native
  def create(): js.Promise[CreateSnapshotResponse] = js.native
  def create(callback: CreateSnapshotCallback): scala.Unit = js.native
  def create(
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any
  ): js.Promise[CreateSnapshotResponse] = js.native
  def create(
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any,
    callback: CreateSnapshotCallback
  ): scala.Unit = js.native
  def delete(): js.Promise[atGoogleDashCloudPubsubLib.buildSrcPubsubMod.EmptyResponse] = js.native
  def delete(callback: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.EmptyCallback): scala.Unit = js.native
  def seek(): js.Promise[SeekResponse] = js.native
  def seek(callback: SeekCallback): scala.Unit = js.native
  def seek(
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any
  ): js.Promise[SeekResponse] = js.native
  def seek(
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any,
    callback: SeekCallback
  ): scala.Unit = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/src/snapshot", "Snapshot")
@js.native
object Snapshot extends js.Object {
  def formatName_(projectId: java.lang.String, name: java.lang.String): java.lang.String = js.native
}

