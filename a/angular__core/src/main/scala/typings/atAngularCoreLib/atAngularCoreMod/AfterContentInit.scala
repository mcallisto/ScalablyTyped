package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterContentInit extends js.Object {
  /**
    * A callback method that is invoked immediately after
    * Angular has completed initialization of all of the directive's
    * content.
    * It is invoked only once when the directive is instantiated.
    */
  def ngAfterContentInit(): scala.Unit
}

object AfterContentInit {
  @scala.inline
  def apply(ngAfterContentInit: () => scala.Unit): AfterContentInit = {
    val __obj = js.Dynamic.literal(ngAfterContentInit = js.Any.fromFunction0(ngAfterContentInit))
  
    __obj.asInstanceOf[AfterContentInit]
  }
}

