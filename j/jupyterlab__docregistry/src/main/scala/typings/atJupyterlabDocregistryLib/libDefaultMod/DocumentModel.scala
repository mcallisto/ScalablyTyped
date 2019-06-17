package typings
package atJupyterlabDocregistryLib.libDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/docregistry/lib/default", "DocumentModel")
@js.native
/**
  * Construct a new document model.
  */
class DocumentModel ()
  extends atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.ICodeModel {
  def this(languagePreference: java.lang.String) = this()
  def this(languagePreference: java.lang.String, modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB) = this()
  var _contentChanged: js.Any = js.native
  var _defaultLang: js.Any = js.native
  var _dirty: js.Any = js.native
  var _readOnly: js.Any = js.native
  var _stateChanged: js.Any = js.native
  /**
    * A signal emitted when the document content changes.
    */
  /* CompleteClass */
  override var contentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * The default kernel language of the document.
    */
  /* CompleteClass */
  override val defaultKernelLanguage: java.lang.String = js.native
  /**
    * The default kernel name of the document.
    */
  /* CompleteClass */
  override val defaultKernelName: java.lang.String = js.native
  /**
    * The dirty state of the model.
    *
    * #### Notes
    * This should be cleared when the document is loaded from
    * or saved to disk.
    */
  /* CompleteClass */
  override var dirty: scala.Boolean = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    *
    * ### Notes
    * Making direct edits to the values stored in the`IModelDB`
    * is not recommended, and may produce unpredictable results.
    */
  /* CompleteClass */
  override val modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB = js.native
  /**
    * The read-only state of the model.
    */
  /* CompleteClass */
  override var readOnly: scala.Boolean = js.native
  /**
    * A signal emitted when the model state changes.
    */
  /* CompleteClass */
  override var stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]] = js.native
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
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromJSON(value: atPhosphorCoreutilsLib.libJsonMod.JSONValue): scala.Unit = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  /* CompleteClass */
  override def fromJSON(value: js.Any): scala.Unit = js.native
  /**
    * Deserialize the model from a string.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  /* CompleteClass */
  override def fromString(value: java.lang.String): scala.Unit = js.native
  /**
    * Initialize model state after initial data load.
    *
    * #### Notes
    * This function must be called after the initial data is loaded to set up
    * initial model state, such as an initial undo stack, etc.
    */
  /* CompleteClass */
  override def initialize(): scala.Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  /* CompleteClass */
  override def toJSON(): atPhosphorCoreutilsLib.libJsonMod.JSONValue = js.native
  /**
    * Trigger a content changed signal.
    */
  /* protected */ def triggerContentChange(): scala.Unit = js.native
  /**
    * Trigger a state change signal.
    */
  /* protected */ def triggerStateChange(args: atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]): scala.Unit = js.native
}

