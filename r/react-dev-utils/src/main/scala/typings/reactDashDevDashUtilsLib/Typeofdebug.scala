package typings
package reactDashDevDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdebug extends js.Object {
  /**
    * Generate Chrome profile file which includes timings of plugins execution. Outputs `events.json` file by
    * default. It is possible to provide custom file path using `outputPath` option.
    *
    * In order to view the profile file:
    * * Run webpack with ProfilingPlugin.
    * * Go to Chrome, open the Profile Tab.
    * * Drag and drop generated file (events.json by default) into the profiler.
    *
    * It will then display timeline stats and calls per plugin!
    */
  var ProfilingPlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.debugNs.ProfilingPlugin]
}

object Typeofdebug {
  @scala.inline
  def apply(
    ProfilingPlugin: org.scalablytyped.runtime.Instantiable0[webpackLib.webpackMod.debugNs.ProfilingPlugin]
  ): Typeofdebug = {
    val __obj = js.Dynamic.literal(ProfilingPlugin = ProfilingPlugin)
  
    __obj.asInstanceOf[Typeofdebug]
  }
}

