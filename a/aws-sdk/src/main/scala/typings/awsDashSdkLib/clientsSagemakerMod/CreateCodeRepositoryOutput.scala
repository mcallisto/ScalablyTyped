package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCodeRepositoryOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new repository.
    */
  var CodeRepositoryArn: awsDashSdkLib.clientsSagemakerMod.CodeRepositoryArn
}

object CreateCodeRepositoryOutput {
  @scala.inline
  def apply(CodeRepositoryArn: CodeRepositoryArn): CreateCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn)
  
    __obj.asInstanceOf[CreateCodeRepositoryOutput]
  }
}

