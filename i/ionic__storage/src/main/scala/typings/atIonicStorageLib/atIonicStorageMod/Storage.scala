package typings
package atIonicStorageLib.atIonicStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/storage", "Storage")
@js.native
class Storage protected ()
  extends atIonicStorageLib.atIonicStorageStorageMod.Storage {
  /**
    * Create a new Storage instance using the order of drivers and any additional config
    * options to pass to LocalForage.
    *
    * Possible driver options are: ['sqlite', 'indexeddb', 'websql', 'localstorage'] and the
    * default is that exact ordering.
    */
  def this(config: atIonicStorageLib.atIonicStorageStorageMod.StorageConfig) = this()
}

