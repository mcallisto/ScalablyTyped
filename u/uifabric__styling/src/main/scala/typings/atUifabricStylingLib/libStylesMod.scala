package typings
package atUifabricStylingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles", JSImport.Namespace)
@js.native
object libStylesMod extends js.Object {
  val AnimationStyles: atUifabricStylingLib.libInterfacesIAnimationStylesMod.IAnimationStyles = js.native
  val AnimationVariables: atUifabricStylingLib.libInterfacesIAnimationStylesMod.IAnimationVariables = js.native
  val DefaultFontStyles: atUifabricStylingLib.libInterfacesIFontStylesMod.IFontStyles = js.native
  val DefaultPalette: atUifabricStylingLib.libInterfacesIPaletteMod.IPalette = js.native
  val HighContrastSelector: atUifabricStylingLib.atUifabricStylingLibStrings.`@media screen and (-ms-high-contrast: active)` = js.native
  val HighContrastSelectorBlack: atUifabricStylingLib.atUifabricStylingLibStrings.`@media screen and (-ms-high-contrast: white-on-black)` = js.native
  val HighContrastSelectorWhite: atUifabricStylingLib.atUifabricStylingLibStrings.`@media screen and (-ms-high-contrast: black-on-white)` = js.native
  val ScreenWidthMaxLarge: scala.Double = js.native
  val ScreenWidthMaxMedium: scala.Double = js.native
  val ScreenWidthMaxSmall: scala.Double = js.native
  val ScreenWidthMaxXLarge: scala.Double = js.native
  val ScreenWidthMaxXXLarge: scala.Double = js.native
  val ScreenWidthMinLarge: atUifabricStylingLib.atUifabricStylingLibNumbers.`640` = js.native
  val ScreenWidthMinMedium: atUifabricStylingLib.atUifabricStylingLibNumbers.`480` = js.native
  val ScreenWidthMinSmall: atUifabricStylingLib.atUifabricStylingLibNumbers.`320` = js.native
  val ScreenWidthMinUhfMobile: atUifabricStylingLib.atUifabricStylingLibNumbers.`768` = js.native
  val ScreenWidthMinXLarge: atUifabricStylingLib.atUifabricStylingLibNumbers.`1024` = js.native
  val ScreenWidthMinXXLarge: atUifabricStylingLib.atUifabricStylingLibNumbers.`1366` = js.native
  val ScreenWidthMinXXXLarge: atUifabricStylingLib.atUifabricStylingLibNumbers.`1920` = js.native
  val ThemeSettingName: atUifabricStylingLib.atUifabricStylingLibStrings.theme = js.native
  val hiddenContentStyle: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  val noWrap: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  val normalize: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def createFontStyles(): atUifabricStylingLib.libInterfacesIFontStylesMod.IFontStyles = js.native
  def createFontStyles(localeCode: java.lang.String): atUifabricStylingLib.libInterfacesIFontStylesMod.IFontStyles = js.native
  def createTheme(theme: atUifabricStylingLib.libInterfacesIThemeMod.IPartialTheme): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def createTheme(theme: atUifabricStylingLib.libInterfacesIThemeMod.IPartialTheme, depComments: scala.Boolean): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def focusClear(): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFadedOverflowStyle(theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFadedOverflowStyle(theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme, color: java.lang.String): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal,
    width: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal,
    width: java.lang.String,
    height: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal,
    width: java.lang.String,
    height: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal,
    width: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal,
    width: scala.Double,
    height: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.horizontal,
    width: scala.Double,
    height: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical,
    width: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical,
    width: java.lang.String,
    height: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical,
    width: java.lang.String,
    height: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical,
    width: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical,
    width: scala.Double,
    height: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    color: java.lang.String,
    direction: atUifabricStylingLib.atUifabricStylingLibStrings.vertical,
    width: scala.Double,
    height: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFocusOutlineStyle(theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFocusOutlineStyle(theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme, inset: scala.Double): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFocusOutlineStyle(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    inset: scala.Double,
    width: scala.Double
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFocusOutlineStyle(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    inset: scala.Double,
    width: scala.Double,
    color: java.lang.String
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFocusStyle(theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getFocusStyle(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    options: atUifabricStylingLib.libInterfacesIGetFocusStylesMod.IGetFocusStylesOptions
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFocusStyle")
  def getFocusStyle_absolute(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    inset: js.UndefOr[scala.Double],
    position: js.UndefOr[atUifabricStylingLib.atUifabricStylingLibStrings.absolute],
    highContrastStyle: js.UndefOr[atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle],
    borderColor: js.UndefOr[java.lang.String],
    outlineColor: js.UndefOr[java.lang.String],
    isFocusedOnly: js.UndefOr[scala.Boolean]
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  @JSName("getFocusStyle")
  def getFocusStyle_relative(
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    inset: js.UndefOr[scala.Double],
    position: js.UndefOr[atUifabricStylingLib.atUifabricStylingLibStrings.relative],
    highContrastStyle: js.UndefOr[atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle],
    borderColor: js.UndefOr[java.lang.String],
    outlineColor: js.UndefOr[java.lang.String],
    isFocusedOnly: js.UndefOr[scala.Boolean]
  ): atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = js.native
  def getGlobalClassNames[T](
    classNames: atUifabricStylingLib.libStylesGetGlobalClassNamesMod.GlobalClassNames[T],
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme
  ): stdLib.Partial[atUifabricStylingLib.libStylesGetGlobalClassNamesMod.GlobalClassNames[T]] = js.native
  def getGlobalClassNames[T](
    classNames: atUifabricStylingLib.libStylesGetGlobalClassNamesMod.GlobalClassNames[T],
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme,
    disableGlobalClassNames: scala.Boolean
  ): stdLib.Partial[atUifabricStylingLib.libStylesGetGlobalClassNamesMod.GlobalClassNames[T]] = js.native
  def getPlaceholderStyles(styles: atUifabricMergeDashStylesLib.libIStyleMod.IStyle): atUifabricMergeDashStylesLib.libIStyleMod.IStyle = js.native
  def getScreenSelector(min: scala.Double, max: scala.Double): java.lang.String = js.native
  def getTheme(): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def getTheme(depComments: scala.Boolean): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def getThemedContext(context: atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod.ICustomizerContext): atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod.ICustomizerContext = js.native
  def getThemedContext(
    context: atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod.ICustomizerContext,
    scheme: atUifabricStylingLib.libInterfacesIThemeMod.ISchemeNames
  ): atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod.ICustomizerContext = js.native
  def getThemedContext(
    context: atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod.ICustomizerContext,
    scheme: atUifabricStylingLib.libInterfacesIThemeMod.ISchemeNames,
    theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme
  ): atUifabricUtilitiesLib.libCustomizationsCustomizerContextMod.ICustomizerContext = js.native
  def loadTheme(theme: atUifabricStylingLib.libInterfacesIThemeMod.IPartialTheme): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def loadTheme(theme: atUifabricStylingLib.libInterfacesIThemeMod.IPartialTheme, depComments: scala.Boolean): atUifabricStylingLib.libInterfacesIThemeMod.ITheme = js.native
  def registerDefaultFontFaces(baseUrl: java.lang.String): scala.Unit = js.native
  def registerOnThemeChangeCallback(callback: js.Function1[/* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, scala.Unit]): scala.Unit = js.native
  def removeOnThemeChangeCallback(callback: js.Function1[/* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, scala.Unit]): scala.Unit = js.native
  @JSName("FontSizes")
  @js.native
  object FontSizesNs extends js.Object {
    val icon: java.lang.String = js.native
    val large: java.lang.String = js.native
    val medium: java.lang.String = js.native
    val mediumPlus: java.lang.String = js.native
    val mega: java.lang.String = js.native
    val mini: java.lang.String = js.native
    val small: java.lang.String = js.native
    val smallPlus: java.lang.String = js.native
    val superLarge: java.lang.String = js.native
    val xLarge: java.lang.String = js.native
    val xLargePlus: java.lang.String = js.native
    val xSmall: java.lang.String = js.native
    val xxLarge: java.lang.String = js.native
    val xxLargePlus: java.lang.String = js.native
  }
  
  @JSName("FontWeights")
  @js.native
  object FontWeightsNs extends js.Object {
    val bold: atUifabricMergeDashStylesLib.libIRawStyleBaseMod.IFontWeight = js.native
    val light: atUifabricMergeDashStylesLib.libIRawStyleBaseMod.IFontWeight = js.native
    val regular: atUifabricMergeDashStylesLib.libIRawStyleBaseMod.IFontWeight = js.native
    val semibold: atUifabricMergeDashStylesLib.libIRawStyleBaseMod.IFontWeight = js.native
    val semilight: atUifabricMergeDashStylesLib.libIRawStyleBaseMod.IFontWeight = js.native
  }
  
  @JSName("IconFontSizes")
  @js.native
  object IconFontSizesNs extends js.Object {
    val large: java.lang.String = js.native
    val medium: java.lang.String = js.native
    val small: java.lang.String = js.native
    val xSmall: java.lang.String = js.native
  }
  
  @js.native
  object PulsingBeaconAnimationStyles extends js.Object {
    var continuousPulseAnimationDouble: js.Function5[
        /* beaconColorOne */ java.lang.String, 
        /* beaconColorTwo */ java.lang.String, 
        /* innerDimension */ java.lang.String, 
        /* outerDimension */ java.lang.String, 
        /* borderWidth */ java.lang.String, 
        java.lang.String
      ] = js.native
    var continuousPulseAnimationSingle: js.Function5[
        /* beaconColorOne */ java.lang.String, 
        /* beaconColorTwo */ java.lang.String, 
        /* innerDimension */ java.lang.String, 
        /* outerDimension */ java.lang.String, 
        /* borderWidth */ java.lang.String, 
        java.lang.String
      ] = js.native
    var createDefaultAnimation: js.Function2[
        /* animationName */ java.lang.String, 
        /* delayLength */ js.UndefOr[java.lang.String], 
        atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle
      ] = js.native
  }
  
  @JSName("ZIndexes")
  @js.native
  object ZIndexesNs extends js.Object {
    val Coachmark: scala.Double = js.native
    val FocusStyle: scala.Double = js.native
    val KeytipLayer: scala.Double = js.native
    val Layer: scala.Double = js.native
    val Nav: scala.Double = js.native
    /**
      * @deprecated ScrollablePane
      */
    val ScrollablePane: scala.Double = js.native
  }
  
}

