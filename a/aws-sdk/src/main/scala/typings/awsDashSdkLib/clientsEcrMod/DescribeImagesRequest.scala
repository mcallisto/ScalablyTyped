package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImagesRequest extends js.Object {
  /**
    * The filter key and value with which to filter your DescribeImages results.
    */
  var filter: js.UndefOr[DescribeImagesFilter] = js.undefined
  /**
    * The list of image IDs for the requested repository.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.undefined
  /**
    * The maximum number of repository results returned by DescribeImages in paginated output. When this parameter is used, DescribeImages only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeImages request with the returned nextToken value. This value can be between 1 and 1000. If this parameter is not used, then DescribeImages returns up to 100 results and a nextToken value, if applicable. This option cannot be used when you specify images with imageIds.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The nextToken value returned from a previous paginated DescribeImages request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return. This option cannot be used when you specify images with imageIds.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The AWS account ID associated with the registry that contains the repository in which to describe images. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  /**
    * A list of repositories to describe.
    */
  var repositoryName: RepositoryName
}

object DescribeImagesRequest {
  @scala.inline
  def apply(
    repositoryName: RepositoryName,
    filter: DescribeImagesFilter = null,
    imageIds: ImageIdentifierList = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    registryId: RegistryId = null
  ): DescribeImagesRequest = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (imageIds != null) __obj.updateDynamic("imageIds")(imageIds)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (registryId != null) __obj.updateDynamic("registryId")(registryId)
    __obj.asInstanceOf[DescribeImagesRequest]
  }
}

