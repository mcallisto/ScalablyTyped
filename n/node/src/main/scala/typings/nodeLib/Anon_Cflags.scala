package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cflags extends js.Object {
  var cflags: js.Array[_]
  var default_configuration: java.lang.String
  var defines: js.Array[java.lang.String]
  var include_dirs: js.Array[java.lang.String]
  var libraries: js.Array[java.lang.String]
}

object Anon_Cflags {
  @scala.inline
  def apply(
    cflags: js.Array[_],
    default_configuration: java.lang.String,
    defines: js.Array[java.lang.String],
    include_dirs: js.Array[java.lang.String],
    libraries: js.Array[java.lang.String]
  ): Anon_Cflags = {
    val __obj = js.Dynamic.literal(cflags = cflags, default_configuration = default_configuration, defines = defines, include_dirs = include_dirs, libraries = libraries)
  
    __obj.asInstanceOf[Anon_Cflags]
  }
}

