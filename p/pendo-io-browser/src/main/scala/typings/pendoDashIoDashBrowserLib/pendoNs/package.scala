package typings
package pendoDashIoDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pendoNs {
  type Account = pendoDashIoDashBrowserLib.Anon_IdString with Metadata
  type Events = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in 'ready' | 'guidesLoaded' | 'guidesFailed' ]: -? (callback : pendo-io-browser.pendo.EventCallbacks[K]): object}
    */ pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.Events with EventCallbacks
  type Metadata = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | scala.Double | scala.Boolean | stdLib.Date | (js.Array[scala.Double | java.lang.String])
  ]
  type Visitor = pendoDashIoDashBrowserLib.Anon_Id with Metadata
}
