package typings
package atMaterialDashUiCoreLib.stylesWithStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSProperties
  extends csstypeLib.csstypeMod.Properties[scala.Double | java.lang.String]
     with // Allow pseudo selectors and media queries
/* k */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 494 */ js.Any
      ]
    ]

object CSSProperties {
  @scala.inline
  def apply(
    Properties: csstypeLib.csstypeMod.Properties[scala.Double | java.lang.String] = null,
    StringDictionary: // Allow pseudo selectors and media queries
  /* k */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 494 */ js.Any
      ]
    ] = null
  ): CSSProperties = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Properties)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CSSProperties]
  }
}

