package typings
package resourcejsLib.resourcejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resourcejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    app: expressLib.expressMod.Application,
    route: java.lang.String,
    modelName: java.lang.String,
    model: mongooseLib.mongooseMod.Model[mongooseLib.mongooseMod.Document, js.Object]
  ): ResourceEndpoint = js.native
}

