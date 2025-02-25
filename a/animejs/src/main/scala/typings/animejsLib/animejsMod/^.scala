package typings
package animejsLib.animejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("animejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val running: js.Array[AnimeInstance] = js.native
  // Helpers
  val speed: scala.Double = js.native
  def apply(params: AnimeParams): AnimeInstance = js.native
  def bezier(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): js.Function1[/* t */ scala.Double, scala.Double] = js.native
  def getValue(targets: AnimeTarget, prop: java.lang.String): java.lang.String | scala.Double = js.native
  def path(): js.Function1[/* prop */ java.lang.String, animejsLib.Anon_El] = js.native
  def path(path: java.lang.String): js.Function1[/* prop */ java.lang.String, animejsLib.Anon_El] = js.native
  def path(path: java.lang.String, percent: scala.Double): js.Function1[/* prop */ java.lang.String, animejsLib.Anon_El] = js.native
  def path(path: scala.Null, percent: scala.Double): js.Function1[/* prop */ java.lang.String, animejsLib.Anon_El] = js.native
  def path(path: stdLib.HTMLElement): js.Function1[/* prop */ java.lang.String, animejsLib.Anon_El] = js.native
  def path(path: stdLib.HTMLElement, percent: scala.Double): js.Function1[/* prop */ java.lang.String, animejsLib.Anon_El] = js.native
  def path(path: stdLib.SVGElement): js.Function1[/* prop */ java.lang.String, animejsLib.Anon_El] = js.native
  def path(path: stdLib.SVGElement, percent: scala.Double): js.Function1[/* prop */ java.lang.String, animejsLib.Anon_El] = js.native
  def random(min: scala.Double, max: scala.Double): scala.Double = js.native
  def remove(targets: AnimeTarget): scala.Unit = js.native
  def remove(targets: js.Array[AnimeTarget]): scala.Unit = js.native
  def setDashoffset(): scala.Double = js.native
  def setDashoffset(el: stdLib.HTMLElement): scala.Double = js.native
  def setDashoffset(el: stdLib.SVGElement): scala.Double = js.native
  // Timeline
  def timeline(): AnimeTimelineInstance = js.native
  def timeline(params: AnimeInstanceParams): AnimeTimelineInstance = js.native
  def timeline(params: js.Array[AnimeInstance]): AnimeTimelineInstance = js.native
}

