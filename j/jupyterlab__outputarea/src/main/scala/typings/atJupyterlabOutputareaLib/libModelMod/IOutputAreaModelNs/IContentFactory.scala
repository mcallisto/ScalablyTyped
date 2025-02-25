package typings
package atJupyterlabOutputareaLib.libModelMod.IOutputAreaModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for an output content factory.
  */
trait IContentFactory extends js.Object {
  /**
    * Create an output model.
    */
  def createOutputModel(options: atJupyterlabRendermimeLib.libOutputmodelMod.IOutputModelNs.IOptions): atJupyterlabRendermimeLib.libOutputmodelMod.IOutputModel
}

object IContentFactory {
  @scala.inline
  def apply(
    createOutputModel: atJupyterlabRendermimeLib.libOutputmodelMod.IOutputModelNs.IOptions => atJupyterlabRendermimeLib.libOutputmodelMod.IOutputModel
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createOutputModel = js.Any.fromFunction1(createOutputModel))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

