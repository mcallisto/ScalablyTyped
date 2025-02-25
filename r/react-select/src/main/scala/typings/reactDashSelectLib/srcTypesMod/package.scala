package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcTypesMod {
  type ClassNameList = js.Array[java.lang.String]
  type ClassNamesState = js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]
  type FocusEventHandler = js.Function1[/* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLElement], scala.Unit]
  type GroupedOptionsType[UnionOptionType] = js.Array[GroupType[UnionOptionType]]
  type InnerRef = reactLib.reactMod.Ref[js.Any]
  type KeyboardEventHandler = js.Function1[/* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement], scala.Unit]
  type MouseEventHandler = js.Function1[
    /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
    scala.Unit
  ]
  type OptionProps = PropsWithInnerRef with reactDashSelectLib.Anon_Data
  type OptionsType[OptionType] = js.Array[OptionType]
  type ValueType[OptionType] = js.UndefOr[OptionType | OptionsType[OptionType] | scala.Null]
}
