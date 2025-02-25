package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofassert extends js.Object {
  var AssertionError: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.assertNs.AssertionError] = js.native
  def deepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def doesNotThrow(block: js.Function0[scala.Unit]): scala.Unit = js.native
  def doesNotThrow(block: js.Function0[scala.Unit], error: js.Function0[scala.Unit]): scala.Unit = js.native
  def doesNotThrow(block: js.Function0[scala.Unit], error: js.Function0[scala.Unit], message: java.lang.String): scala.Unit = js.native
  def doesNotThrow(block: js.Function0[scala.Unit], error: js.Function1[/* err */ js.Any, scala.Boolean]): scala.Unit = js.native
  def doesNotThrow(
    block: js.Function0[scala.Unit],
    error: js.Function1[/* err */ js.Any, scala.Boolean],
    message: java.lang.String
  ): scala.Unit = js.native
  def doesNotThrow(block: js.Function0[scala.Unit], error: stdLib.RegExp): scala.Unit = js.native
  def doesNotThrow(block: js.Function0[scala.Unit], error: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def doesNotThrow(block: js.Function0[scala.Unit], message: java.lang.String): scala.Unit = js.native
  def equal(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def fail(): scala.Unit = js.native
  def fail(actual: js.Any): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: java.lang.String): scala.Unit = js.native
  def ifError(value: js.Any): scala.Unit = js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any): scala.Unit = js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def ok(value: js.Any): scala.Unit = js.native
  def ok(value: js.Any, message: java.lang.String): scala.Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function0[scala.Unit]): scala.Unit = js.native
  def throws(block: js.Function0[scala.Unit], error: js.Function0[scala.Unit]): scala.Unit = js.native
  def throws(block: js.Function0[scala.Unit], error: js.Function0[scala.Unit], message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function0[scala.Unit], error: js.Function1[/* err */ js.Any, scala.Boolean]): scala.Unit = js.native
  def throws(
    block: js.Function0[scala.Unit],
    error: js.Function1[/* err */ js.Any, scala.Boolean],
    message: java.lang.String
  ): scala.Unit = js.native
  def throws(block: js.Function0[scala.Unit], error: stdLib.RegExp): scala.Unit = js.native
  def throws(block: js.Function0[scala.Unit], error: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function0[scala.Unit], message: java.lang.String): scala.Unit = js.native
}

