package typings
package atPulumiAwsLib.codebuildWebhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookArgs extends js.Object {
  /**
    * A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filter_group` over `branch_filter`.
    */
  val branchFilter: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Information about the webhook's trigger. Filter group blocks are documented below.
    */
  val filterGroups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FiltersAnonExcludeMatchedPatternPattern]
      ]
    ]
  ] = js.undefined
  /**
    * The name of the build project.
    */
  val projectName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object WebhookArgs {
  @scala.inline
  def apply(
    projectName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    branchFilter: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    filterGroups: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FiltersAnonExcludeMatchedPatternPattern]
      ]
    ] = null
  ): WebhookArgs = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    if (branchFilter != null) __obj.updateDynamic("branchFilter")(branchFilter.asInstanceOf[js.Any])
    if (filterGroups != null) __obj.updateDynamic("filterGroups")(filterGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookArgs]
  }
}

