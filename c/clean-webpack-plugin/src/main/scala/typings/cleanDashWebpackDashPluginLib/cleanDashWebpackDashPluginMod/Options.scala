package typings
package cleanDashWebpackDashPluginLib.cleanDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Removes files after every build (including watch mode) that match this pattern.
    * Used for files that are not created directly by Webpack.
    *
    * Use !negative patterns to exclude files
    *
    * default: []
    */
  var cleanAfterEveryBuildPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Removes files once prior to Webpack compilation
    *   Not included in rebuilds (watch mode)
    *
    * Use !negative patterns to exclude files
    *
    * default: ['**\/ *']
    */
  var cleanOnceBeforeBuildPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Automatically remove all unused webpack assets on rebuild
    *
    * default: true
    */
  var cleanStaleWebpackAssets: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow clean patterns outside of process.cwd()
    *
    * requires dry option to be explicitly set
    *
    * default: false
    */
  var dangerouslyAllowCleanPatternsOutsideProject: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Simulate the removal of files
    *
    * default: false
    */
  var dry: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Do not allow removal of current webpack assets
    *
    * default: true
    */
  var protectWebpackAssets: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Write Logs to Console
    * (Always enabled when dry is true)
    *
    * default: false
    */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cleanAfterEveryBuildPatterns: js.Array[java.lang.String] = null,
    cleanOnceBeforeBuildPatterns: js.Array[java.lang.String] = null,
    cleanStaleWebpackAssets: js.UndefOr[scala.Boolean] = js.undefined,
    dangerouslyAllowCleanPatternsOutsideProject: js.UndefOr[scala.Boolean] = js.undefined,
    dry: js.UndefOr[scala.Boolean] = js.undefined,
    protectWebpackAssets: js.UndefOr[scala.Boolean] = js.undefined,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cleanAfterEveryBuildPatterns != null) __obj.updateDynamic("cleanAfterEveryBuildPatterns")(cleanAfterEveryBuildPatterns)
    if (cleanOnceBeforeBuildPatterns != null) __obj.updateDynamic("cleanOnceBeforeBuildPatterns")(cleanOnceBeforeBuildPatterns)
    if (!js.isUndefined(cleanStaleWebpackAssets)) __obj.updateDynamic("cleanStaleWebpackAssets")(cleanStaleWebpackAssets)
    if (!js.isUndefined(dangerouslyAllowCleanPatternsOutsideProject)) __obj.updateDynamic("dangerouslyAllowCleanPatternsOutsideProject")(dangerouslyAllowCleanPatternsOutsideProject)
    if (!js.isUndefined(dry)) __obj.updateDynamic("dry")(dry)
    if (!js.isUndefined(protectWebpackAssets)) __obj.updateDynamic("protectWebpackAssets")(protectWebpackAssets)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

