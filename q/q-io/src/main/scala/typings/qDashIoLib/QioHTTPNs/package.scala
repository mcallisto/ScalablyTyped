package typings
package qDashIoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QioHTTPNs {
  type Application = js.Function1[/* req */ Request, qLib.qMod.Promise[js.Any]]
  type Body = qDashIoLib.QioNs.Stream
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
}
