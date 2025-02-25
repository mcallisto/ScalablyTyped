package typings
package atPulumiCloudLib.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  /**
    * The name of the primary key.
    */
  val primaryKey: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The type of the primary key.
    */
  val primaryKeyType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Deletes a documents from the table.
    *
    * @param query An object with the primary key ("id" by default) assigned
    * the value to lookup.
    * @returns A promise for the success or failure of the delete.
    */
  def delete(query: js.Object): js.Promise[scala.Unit] = js.native
  /**
    * Get a document from the table.
    *
    * @param query An object with the primary key ("id" by default) assigned
    * the value to lookup.
    * @returns A promise for the resulting document if found, or for undefined if not found,
    *   or a failed promise if the query could not be processed.
    */
  def get(query: js.Object): js.Promise[_] = js.native
  /**
    * Insert a document into the table.
    *
    * @param item An object representing the full document to insert. Must
    *   include a property for the primary key ("id" by default).
    * @returns A promise for the success or failure of the insert.
    */
  def insert(item: js.Object): js.Promise[scala.Unit] = js.native
  /**
    * Gets all documents from the table.
    *
    * @param callback An optional callback that will be called for each page of results. If this callback returns
    * false, no more pages will be fetched.
    * @returns A promise for the resulting documents, or a failed promise if
    * the lookup fails.
    */
  def scan(): js.Promise[js.Array[_]] = js.native
  def scan(callback: js.Function1[/* items */ js.Array[_], js.Promise[scala.Boolean]]): js.Promise[scala.Unit] = js.native
  /**
    * Updates a documents in the table.
    *
    * @param query An object with the primary key ("id" by default) assigned
    * the value to lookup.
    * @param updates An object with all document properties that should be
    * updated.
    * @returns A promise for the success or failure of the update.
    */
  def update(query: js.Object, updates: js.Object): js.Promise[scala.Unit] = js.native
}

@JSImport("@pulumi/cloud/table", "Table")
@js.native
class TableCls protected () extends Table {
  /**
    * Creates a new Table.
    *
    * @param name A unique name for the table.
    * @param primaryKey An optional primary key name.
    * @param primaryKeyType An optional primary key type.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, primaryKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]) = this()
  def this(name: java.lang.String, primaryKey: atPulumiPulumiLib.outputMod.Input[java.lang.String], primaryKeyType: atPulumiPulumiLib.outputMod.Input[PrimaryKeyType]) = this()
  def this(name: java.lang.String, primaryKey: atPulumiPulumiLib.outputMod.Input[java.lang.String], primaryKeyType: atPulumiPulumiLib.outputMod.Input[PrimaryKeyType], opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
}

