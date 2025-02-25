package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassSansProvider extends InjectableProvider {
  /**
    * Class to instantiate for the `token`.
    */
  var useClass: Type[_]
}

object ClassSansProvider {
  @scala.inline
  def apply(useClass: Type[_]): ClassSansProvider = {
    val __obj = js.Dynamic.literal(useClass = useClass)
  
    __obj.asInstanceOf[ClassSansProvider]
  }
}

