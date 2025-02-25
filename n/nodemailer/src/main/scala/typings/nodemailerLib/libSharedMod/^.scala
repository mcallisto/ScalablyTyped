package typings
package nodemailerLib.libSharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/shared", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def assign(target: js.Object, sources: js.Object*): js.Object = js.native
  def callbackPromise(
    resolve: js.Function1[/* repeated */ js.Any, scala.Unit],
    reject: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def encodeXText(str: java.lang.String): java.lang.String = js.native
  def getLogger(): Logger = js.native
  def getLogger(options: org.scalablytyped.runtime.StringDictionary[js.Any]): Logger = js.native
  def getLogger(
    options: org.scalablytyped.runtime.StringDictionary[js.Any],
    defaults: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): Logger = js.native
  def parseConnectionUrl(url: java.lang.String): nodemailerLib.libSmtpDashConnectionMod.Options = js.native
  def resolveContent(data: js.Array[_], key: java.lang.String): js.Promise[nodeLib.Buffer | java.lang.String] = js.native
  def resolveContent(
    data: js.Array[_],
    key: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* value */ nodeLib.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveContent(data: js.Array[_], key: scala.Double): js.Promise[nodeLib.Buffer | java.lang.String] = js.native
  def resolveContent(
    data: js.Array[_],
    key: scala.Double,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* value */ nodeLib.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveContent(data: js.Object, key: java.lang.String): js.Promise[nodeLib.Buffer | java.lang.String] = js.native
  def resolveContent(
    data: js.Object,
    key: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* value */ nodeLib.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveContent(data: js.Object, key: scala.Double): js.Promise[nodeLib.Buffer | java.lang.String] = js.native
  def resolveContent(
    data: js.Object,
    key: scala.Double,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* value */ nodeLib.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveHostname(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ ResolveHostnameValue, scala.Unit]
  ): scala.Unit = js.native
  def resolveHostname(
    options: ResolveHostnameOptions,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ ResolveHostnameValue, scala.Unit]
  ): scala.Unit = js.native
  def resolveHostname(
    options: scala.Null,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ ResolveHostnameValue, scala.Unit]
  ): scala.Unit = js.native
}

