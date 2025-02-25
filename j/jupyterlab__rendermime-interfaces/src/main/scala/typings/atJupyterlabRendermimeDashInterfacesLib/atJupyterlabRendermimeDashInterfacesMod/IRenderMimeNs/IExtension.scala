package typings
package atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for using a RenderMime.IRenderer for output and read-only documents.
  */
trait IExtension extends js.Object {
  /**
    * Preferred data type from the model.  Defaults to `string`.
    */
  val dataType: js.UndefOr[
    atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesLibStrings.string | atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesLibStrings.json
  ] = js.undefined
  /**
    * The options used to open a document with the renderer factory.
    */
  val documentWidgetFactoryOptions: js.UndefOr[IDocumentWidgetFactoryOptions | js.Array[IDocumentWidgetFactoryOptions]] = js.undefined
  /**
    * The optional file type associated with the extension.
    */
  val fileTypes: js.UndefOr[js.Array[IFileType]] = js.undefined
  /**
    * The ID of the extension.
    *
    * #### Notes
    * The convention for extension IDs in JupyterLab is the full NPM package
    * name followed by a colon and a unique string token, e.g.
    * `'@jupyterlab/apputils-extension:settings'` or `'foo-extension:bar'`.
    */
  val id: java.lang.String
  /**
    * The rank passed to `RenderMime.addFactory`.  If not given,
    * defaults to the `defaultRank` of the factory.
    */
  val rank: js.UndefOr[scala.Double] = js.undefined
  /**
    * The timeout after user activity to re-render the data.
    */
  val renderTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * A renderer factory to be registered to render the MIME type.
    */
  val rendererFactory: IRendererFactory
}

object IExtension {
  @scala.inline
  def apply(
    id: java.lang.String,
    rendererFactory: IRendererFactory,
    dataType: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesLibStrings.string | atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesLibStrings.json = null,
    documentWidgetFactoryOptions: IDocumentWidgetFactoryOptions | js.Array[IDocumentWidgetFactoryOptions] = null,
    fileTypes: js.Array[IFileType] = null,
    rank: scala.Int | scala.Double = null,
    renderTimeout: scala.Int | scala.Double = null
  ): IExtension = {
    val __obj = js.Dynamic.literal(id = id, rendererFactory = rendererFactory)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (documentWidgetFactoryOptions != null) __obj.updateDynamic("documentWidgetFactoryOptions")(documentWidgetFactoryOptions.asInstanceOf[js.Any])
    if (fileTypes != null) __obj.updateDynamic("fileTypes")(fileTypes)
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (renderTimeout != null) __obj.updateDynamic("renderTimeout")(renderTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtension]
  }
}

