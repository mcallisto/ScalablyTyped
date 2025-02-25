package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnBuilder extends js.Object {
  def alter(): ColumnBuilder = js.native
  def comment(value: java.lang.String): ColumnBuilder = js.native
  def defaultTo(value: Value): ColumnBuilder = js.native
  def index(): ColumnBuilder = js.native
  def index(indexName: java.lang.String): ColumnBuilder = js.native
  def notNullable(): ColumnBuilder = js.native
  def nullable(): ColumnBuilder = js.native
  def onDelete(command: java.lang.String): ColumnBuilder = js.native
  def onUpdate(command: java.lang.String): ColumnBuilder = js.native
  def primary(): ColumnBuilder = js.native
  def primary(constraintName: java.lang.String): ColumnBuilder = js.native
  def queryContext(context: js.Any): ColumnBuilder = js.native
  def references(columnName: java.lang.String): ReferencingColumnBuilder = js.native
  def unique(): ColumnBuilder = js.native
  def unique(indexName: java.lang.String): ColumnBuilder = js.native
  def unsigned(): ColumnBuilder = js.native
}

