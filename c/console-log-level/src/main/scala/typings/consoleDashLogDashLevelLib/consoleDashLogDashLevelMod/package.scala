package typings
package consoleDashLogDashLevelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object consoleDashLogDashLevelMod {
  type Logger = stdLib.Record[LogLevelNames, js.Function1[/* repeated */ js.Any, scala.Unit]]
  type PrefixFunction = js.Function1[/* level */ java.lang.String, java.lang.String]
}
