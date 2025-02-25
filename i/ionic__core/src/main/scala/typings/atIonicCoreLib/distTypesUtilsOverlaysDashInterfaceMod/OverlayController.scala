package typings
package atIonicCoreLib.distTypesUtilsOverlaysDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayController extends js.Object {
  def create(): js.Promise[stdLib.HTMLElement] = js.native
  def create(opts: js.Any): js.Promise[stdLib.HTMLElement] = js.native
  def dismiss(): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String): js.Promise[scala.Boolean] = js.native
  def dismiss(data: js.Any, role: java.lang.String, id: java.lang.String): js.Promise[scala.Boolean] = js.native
  def getTop(): js.Promise[js.UndefOr[HTMLIonOverlayElement]] = js.native
}

