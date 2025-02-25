package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/Cache", JSImport.Namespace)
@js.native
object srcLoadersCacheMod extends js.Object {
  @JSName("Cache")
  @js.native
  object CacheNs extends js.Object {
    var enabled: scala.Boolean = js.native
    var files: js.Any = js.native
    def add(key: java.lang.String, file: js.Any): scala.Unit = js.native
    def clear(): scala.Unit = js.native
    def get(key: java.lang.String): js.Any = js.native
    def remove(key: java.lang.String): scala.Unit = js.native
  }
  
}

