package typings
package cypressLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Include extends js.Object {
  var all: KeyFilter = js.native
  var any: KeyFilter = js.native
  var deep: Deep = js.native
  @JSName("keys")
  var keys_Original: Keys = js.native
  @JSName("members")
  var members_Original: Members = js.native
  var ordered: Ordered = js.native
  def apply(value: cypressLib.Object): Assertion = js.native
  def apply(value: cypressLib.Object, message: java.lang.String): Assertion = js.native
  def apply(value: java.lang.String): Assertion = js.native
  def apply(value: java.lang.String, message: java.lang.String): Assertion = js.native
  def apply(value: scala.Double): Assertion = js.native
  def apply(value: scala.Double, message: java.lang.String): Assertion = js.native
  def keys(keys: java.lang.String*): Assertion = js.native
  def keys(keys: cypressLib.Object): Assertion = js.native
  def keys(keys: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: java.lang.String): Assertion = js.native
}

