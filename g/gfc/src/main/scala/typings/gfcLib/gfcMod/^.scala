package typings
package gfcLib.gfcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gfc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[gfcLib.Anon_Stderr] = js.native
  def apply(cwd: java.lang.String): js.Promise[gfcLib.Anon_Stderr] = js.native
  def apply(
    cwd: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(cwd: java.lang.String, options: Options[ExecOptionsWithEncoding]): js.Promise[gfcLib.Anon_Stderr] = js.native
  def apply(
    cwd: java.lang.String,
    options: Options[ExecOptionsWithEncoding],
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(options: Options[ExecOptionsWithEncoding]): js.Promise[gfcLib.Anon_Stderr] = js.native
  def sync(): java.lang.String | nodeLib.Buffer = js.native
  def sync(cwd: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  def sync(cwd: java.lang.String, options: Options[nodeLib.childUnderscoreProcessMod.ExecSyncOptions]): java.lang.String | nodeLib.Buffer = js.native
  def sync(options: Options[nodeLib.childUnderscoreProcessMod.ExecSyncOptions]): java.lang.String | nodeLib.Buffer = js.native
}

