package typings
package postcssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Postcss
  extends postcssLib.postcssMod._AcceptedPlugin {
  var postcss: postcssLib.postcssMod.TransformCallback | postcssLib.postcssMod.Processor
}

object Anon_Postcss {
  @scala.inline
  def apply(postcss: postcssLib.postcssMod.TransformCallback | postcssLib.postcssMod.Processor): Anon_Postcss = {
    val __obj = js.Dynamic.literal(postcss = postcss.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Postcss]
  }
}

