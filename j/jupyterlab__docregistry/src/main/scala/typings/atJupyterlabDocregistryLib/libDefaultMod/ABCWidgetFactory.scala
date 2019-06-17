package typings
package atJupyterlabDocregistryLib.libDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/default", "ABCWidgetFactory")
@js.native
abstract class ABCWidgetFactory[T /* <: atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel] */, U /* <: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel */] protected ()
  extends atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IWidgetFactory[T, U] {
  /**
    * Construct a new `ABCWidgetFactory`.
    */
  def this(options: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IWidgetFactoryOptions[T]) = this()
  var _canStartKernel: js.Any = js.native
  var _defaultFor: js.Any = js.native
  var _defaultRendered: js.Any = js.native
  var _fileTypes: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _modelName: js.Any = js.native
  var _name: js.Any = js.native
  var _preferKernel: js.Any = js.native
  var _readOnly: js.Any = js.native
  var _toolbarFactory: js.Any = js.native
  var _widgetCreated: js.Any = js.native
  /**
    * Whether the widgets can start a kernel when opened.
    */
  @JSName("canStartKernel")
  val canStartKernel_ABCWidgetFactory: scala.Boolean = js.native
  /**
    * The file types for which the factory should be the default.
    */
  @JSName("defaultFor")
  val defaultFor_ABCWidgetFactory: js.Array[java.lang.String] = js.native
  /**
    * The file types for which the factory should be the default for
    * rendering a document model, if different from editing.
    */
  @JSName("defaultRendered")
  val defaultRendered_ABCWidgetFactory: js.Array[java.lang.String] = js.native
  /**
    * The file types the widget can view.
    */
  /* CompleteClass */
  override val fileTypes: js.Array[java.lang.String] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * The registered name of the model type used to create the widgets.
    */
  @JSName("modelName")
  val modelName_ABCWidgetFactory: java.lang.String = js.native
  /**
    * The name of the widget to display in dialogs.
    */
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /**
    * Whether the widgets prefer having a kernel started.
    */
  @JSName("preferKernel")
  val preferKernel_ABCWidgetFactory: scala.Boolean = js.native
  /**
    * Whether the widget factory is read only.
    */
  @JSName("readOnly")
  val readOnly_ABCWidgetFactory: scala.Boolean = js.native
  /**
    * A signal emitted when a new widget is created.
    */
  /* CompleteClass */
  override var widgetCreated: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IWidgetFactory[T, U], 
    T
  ] = js.native
  /**
    * Create a new widget given a context.
    *
    * #### Notes
    * It should emit the [widgetCreated] signal with the new widget.
    */
  /* CompleteClass */
  override def createNew(context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IContext[U]): T = js.native
  /**
    * Create a widget for a context.
    */
  /* protected */ def createNewWidget(context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IContext[U]): T = js.native
  /**
    * Default factory for toolbar items to be added after the widget is created.
    */
  /* protected */ def defaultToolbarFactory(widget: T): js.Array[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IToolbarItem] = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
}

