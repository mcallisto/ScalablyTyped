package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRepositoryInput extends js.Object {
  /**
    * A comment or description about the new repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a web page could expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a web page. 
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
  /**
    * The name of the new repository to be created.  The repository name must be unique across the calling AWS account. In addition, repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. For a full description of the limits on repository names, see Limits in the AWS CodeCommit User Guide. The suffix ".git" is prohibited. 
    */
  var repositoryName: RepositoryName
  /**
    * One or more tag key-value pairs to use when tagging this repository.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}

object CreateRepositoryInput {
  @scala.inline
  def apply(
    repositoryName: RepositoryName,
    repositoryDescription: RepositoryDescription = null,
    tags: TagsMap = null
  ): CreateRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (repositoryDescription != null) __obj.updateDynamic("repositoryDescription")(repositoryDescription)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateRepositoryInput]
  }
}

