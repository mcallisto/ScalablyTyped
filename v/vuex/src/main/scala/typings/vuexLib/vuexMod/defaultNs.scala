package typings
package vuexLib.vuexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class Store[S] protected ()
    extends vuexLib.vuexMod.Store[S] {
    def this(options: vuexLib.vuexMod.StoreOptions[/* import warning: RewrittenClass.unapply cls $anonfun was tparam S */ _]) = this()
  }
  
}

