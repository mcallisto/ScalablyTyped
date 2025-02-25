package typings
package minecraftDashScriptingDashTypesDashSharedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponent[T] extends js.Object {
  /**
    * The identifier of the component, e.g., "minecraft:position", or "minecraft:nameable"
    */
  val __identifier__ : java.lang.String
  /**
    * The type of the object
    */
  val __type__ : minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.component
  var data: T
}

object IComponent {
  @scala.inline
  def apply[T](
    __identifier__ : java.lang.String,
    __type__ : minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.component,
    data: T
  ): IComponent[T] = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__, __type__ = __type__, data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IComponent[T]]
  }
}

