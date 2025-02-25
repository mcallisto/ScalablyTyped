package typings
package pgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofPg extends js.Object {
  var Client: org.scalablytyped.runtime.Instantiable1[js.UndefOr[java.lang.String | pgLib.pgMod.ClientConfig], pgLib.pgMod.Client]
  var ClientBase: org.scalablytyped.runtime.Instantiable1[js.UndefOr[java.lang.String | pgLib.pgMod.ClientConfig], pgLib.pgMod.ClientBase]
  var Connection: org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* config */ pgLib.pgMod.ConnectionConfig], pgLib.pgMod.Connection]
  var Events: org.scalablytyped.runtime.Instantiable0[pgLib.pgMod.Events]
  var Pool: org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* config */ pgLib.pgMod.PoolConfig], pgLib.pgMod.Pool]
  var Query: org.scalablytyped.runtime.Instantiable2[
    js.UndefOr[java.lang.String | pgLib.pgMod.QueryConfig], 
    js.UndefOr[/* values */ js.Array[js.Any]], 
    pgLib.pgMod.Query
  ]
  val defaults: pgLib.pgMod.Defaults with pgLib.pgMod.ClientConfig
  val native: (/* import warning: ImportType.apply Failed type conversion: typeof Pg */ js.Any) | scala.Null
}

object TypeofPg {
  @scala.inline
  def apply(
    Client: org.scalablytyped.runtime.Instantiable1[js.UndefOr[java.lang.String | pgLib.pgMod.ClientConfig], pgLib.pgMod.Client],
    ClientBase: org.scalablytyped.runtime.Instantiable1[js.UndefOr[java.lang.String | pgLib.pgMod.ClientConfig], pgLib.pgMod.ClientBase],
    Connection: org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* config */ pgLib.pgMod.ConnectionConfig], pgLib.pgMod.Connection],
    Events: org.scalablytyped.runtime.Instantiable0[pgLib.pgMod.Events],
    Pool: org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* config */ pgLib.pgMod.PoolConfig], pgLib.pgMod.Pool],
    Query: org.scalablytyped.runtime.Instantiable2[
      js.UndefOr[java.lang.String | pgLib.pgMod.QueryConfig], 
      js.UndefOr[/* values */ js.Array[js.Any]], 
      pgLib.pgMod.Query
    ],
    defaults: pgLib.pgMod.Defaults with pgLib.pgMod.ClientConfig,
    native: /* import warning: ImportType.apply Failed type conversion: typeof Pg */ js.Any = null
  ): TypeofPg = {
    val __obj = js.Dynamic.literal(Client = Client, ClientBase = ClientBase, Connection = Connection, Events = Events, Pool = Pool, Query = Query, defaults = defaults)
    if (native != null) __obj.updateDynamic("native")(native)
    __obj.asInstanceOf[TypeofPg]
  }
}

