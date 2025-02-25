package typings
package reactDashSmoothDashScrollbarLib.reactDashSmoothDashScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof smooth-scrollbar.smooth-scrollbar/interfaces/scrollbar.ScrollbarOptions ]:? smooth-scrollbar.smooth-scrollbar/interfaces/scrollbar.ScrollbarOptions[P]} */ trait ScrollbarProps extends js.Object {
  /**
    * Keep scrollbar tracks visible whether it's scrolling or not
    * @default false
    */
  var alwaysShowTracks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional class name
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Pipe to scrollbar.addListener()
    */
  var onScroll: js.UndefOr[
    js.Function2[
      /* status */ smoothDashScrollbarLib.interfacesScrollbarMod.ScrollStatus, 
      /* scrollbarInstance */ smoothDashScrollbarLib.smoothDashScrollbarMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Optional style
    */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ScrollbarProps {
  @scala.inline
  def apply(
    alwaysShowTracks: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    onScroll: (/* status */ smoothDashScrollbarLib.interfacesScrollbarMod.ScrollStatus, /* scrollbarInstance */ smoothDashScrollbarLib.smoothDashScrollbarMod.default) => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null
  ): ScrollbarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowTracks)) __obj.updateDynamic("alwaysShowTracks")(alwaysShowTracks)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction2(onScroll))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ScrollbarProps]
  }
}

