package typings
package nssmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nssmLibStrings {
  @js.native
  sealed trait Nssm extends js.Object
  
  @js.native
  sealed trait continue
    extends nssmLib.nssmMod.Command
  
  @js.native
  sealed trait get
    extends nssmLib.nssmMod.Command
  
  @js.native
  sealed trait install
    extends nssmLib.nssmMod.Command
  
  @js.native
  sealed trait pause
    extends nssmLib.nssmMod.Command
  
  @js.native
  sealed trait remove
    extends nssmLib.nssmMod.Command
  
  @js.native
  sealed trait reset
    extends nssmLib.nssmMod.Command
  
  @js.native
  sealed trait restart
    extends nssmLib.nssmMod.Command
  
  @js.native
  sealed trait rotate
    extends nssmLib.nssmMod.Command
  
  @js.native
  sealed trait set
    extends nssmLib.nssmMod.Command
  
  @js.native
  sealed trait start
    extends nssmLib.nssmMod.Command
  
  @js.native
  sealed trait status
    extends nssmLib.nssmMod.Command
  
  @js.native
  sealed trait stop
    extends nssmLib.nssmMod.Command
  
  @scala.inline
  def Nssm: Nssm = "Nssm".asInstanceOf[Nssm]
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def install: install = "install".asInstanceOf[install]
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  @scala.inline
  def restart: restart = "restart".asInstanceOf[restart]
  @scala.inline
  def rotate: rotate = "rotate".asInstanceOf[rotate]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
}

