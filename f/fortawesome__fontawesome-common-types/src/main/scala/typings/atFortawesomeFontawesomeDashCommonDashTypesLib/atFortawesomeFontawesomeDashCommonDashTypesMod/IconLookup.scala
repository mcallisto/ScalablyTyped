package typings
package atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconLookup extends js.Object {
  // IconName is defined in the code that will be generated at build time and bundled with this file.
  var iconName: IconName
  var prefix: IconPrefix
}

object IconLookup {
  @scala.inline
  def apply(iconName: IconName, prefix: IconPrefix): IconLookup = {
    val __obj = js.Dynamic.literal(iconName = iconName, prefix = prefix)
  
    __obj.asInstanceOf[IconLookup]
  }
}

