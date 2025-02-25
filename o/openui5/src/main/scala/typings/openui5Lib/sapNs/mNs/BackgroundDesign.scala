package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundDesign extends js.Object

/**
  * Available Background Design.
  */
@JSGlobal("sap.m.BackgroundDesign")
@js.native
object BackgroundDesign extends js.Object {
  @js.native
  sealed trait Solid
    extends openui5Lib.sapNs.mNs.BackgroundDesign
  
  @js.native
  sealed trait Translucent
    extends openui5Lib.sapNs.mNs.BackgroundDesign
  
  @js.native
  sealed trait Transparent
    extends openui5Lib.sapNs.mNs.BackgroundDesign
  
  /* 0 */ val Solid: Solid with scala.Double = js.native
  /* 1 */ val Translucent: Translucent with scala.Double = js.native
  /* 2 */ val Transparent: Transparent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.BackgroundDesign with scala.Double] = js.native
}

