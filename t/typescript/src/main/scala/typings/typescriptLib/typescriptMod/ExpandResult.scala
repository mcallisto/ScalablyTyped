package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandResult extends js.Object {
  var fileNames: js.Array[java.lang.String]
  var wildcardDirectories: MapLike[WatchDirectoryFlags]
}

object ExpandResult {
  @scala.inline
  def apply(fileNames: js.Array[java.lang.String], wildcardDirectories: MapLike[WatchDirectoryFlags]): ExpandResult = {
    val __obj = js.Dynamic.literal(fileNames = fileNames, wildcardDirectories = wildcardDirectories)
  
    __obj.asInstanceOf[ExpandResult]
  }
}

