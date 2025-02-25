package typings
package blueDashTapeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blue-tape", JSImport.Namespace)
@js.native
object blueDashTapeMod extends js.Object {
  def apply(cb: tapeLib.tapeMod.TestCase): scala.Unit = js.native
  /**
    * Create a new test with an optional name string and optional opts object.
    * cb(t) fires with the new test object t once all preceeding tests have finished.
    * Tests execute serially.
    */
  def apply(name: java.lang.String, cb: tapeLib.tapeMod.TestCase): scala.Unit = js.native
  def apply(name: java.lang.String, opts: tapeLib.tapeMod.TestOptions, cb: tapeLib.tapeMod.TestCase): scala.Unit = js.native
  def apply(opts: tapeLib.tapeMod.TestOptions, cb: tapeLib.tapeMod.TestCase): scala.Unit = js.native
  def createHarness(): tapeLib.Fn_Cb = js.native
  def createStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  def createStream(opts: tapeLib.tapeMod.StreamOptions): nodeLib.NodeJSNs.ReadableStream = js.native
  def onFinish(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def only(cb: tapeLib.tapeMod.TestCase): scala.Unit = js.native
  def only(name: java.lang.String, cb: tapeLib.tapeMod.TestCase): scala.Unit = js.native
  def only(name: java.lang.String, opts: tapeLib.tapeMod.TestOptions, cb: tapeLib.tapeMod.TestCase): scala.Unit = js.native
  def only(opts: tapeLib.tapeMod.TestOptions, cb: tapeLib.tapeMod.TestCase): scala.Unit = js.native
  def skip(cb: tapeLib.tapeMod.TestCase): scala.Unit = js.native
  def skip(name: java.lang.String, cb: tapeLib.tapeMod.TestCase): scala.Unit = js.native
  def skip(name: java.lang.String, opts: tapeLib.tapeMod.TestOptions, cb: tapeLib.tapeMod.TestCase): scala.Unit = js.native
  def skip(opts: tapeLib.tapeMod.TestOptions, cb: tapeLib.tapeMod.TestCase): scala.Unit = js.native
}

