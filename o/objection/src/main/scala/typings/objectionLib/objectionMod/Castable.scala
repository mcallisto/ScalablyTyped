package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Castable extends js.Object {
  def as(alias: java.lang.String): this.type
  def asArray(): this.type
  def castArray(): this.type
  def castBigInt(): this.type
  def castBool(): this.type
  def castDecimal(): this.type
  def castFloat(): this.type
  def castInt(): this.type
  def castJson(): this.type
  def castReal(): this.type
  def castText(): this.type
  def castTo(sqlType: java.lang.String): this.type
  def castType(sqlType: java.lang.String): this.type
}

object Castable {
  @scala.inline
  def apply(
    as: java.lang.String => Castable,
    asArray: () => Castable,
    castArray: () => Castable,
    castBigInt: () => Castable,
    castBool: () => Castable,
    castDecimal: () => Castable,
    castFloat: () => Castable,
    castInt: () => Castable,
    castJson: () => Castable,
    castReal: () => Castable,
    castText: () => Castable,
    castTo: java.lang.String => Castable,
    castType: java.lang.String => Castable
  ): Castable = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), asArray = js.Any.fromFunction0(asArray), castArray = js.Any.fromFunction0(castArray), castBigInt = js.Any.fromFunction0(castBigInt), castBool = js.Any.fromFunction0(castBool), castDecimal = js.Any.fromFunction0(castDecimal), castFloat = js.Any.fromFunction0(castFloat), castInt = js.Any.fromFunction0(castInt), castJson = js.Any.fromFunction0(castJson), castReal = js.Any.fromFunction0(castReal), castText = js.Any.fromFunction0(castText), castTo = js.Any.fromFunction1(castTo), castType = js.Any.fromFunction1(castType))
  
    __obj.asInstanceOf[Castable]
  }
}

