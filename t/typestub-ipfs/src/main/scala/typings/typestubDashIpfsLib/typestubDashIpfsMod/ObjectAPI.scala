package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectAPI extends js.Object {
  var patch: ObjectPatchAPI = js.native
  def data(multihash: Multihash): js.Promise[_] = js.native
  def data(multihash: Multihash, callback: Callback[_]): scala.Unit = js.native
  def data(multihash: Multihash, options: GetObjectOptions): js.Promise[_] = js.native
  def data(multihash: Multihash, options: GetObjectOptions, callback: Callback[_]): scala.Unit = js.native
  def get(multihash: Multihash): js.Promise[_] = js.native
  def get(multihash: Multihash, callback: Callback[_]): scala.Unit = js.native
  def get(multihash: Multihash, options: GetObjectOptions): js.Promise[_] = js.native
  def get(multihash: Multihash, options: GetObjectOptions, callback: Callback[_]): scala.Unit = js.native
  def links(multihash: Multihash): js.Promise[js.Array[DAGLink]] = js.native
  def links(multihash: Multihash, callback: Callback[js.Array[DAGLink]]): scala.Unit = js.native
  def links(multihash: Multihash, options: GetObjectOptions): js.Promise[js.Array[DAGLink]] = js.native
  def links(multihash: Multihash, options: GetObjectOptions, callback: Callback[js.Array[DAGLink]]): scala.Unit = js.native
  def `new`(): js.Promise[DAGNode] = js.native
  def `new`(callback: Callback[DAGNode]): scala.Unit = js.native
  @JSName("new")
  def new_unixfsdir(template: typestubDashIpfsLib.typestubDashIpfsLibStrings.`unixfs-dir`, callback: Callback[DAGNode]): scala.Unit = js.native
  def put(obj: Obj): js.Promise[_] = js.native
  def put(obj: Obj, callback: Callback[_]): scala.Unit = js.native
  def put(obj: Obj, options: PutObjectOptions): js.Promise[_] = js.native
  def put(obj: Obj, options: PutObjectOptions, callback: Callback[_]): scala.Unit = js.native
  def stat(multihash: Multihash): js.Promise[ObjectStat] = js.native
  def stat(multihash: Multihash, callback: Callback[ObjectStat]): scala.Unit = js.native
  def stat(multihash: Multihash, options: GetObjectOptions): js.Promise[ObjectStat] = js.native
  def stat(multihash: Multihash, options: GetObjectOptions, callback: Callback[ObjectStat]): scala.Unit = js.native
}

