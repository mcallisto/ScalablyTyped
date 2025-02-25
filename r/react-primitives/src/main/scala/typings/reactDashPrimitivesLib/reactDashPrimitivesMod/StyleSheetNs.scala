package typings
package reactDashPrimitivesLib.reactDashPrimitivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-primitives", "StyleSheet")
@js.native
object StyleSheetNs extends js.Object {
  val absoluteFill: reactDashNativeLib.reactDashNativeMod.RegisteredStyle[reactDashNativeLib.reactDashNativeMod.StyleSheetNs.AbsoluteFillStyle] = js.native
  val absoluteFillObject: reactDashNativeLib.reactDashNativeMod.StyleSheetNs.AbsoluteFillStyle = js.native
  val hairlineWidth: scala.Double = js.native
  def create[T /* <: reactDashNativeLib.reactDashNativeMod.StyleSheetNs.NamedStyles[_ | T] */](styles: T): T = js.native
  def create[T /* <: reactDashNativeLib.reactDashNativeMod.StyleSheetNs.NamedStyles[_ | T] */](styles: reactDashNativeLib.reactDashNativeMod.StyleSheetNs.NamedStyles[T]): T = js.native
  def flatten(): reactDashNativeLib.reactDashNativeMod.ImageStyle = js.native
  def flatten(
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ImageStyle]
  ): reactDashNativeLib.reactDashNativeMod.ImageStyle = js.native
  def flatten[T](style: reactDashNativeLib.reactDashNativeMod.RegisteredStyle[T]): T = js.native
  @JSName("flatten")
  def flatten_TT[T](): T = js.native
  @JSName("flatten")
  def flatten_TextStyle(): reactDashNativeLib.reactDashNativeMod.TextStyle = js.native
  @JSName("flatten")
  def flatten_TextStyle(
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ): reactDashNativeLib.reactDashNativeMod.TextStyle = js.native
  @JSName("flatten")
  def flatten_ViewStyle(): reactDashNativeLib.reactDashNativeMod.ViewStyle = js.native
  @JSName("flatten")
  def flatten_ViewStyle(
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ): reactDashNativeLib.reactDashNativeMod.ViewStyle = js.native
  def setStyleAttributePreprocessor(property: java.lang.String, process: js.Function1[/* nextProp */ js.Any, _]): scala.Unit = js.native
}

