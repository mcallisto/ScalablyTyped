package typings
package ecurveLib.ecurveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecurve", "Point")
@js.native
class Point protected () extends js.Object {
  def this(curve: Curve, x: bigiLib.bigiMod.^, y: bigiLib.bigiMod.^, z: bigiLib.bigiMod.^) = this()
  var affineX: bigiLib.bigiMod.^ = js.native
  var affineY: bigiLib.bigiMod.^ = js.native
  var x: bigiLib.bigiMod.^ = js.native
  var y: bigiLib.bigiMod.^ = js.native
  var z: bigiLib.bigiMod.^ = js.native
  def add(b: Point): Point = js.native
  def equals(other: Point): scala.Boolean = js.native
  def getEncoded(): nodeLib.Buffer = js.native
  def getEncoded(compressed: scala.Boolean): nodeLib.Buffer = js.native
  def multiply(k: js.Any): Point = js.native
  def multiplyTwo(j: js.Any, x: js.Any, k: js.Any): Point = js.native
  def negate(): Point = js.native
  def twice(): Point = js.native
}

/* static members */
@JSImport("ecurve", "Point")
@js.native
object Point extends js.Object {
  def decodeFrom(curve: ecurveLib.ecurveMod.Curve, buffer: nodeLib.Buffer): js.Any = js.native
  def fromAffine(curve: ecurveLib.ecurveMod.Curve, x: bigiLib.bigiMod.^, y: bigiLib.bigiMod.^): ecurveLib.ecurveMod.Point = js.native
}

