package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stderr extends js.Object {
  var stderr: java.lang.String
  var stdout: java.lang.String
}

object Anon_Stderr {
  @scala.inline
  def apply(stderr: java.lang.String, stdout: java.lang.String): Anon_Stderr = {
    val __obj = js.Dynamic.literal(stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[Anon_Stderr]
  }
}

