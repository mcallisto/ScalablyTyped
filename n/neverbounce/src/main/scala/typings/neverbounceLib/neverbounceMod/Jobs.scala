package typings
package neverbounceLib.neverbounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jobs extends js.Object {
  def create(input: js.Any, inputLocation: js.Any, fileName: js.Any): js.Promise[neverbounceLib.Response] = js.native
  def create(input: js.Any, inputLocation: js.Any, fileName: js.Any, runSample: js.Any): js.Promise[neverbounceLib.Response] = js.native
  def create(input: js.Any, inputLocation: js.Any, fileName: js.Any, runSample: js.Any, autoParse: js.Any): js.Promise[neverbounceLib.Response] = js.native
  def create(
    input: js.Any,
    inputLocation: js.Any,
    fileName: js.Any,
    runSample: js.Any,
    autoParse: js.Any,
    autoStart: js.Any
  ): js.Promise[neverbounceLib.Response] = js.native
  def download(jobId: scala.Double): js.Promise[neverbounceLib.Response] = js.native
  def parse(jobId: scala.Double): js.Promise[neverbounceLib.Response] = js.native
  def parse(jobId: scala.Double, autoStart: js.Any): js.Promise[neverbounceLib.Response] = js.native
  def results(jobId: scala.Double, query: js.Any): js.Promise[neverbounceLib.Response] = js.native
  def search(query: js.Any): js.Promise[neverbounceLib.Response] = js.native
  def start(jobId: scala.Double): js.Promise[neverbounceLib.Response] = js.native
  def start(jobId: scala.Double, runSample: js.Any): js.Promise[neverbounceLib.Response] = js.native
  def status(jobId: scala.Double): js.Promise[neverbounceLib.Response] = js.native
}

