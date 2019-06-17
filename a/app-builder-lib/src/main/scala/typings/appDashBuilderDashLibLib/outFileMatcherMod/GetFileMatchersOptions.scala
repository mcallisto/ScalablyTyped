package typings
package appDashBuilderDashLibLib.outFileMatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileMatchersOptions extends js.Object {
  val customBuildOptions: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
  val defaultSrc: java.lang.String
  val globalOutDir: java.lang.String
  def macroExpander(pattern: java.lang.String): java.lang.String
}

object GetFileMatchersOptions {
  @scala.inline
  def apply(
    customBuildOptions: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions,
    defaultSrc: java.lang.String,
    globalOutDir: java.lang.String,
    macroExpander: java.lang.String => java.lang.String
  ): GetFileMatchersOptions = {
    val __obj = js.Dynamic.literal(customBuildOptions = customBuildOptions, defaultSrc = defaultSrc, globalOutDir = globalOutDir, macroExpander = js.Any.fromFunction1(macroExpander))
  
    __obj.asInstanceOf[GetFileMatchersOptions]
  }
}

