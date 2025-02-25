package typings
package typestyleLib.libInternalTypestyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typestyle/lib/internal/typestyle", "TypeStyle")
@js.native
class TypeStyle protected () extends js.Object {
  def this(hasAutoGenerateTag: typestyleLib.Anon_AutoGenerateTag) = this()
  var _autoGenerateTag: js.Any = js.native
  var _freeStyle: js.Any = js.native
  /**
    * We have a single stylesheet that we update as components register themselves
    */
  var _lastFreeStyleChangeId: js.Any = js.native
  var _pending: js.Any = js.native
  var _pendingRawChange: js.Any = js.native
  var _raw: js.Any = js.native
  var _tag: js.UndefOr[js.Any] = js.native
  /**
    * Only calls cb all sync operations settle
    */
  /* private */ def _afterAllSync(cb: js.Any): js.Any = js.native
  /* private */ def _getTag(): js.Any = js.native
  /** Checks if the style tag needs updating and if so queues up the change */
  /* private */ def _styleUpdated(): js.Any = js.native
  /**
    * Insert `raw` CSS as a string. This is useful for e.g.
    * - third party CSS that you are customizing with template strings
    * - generating raw CSS in JavaScript
    * - reset libraries like normalize.css that you can use without loaders
    */
  def cssRaw(mustBeValidCSS: java.lang.String): scala.Unit = js.native
  /**
    * Takes CSSProperties and registers it to a global selector (body, html, etc.)
    */
  def cssRule(selector: java.lang.String, objects: typestyleLib.libTypesMod.NestedCSSProperties*): scala.Unit = js.native
  /**
    * Utility function to register an @font-face
    */
  def fontFace(fontFace: typestyleLib.libTypesMod.FontFace*): scala.Unit = js.native
  /**
    * Renders styles to the singleton tag imediately
    * NOTE: You should only call it on initial render to prevent any non CSS flash.
    * After that it is kept sync using `requestAnimationFrame` and we haven't noticed any bad flashes.
    **/
  def forceRenderStyles(): scala.Unit = js.native
  /**
    * Allows use to use the stylesheet in a node.js environment
    */
  def getStyles(): java.lang.String = js.native
  /**
    * Takes keyframes and returns a generated animationName
    */
  def keyframes(frames: typestyleLib.libTypesMod.KeyFrames): java.lang.String = js.native
  /**
    * Helps with testing. Reinitializes FreeStyle + raw
    */
  def reinit(): scala.Unit = js.native
  /** Sets the target tag where we write the css on style updates */
  def setStylesTarget(tag: StylesTarget): scala.Unit = js.native
  /**
    * Takes CSSProperties and return a generated className you can use on your component
    */
  def style(objects: js.UndefOr[typestyleLib.libTypesMod.NestedCSSProperties]*): java.lang.String = js.native
  @JSName("style")
  def style_false(
    objects: (js.UndefOr[
      typestyleLib.libTypesMod.NestedCSSProperties | scala.Null | typestyleLib.typestyleLibNumbers.`false`
    ])*
  ): java.lang.String = js.native
  /**
    * Takes an object where property names are ideal class names and property values are CSSProperties, and
    * returns an object where property names are the same ideal class names and the property values are
    * the actual generated class names using the ideal class name as the $debugName
    */
  def stylesheet[Names /* <: java.lang.String */](classes: stdLib.Record[Names, typestyleLib.libTypesMod.NestedCSSProperties]): stdLib.Record[Names, java.lang.String] = js.native
}

