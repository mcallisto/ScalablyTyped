package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "RotationalSpring")
@js.native
class RotationalSpring protected () extends Spring {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: RotationalSpringOptions) = this()
  var restAngle: scala.Double = js.native
}

