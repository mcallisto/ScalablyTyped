package typings
package webpackDashBugsnagDashPluginsLib.webpackDashBugsnagDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildReporterBuild extends js.Object {
  /**
    * Your Bugsnag API key
    */
  var apiKey: java.lang.String
  /**
    * The version of the application you are building (this should match the
    * `appVersion` configured in your notifier)
    */
  var appVersion: java.lang.String
  /**
    * Automatically associate this build with any new error events and sessions
    * that are received for the releaseStage until a subsequent build
    * notification is received. If this is set to true and no `releaseStage`
    * is provided the build will be applied to 'production'. You should only use
    * this option if you aren’t able to set an `appVersion` in your notifier.
    */
  var autoAssignRelease: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the person/machine that created this build (defaults to the
    * result of the `whoami` command)
    */
  var builderName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 'production', 'staging' etc. (leave blank if this build can be released to
    * different releaseStages)
    */
  var releaseStage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object describing the source control of the build (if not specified,
    * the module will attempt to detect source control information from .git, .
    * hg and the nearest package.json)
    */
  var sourceControl: js.UndefOr[webpackDashBugsnagDashPluginsLib.Anon_Bitbucket] = js.undefined
}

object BuildReporterBuild {
  @scala.inline
  def apply(
    apiKey: java.lang.String,
    appVersion: java.lang.String,
    autoAssignRelease: js.UndefOr[scala.Boolean] = js.undefined,
    builderName: java.lang.String = null,
    releaseStage: java.lang.String = null,
    sourceControl: webpackDashBugsnagDashPluginsLib.Anon_Bitbucket = null
  ): BuildReporterBuild = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, appVersion = appVersion)
    if (!js.isUndefined(autoAssignRelease)) __obj.updateDynamic("autoAssignRelease")(autoAssignRelease)
    if (builderName != null) __obj.updateDynamic("builderName")(builderName)
    if (releaseStage != null) __obj.updateDynamic("releaseStage")(releaseStage)
    if (sourceControl != null) __obj.updateDynamic("sourceControl")(sourceControl)
    __obj.asInstanceOf[BuildReporterBuild]
  }
}

