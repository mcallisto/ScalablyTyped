package typings
package emscriptenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object emscriptenLibStrings {
  @js.native
  sealed trait NODE
    extends emscriptenLib.EmscriptenNs.EnvironmentType
  
  @js.native
  sealed trait SHELL
    extends emscriptenLib.EmscriptenNs.EnvironmentType
  
  @js.native
  sealed trait WEB
    extends emscriptenLib.EmscriptenNs.EnvironmentType
  
  @js.native
  sealed trait WORKER
    extends emscriptenLib.EmscriptenNs.EnvironmentType
  
  @scala.inline
  def NODE: NODE = "NODE".asInstanceOf[NODE]
  @scala.inline
  def SHELL: SHELL = "SHELL".asInstanceOf[SHELL]
  @scala.inline
  def WEB: WEB = "WEB".asInstanceOf[WEB]
  @scala.inline
  def WORKER: WORKER = "WORKER".asInstanceOf[WORKER]
}

