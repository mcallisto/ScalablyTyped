package typings
package ts3DashNodejsDashLibraryLib.propertyClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClientType extends js.Object

@JSImport("ts3-nodejs-library/property/Client", "ClientType")
@js.native
object ClientType extends js.Object {
  @js.native
  sealed trait CLIENT
    extends ts3DashNodejsDashLibraryLib.propertyClientMod.ClientType
  
  @js.native
  sealed trait QUERY
    extends ts3DashNodejsDashLibraryLib.propertyClientMod.ClientType
  
}

