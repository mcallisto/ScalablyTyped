package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintMode extends js.Object

@JSGlobal("ej.Grid.PrintMode")
@js.native
object PrintMode extends js.Object {
  ///Prints all pages.
  @js.native
  sealed trait AllPages
    extends ejDotWebDotAllLib.ejNs.GridNs.PrintMode
  
  ///Prints current page.
  @js.native
  sealed trait CurrentPage
    extends ejDotWebDotAllLib.ejNs.GridNs.PrintMode
  
  /* 0 */ val AllPages: AllPages with scala.Double = js.native
  /* 1 */ val CurrentPage: CurrentPage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.PrintMode with scala.Double] = js.native
}

