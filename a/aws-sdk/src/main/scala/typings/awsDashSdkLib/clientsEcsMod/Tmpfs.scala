package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tmpfs extends js.Object {
  /**
    * The absolute file path where the tmpfs volume is to be mounted.
    */
  var containerPath: String
  /**
    * The list of tmpfs volume mount options. Valid values: "defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol" 
    */
  var mountOptions: js.UndefOr[StringList] = js.undefined
  /**
    * The size (in MiB) of the tmpfs volume.
    */
  var size: Integer
}

object Tmpfs {
  @scala.inline
  def apply(containerPath: String, size: Integer, mountOptions: StringList = null): Tmpfs = {
    val __obj = js.Dynamic.literal(containerPath = containerPath, size = size)
    if (mountOptions != null) __obj.updateDynamic("mountOptions")(mountOptions)
    __obj.asInstanceOf[Tmpfs]
  }
}

