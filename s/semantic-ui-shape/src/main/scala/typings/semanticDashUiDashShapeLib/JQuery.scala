package typings
package semanticDashUiDashShapeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("shape")
  var shape_Original: semanticDashUiDashShapeLib.SemanticUINs.Shape = js.native
  def shape(): JQuery = js.native
  def shape(settings: semanticDashUiDashShapeLib.SemanticUINs.ShapeSettings): JQuery = js.native
  @JSName("shape")
  def shape_destroy(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.destroy): JQuery = js.native
  /**
    * Flips the shape over counter-clockwise
    */
  @JSName("shape")
  def shape_flipback(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`flip back`): JQuery = js.native
  /**
    * Flips the shape downward
    */
  @JSName("shape")
  def shape_flipdown(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`flip down`): JQuery = js.native
  /**
    * Flips the shape left
    */
  @JSName("shape")
  def shape_flipleft(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`flip left`): JQuery = js.native
  /**
    * Flips the shape over clock-wise
    */
  @JSName("shape")
  def shape_flipover(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`flip over`): JQuery = js.native
  /**
    * Flips the shape right
    */
  @JSName("shape")
  def shape_flipright(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`flip right`): JQuery = js.native
  /**
    * Flips the shape upward
    */
  @JSName("shape")
  def shape_flipup(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`flip up`): JQuery = js.native
  /**
    * Returns translation for next side staged below
    */
  @JSName("shape")
  def shape_gettransformdown(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`get transform down`): semanticDashUiDashShapeLib.SemanticUINs.ShapeNs.Translation = js.native
  /**
    * Returns translation for next side staged left
    */
  @JSName("shape")
  def shape_gettransformleft(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`get transform left`): semanticDashUiDashShapeLib.SemanticUINs.ShapeNs.Translation = js.native
  /**
    * Returns translation for next side staged right
    */
  @JSName("shape")
  def shape_gettransformright(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`get transform right`): semanticDashUiDashShapeLib.SemanticUINs.ShapeNs.Translation = js.native
  /**
    * Returns translation for next side staged up
    */
  @JSName("shape")
  def shape_gettransformup(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`get transform up`): semanticDashUiDashShapeLib.SemanticUINs.ShapeNs.Translation = js.native
  /**
    * Returns whether shape is currently animating
    */
  @JSName("shape")
  def shape_isanimating(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`is animating`): scala.Boolean = js.native
  /**
    * Queues an animation until after current animation
    */
  @JSName("shape")
  def shape_queue(
    behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.queue,
    animation: java.lang.String
  ): JQuery = js.native
  /**
    * Refreshes the selector cache for element sides
    */
  @JSName("shape")
  def shape_refresh(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.refresh): JQuery = js.native
  /**
    * Forces a reflow on element
    */
  @JSName("shape")
  def shape_repaint(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.repaint): JQuery = js.native
  /**
    * Removes all inline styles
    */
  @JSName("shape")
  def shape_reset(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.reset): JQuery = js.native
  /**
    * Set the next side to next sibling to active element
    */
  @JSName("shape")
  def shape_setdefaultside(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`set default side`): JQuery = js.native
  /**
    * Set the next side to a specific selector
    */
  @JSName("shape")
  def shape_setnextside(
    behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`set next side`,
    selector: java.lang.String
  ): JQuery = js.native
  @JSName("shape")
  def shape_setnextside(
    behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`set next side`,
    selector: JQuery
  ): JQuery = js.native
  /**
    * Sets shape to the content size of the next side
    */
  @JSName("shape")
  def shape_setstagesize(behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.`set stage size`): JQuery = js.native
  @JSName("shape")
  def shape_setting(
    behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.setting,
    value: semanticDashUiDashShapeLib.SemanticUINs.ShapeSettings
  ): JQuery = js.native
  @JSName("shape")
  def shape_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-shape.SemanticUI.ShapeSettings._Impl[K] */ js.Any = js.native
  @JSName("shape")
  def shape_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashShapeLib.semanticDashUiDashShapeLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-shape.SemanticUI.ShapeSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

