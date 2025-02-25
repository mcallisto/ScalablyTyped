package typings
package saslmechanismsLib.saslmechanismsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Factory extends js.Object {
  def create(mechanisms: js.Array[java.lang.String]): Mechanism | scala.Null = js.native
  def use(mechanism: MechanismStatic): this.type = js.native
  def use(name: java.lang.String, mechanism: MechanismStatic): this.type = js.native
}

