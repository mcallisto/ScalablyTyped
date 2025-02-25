package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventGroup extends js.Object {
  def add(types: java.lang.String, callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit]): this.type = js.native
  def add(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[IEvent | js.Object, scala.Unit]
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[IEvent | js.Object, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[IEvent | js.Object, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def remove(types: java.lang.String, callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit]): this.type = js.native
  def remove(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[IEvent | js.Object, scala.Unit]
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[IEvent | js.Object, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[java.lang.String] | java.lang.String],
    callback: js.Function1[IEvent | js.Object, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def removeAll(): this.type = js.native
}

