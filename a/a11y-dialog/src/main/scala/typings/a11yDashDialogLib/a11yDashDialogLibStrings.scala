package typings
package a11yDashDialogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object a11yDashDialogLibStrings {
  @js.native
  sealed trait create
    extends a11yDashDialogLib.a11yDashDialogMod.DialogEvents
  
  @js.native
  sealed trait destroy
    extends a11yDashDialogLib.a11yDashDialogMod.DialogEvents
  
  @js.native
  sealed trait hide
    extends a11yDashDialogLib.a11yDashDialogMod.DialogEvents
  
  @js.native
  sealed trait show
    extends a11yDashDialogLib.a11yDashDialogMod.DialogEvents
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  @scala.inline
  def show: show = "show".asInstanceOf[show]
}

