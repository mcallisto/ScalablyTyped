package typings
package atBlueprintjsTableLib.libEsmCommonRenderModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenderMode extends js.Object

@JSImport("@blueprintjs/table/lib/esm/common/renderMode", "RenderMode")
@js.native
object RenderMode extends js.Object {
  /**
    * Renders cells in batches across multiple animation frames. This improves
    * performance by spreading out work to keep a high FPS and avoid blocking
    * the UI, but it also introduces a noticeable scan-line rendering artifact
    * as successive batches of cells finish rendering.
    */
  @js.native
  sealed trait BATCH
    extends atBlueprintjsTableLib.libEsmCommonRenderModeMod.RenderMode
  
  /**
    * Renders all cells synchronously on initial mount, then renders cells in
    * batches on successive updates (e.g. during scrolling). This helps to
    * remove visual rendering artifacts when the table is first rendered,
    * wihout slowing scrolling performance to a crawl.
    */
  @js.native
  sealed trait BATCH_ON_UPDATE
    extends atBlueprintjsTableLib.libEsmCommonRenderModeMod.RenderMode
  
  /**
    * Disables the batch-rendering behavior, rendering all cells synchronously
    * at once. This may result in degraded performance on large tables and/or
    * on tables with complex cells.
    */
  @js.native
  sealed trait NONE
    extends atBlueprintjsTableLib.libEsmCommonRenderModeMod.RenderMode
  
  /* "batch" */ val BATCH: BATCH with java.lang.String = js.native
  /* "batch-on-update" */ val BATCH_ON_UPDATE: BATCH_ON_UPDATE with java.lang.String = js.native
  /* "none" */ val NONE: NONE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atBlueprintjsTableLib.libEsmCommonRenderModeMod.RenderMode with java.lang.String] = js.native
}

