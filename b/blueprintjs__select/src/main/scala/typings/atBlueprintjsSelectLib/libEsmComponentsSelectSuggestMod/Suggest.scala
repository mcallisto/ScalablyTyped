package typings
package atBlueprintjsSelectLib.libEsmComponentsSelectSuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/components/select/suggest", "Suggest")
@js.native
class Suggest[T] ()
  extends reactLib.reactMod.PureComponent[ISuggestProps[T], ISuggestState[T], js.Any] {
  var TypedQueryList: js.Any = js.native
  var getTargetKeyDownHandler: js.Any = js.native
  var getTargetKeyUpHandler: js.Any = js.native
  var handleInputFocus: js.Any = js.native
  var handleItemSelect: js.Any = js.native
  var handlePopoverInteraction: js.Any = js.native
  var handlePopoverOpened: js.Any = js.native
  var handlePopoverOpening: js.Any = js.native
  var input: js.Any = js.native
  var queryList: js.Any = js.native
  var refHandlers: js.Any = js.native
  var renderQueryList: js.Any = js.native
  var selectText: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSuggest(_prevProps: ISuggestProps[T], prevState: ISuggestState[T]): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSuggest(nextProps: ISuggestProps[T]): scala.Unit = js.native
  /* private */ def getInitialSelectedItem(): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/select/lib/esm/components/select/suggest", "Suggest")
@js.native
object Suggest extends js.Object {
  var defaultProps: stdLib.Partial[atBlueprintjsSelectLib.libEsmComponentsSelectSuggestMod.ISuggestProps[_]] = js.native
  var displayName: java.lang.String = js.native
  def ofType[T](): org.scalablytyped.runtime.Instantiable1[
    /* props */ atBlueprintjsSelectLib.libEsmComponentsSelectSuggestMod.ISuggestProps[T], 
    atBlueprintjsSelectLib.libEsmComponentsSelectSuggestMod.Suggest[T]
  ] = js.native
}

