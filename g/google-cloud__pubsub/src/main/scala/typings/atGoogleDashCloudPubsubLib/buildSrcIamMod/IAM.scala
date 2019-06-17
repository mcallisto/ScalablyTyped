package typings
package atGoogleDashCloudPubsubLib.buildSrcIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/iam", "IAM")
@js.native
class IAM protected () extends js.Object {
  def this(pubsub: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub, id: java.lang.String) = this()
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.native
  var id: java.lang.String = js.native
  var pubsub: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.PubSub = js.native
  @JSName("request")
  var request_Original: atGoogleDashCloudPubsubLib.Fn_Callback = js.native
  def getPolicy(): js.Promise[GetPolicyResponse] = js.native
  def getPolicy(callback: GetPolicyCallback): scala.Unit = js.native
  def getPolicy(
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any
  ): js.Promise[GetPolicyResponse] = js.native
  def getPolicy(
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any,
    callback: GetPolicyCallback
  ): scala.Unit = js.native
  def request[T, R](
    config: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.RequestConfig,
    callback: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.RequestCallback[T, R]
  ): scala.Unit = js.native
  def setPolicy(policy: Policy): js.Promise[SetPolicyResponse] = js.native
  def setPolicy(policy: Policy, callback: SetPolicyCallback): scala.Unit = js.native
  def setPolicy(
    policy: Policy,
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any
  ): js.Promise[SetPolicyResponse] = js.native
  def setPolicy(
    policy: Policy,
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any,
    callback: SetPolicyCallback
  ): scala.Unit = js.native
  def testPermissions(permissions: java.lang.String): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(permissions: java.lang.String, callback: TestIamPermissionsCallback): scala.Unit = js.native
  def testPermissions(
    permissions: java.lang.String,
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any
  ): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(
    permissions: java.lang.String,
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any,
    callback: TestIamPermissionsCallback
  ): scala.Unit = js.native
  def testPermissions(permissions: js.Array[java.lang.String]): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(permissions: js.Array[java.lang.String], callback: TestIamPermissionsCallback): scala.Unit = js.native
  def testPermissions(
    permissions: js.Array[java.lang.String],
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any
  ): js.Promise[TestIamPermissionsResponse] = js.native
  def testPermissions(
    permissions: js.Array[java.lang.String],
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any,
    callback: TestIamPermissionsCallback
  ): scala.Unit = js.native
}

