package typings
package atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a renderer factory.
  */
trait IRendererFactory extends js.Object {
  /**
    * The default rank of the factory.  If not given, defaults to 100.
    */
  val defaultRank: js.UndefOr[scala.Double] = js.undefined
  /**
    * The mime types handled by this factory.
    */
  val mimeTypes: js.Array[java.lang.String]
  /**
    * Whether the factory is a "safe" factory.
    *
    * #### Notes
    * A "safe" factory produces renderer widgets which can render
    * untrusted model data in a usable way. *All* renderers must
    * handle untrusted data safely, but some may simply failover
    * with a "Run cell to view output" message. A "safe" renderer
    * is an indication that its sanitized output will be useful.
    */
  val safe: scala.Boolean
  /**
    * Create a renderer which displays the mime data.
    *
    * @param options - The options used to render the data.
    */
  def createRenderer(options: IRendererOptions): IRenderer
}

object IRendererFactory {
  @scala.inline
  def apply(
    createRenderer: IRendererOptions => IRenderer,
    mimeTypes: js.Array[java.lang.String],
    safe: scala.Boolean,
    defaultRank: scala.Int | scala.Double = null
  ): IRendererFactory = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer), mimeTypes = mimeTypes, safe = safe)
    if (defaultRank != null) __obj.updateDynamic("defaultRank")(defaultRank.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRendererFactory]
  }
}

