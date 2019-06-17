package typings
package appDashBuilderDashLibLib.outPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildResult extends js.Object {
  val artifactPaths: js.Array[java.lang.String]
  val configuration: appDashBuilderDashLibLib.outConfigurationMod.Configuration
  val outDir: java.lang.String
  val platformToTargets: stdLib.Map[
    appDashBuilderDashLibLib.outMod.Platform, 
    stdLib.Map[java.lang.String, appDashBuilderDashLibLib.outMod.Target]
  ]
}

object BuildResult {
  @scala.inline
  def apply(
    artifactPaths: js.Array[java.lang.String],
    configuration: appDashBuilderDashLibLib.outConfigurationMod.Configuration,
    outDir: java.lang.String,
    platformToTargets: stdLib.Map[
      appDashBuilderDashLibLib.outMod.Platform, 
      stdLib.Map[java.lang.String, appDashBuilderDashLibLib.outMod.Target]
    ]
  ): BuildResult = {
    val __obj = js.Dynamic.literal(artifactPaths = artifactPaths, configuration = configuration, outDir = outDir, platformToTargets = platformToTargets)
  
    __obj.asInstanceOf[BuildResult]
  }
}

