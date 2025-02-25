package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBottomTabScreenOptions extends NavigationTabScreenOptionsBase {
  var tabBarOnPress: js.UndefOr[
    js.Function1[/* options */ reactDashNavigationLib.Anon_DefaultHandler, scala.Unit]
  ] = js.undefined
}

object NavigationBottomTabScreenOptions {
  @scala.inline
  def apply(
    tabBarIcon: reactLib.reactMod.ReactElement | (js.Function1[
      /* options */ reactDashNavigationLib.Anon_FocusedHorizontal, 
      reactLib.reactMod.ReactElement | scala.Null
    ]) = null,
    tabBarLabel: java.lang.String | reactLib.reactMod.ReactElement | (js.Function1[
      /* options */ reactDashNavigationLib.Anon_Focused, 
      reactLib.reactMod.ReactElement | java.lang.String | scala.Null
    ]) = null,
    tabBarOnPress: /* options */ reactDashNavigationLib.Anon_DefaultHandler => scala.Unit = null,
    tabBarTestIDProps: reactDashNavigationLib.Anon_AccessibilityLabel = null,
    tabBarVisible: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): NavigationBottomTabScreenOptions = {
    val __obj = js.Dynamic.literal()
    if (tabBarIcon != null) __obj.updateDynamic("tabBarIcon")(tabBarIcon.asInstanceOf[js.Any])
    if (tabBarLabel != null) __obj.updateDynamic("tabBarLabel")(tabBarLabel.asInstanceOf[js.Any])
    if (tabBarOnPress != null) __obj.updateDynamic("tabBarOnPress")(js.Any.fromFunction1(tabBarOnPress))
    if (tabBarTestIDProps != null) __obj.updateDynamic("tabBarTestIDProps")(tabBarTestIDProps)
    if (!js.isUndefined(tabBarVisible)) __obj.updateDynamic("tabBarVisible")(tabBarVisible)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[NavigationBottomTabScreenOptions]
  }
}

