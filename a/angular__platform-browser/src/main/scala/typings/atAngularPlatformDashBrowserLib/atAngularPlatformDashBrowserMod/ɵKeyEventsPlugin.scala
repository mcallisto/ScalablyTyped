package typings
package atAngularPlatformDashBrowserLib.atAngularPlatformDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "ɵKeyEventsPlugin")
@js.native
class ɵKeyEventsPlugin protected () extends ɵangular_packages_platform_browser_platform_browser_g {
  /**
    * Initializes an instance of the browser plug-in.
    * @param doc The document in which key events will be detected.
    */
  def this(doc: js.Any) = this()
}

/* static members */
@JSImport("@angular/platform-browser", "ɵKeyEventsPlugin")
@js.native
object ɵKeyEventsPlugin extends js.Object {
  /**
    * Configures a handler callback for a key event.
    * @param fullKey The event name that combines all simultaneous keystrokes.
    * @param handler The function that responds to the key event.
    * @param zone The zone in which the event occurred.
    * @returns A callback function.
    */
  def eventCallback(fullKey: js.Any, handler: js.Function, zone: atAngularCoreLib.atAngularCoreMod.NgZone): js.Function = js.native
  def getEventFullKey(event: stdLib.KeyboardEvent): java.lang.String = js.native
  def parseEventName(eventName: java.lang.String): org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null = js.native
}

