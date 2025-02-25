package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultTraditionalFolderOperations extends js.Object {
  def GetTraditionalFolderContents(Folder: scala.Double): ITraditionalFolderContents
}

object IVaultTraditionalFolderOperations {
  @scala.inline
  def apply(GetTraditionalFolderContents: scala.Double => ITraditionalFolderContents): IVaultTraditionalFolderOperations = {
    val __obj = js.Dynamic.literal(GetTraditionalFolderContents = js.Any.fromFunction1(GetTraditionalFolderContents))
  
    __obj.asInstanceOf[IVaultTraditionalFolderOperations]
  }
}

