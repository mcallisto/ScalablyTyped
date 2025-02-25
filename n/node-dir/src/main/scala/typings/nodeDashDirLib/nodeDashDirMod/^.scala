package typings
package nodeDashDirLib.nodeDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-dir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def files(
    dir: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* files */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def files(dir: java.lang.String, syncOption: nodeDashDirLib.Anon_Sync): js.Array[java.lang.String] = js.native
  def paths(
    dir: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* paths */ PathsResult, scala.Unit]
  ): scala.Unit = js.native
  def paths(
    dir: java.lang.String,
    combine: scala.Boolean,
    callback: js.Function2[/* error */ js.Any, /* paths */ js.Array[java.lang.String] | PathsResult, scala.Unit]
  ): scala.Unit = js.native
  def promiseFiles(dir: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def readFiles(dir: java.lang.String, fileCallback: FileCallback): scala.Unit = js.native
  def readFiles(dir: java.lang.String, fileCallback: FileCallback, finishedCallback: FinishedCallback): scala.Unit = js.native
  def readFiles(dir: java.lang.String, fileCallback: FileNamedCallback): scala.Unit = js.native
  def readFiles(dir: java.lang.String, fileCallback: FileNamedCallback, finishedCallback: FinishedCallback): scala.Unit = js.native
  def readFiles(dir: java.lang.String, options: Options, fileCallback: FileCallback): scala.Unit = js.native
  def readFiles(
    dir: java.lang.String,
    options: Options,
    fileCallback: FileCallback,
    finishedCallback: FinishedCallback
  ): scala.Unit = js.native
  def readFiles(dir: java.lang.String, options: Options, fileCallback: FileNamedCallback): scala.Unit = js.native
  def readFiles(
    dir: java.lang.String,
    options: Options,
    fileCallback: FileNamedCallback,
    finishedCallback: FinishedCallback
  ): scala.Unit = js.native
  def readFilesStream(dir: java.lang.String, options: Options, streamCallback: StreamCallback): scala.Unit = js.native
  def readFilesStream(
    dir: java.lang.String,
    options: Options,
    streamCallback: StreamCallback,
    finishedCallback: FinishedCallback
  ): scala.Unit = js.native
  def readFilesStream(dir: java.lang.String, streamCallback: StreamCallback): scala.Unit = js.native
  def readFilesStream(dir: java.lang.String, streamCallback: StreamCallback, finishedCallback: FinishedCallback): scala.Unit = js.native
  def subdirs(
    dir: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* subdirs */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
}

