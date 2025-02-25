package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformStatic extends js.Object {
  var Version: scala.Double | java.lang.String
  var isTV: scala.Boolean
  /**
    * @see https://facebook.github.io/react-native/docs/platform-specific-code.html#content
    */
  @JSName("select")
  def select_default[T](
    specifics: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ reactDashNativeLib.reactDashNativeLibStrings.PlatformStatic with js.Any
  ): T
}

object PlatformStatic {
  @scala.inline
  def apply(
    Version: scala.Double | java.lang.String,
    isTV: scala.Boolean,
    select_default: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ reactDashNativeLib.reactDashNativeLibStrings.PlatformStatic with js.Any => js.Any
  ): PlatformStatic = {
    val __obj = js.Dynamic.literal(Version = Version.asInstanceOf[js.Any], isTV = isTV)
    __obj.updateDynamic("select")(js.Any.fromFunction1(select_default))
    __obj.asInstanceOf[PlatformStatic]
  }
}

